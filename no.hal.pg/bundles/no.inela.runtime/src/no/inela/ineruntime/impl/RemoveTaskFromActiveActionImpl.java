/**
 */
package no.inela.ineruntime.impl;

import java.lang.reflect.InvocationTargetException;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.LeaderboardGame;
import no.inela.ineruntime.RemoveTaskFromActiveAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Task From Active Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.impl.RemoveTaskFromActiveActionImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveTaskFromActiveActionImpl extends MinimalEObjectImpl.Container implements RemoveTaskFromActiveAction {
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
	protected RemoveTaskFromActiveActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IneruntimePackage.Literals.REMOVE_TASK_FROM_ACTIVE_ACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION__TASK, oldTask, task));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void perform(Player player) {
		if (eContainer().eContainer() instanceof LeaderboardGame) {
			LeaderboardGame game = (LeaderboardGame) eContainer().eContainer();
			game.getPlayersActiveTasks().removeKey(player);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION__TASK:
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
			case IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION__TASK:
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
			case IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION__TASK:
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
			case IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION__TASK:
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
			case IneruntimePackage.REMOVE_TASK_FROM_ACTIVE_ACTION___PERFORM__PLAYER:
				perform((Player)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RemoveTaskFromActiveActionImpl
