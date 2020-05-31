/**
 */
package no.inlea.puzzletask2.runtime.impl;

import no.hal.pg.runtime.Player;
import no.inlea.puzzletask2.runtime.RuntimePackage;
import no.inlea.puzzletask2.runtime.TaskScores;

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
 * An implementation of the model object '<em><b>Task Scores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.impl.TaskScoresImpl#getTaskScores <em>Task Scores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskScoresImpl extends MinimalEObjectImpl.Container implements TaskScores {
	/**
	 * The cached value of the '{@link #getTaskScores() <em>Task Scores</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskScores()
	 * @generated
	 * @ordered
	 */
	protected EMap<Player, Integer> taskScores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskScoresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.TASK_SCORES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<Player, Integer> getTaskScores() {
		if (taskScores == null) {
			taskScores = new EcoreEMap<Player,Integer>(RuntimePackage.Literals.PLAYER_TO_INT, PlayerToIntImpl.class, this, RuntimePackage.TASK_SCORES__TASK_SCORES);
		}
		return taskScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.TASK_SCORES__TASK_SCORES:
				return ((InternalEList<?>)getTaskScores()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.TASK_SCORES__TASK_SCORES:
				if (coreType) return getTaskScores();
				else return getTaskScores().map();
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
			case RuntimePackage.TASK_SCORES__TASK_SCORES:
				((EStructuralFeature.Setting)getTaskScores()).set(newValue);
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
			case RuntimePackage.TASK_SCORES__TASK_SCORES:
				getTaskScores().clear();
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
			case RuntimePackage.TASK_SCORES__TASK_SCORES:
				return taskScores != null && !taskScores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskScoresImpl
