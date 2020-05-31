/**
 */
package no.inlea.puzzletask3.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.inlea.puzzletask3.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = no.inlea.puzzletask3.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Puzzle Task3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puzzle Task3</em>'.
	 * @generated
	 */
	PuzzleTask3 createPuzzleTask3();

	/**
	 * Returns a new object of class '<em>Puzzle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puzzle</em>'.
	 * @generated
	 */
	Puzzle createPuzzle();

	/**
	 * Returns a new object of class '<em>Image Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Piece</em>'.
	 * @generated
	 */
	ImagePiece createImagePiece();

	/**
	 * Returns a new object of class '<em>Puzzle Task View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puzzle Task View</em>'.
	 * @generated
	 */
	PuzzleTaskView createPuzzleTaskView();

	/**
	 * Returns a new object of class '<em>Task Scores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Scores</em>'.
	 * @generated
	 */
	TaskScores createTaskScores();

	/**
	 * Returns a new object of class '<em>Text Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Piece</em>'.
	 * @generated
	 */
	TextPiece createTextPiece();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory
