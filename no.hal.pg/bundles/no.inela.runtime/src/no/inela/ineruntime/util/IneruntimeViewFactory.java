package no.inela.ineruntime.util;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.app.View;
import no.hal.pg.app.util.IViewFactory;
import no.inela.ineruntime.IneruntimeFactory;
import no.inela.ineruntime.impl.LeaderboardGameImpl;

@Component
public class IneruntimeViewFactory implements IViewFactory {

	@Override
	public View<?> createView(EObject user, EObject eObject) {
		if (eObject.getClass() == LeaderboardGameImpl.class) {
			return IneruntimeFactory.eINSTANCE.createLeaderboardGameView();
		}
		return null;
	}

}
