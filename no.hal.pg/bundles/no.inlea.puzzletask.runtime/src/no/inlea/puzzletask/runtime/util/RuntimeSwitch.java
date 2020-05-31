/**
 */
package no.inlea.puzzletask.runtime.util;

import java.util.Map;

import no.hal.pg.app.TaskView;
import no.hal.pg.app.View;
import no.hal.pg.app.View1;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;

import no.hal.pg.runtime.Described;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import no.inlea.puzzletask.runtime.*;

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
 * @see no.inlea.puzzletask.runtime.RuntimePackage
 * @generated
 */
public class RuntimeSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
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
			case RuntimePackage.PUZZLE_TASK: {
				PuzzleTask puzzleTask = (PuzzleTask)theEObject;
				T1 result = casePuzzleTask(puzzleTask);
				if (result == null) result = caseTask(puzzleTask);
				if (result == null) result = caseGeoLocation(puzzleTask);
				if (result == null) result = caseDescribed(puzzleTask);
				if (result == null) result = caseGeoLocated(puzzleTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PUZZLE_PIECE: {
				PuzzlePiece puzzlePiece = (PuzzlePiece)theEObject;
				T1 result = casePuzzlePiece(puzzlePiece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PUZZLE_TASK_VIEW: {
				PuzzleTaskView puzzleTaskView = (PuzzleTaskView)theEObject;
				T1 result = casePuzzleTaskView(puzzleTaskView);
				if (result == null) result = caseTaskView(puzzleTaskView);
				if (result == null) result = caseView1(puzzleTaskView);
				if (result == null) result = caseView(puzzleTaskView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PLAYER_TO_INT: {
				@SuppressWarnings("unchecked") Map.Entry<Player, Integer> playerToInt = (Map.Entry<Player, Integer>)theEObject;
				T1 result = casePlayerToInt(playerToInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PUZZLE: {
				Puzzle puzzle = (Puzzle)theEObject;
				T1 result = casePuzzle(puzzle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.SIMPLE_PUZZLE: {
				SimplePuzzle simplePuzzle = (SimplePuzzle)theEObject;
				T1 result = caseSimplePuzzle(simplePuzzle);
				if (result == null) result = casePuzzle(simplePuzzle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PLAYER_TASK_SCORE: {
				PlayerTaskScore playerTaskScore = (PlayerTaskScore)theEObject;
				T1 result = casePlayerTaskScore(playerTaskScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PLAYER_TASK_SCORES: {
				PlayerTaskScores playerTaskScores = (PlayerTaskScores)theEObject;
				T1 result = casePlayerTaskScores(playerTaskScores);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PLAYER_TO_PUZZLE_PIECE: {
				@SuppressWarnings("unchecked") Map.Entry<Player, PuzzlePiece> playerToPuzzlePiece = (Map.Entry<Player, PuzzlePiece>)theEObject;
				T1 result = casePlayerToPuzzlePiece(playerToPuzzlePiece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Puzzle Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Puzzle Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePuzzleTask(PuzzleTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Puzzle Piece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Puzzle Piece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePuzzlePiece(PuzzlePiece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Puzzle Task View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Puzzle Task View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePuzzleTaskView(PuzzleTaskView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Puzzle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Puzzle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePuzzle(Puzzle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Puzzle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Puzzle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSimplePuzzle(SimplePuzzle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Task Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Task Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerTaskScore(PlayerTaskScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Task Scores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Task Scores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerTaskScores(PlayerTaskScores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player To Puzzle Piece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player To Puzzle Piece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerToPuzzlePiece(Map.Entry<Player, PuzzlePiece> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocated(GeoLocated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocation(GeoLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R> T1 caseTask(Task<R> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Task View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseTaskView(TaskView<T> object) {
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

} //RuntimeSwitch
