/**
 */
package config;

import java.util.Date;
import no.hal.pg.config.TaskConfig;
import no.hal.pg.osm.GeoLocation;
import no.inlea.puzzletask3.runtime.PuzzleTask3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle Task2 Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link config.PuzzleTask3Config#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link config.PuzzleTask3Config#getOpenTime <em>Open Time</em>}</li>
 *   <li>{@link config.PuzzleTask3Config#getCloseTime <em>Close Time</em>}</li>
 *   <li>{@link config.PuzzleTask3Config#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}</li>
 *   <li>{@link config.PuzzleTask3Config#getMaxScore <em>Max Score</em>}</li>
 *   <li>{@link config.PuzzleTask3Config#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}</li>
 *   <li>{@link config.PuzzleTask3Config#getLocation <em>Location</em>}</li>
 *   <li>{@link config.PuzzleTask3Config#getNumCorrectRequired <em>Num Correct Required</em>}</li>
 * </ul>
 *
 * @see config.ConfigPackage#getPuzzleTask3Config()
 * @model
 * @generated
 */
public interface PuzzleTask3Config extends TaskConfig<PuzzleTask3> {

	/**
	 * Returns the value of the '<em><b>Puzzle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puzzle</em>' reference.
	 * @see #setPuzzle(no.inlea.puzzletask3.runtime.Puzzle)
	 * @see config.ConfigPackage#getPuzzleTask3Config_Puzzle()
	 * @model
	 * @generated
	 */
	no.inlea.puzzletask3.runtime.Puzzle getPuzzle();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getPuzzle <em>Puzzle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puzzle</em>' reference.
	 * @see #getPuzzle()
	 * @generated
	 */
	void setPuzzle(no.inlea.puzzletask3.runtime.Puzzle value);

	/**
	 * Returns the value of the '<em><b>Open Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Time</em>' attribute.
	 * @see #setOpenTime(Date)
	 * @see config.ConfigPackage#getPuzzleTask3Config_OpenTime()
	 * @model
	 * @generated
	 */
	Date getOpenTime();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getOpenTime <em>Open Time</em>}' attribute.
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
	 * @see config.ConfigPackage#getPuzzleTask3Config_CloseTime()
	 * @model
	 * @generated
	 */
	Date getCloseTime();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getCloseTime <em>Close Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Time</em>' attribute.
	 * @see #getCloseTime()
	 * @generated
	 */
	void setCloseTime(Date value);

	/**
	 * Returns the value of the '<em><b>Acceptable Target Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptable Target Distance</em>' attribute.
	 * @see #setAcceptableTargetDistance(int)
	 * @see config.ConfigPackage#getPuzzleTask3Config_AcceptableTargetDistance()
	 * @model
	 * @generated
	 */
	int getAcceptableTargetDistance();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptable Target Distance</em>' attribute.
	 * @see #getAcceptableTargetDistance()
	 * @generated
	 */
	void setAcceptableTargetDistance(int value);

	/**
	 * Returns the value of the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Score</em>' attribute.
	 * @see #setMaxScore(int)
	 * @see config.ConfigPackage#getPuzzleTask3Config_MaxScore()
	 * @model
	 * @generated
	 */
	int getMaxScore();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getMaxScore <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Score</em>' attribute.
	 * @see #getMaxScore()
	 * @generated
	 */
	void setMaxScore(int value);

	/**
	 * Returns the value of the '<em><b>Wrong Attempt Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrong Attempt Penalty</em>' attribute.
	 * @see #setWrongAttemptPenalty(int)
	 * @see config.ConfigPackage#getPuzzleTask3Config_WrongAttemptPenalty()
	 * @model
	 * @generated
	 */
	int getWrongAttemptPenalty();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrong Attempt Penalty</em>' attribute.
	 * @see #getWrongAttemptPenalty()
	 * @generated
	 */
	void setWrongAttemptPenalty(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(GeoLocation)
	 * @see config.ConfigPackage#getPuzzleTask3Config_Location()
	 * @model
	 * @generated
	 */
	GeoLocation getLocation();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GeoLocation value);

	/**
	 * Returns the value of the '<em><b>Num Correct Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Correct Required</em>' attribute.
	 * @see #setNumCorrectRequired(int)
	 * @see config.ConfigPackage#getPuzzleTask3Config_NumCorrectRequired()
	 * @model
	 * @generated
	 */
	int getNumCorrectRequired();

	/**
	 * Sets the value of the '{@link config.PuzzleTask3Config#getNumCorrectRequired <em>Num Correct Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Correct Required</em>' attribute.
	 * @see #getNumCorrectRequired()
	 * @generated
	 */
	void setNumCorrectRequired(int value);
} // PuzzleTask2Config
