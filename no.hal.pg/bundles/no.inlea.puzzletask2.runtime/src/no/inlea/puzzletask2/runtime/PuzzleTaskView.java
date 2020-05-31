/**
 */
package no.inlea.puzzletask2.runtime;

import java.util.Date;
import no.hal.pg.app.TaskView;
import no.hal.pg.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle Task View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#getContent <em>Content</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#getScore <em>Score</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#getTaskLocation <em>Task Location</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#isIsCompletedByPlayer <em>Is Completed By Player</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#isActive <em>Active</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#getDistance <em>Distance</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#getCloseTime <em>Close Time</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#getNumberOfActivePlayers <em>Number Of Active Players</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView()
 * @model
 * @generated
 */
public interface PuzzleTaskView extends TaskView<PuzzleTask2> {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_Content()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_Score()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getScore();

	/**
	 * Returns the value of the '<em><b>Task Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Location</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_TaskLocation()
	 * @model dataType="no.hal.pg.osm.LatLong" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	LatLong getTaskLocation();

	/**
	 * Returns the value of the '<em><b>Is Completed By Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Completed By Player</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_IsCompletedByPlayer()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsCompletedByPlayer();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_Active()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_Distance()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getDistance();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_Instructions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getInstructions();

	/**
	 * Returns the value of the '<em><b>Close Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Time</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_CloseTime()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getCloseTime();

	/**
	 * Returns the value of the '<em><b>Number Of Active Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Active Players</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzleTaskView_NumberOfActivePlayers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfActivePlayers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean proposeAnswer(String proposal);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TaskView<?> start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean quitPuzzle();

} // PuzzleTaskView
