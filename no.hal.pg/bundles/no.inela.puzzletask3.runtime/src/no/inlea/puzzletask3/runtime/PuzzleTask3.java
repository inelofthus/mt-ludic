/**
 */
package no.inlea.puzzletask3.runtime;

import java.util.Date;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle Task3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getTaskScores <em>Task Scores</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getOpenTime <em>Open Time</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getCloseTime <em>Close Time</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getMaxScore <em>Max Score</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getNumCorrectRequired <em>Num Correct Required</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3()
 * @model
 * @generated
 */
public interface PuzzleTask3 extends Task<TaskScores>, GeoLocation {
	/**
	 * Returns the value of the '<em><b>Puzzle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puzzle</em>' containment reference.
	 * @see #setPuzzle(Puzzle)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_Puzzle()
	 * @model containment="true"
	 * @generated
	 */
	Puzzle getPuzzle();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getPuzzle <em>Puzzle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puzzle</em>' containment reference.
	 * @see #getPuzzle()
	 * @generated
	 */
	void setPuzzle(Puzzle value);

	/**
	 * Returns the value of the '<em><b>Task Scores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Scores</em>' containment reference.
	 * @see #setTaskScores(TaskScores)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_TaskScores()
	 * @model containment="true"
	 * @generated
	 */
	TaskScores getTaskScores();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getTaskScores <em>Task Scores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Scores</em>' containment reference.
	 * @see #getTaskScores()
	 * @generated
	 */
	void setTaskScores(TaskScores value);

	/**
	 * Returns the value of the '<em><b>Attempts</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type list of {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempts</em>' map.
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_Attempts()
	 * @model mapType="no.inlea.puzzletask3.runtime.PlayerToStrings&lt;no.hal.pg.runtime.Player, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<Player, EList<String>> getAttempts();

	/**
	 * Returns the value of the '<em><b>Open Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Time</em>' attribute.
	 * @see #setOpenTime(Date)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_OpenTime()
	 * @model
	 * @generated
	 */
	Date getOpenTime();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getOpenTime <em>Open Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Time</em>' attribute.
	 * @see #getOpenTime()
	 * @generated
	 */
	void setOpenTime(Date value);

	/**
	 * Returns the value of the '<em><b>Close Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Time</em>' attribute.
	 * @see #setCloseTime(Date)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_CloseTime()
	 * @model
	 * @generated
	 */
	Date getCloseTime();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getCloseTime <em>Close Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Time</em>' attribute.
	 * @see #getCloseTime()
	 * @generated
	 */
	void setCloseTime(Date value);

	/**
	 * Returns the value of the '<em><b>Acceptable Target Distance</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptable Target Distance</em>' attribute.
	 * @see #setAcceptableTargetDistance(int)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_AcceptableTargetDistance()
	 * @model default="10"
	 * @generated
	 */
	int getAcceptableTargetDistance();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptable Target Distance</em>' attribute.
	 * @see #getAcceptableTargetDistance()
	 * @generated
	 */
	void setAcceptableTargetDistance(int value);

	/**
	 * Returns the value of the '<em><b>Max Score</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Score</em>' attribute.
	 * @see #setMaxScore(int)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_MaxScore()
	 * @model default="300"
	 * @generated
	 */
	int getMaxScore();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getMaxScore <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Score</em>' attribute.
	 * @see #getMaxScore()
	 * @generated
	 */
	void setMaxScore(int value);

	/**
	 * Returns the value of the '<em><b>Wrong Attempt Penalty</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrong Attempt Penalty</em>' attribute.
	 * @see #setWrongAttemptPenalty(int)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_WrongAttemptPenalty()
	 * @model default="100"
	 * @generated
	 */
	int getWrongAttemptPenalty();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrong Attempt Penalty</em>' attribute.
	 * @see #getWrongAttemptPenalty()
	 * @generated
	 */
	void setWrongAttemptPenalty(int value);

	/**
	 * Returns the value of the '<em><b>Num Correct Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Correct Required</em>' attribute.
	 * @see #setNumCorrectRequired(int)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPuzzleTask3_NumCorrectRequired()
	 * @model
	 * @generated
	 */
	int getNumCorrectRequired();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getNumCorrectRequired <em>Num Correct Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Correct Required</em>' attribute.
	 * @see #getNumCorrectRequired()
	 * @generated
	 */
	void setNumCorrectRequired(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean acceptProposal(String proposal, Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int calculateScore(int numWrong);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean acceptPlayer(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isTimeWithinInterval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canStart(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean quitPuzzle(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompletedByPlayer(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double checkTargetDistance(GeoLocated geoLocated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkPlayerLocation(Player player);

} // PuzzleTask3
