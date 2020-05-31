package no.hal.pg.app.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import no.hal.pg.app.AppFactory;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameApp;
import no.hal.pg.app.GameView;
import no.hal.pg.app.ItemView;
import no.hal.pg.app.TaskView;
import no.hal.pg.app.View;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

public class ViewFactoryUtil {

	public static View<?> createView(EObject user, EObject eObject, Class<? extends View> viewClass, Class<?> context) {
		BundleContext bundleContext = FrameworkUtil.getBundle(context).getBundleContext();
		Collection<IViewFactory> viewFactories = new ArrayList<IViewFactory>();
		try {
			Collection<ServiceReference<IViewFactory>> serviceReferences = bundleContext.getServiceReferences(IViewFactory.class, null);
			for (ServiceReference<IViewFactory> serviceReference : serviceReferences) {
				IViewFactory viewFactory = bundleContext.getService(serviceReference);
				viewFactories.add(viewFactory);
			}
		} catch (InvalidSyntaxException e) {
			return null;
		}
		return createView(user, eObject, viewClass, viewFactories);
	}

	public static View<?> createView(EObject user, EObject eObject, Class<? extends View> viewClass, Iterable<IViewFactory> viewFactories, EClass viewEClass) {
		for (IViewFactory viewFactory : viewFactories) {
			View<?> view = viewFactory.createView(user, eObject);
			if (view != null && (viewClass == null || viewClass.isInstance(view))) {
				return view;
			}
		}
		return (viewEClass != null ? (View<?>) EcoreUtil.create(viewEClass) : null);
	}
	public static View<?> createView(EObject user, EObject eObject, Class<? extends View> viewClass, Iterable<IViewFactory> viewFactories) {
		return createView(user, eObject, viewClass, viewFactories, null);
	}

	public static GameApp<?> createGameApp(Game<Task<?>> game) {
		GameApp<?> app = AppFactory.eINSTANCE.createGameApp();
		app.setModel(game);
		BundleContext bundleContext = FrameworkUtil.getBundle(game.getClass()).getBundleContext();
		Collection<IViewFactory> viewFactories = getViewFactories(bundleContext);
		for (Player player : game.getPlayers()) {
			GameView<Task<?>> gameView = (GameView<Task<?>>) createView(player, game, GameView.class, viewFactories);
			gameView.setPlayer(player);
			gameView.setModel(game);
			app.getViews().add(gameView);
			for (Task<?> task : game.getTasks()) {
				if (task.getPlayers().contains(player)) {
					TaskView<Task<?>> taskView = (TaskView<Task<?>>) createView(player, task, TaskView.class, viewFactories);
					if (taskView != null) {
						taskView.setModel(task);
						gameView.getTaskViews().add(taskView);
					}
				}
			}
			createItemViews(player, gameView, game.getItems(), viewFactories);
			createItemViews(player, gameView, player.getItems(), viewFactories);
		}
		return app;
	}

	protected static void createItemViews(Player player, GameView<Task<?>> gameView, EList<Item> items, Collection<IViewFactory> viewFactories) {
		for (Item item : items) {
			ItemView itemView = (ItemView) createView(player, item, ItemView.class, viewFactories, AppPackage.eINSTANCE.getItemView());
			itemView.setModel(item);
			gameView.getAllItemViews().add(itemView);
		}
	}

	public static Collection<IViewFactory> getViewFactories(BundleContext bundleContext) {
		Collection<IViewFactory> viewFactories = new ArrayList<IViewFactory>();
		try {
			Collection<ServiceReference<IViewFactory>> serviceReferences = bundleContext.getServiceReferences(IViewFactory.class, null);
			for (ServiceReference<IViewFactory> serviceReference : serviceReferences) {
				IViewFactory viewFactory = bundleContext.getService(serviceReference);
				viewFactories.add(viewFactory);
			}
		} catch (InvalidSyntaxException e) {
			return null;
		}
		return viewFactories;
	}
}
