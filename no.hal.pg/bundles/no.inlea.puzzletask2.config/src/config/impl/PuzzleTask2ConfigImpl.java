/**
 */
package config.impl;

import config.ConfigPackage;
import config.PuzzleTask2Config;
import java.util.Date;
import no.hal.pg.config.TaskProxy;
import no.hal.pg.config.impl.TaskConfigImpl;

import no.hal.pg.osm.GeoLocation;
import no.inlea.puzzletask2.runtime.Puzzle;
import no.inlea.puzzletask2.runtime.PuzzleTask2;
import no.inlea.puzzletask2.runtime.RuntimeFactory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle Task2 Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link config.impl.PuzzleTask2ConfigImpl#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link config.impl.PuzzleTask2ConfigImpl#getOpenTime <em>Open Time</em>}</li>
 *   <li>{@link config.impl.PuzzleTask2ConfigImpl#getCloseTime <em>Close Time</em>}</li>
 *   <li>{@link config.impl.PuzzleTask2ConfigImpl#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}</li>
 *   <li>{@link config.impl.PuzzleTask2ConfigImpl#getMaxScore <em>Max Score</em>}</li>
 *   <li>{@link config.impl.PuzzleTask2ConfigImpl#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}</li>
 *   <li>{@link config.impl.PuzzleTask2ConfigImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleTask2ConfigImpl extends TaskConfigImpl<PuzzleTask2> implements PuzzleTask2Config {
	/**
	 * The cached value of the '{@link #getPuzzle() <em>Puzzle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuzzle()
	 * @generated
	 * @ordered
	 */
	protected Puzzle puzzle;

	/**
	 * The default value of the '{@link #getOpenTime() <em>Open Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPEN_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOpenTime() <em>Open Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenTime()
	 * @generated
	 * @ordered
	 */
	protected Date openTime = OPEN_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getCloseTime() <em>Close Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSE_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCloseTime() <em>Close Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseTime()
	 * @generated
	 * @ordered
	 */
	protected Date closeTime = CLOSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptableTargetDistance() <em>Acceptable Target Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableTargetDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCEPTABLE_TARGET_DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAcceptableTargetDistance() <em>Acceptable Target Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableTargetDistance()
	 * @generated
	 * @ordered
	 */
	protected int acceptableTargetDistance = ACCEPTABLE_TARGET_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxScore() <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScore()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SCORE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxScore() <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScore()
	 * @generated
	 * @ordered
	 */
	protected int maxScore = MAX_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrongAttemptPenalty() <em>Wrong Attempt Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrongAttemptPenalty()
	 * @generated
	 * @ordered
	 */
	protected static final int WRONG_ATTEMPT_PENALTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWrongAttemptPenalty() <em>Wrong Attempt Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrongAttemptPenalty()
	 * @generated
	 * @ordered
	 */
	protected int wrongAttemptPenalty = WRONG_ATTEMPT_PENALTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected GeoLocation location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleTask2ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PUZZLE_TASK2_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Puzzle getPuzzle() {
		if (puzzle != null && puzzle.eIsProxy()) {
			InternalEObject oldPuzzle = (InternalEObject)puzzle;
			puzzle = (Puzzle)eResolveProxy(oldPuzzle);
			if (puzzle != oldPuzzle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.PUZZLE_TASK2_CONFIG__PUZZLE, oldPuzzle, puzzle));
			}
		}
		return puzzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Puzzle basicGetPuzzle() {
		return puzzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuzzle(Puzzle newPuzzle) {
		Puzzle oldPuzzle = puzzle;
		puzzle = newPuzzle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PUZZLE_TASK2_CONFIG__PUZZLE, oldPuzzle, puzzle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOpenTime() {
		return openTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenTime(Date newOpenTime) {
		Date oldOpenTime = openTime;
		openTime = newOpenTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PUZZLE_TASK2_CONFIG__OPEN_TIME, oldOpenTime, openTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCloseTime() {
		return closeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseTime(Date newCloseTime) {
		Date oldCloseTime = closeTime;
		closeTime = newCloseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PUZZLE_TASK2_CONFIG__CLOSE_TIME, oldCloseTime, closeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAcceptableTargetDistance() {
		return acceptableTargetDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptableTargetDistance(int newAcceptableTargetDistance) {
		int oldAcceptableTargetDistance = acceptableTargetDistance;
		acceptableTargetDistance = newAcceptableTargetDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PUZZLE_TASK2_CONFIG__ACCEPTABLE_TARGET_DISTANCE, oldAcceptableTargetDistance, acceptableTargetDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxScore() {
		return maxScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxScore(int newMaxScore) {
		int oldMaxScore = maxScore;
		maxScore = newMaxScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PUZZLE_TASK2_CONFIG__MAX_SCORE, oldMaxScore, maxScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWrongAttemptPenalty() {
		return wrongAttemptPenalty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrongAttemptPenalty(int newWrongAttemptPenalty) {
		int oldWrongAttemptPenalty = wrongAttemptPenalty;
		wrongAttemptPenalty = newWrongAttemptPenalty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PUZZLE_TASK2_CONFIG__WRONG_ATTEMPT_PENALTY, oldWrongAttemptPenalty, wrongAttemptPenalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (GeoLocation)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.PUZZLE_TASK2_CONFIG__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GeoLocation newLocation) {
		GeoLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PUZZLE_TASK2_CONFIG__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PUZZLE_TASK2_CONFIG__PUZZLE:
				if (resolve) return getPuzzle();
				return basicGetPuzzle();
			case ConfigPackage.PUZZLE_TASK2_CONFIG__OPEN_TIME:
				return getOpenTime();
			case ConfigPackage.PUZZLE_TASK2_CONFIG__CLOSE_TIME:
				return getCloseTime();
			case ConfigPackage.PUZZLE_TASK2_CONFIG__ACCEPTABLE_TARGET_DISTANCE:
				return getAcceptableTargetDistance();
			case ConfigPackage.PUZZLE_TASK2_CONFIG__MAX_SCORE:
				return getMaxScore();
			case ConfigPackage.PUZZLE_TASK2_CONFIG__WRONG_ATTEMPT_PENALTY:
				return getWrongAttemptPenalty();
			case ConfigPackage.PUZZLE_TASK2_CONFIG__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.PUZZLE_TASK2_CONFIG__PUZZLE:
				setPuzzle((Puzzle)newValue);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__OPEN_TIME:
				setOpenTime((Date)newValue);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__CLOSE_TIME:
				setCloseTime((Date)newValue);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__ACCEPTABLE_TARGET_DISTANCE:
				setAcceptableTargetDistance((Integer)newValue);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__MAX_SCORE:
				setMaxScore((Integer)newValue);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__WRONG_ATTEMPT_PENALTY:
				setWrongAttemptPenalty((Integer)newValue);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__LOCATION:
				setLocation((GeoLocation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.PUZZLE_TASK2_CONFIG__PUZZLE:
				setPuzzle((Puzzle)null);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__OPEN_TIME:
				setOpenTime(OPEN_TIME_EDEFAULT);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__CLOSE_TIME:
				setCloseTime(CLOSE_TIME_EDEFAULT);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__ACCEPTABLE_TARGET_DISTANCE:
				setAcceptableTargetDistance(ACCEPTABLE_TARGET_DISTANCE_EDEFAULT);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__MAX_SCORE:
				setMaxScore(MAX_SCORE_EDEFAULT);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__WRONG_ATTEMPT_PENALTY:
				setWrongAttemptPenalty(WRONG_ATTEMPT_PENALTY_EDEFAULT);
				return;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__LOCATION:
				setLocation((GeoLocation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.PUZZLE_TASK2_CONFIG__PUZZLE:
				return puzzle != null;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__OPEN_TIME:
				return OPEN_TIME_EDEFAULT == null ? openTime != null : !OPEN_TIME_EDEFAULT.equals(openTime);
			case ConfigPackage.PUZZLE_TASK2_CONFIG__CLOSE_TIME:
				return CLOSE_TIME_EDEFAULT == null ? closeTime != null : !CLOSE_TIME_EDEFAULT.equals(closeTime);
			case ConfigPackage.PUZZLE_TASK2_CONFIG__ACCEPTABLE_TARGET_DISTANCE:
				return acceptableTargetDistance != ACCEPTABLE_TARGET_DISTANCE_EDEFAULT;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__MAX_SCORE:
				return maxScore != MAX_SCORE_EDEFAULT;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__WRONG_ATTEMPT_PENALTY:
				return wrongAttemptPenalty != WRONG_ATTEMPT_PENALTY_EDEFAULT;
			case ConfigPackage.PUZZLE_TASK2_CONFIG__LOCATION:
				return location != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (openTime: ");
		result.append(openTime);
		result.append(", closeTime: ");
		result.append(closeTime);
		result.append(", acceptableTargetDistance: ");
		result.append(acceptableTargetDistance);
		result.append(", maxScore: ");
		result.append(maxScore);
		result.append(", wrongAttemptPenalty: ");
		result.append(wrongAttemptPenalty);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public PuzzleTask2 createTask(TaskProxy proxy) {
		PuzzleTask2 puzzleTask = RuntimeFactory.eINSTANCE.createPuzzleTask2();
		Puzzle puzzleCopy = EcoreUtil.copy(getPuzzle());
		puzzleTask.setPuzzle(puzzleCopy);
		puzzleTask.setOpenTime(getOpenTime());
		puzzleTask.setCloseTime(getCloseTime());
		puzzleTask.setAcceptableTargetDistance(getAcceptableTargetDistance());
		puzzleTask.setMaxScore(getMaxScore());
		puzzleTask.setWrongAttemptPenalty(getWrongAttemptPenalty());
		puzzleTask.setLatitude(getLocation().getLatitude());
		puzzleTask.setLongitude(getLocation().getLongitude());
		return puzzleTask;
	}

} //PuzzleTask2ConfigImpl
