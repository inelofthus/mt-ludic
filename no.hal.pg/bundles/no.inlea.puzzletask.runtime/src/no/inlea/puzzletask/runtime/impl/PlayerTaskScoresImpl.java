/**
 */
package no.inlea.puzzletask.runtime.impl;

import java.util.Collection;

import no.inlea.puzzletask.runtime.PlayerTaskScore;
import no.inlea.puzzletask.runtime.PlayerTaskScores;
import no.inlea.puzzletask.runtime.RuntimePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Task Scores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PlayerTaskScoresImpl#getScores <em>Scores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerTaskScoresImpl extends MinimalEObjectImpl.Container implements PlayerTaskScores {
	/**
	 * The cached value of the '{@link #getScores() <em>Scores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScores()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerTaskScore> scores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerTaskScoresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PLAYER_TASK_SCORES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayerTaskScore> getScores() {
		if (scores == null) {
			scores = new EObjectResolvingEList<PlayerTaskScore>(PlayerTaskScore.class, this, RuntimePackage.PLAYER_TASK_SCORES__SCORES);
		}
		return scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.PLAYER_TASK_SCORES__SCORES:
				return getScores();
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
			case RuntimePackage.PLAYER_TASK_SCORES__SCORES:
				getScores().clear();
				getScores().addAll((Collection<? extends PlayerTaskScore>)newValue);
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
			case RuntimePackage.PLAYER_TASK_SCORES__SCORES:
				getScores().clear();
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
			case RuntimePackage.PLAYER_TASK_SCORES__SCORES:
				return scores != null && !scores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlayerTaskScoresImpl
