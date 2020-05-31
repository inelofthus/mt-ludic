/**
 */
package no.inela.ineruntime.util;

import java.util.Map;

import no.hal.pg.app.GameView;
import no.hal.pg.app.View;
import no.hal.pg.app.View1;

import no.hal.pg.arc.Group;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import no.inela.ineruntime.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.inela.ineruntime.IneruntimePackage
 * @generated
 */
public class IneruntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IneruntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IneruntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IneruntimePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IneruntimeSwitch<Adapter> modelSwitch =
		new IneruntimeSwitch<Adapter>() {
			@Override
			public Adapter caseLeaderboardGame(LeaderboardGame object) {
				return createLeaderboardGameAdapter();
			}
			@Override
			public Adapter caseLeaderboard(Leaderboard object) {
				return createLeaderboardAdapter();
			}
			@Override
			public Adapter casePlayerToInt(Map.Entry<Player, Integer> object) {
				return createPlayerToIntAdapter();
			}
			@Override
			public Adapter caseLeaderboardGameView(LeaderboardGameView object) {
				return createLeaderboardGameViewAdapter();
			}
			@Override
			public Adapter casePlayerToTask(Map.Entry<Player, Task<?>> object) {
				return createPlayerToTaskAdapter();
			}
			@Override
			public Adapter caseGroupToInt(Map.Entry<Group, Integer> object) {
				return createGroupToIntAdapter();
			}
			@Override
			public Adapter casePlayerAction(PlayerAction object) {
				return createPlayerActionAdapter();
			}
			@Override
			public Adapter caseCompositePlayerAction(CompositePlayerAction object) {
				return createCompositePlayerActionAdapter();
			}
			@Override
			public Adapter caseSetTaskToActiveAction(SetTaskToActiveAction object) {
				return createSetTaskToActiveActionAdapter();
			}
			@Override
			public Adapter caseRemoveTaskFromActiveAction(RemoveTaskFromActiveAction object) {
				return createRemoveTaskFromActiveActionAdapter();
			}
			@Override
			public Adapter casePlayerCondition(PlayerCondition object) {
				return createPlayerConditionAdapter();
			}
			@Override
			public Adapter caseCompositePlayerCondition(CompositePlayerCondition object) {
				return createCompositePlayerConditionAdapter();
			}
			@Override
			public Adapter caseIsOnlyTaskActiveForPlayerCondition(IsOnlyTaskActiveForPlayerCondition object) {
				return createIsOnlyTaskActiveForPlayerConditionAdapter();
			}
			@Override
			public <T extends Task<?>> Adapter caseGame(Game<T> object) {
				return createGameAdapter();
			}
			@Override
			public <U> Adapter caseView(View<U> object) {
				return createViewAdapter();
			}
			@Override
			public <U, M> Adapter caseView1(View1<U, M> object) {
				return createView1Adapter();
			}
			@Override
			public <T extends Task<?>> Adapter caseGameView(GameView<T> object) {
				return createGameViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.LeaderboardGame <em>Leaderboard Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.LeaderboardGame
	 * @generated
	 */
	public Adapter createLeaderboardGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.Leaderboard <em>Leaderboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.Leaderboard
	 * @generated
	 */
	public Adapter createLeaderboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Player To Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPlayerToIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.LeaderboardGameView <em>Leaderboard Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.LeaderboardGameView
	 * @generated
	 */
	public Adapter createLeaderboardGameViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Player To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPlayerToTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Group To Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createGroupToIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.PlayerAction <em>Player Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.PlayerAction
	 * @generated
	 */
	public Adapter createPlayerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.CompositePlayerAction <em>Composite Player Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.CompositePlayerAction
	 * @generated
	 */
	public Adapter createCompositePlayerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.SetTaskToActiveAction <em>Set Task To Active Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.SetTaskToActiveAction
	 * @generated
	 */
	public Adapter createSetTaskToActiveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.RemoveTaskFromActiveAction <em>Remove Task From Active Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.RemoveTaskFromActiveAction
	 * @generated
	 */
	public Adapter createRemoveTaskFromActiveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.PlayerCondition <em>Player Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.PlayerCondition
	 * @generated
	 */
	public Adapter createPlayerConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.CompositePlayerCondition <em>Composite Player Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.CompositePlayerCondition
	 * @generated
	 */
	public Adapter createCompositePlayerConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition <em>Is Only Task Active For Player Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition
	 * @generated
	 */
	public Adapter createIsOnlyTaskActiveForPlayerConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.app.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.app.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.app.View1 <em>View1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.app.View1
	 * @generated
	 */
	public Adapter createView1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.app.GameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.app.GameView
	 * @generated
	 */
	public Adapter createGameViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IneruntimeAdapterFactory
