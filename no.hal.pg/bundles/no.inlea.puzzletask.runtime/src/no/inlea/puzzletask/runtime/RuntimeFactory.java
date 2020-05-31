/**
 */
package no.inlea.puzzletask.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.inlea.puzzletask.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = no.inlea.puzzletask.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Puzzle Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puzzle Task</em>'.
	 * @generated
	 */
	PuzzleTask createPuzzleTask();

	/**
	 * Returns a new object of class '<em>Puzzle Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puzzle Piece</em>'.
	 * @generated
	 */
	PuzzlePiece createPuzzlePiece();

	/**
	 * Returns a new object of class '<em>Puzzle Task View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puzzle Task View</em>'.
	 * @generated
	 */
	PuzzleTaskView createPuzzleTaskView();

	/**
	 * Returns a new object of class '<em>Simple Puzzle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Puzzle</em>'.
	 * @generated
	 */
	SimplePuzzle createSimplePuzzle();

	/**
	 * Returns a new object of class '<em>Player Task Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Task Score</em>'.
	 * @generated
	 */
	PlayerTaskScore createPlayerTaskScore();

	/**
	 * Returns a new object of class '<em>Player Task Scores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Task Scores</em>'.
	 * @generated
	 */
	PlayerTaskScores createPlayerTaskScores();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory
