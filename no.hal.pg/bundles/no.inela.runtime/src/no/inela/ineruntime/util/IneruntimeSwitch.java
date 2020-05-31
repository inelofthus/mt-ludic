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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.inela.ineruntime.IneruntimePackage
 * @generated
 */
public class IneruntimeSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IneruntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IneruntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = IneruntimePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IneruntimePackage.LEADERBOARD_GAME: {
				LeaderboardGame leaderboardGame = (LeaderboardGame)theEObject;
				T1 result = caseLeaderboardGame(leaderboardGame);
				if (result == null) result = caseGame(leaderboardGame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.LEADERBOARD: {
				Leaderboard leaderboard = (Leaderboard)theEObject;
				T1 result = caseLeaderboard(leaderboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.PLAYER_TO_INT: {
				@SuppressWarnings("unchecked") Map.Entry<Player, Integer> playerToInt = (Map.Entry<Player, Integer>)theEObject;
				T1 result = casePlayerToInt(playerToInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.LEADERBOARD_GAME_VIEW: {
				LeaderboardGameView leaderboardGameView = (LeaderboardGameView)theEObject;
				T1 result = caseLeaderboardGameView(leaderboardGameView);
				if (result == null) result = caseGameView(leaderboardGameView);
				if (result == null) result = caseView1(leaderboardGameView);
				if (result == null) result = caseView(leaderboardGameView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.PLAYER_TO_TASK: {
				@SuppressWarnings("unchecked") Map.Entry<Player, Task<?>> playerToTask = (Map.Entry<Player, Task<?>>)theEObject;
				T1 result = casePlayerToTask(playerToTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.GROUP_TO_INT: {
				@SuppressWarnings("unchecked") Map.Entry<Group, Integer> groupToInt = (Map.Entry<Group, Integer>)theEObject;
				T1 result = caseGroupToInt(groupToInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.PLAYER_ACTION: {
				PlayerAction playerAction = (PlayerAction)theEObject;
				T1 result = casePlayerAction(playerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION: {
				CompositePlayerAction compositePlayerAction = (CompositePlayerAction)theEObject;
				T1 result = caseCompositePlayerAction(compositePlayerAction);
				if (result == null) result = casePlayerAction(compositePlayerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.SET_TASK_TO_ACTIVE_ACTION: {
				SetTaskToActiveAction setTaskToActiveAction = (SetTaskToActiveAction)theEObject;
				T1 result = caseSetTaskToActiveAction(setTaskToActiveAction);
				if (result == null) result = casePlayerAction(setTaskToActiveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION: {
				RemoveTaskFromActiveAction removeTaskFromActiveAction = (RemoveTaskFromActiveAction)theEObject;
				T1 result = caseRemoveTaskFromActiveAction(removeTaskFromActiveAction);
				if (result == null) result = casePlayerAction(removeTaskFromActiveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.PLAYER_CONDITION: {
				PlayerCondition playerCondition = (PlayerCondition)theEObject;
				T1 result = casePlayerCondition(playerCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION: {
				CompositePlayerCondition compositePlayerCondition = (CompositePlayerCondition)theEObject;
				T1 result = caseCompositePlayerCondition(compositePlayerCondition);
				if (result == null) result = casePlayerCondition(compositePlayerCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION: {
				IsOnlyTaskActiveForPlayerCondition isOnlyTaskActiveForPlayerCondition = (IsOnlyTaskActiveForPlayerCondition)theEObject;
				T1 result = caseIsOnlyTaskActiveForPlayerCondition(isOnlyTaskActiveForPlayerCondition);
				if (result == null) result = casePlayerCondition(isOnlyTaskActiveForPlayerCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaderboard Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaderboard Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLeaderboardGame(LeaderboardGame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaderboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaderboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLeaderboard(Leaderboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player To Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player To Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerToInt(Map.Entry<Player, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaderboard Game View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaderboard Game View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLeaderboardGameView(LeaderboardGameView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player To Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player To Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerToTask(Map.Entry<Player, Task<?>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group To Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group To Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroupToInt(Map.Entry<Group, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerAction(PlayerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Player Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Player Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositePlayerAction(CompositePlayerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Task To Active Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Task To Active Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSetTaskToActiveAction(SetTaskToActiveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Task From Active Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Task From Active Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRemoveTaskFromActiveAction(RemoveTaskFromActiveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerCondition(PlayerCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Player Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Player Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositePlayerCondition(CompositePlayerCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Only Task Active For Player Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Only Task Active For Player Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIsOnlyTaskActiveForPlayerCondition(IsOnlyTaskActiveForPlayerCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseGame(Game<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U> T1 caseView(View<U> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U, M> T1 caseView1(View1<U, M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseGameView(GameView<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //IneruntimeSwitch
