/**
 */
package no.inela.ineruntime.impl;

import java.util.Map;

import no.hal.pg.arc.Group;
import no.hal.pg.runtime.Player;

import no.hal.pg.runtime.Task;
import no.inela.ineruntime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IneruntimeFactoryImpl extends EFactoryImpl implements IneruntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IneruntimeFactory init() {
		try {
			IneruntimeFactory theIneruntimeFactory = (IneruntimeFactory)EPackage.Registry.INSTANCE.getEFactory(IneruntimePackage.eNS_URI);
			if (theIneruntimeFactory != null) {
				return theIneruntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IneruntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IneruntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IneruntimePackage.LEADERBOARD_GAME: return createLeaderboardGame();
			case IneruntimePackage.LEADERBOARD: return createLeaderboard();
			case IneruntimePackage.PLAYER_TO_INT: return (EObject)createPlayerToInt();
			case IneruntimePackage.LEADERBOARD_GAME_VIEW: return createLeaderboardGameView();
			case IneruntimePackage.PLAYER_TO_TASK: return (EObject)createPlayerToTask();
			case IneruntimePackage.GROUP_TO_INT: return (EObject)createGroupToInt();
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION: return createCompositePlayerAction();
			case IneruntimePackage.SET_TASK_TO_ACTIVE_ACTION: return createSetTaskToActiveAction();
			case IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION: return createRemoveTaskFromActiveAction();
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION: return createCompositePlayerCondition();
			case IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION: return createIsOnlyTaskActiveForPlayerCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeaderboardGame createLeaderboardGame() {
		LeaderboardGameImpl leaderboardGame = new LeaderboardGameImpl();
		return leaderboardGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leaderboard createLeaderboard() {
		LeaderboardImpl leaderboard = new LeaderboardImpl();
		return leaderboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Player, Integer> createPlayerToInt() {
		PlayerToIntImpl playerToInt = new PlayerToIntImpl();
		return playerToInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeaderboardGameView createLeaderboardGameView() {
		LeaderboardGameViewImpl leaderboardGameView = new LeaderboardGameViewImpl();
		return leaderboardGameView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Player, Task<?>> createPlayerToTask() {
		PlayerToTaskImpl playerToTask = new PlayerToTaskImpl();
		return playerToTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Group, Integer> createGroupToInt() {
		GroupToIntImpl groupToInt = new GroupToIntImpl();
		return groupToInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositePlayerAction createCompositePlayerAction() {
		CompositePlayerActionImpl compositePlayerAction = new CompositePlayerActionImpl();
		return compositePlayerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetTaskToActiveAction createSetTaskToActiveAction() {
		SetTaskToActiveActionImpl setTaskToActiveAction = new SetTaskToActiveActionImpl();
		return setTaskToActiveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveTaskFromActiveAction createRemoveTaskFromActiveAction() {
		RemoveTaskFromActiveActionImpl removeTaskFromActiveAction = new RemoveTaskFromActiveActionImpl();
		return removeTaskFromActiveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositePlayerCondition createCompositePlayerCondition() {
		CompositePlayerConditionImpl compositePlayerCondition = new CompositePlayerConditionImpl();
		return compositePlayerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsOnlyTaskActiveForPlayerCondition createIsOnlyTaskActiveForPlayerCondition() {
		IsOnlyTaskActiveForPlayerConditionImpl isOnlyTaskActiveForPlayerCondition = new IsOnlyTaskActiveForPlayerConditionImpl();
		return isOnlyTaskActiveForPlayerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IneruntimePackage getIneruntimePackage() {
		return (IneruntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IneruntimePackage getPackage() {
		return IneruntimePackage.eINSTANCE;
	}

} //IneruntimeFactoryImpl
