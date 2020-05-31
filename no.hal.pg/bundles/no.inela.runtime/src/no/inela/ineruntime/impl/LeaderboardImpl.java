/**
 */
package no.inela.ineruntime.impl;

import no.hal.pg.arc.Group;
import no.hal.pg.runtime.Player;

import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.Leaderboard;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaderboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardImpl#getPlayerTotalScores <em>Player Total Scores</em>}</li>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardImpl#getTeamTotalScores <em>Team Total Scores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeaderboardImpl extends MinimalEObjectImpl.Container implements Leaderboard {
	/**
	 * The cached value of the '{@link #getPlayerTotalScores() <em>Player Total Scores</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerTotalScores()
	 * @generated
	 * @ordered
	 */
	protected EMap<Player, Integer> playerTotalScores;

	/**
	 * The cached value of the '{@link #getTeamTotalScores() <em>Team Total Scores</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamTotalScores()
	 * @generated
	 * @ordered
	 */
	protected EMap<Group, Integer> teamTotalScores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeaderboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IneruntimePackage.Literals.LEADERBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Player, Integer> getPlayerTotalScores() {
		if (playerTotalScores == null) {
			playerTotalScores = new EcoreEMap<Player,Integer>(IneruntimePackage.Literals.PLAYER_TO_INT, PlayerToIntImpl.class, this, IneruntimePackage.LEADERBOARD__PLAYER_TOTAL_SCORES);
		}
		return playerTotalScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Group, Integer> getTeamTotalScores() {
		if (teamTotalScores == null) {
			teamTotalScores = new EcoreEMap<Group,Integer>(IneruntimePackage.Literals.GROUP_TO_INT, GroupToIntImpl.class, this, IneruntimePackage.LEADERBOARD__TEAM_TOTAL_SCORES);
		}
		return teamTotalScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD__PLAYER_TOTAL_SCORES:
				return ((InternalEList<?>)getPlayerTotalScores()).basicRemove(otherEnd, msgs);
			case IneruntimePackage.LEADERBOARD__TEAM_TOTAL_SCORES:
				return ((InternalEList<?>)getTeamTotalScores()).basicRemove(otherEnd, msgs);
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
			case IneruntimePackage.LEADERBOARD__PLAYER_TOTAL_SCORES:
				if (coreType) return getPlayerTotalScores();
				else return getPlayerTotalScores().map();
			case IneruntimePackage.LEADERBOARD__TEAM_TOTAL_SCORES:
				if (coreType) return getTeamTotalScores();
				else return getTeamTotalScores().map();
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
			case IneruntimePackage.LEADERBOARD__PLAYER_TOTAL_SCORES:
				((EStructuralFeature.Setting)getPlayerTotalScores()).set(newValue);
				return;
			case IneruntimePackage.LEADERBOARD__TEAM_TOTAL_SCORES:
				((EStructuralFeature.Setting)getTeamTotalScores()).set(newValue);
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
			case IneruntimePackage.LEADERBOARD__PLAYER_TOTAL_SCORES:
				getPlayerTotalScores().clear();
				return;
			case IneruntimePackage.LEADERBOARD__TEAM_TOTAL_SCORES:
				getTeamTotalScores().clear();
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
			case IneruntimePackage.LEADERBOARD__PLAYER_TOTAL_SCORES:
				return playerTotalScores != null && !playerTotalScores.isEmpty();
			case IneruntimePackage.LEADERBOARD__TEAM_TOTAL_SCORES:
				return teamTotalScores != null && !teamTotalScores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LeaderboardImpl
