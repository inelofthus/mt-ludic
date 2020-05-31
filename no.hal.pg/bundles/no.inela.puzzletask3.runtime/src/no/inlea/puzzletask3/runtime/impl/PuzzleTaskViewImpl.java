/**
 */
package no.inlea.puzzletask3.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import no.hal.pg.app.TaskView;
import no.hal.pg.app.impl.TaskViewImpl;
import no.hal.pg.osm.geoutil.LatLong;
import no.inela.ineruntime.LeaderboardGame;
import no.inlea.puzzletask3.runtime.PuzzleTask3;
import no.inlea.puzzletask3.runtime.PuzzleTaskView;
import no.inlea.puzzletask3.runtime.RuntimePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle Task View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#getContent <em>Content</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#getScore <em>Score</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#getTaskLocation <em>Task Location</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#isIsCompletedByPlayer <em>Is Completed By Player</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#isActive <em>Active</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#getCloseTime <em>Close Time</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl#getNumberOfActivePlayers <em>Number Of Active Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleTaskViewImpl extends TaskViewImpl<PuzzleTask3> implements PuzzleTaskView {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final int SCORE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTaskLocation() <em>Task Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskLocation()
	 * @generated
	 * @ordered
	 */
	protected static final LatLong TASK_LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsCompletedByPlayer() <em>Is Completed By Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCompletedByPlayer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETED_BY_PLAYER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_EDEFAULT = null;

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
	 * The default value of the '{@link #getNumberOfActivePlayers() <em>Number Of Active Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfActivePlayers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ACTIVE_PLAYERS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleTaskViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PUZZLE_TASK_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getContent() {
		return this.getModel().getPuzzle().getPuzzleContent(getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getScore() {
		return this.getModel().getTaskScores().getTaskScores().get(getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public LatLong getTaskLocation() {
		return this.getModel().getLatLong();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isIsCompletedByPlayer() {
		return this.getModel().getTaskScores().getTaskScores().containsKey(getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isActive() {
		PuzzleTask3 task = this.getModel();
		if (task.eContainer() instanceof LeaderboardGame) {
			LeaderboardGame game = (LeaderboardGame) task.eContainer();
			return task == game.getActiveTask(getUser());
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getDistance() {
		return (int) this.getModel().checkTargetDistance(getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getInstructions() {
		return this.getModel().getPuzzle().getInstructions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Date getCloseTime() {
		return this.getModel().getCloseTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumberOfActivePlayers() {
		return this.getModel().getPlayers().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean proposeAnswer(String proposal) {
		return this.getModel().acceptProposal(proposal, this.getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void startPuzzle() {
		if (getModel().getPlayers().contains(getUser())){
			getModel().getPuzzle().startPuzzle(getUser());
		} else {
			throw new IllegalStateException("Player not in task");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean acceptPlayer() {
		return getModel().acceptPlayer(getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean quitPuzzle() {
		return this.getModel().quitPuzzle(getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK_VIEW__CONTENT:
				return getContent();
			case RuntimePackage.PUZZLE_TASK_VIEW__SCORE:
				return getScore();
			case RuntimePackage.PUZZLE_TASK_VIEW__TASK_LOCATION:
				return getTaskLocation();
			case RuntimePackage.PUZZLE_TASK_VIEW__IS_COMPLETED_BY_PLAYER:
				return isIsCompletedByPlayer();
			case RuntimePackage.PUZZLE_TASK_VIEW__ACTIVE:
				return isActive();
			case RuntimePackage.PUZZLE_TASK_VIEW__DISTANCE:
				return getDistance();
			case RuntimePackage.PUZZLE_TASK_VIEW__INSTRUCTIONS:
				return getInstructions();
			case RuntimePackage.PUZZLE_TASK_VIEW__CLOSE_TIME:
				return getCloseTime();
			case RuntimePackage.PUZZLE_TASK_VIEW__NUMBER_OF_ACTIVE_PLAYERS:
				return getNumberOfActivePlayers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK_VIEW__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case RuntimePackage.PUZZLE_TASK_VIEW__SCORE:
				return getScore() != SCORE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK_VIEW__TASK_LOCATION:
				return TASK_LOCATION_EDEFAULT == null ? getTaskLocation() != null : !TASK_LOCATION_EDEFAULT.equals(getTaskLocation());
			case RuntimePackage.PUZZLE_TASK_VIEW__IS_COMPLETED_BY_PLAYER:
				return isIsCompletedByPlayer() != IS_COMPLETED_BY_PLAYER_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK_VIEW__ACTIVE:
				return isActive() != ACTIVE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK_VIEW__DISTANCE:
				return getDistance() != DISTANCE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK_VIEW__INSTRUCTIONS:
				return INSTRUCTIONS_EDEFAULT == null ? getInstructions() != null : !INSTRUCTIONS_EDEFAULT.equals(getInstructions());
			case RuntimePackage.PUZZLE_TASK_VIEW__CLOSE_TIME:
				return CLOSE_TIME_EDEFAULT == null ? getCloseTime() != null : !CLOSE_TIME_EDEFAULT.equals(getCloseTime());
			case RuntimePackage.PUZZLE_TASK_VIEW__NUMBER_OF_ACTIVE_PLAYERS:
				return getNumberOfActivePlayers() != NUMBER_OF_ACTIVE_PLAYERS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING:
				return proposeAnswer((String)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK_VIEW___START_PUZZLE:
				startPuzzle();
				return null;
			case RuntimePackage.PUZZLE_TASK_VIEW___ACCEPT_PLAYER:
				return acceptPlayer();
			case RuntimePackage.PUZZLE_TASK_VIEW___QUIT_PUZZLE:
				return quitPuzzle();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public TaskView<?> start() {
		if (acceptPlayer()) {
			((PuzzleTask3)getModel()).start(getUser());
			return this;
		} else {
			throw new IllegalStateException("Player not accepted");
		}
	}
	
	@Override
	public boolean isEnabled(){
		return getModel().canStart(getUser());
	}


} //PuzzleTaskViewImpl
