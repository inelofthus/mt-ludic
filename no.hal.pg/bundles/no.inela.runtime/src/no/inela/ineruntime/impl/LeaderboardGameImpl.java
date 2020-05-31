/**
 */
package no.inela.ineruntime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import no.hal.pg.arc.Group;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import no.hal.pg.runtime.impl.GameImpl;

import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.Leaderboard;
import no.inela.ineruntime.LeaderboardGame;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaderboard Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardGameImpl#getLeaderboard <em>Leaderboard</em>}</li>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardGameImpl#getPlayersActiveTasks <em>Players Active Tasks</em>}</li>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardGameImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeaderboardGameImpl extends GameImpl<Task<?>> implements LeaderboardGame {
	/**
	 * The cached value of the '{@link #getLeaderboard() <em>Leaderboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderboard()
	 * @generated
	 * @ordered
	 */
	protected Leaderboard leaderboard;

	/**
	 * The cached value of the '{@link #getPlayersActiveTasks() <em>Players Active Tasks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayersActiveTasks()
	 * @generated
	 * @ordered
	 */
	protected EMap<Player, Task<?>> playersActiveTasks;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> teams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeaderboardGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IneruntimePackage.Literals.LEADERBOARD_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Leaderboard getLeaderboard() {
		if (leaderboard == null) {
			setLeaderboard(no.inela.ineruntime.IneruntimeFactory.eINSTANCE.createLeaderboard());
		}
		return leaderboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeaderboard(Leaderboard newLeaderboard, NotificationChain msgs) {
		Leaderboard oldLeaderboard = leaderboard;
		leaderboard = newLeaderboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD, oldLeaderboard, newLeaderboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderboard(Leaderboard newLeaderboard) {
		if (newLeaderboard != leaderboard) {
			NotificationChain msgs = null;
			if (leaderboard != null)
				msgs = ((InternalEObject)leaderboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD, null, msgs);
			if (newLeaderboard != null)
				msgs = ((InternalEObject)newLeaderboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD, null, msgs);
			msgs = basicSetLeaderboard(newLeaderboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD, newLeaderboard, newLeaderboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Player, Task<?>> getPlayersActiveTasks() {
		if (playersActiveTasks == null) {
			playersActiveTasks = new EcoreEMap<Player,Task<?>>(IneruntimePackage.Literals.PLAYER_TO_TASK, PlayerToTaskImpl.class, this, IneruntimePackage.LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS);
		}
		return playersActiveTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList<Group>(Group.class, this, IneruntimePackage.LEADERBOARD_GAME__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Task<?> getActiveTask(Player player) {
		if (getPlayersActiveTasks().containsKey(player)){
			return getPlayersActiveTasks().get(player);
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateLeaderboard(Player player, int score) {
		EMap<Player, Integer> entries = getLeaderboard().getPlayerTotalScores();
		EMap<Group, Integer> teamEntries = getLeaderboard().getTeamTotalScores();
		int currentScore = 0;
		if (entries.containsKey(player)){
			currentScore = entries.get(player);
		}
		entries.put(player, currentScore + score);
		
		Group playerTeam = player.getPerson().getGroup();
		if (playerTeam != null){
			int currentTeamScore = 0;
			if (teamEntries.containsKey(playerTeam)){
				currentTeamScore = teamEntries.get(playerTeam);	
			}
			teamEntries.put(playerTeam, currentTeamScore + score);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD:
				return basicSetLeaderboard(null, msgs);
			case IneruntimePackage.LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS:
				return ((InternalEList<?>)getPlayersActiveTasks()).basicRemove(otherEnd, msgs);
			case IneruntimePackage.LEADERBOARD_GAME__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
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
			case IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD:
				return getLeaderboard();
			case IneruntimePackage.LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS:
				if (coreType) return getPlayersActiveTasks();
				else return getPlayersActiveTasks().map();
			case IneruntimePackage.LEADERBOARD_GAME__TEAMS:
				return getTeams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD:
				setLeaderboard((Leaderboard)newValue);
				return;
			case IneruntimePackage.LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS:
				((EStructuralFeature.Setting)getPlayersActiveTasks()).set(newValue);
				return;
			case IneruntimePackage.LEADERBOARD_GAME__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Group>)newValue);
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
			case IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD:
				setLeaderboard((Leaderboard)null);
				return;
			case IneruntimePackage.LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS:
				getPlayersActiveTasks().clear();
				return;
			case IneruntimePackage.LEADERBOARD_GAME__TEAMS:
				getTeams().clear();
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
			case IneruntimePackage.LEADERBOARD_GAME__LEADERBOARD:
				return leaderboard != null;
			case IneruntimePackage.LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS:
				return playersActiveTasks != null && !playersActiveTasks.isEmpty();
			case IneruntimePackage.LEADERBOARD_GAME__TEAMS:
				return teams != null && !teams.isEmpty();
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
			case IneruntimePackage.LEADERBOARD_GAME___GET_ACTIVE_TASK__PLAYER:
				return getActiveTask((Player)arguments.get(0));
			case IneruntimePackage.LEADERBOARD_GAME___UPDATE_LEADERBOARD__PLAYER_INT:
				updateLeaderboard((Player)arguments.get(0), (Integer)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LeaderboardGameImpl
