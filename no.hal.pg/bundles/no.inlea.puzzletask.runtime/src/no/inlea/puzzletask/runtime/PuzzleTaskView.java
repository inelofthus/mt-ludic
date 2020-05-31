/**
 */
package no.inlea.puzzletask.runtime;

import no.hal.pg.app.TaskView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle Task View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getImage <em>Image</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getScore <em>Score</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTaskView()
 * @model
 * @generated
 */
public interface PuzzleTaskView extends TaskView<PuzzleTask> {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTaskView_Image()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTaskView_Score()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getScore();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #isSetLevel()
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTaskView_Level()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Returns whether the value of the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getLevel <em>Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level</em>' attribute is set.
	 * @see #getLevel()
	 * @generated
	 */
	boolean isSetLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PuzzleTaskView proposeAnswer(String proposal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finish();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startPuzzle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean acceptPlayer();

} // PuzzleTaskView
