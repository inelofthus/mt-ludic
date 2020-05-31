/**
 */
package no.inela.ineruntime.impl;

import java.lang.reflect.InvocationTargetException;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Only Task Active For Player Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.impl.IsOnlyTaskActiveForPlayerConditionImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsOnlyTaskActiveForPlayerConditionImpl extends MinimalEObjectImpl.Container implements IsOnlyTaskActiveForPlayerCondition {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task<?> task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsOnlyTaskActiveForPlayerConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IneruntimePackage.Literals.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task<?> getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task<?>)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task<?> basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(Task<?> newTask) {
		Task<?> oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean test(Player player) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK:
				if (resolve) return getTask();
				return basicGetTask();
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
			case IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK:
				setTask((Task<?>)newValue);
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
			case IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK:
				setTask((Task<?>)null);
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
			case IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK:
				return task != null;
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
			case IneruntimePackage.IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION___TEST__PLAYER:
				return test((Player)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IsOnlyTaskActiveForPlayerConditionImpl
