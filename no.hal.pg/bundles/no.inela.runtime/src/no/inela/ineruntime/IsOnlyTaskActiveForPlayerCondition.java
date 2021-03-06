/**
 */
package no.inela.ineruntime;

import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Only Task Active For Player Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see no.inela.ineruntime.IneruntimePackage#getIsOnlyTaskActiveForPlayerCondition()
 * @model
 * @generated
 */
public interface IsOnlyTaskActiveForPlayerCondition extends PlayerCondition {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see no.inela.ineruntime.IneruntimePackage#getIsOnlyTaskActiveForPlayerCondition_Task()
	 * @model
	 * @generated
	 */
	Task<?> getTask();

	/**
	 * Sets the value of the '{@link no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task<?> value);

} // IsOnlyTaskActiveForPlayerCondition
