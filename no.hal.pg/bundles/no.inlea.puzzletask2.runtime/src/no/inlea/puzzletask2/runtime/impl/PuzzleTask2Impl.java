/**
 */
package no.inlea.puzzletask2.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.OsmPackage;

import no.hal.pg.osm.geoutil.LatLong;
import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.IsTaskFinishedCondition;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.impl.TaskImpl;
import no.inela.ineruntime.LeaderboardGame;
import no.inlea.puzzletask2.runtime.Puzzle;
import no.inlea.puzzletask2.runtime.PuzzleTask2;
import no.inlea.puzzletask2.runtime.RuntimePackage;
import no.inlea.puzzletask2.runtime.TaskScores;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle Task2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getTaskScores <em>Task Scores</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getOpenTime <em>Open Time</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getCloseTime <em>Close Time</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getMaxScore <em>Max Score</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.PuzzleTask2Impl#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleTask2Impl extends TaskImpl<TaskScores> implements PuzzleTask2 {
	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected float latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected float longitude = LONGITUDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPuzzle() <em>Puzzle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuzzle()
	 * @generated
	 * @ordered
	 */
	protected Puzzle puzzle;

	/**
	 * The cached value of the '{@link #getTaskScores() <em>Task Scores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskScores()
	 * @generated
	 * @ordered
	 */
	protected TaskScores taskScores;

	/**
	 * The cached value of the '{@link #getAttempts() <em>Attempts</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected EMap<Player, Integer> attempts;

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
	protected static final int ACCEPTABLE_TARGET_DISTANCE_EDEFAULT = 10;

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
	protected static final int MAX_SCORE_EDEFAULT = 300;

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
	protected static final int WRONG_ATTEMPT_PENALTY_EDEFAULT = 100;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleTask2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PUZZLE_TASK2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setResult(TaskScores newResult) {
		super.setResult(newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(float newLatitude) {
		float oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(float newLongitude) {
		float oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Puzzle getPuzzle() {
		return puzzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPuzzle(Puzzle newPuzzle, NotificationChain msgs) {
		Puzzle oldPuzzle = puzzle;
		puzzle = newPuzzle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__PUZZLE, oldPuzzle, newPuzzle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPuzzle(Puzzle newPuzzle) {
		if (newPuzzle != puzzle) {
			NotificationChain msgs = null;
			if (puzzle != null)
				msgs = ((InternalEObject)puzzle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.PUZZLE_TASK2__PUZZLE, null, msgs);
			if (newPuzzle != null)
				msgs = ((InternalEObject)newPuzzle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.PUZZLE_TASK2__PUZZLE, null, msgs);
			msgs = basicSetPuzzle(newPuzzle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__PUZZLE, newPuzzle, newPuzzle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TaskScores getTaskScores() {
		if (taskScores == null) {
			setTaskScores(no.inlea.puzzletask2.runtime.RuntimeFactory.eINSTANCE.createTaskScores());
		}
		return taskScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskScores(TaskScores newTaskScores, NotificationChain msgs) {
		TaskScores oldTaskScores = taskScores;
		taskScores = newTaskScores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__TASK_SCORES, oldTaskScores, newTaskScores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskScores(TaskScores newTaskScores) {
		if (newTaskScores != taskScores) {
			NotificationChain msgs = null;
			if (taskScores != null)
				msgs = ((InternalEObject)taskScores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.PUZZLE_TASK2__TASK_SCORES, null, msgs);
			if (newTaskScores != null)
				msgs = ((InternalEObject)newTaskScores).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.PUZZLE_TASK2__TASK_SCORES, null, msgs);
			msgs = basicSetTaskScores(newTaskScores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__TASK_SCORES, newTaskScores, newTaskScores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<Player, Integer> getAttempts() {
		if (attempts == null) {
			attempts = new EcoreEMap<Player,Integer>(RuntimePackage.Literals.PLAYER_TO_INT, PlayerToIntImpl.class, this, RuntimePackage.PUZZLE_TASK2__ATTEMPTS);
		}
		return attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpenTime() {
		return openTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenTime(Date newOpenTime) {
		Date oldOpenTime = openTime;
		openTime = newOpenTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__OPEN_TIME, oldOpenTime, openTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCloseTime() {
		return closeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloseTime(Date newCloseTime) {
		Date oldCloseTime = closeTime;
		closeTime = newCloseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__CLOSE_TIME, oldCloseTime, closeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAcceptableTargetDistance() {
		return acceptableTargetDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcceptableTargetDistance(int newAcceptableTargetDistance) {
		int oldAcceptableTargetDistance = acceptableTargetDistance;
		acceptableTargetDistance = newAcceptableTargetDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__ACCEPTABLE_TARGET_DISTANCE, oldAcceptableTargetDistance, acceptableTargetDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxScore() {
		return maxScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxScore(int newMaxScore) {
		int oldMaxScore = maxScore;
		maxScore = newMaxScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__MAX_SCORE, oldMaxScore, maxScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWrongAttemptPenalty() {
		return wrongAttemptPenalty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrongAttemptPenalty(int newWrongAttemptPenalty) {
		int oldWrongAttemptPenalty = wrongAttemptPenalty;
		wrongAttemptPenalty = newWrongAttemptPenalty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK2__WRONG_ATTEMPT_PENALTY, oldWrongAttemptPenalty, wrongAttemptPenalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean acceptProposal(String proposal, Player player) {
		if (! getPlayers().contains(player)) {
			throw new IllegalArgumentException("Player must be one of this task's players");
		}
		boolean isCorrect = getPuzzle().acceptProposal(proposal);		
		if (isCorrect) {
			int score = calculateScore(player, isCorrect);
			removePlayerFromTask(player, score, getPuzzle());
			
		} else {
			incrementAttempts(player);
		}
		
		return isCorrect;
	}
	
	private void incrementAttempts(Player player) {
		if (getAttempts().containsKey(player)){
			Integer numAttempts = getAttempts().get(player) + 1;
			getAttempts().put(player, numAttempts);
		} else {
			getAttempts().put(player, 1);
		}
	}
	
	private void removePlayerFromTask(Player player, int score, Puzzle puzzle) {
		getTaskScores().getTaskScores().put(player, score);
		puzzle.finishPuzzle(player);
		removeTaskFromActive(player);
		getPlayers().remove(player);
		updateLeaderboard(player, score);
		finish(getTaskScores());
	}
	
	private void removeTaskFromActive(Player player) {
		if (eContainer() instanceof LeaderboardGame) {
			LeaderboardGame game = (LeaderboardGame) eContainer();
			game.getPlayersActiveTasks().removeKey(player);
		}
	}
	
	private void updateLeaderboard(Player player, int score) {
		if (this.eContainer() instanceof LeaderboardGame) {
			((LeaderboardGame) eContainer()).updateLeaderboard(player, score);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int calculateScore(Player player, boolean isProposalCorrect) {
		int numAttempts = 0;
		if (getAttempts().containsKey(player)){
			numAttempts = getAttempts().get(player);
		}
		return Math.max(0, getMaxScore() - numAttempts * getWrongAttemptPenalty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean acceptPlayer(Player player) {
		return isOnlyActiveTask(player) && !isCompletedByPlayer(player) 
				&& arePrevTasksCompletedByPlayer(player) && isTimeWithinInterval();
	}
	
	private boolean arePrevTasksCompletedByPlayer(Player player) {
		for (Condition condition : this.getStartConditions()) {
			if (condition instanceof IsTaskFinishedCondition) {
				Task<?> task = ((IsTaskFinishedCondition) condition).getContext();
				if (task instanceof PuzzleTask2) {
					boolean prevCompleted = ((PuzzleTask2) task).isCompletedByPlayer(player);
					if (!prevCompleted) return false;
				}
			}
		}
		return true;
	}
	
	private boolean isOnlyActiveTask(Player player) {
		if (eContainer() instanceof LeaderboardGame) {
			LeaderboardGame game = (LeaderboardGame) eContainer();
			Task<?> activeTask = game.getActiveTask(player);
			if (activeTask == this || activeTask == null || !activeTask.canStart()) {
				return true;
			}
		}
		return false;
	}
	
	private void setTaskActive(Player player) {
		if (eContainer() instanceof LeaderboardGame) {
			LeaderboardGame game = (LeaderboardGame) eContainer();
			game.getPlayersActiveTasks().put(player, this);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isTimeWithinInterval() {
		long time = System.currentTimeMillis();
		boolean afterOpen = true;
		boolean beforeClose = true;
		
		if (getOpenTime() != null) {
			afterOpen = time > getOpenTime().getTime();
		}
		if (getOpenTime() != null) {
			beforeClose = time < getCloseTime().getTime();
		}
		
		return afterOpen && beforeClose;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean canStart(Player player) {
		return super.canStart() && acceptPlayer(player);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean quitPuzzle(Player player) {
		removePlayerFromTask(player, 0, getPuzzle());
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isCompletedByPlayer(Player player) {
		if (getTaskScores() != null) {
			if (!getTaskScores().getTaskScores().containsKey(player)){return false;}
			return getTaskScores().getTaskScores().get(player) > 0;
		} else {
			return false;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LatLong getLatLong() {
		return new LatLong(getLatitude(), getLongitude());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK2__PUZZLE:
				return basicSetPuzzle(null, msgs);
			case RuntimePackage.PUZZLE_TASK2__TASK_SCORES:
				return basicSetTaskScores(null, msgs);
			case RuntimePackage.PUZZLE_TASK2__ATTEMPTS:
				return ((InternalEList<?>)getAttempts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK2__LATITUDE:
				return getLatitude();
			case RuntimePackage.PUZZLE_TASK2__LONGITUDE:
				return getLongitude();
			case RuntimePackage.PUZZLE_TASK2__PUZZLE:
				return getPuzzle();
			case RuntimePackage.PUZZLE_TASK2__TASK_SCORES:
				return getTaskScores();
			case RuntimePackage.PUZZLE_TASK2__ATTEMPTS:
				if (coreType) return getAttempts();
				else return getAttempts().map();
			case RuntimePackage.PUZZLE_TASK2__OPEN_TIME:
				return getOpenTime();
			case RuntimePackage.PUZZLE_TASK2__CLOSE_TIME:
				return getCloseTime();
			case RuntimePackage.PUZZLE_TASK2__ACCEPTABLE_TARGET_DISTANCE:
				return getAcceptableTargetDistance();
			case RuntimePackage.PUZZLE_TASK2__MAX_SCORE:
				return getMaxScore();
			case RuntimePackage.PUZZLE_TASK2__WRONG_ATTEMPT_PENALTY:
				return getWrongAttemptPenalty();
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
			case RuntimePackage.PUZZLE_TASK2__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__PUZZLE:
				setPuzzle((Puzzle)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__TASK_SCORES:
				setTaskScores((TaskScores)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__ATTEMPTS:
				((EStructuralFeature.Setting)getAttempts()).set(newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__OPEN_TIME:
				setOpenTime((Date)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__CLOSE_TIME:
				setCloseTime((Date)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__ACCEPTABLE_TARGET_DISTANCE:
				setAcceptableTargetDistance((Integer)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__MAX_SCORE:
				setMaxScore((Integer)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK2__WRONG_ATTEMPT_PENALTY:
				setWrongAttemptPenalty((Integer)newValue);
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
			case RuntimePackage.PUZZLE_TASK2__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK2__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK2__PUZZLE:
				setPuzzle((Puzzle)null);
				return;
			case RuntimePackage.PUZZLE_TASK2__TASK_SCORES:
				setTaskScores((TaskScores)null);
				return;
			case RuntimePackage.PUZZLE_TASK2__ATTEMPTS:
				getAttempts().clear();
				return;
			case RuntimePackage.PUZZLE_TASK2__OPEN_TIME:
				setOpenTime(OPEN_TIME_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK2__CLOSE_TIME:
				setCloseTime(CLOSE_TIME_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK2__ACCEPTABLE_TARGET_DISTANCE:
				setAcceptableTargetDistance(ACCEPTABLE_TARGET_DISTANCE_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK2__MAX_SCORE:
				setMaxScore(MAX_SCORE_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK2__WRONG_ATTEMPT_PENALTY:
				setWrongAttemptPenalty(WRONG_ATTEMPT_PENALTY_EDEFAULT);
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
			case RuntimePackage.PUZZLE_TASK2__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK2__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK2__PUZZLE:
				return puzzle != null;
			case RuntimePackage.PUZZLE_TASK2__TASK_SCORES:
				return taskScores != null;
			case RuntimePackage.PUZZLE_TASK2__ATTEMPTS:
				return attempts != null && !attempts.isEmpty();
			case RuntimePackage.PUZZLE_TASK2__OPEN_TIME:
				return OPEN_TIME_EDEFAULT == null ? openTime != null : !OPEN_TIME_EDEFAULT.equals(openTime);
			case RuntimePackage.PUZZLE_TASK2__CLOSE_TIME:
				return CLOSE_TIME_EDEFAULT == null ? closeTime != null : !CLOSE_TIME_EDEFAULT.equals(closeTime);
			case RuntimePackage.PUZZLE_TASK2__ACCEPTABLE_TARGET_DISTANCE:
				return acceptableTargetDistance != ACCEPTABLE_TARGET_DISTANCE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK2__MAX_SCORE:
				return maxScore != MAX_SCORE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK2__WRONG_ATTEMPT_PENALTY:
				return wrongAttemptPenalty != WRONG_ATTEMPT_PENALTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (derivedFeatureID) {
				case RuntimePackage.PUZZLE_TASK2__LATITUDE: return OsmPackage.GEO_LOCATION__LATITUDE;
				case RuntimePackage.PUZZLE_TASK2__LONGITUDE: return OsmPackage.GEO_LOCATION__LONGITUDE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (baseFeatureID) {
				case OsmPackage.GEO_LOCATION__LATITUDE: return RuntimePackage.PUZZLE_TASK2__LATITUDE;
				case OsmPackage.GEO_LOCATION__LONGITUDE: return RuntimePackage.PUZZLE_TASK2__LONGITUDE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (baseOperationID) {
				case OsmPackage.GEO_LOCATED___GET_LAT_LONG: return RuntimePackage.PUZZLE_TASK2___GET_LAT_LONG;
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.PUZZLE_TASK2___ACCEPT_PROPOSAL__STRING_PLAYER:
				return acceptProposal((String)arguments.get(0), (Player)arguments.get(1));
			case RuntimePackage.PUZZLE_TASK2___CALCULATE_SCORE__PLAYER_BOOLEAN:
				return calculateScore((Player)arguments.get(0), (Boolean)arguments.get(1));
			case RuntimePackage.PUZZLE_TASK2___ACCEPT_PLAYER__PLAYER:
				return acceptPlayer((Player)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK2___IS_TIME_WITHIN_INTERVAL:
				return isTimeWithinInterval();
			case RuntimePackage.PUZZLE_TASK2___CAN_START__PLAYER:
				return canStart((Player)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK2___QUIT_PUZZLE__PLAYER:
				return quitPuzzle((Player)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK2___IS_COMPLETED_BY_PLAYER__PLAYER:
				return isCompletedByPlayer((Player)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK2___START__PLAYER:
				start((Player)arguments.get(0));
				return null;
			case RuntimePackage.PUZZLE_TASK2___CHECK_TARGET_DISTANCE__GEOLOCATED:
				return checkTargetDistance((GeoLocated)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK2___CHECK_PLAYER_LOCATION__PLAYER:
				return checkPlayerLocation((Player)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK2___GET_LAT_LONG:
				return getLatLong();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", openTime: ");
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
	
	public void start(Player player) {
		setTaskActive(player);
		getPlayers().add(player);
		getPuzzle().startPuzzle(player); 
		this.start();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double checkTargetDistance(GeoLocated geoLocated) {
		return LatLong.distance(getLatLong(), geoLocated.getLatLong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkPlayerLocation(Player player) {
		return checkTargetDistance(player) <= getAcceptableTargetDistance();
	}
	
	

} //PuzzleTask2Impl
