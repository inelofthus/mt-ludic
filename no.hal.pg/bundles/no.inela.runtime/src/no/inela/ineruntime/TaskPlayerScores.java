/**
 */
package no.inela.ineruntime;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Player Scores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.TaskPlayerScores#getTask <em>Task</em>}</li>
 *   <li>{@link no.inela.ineruntime.TaskPlayerScores#getPlayerScores <em>Player Scores</em>}</li>
 * </ul>
 *
 * @see no.inela.ineruntime.IneruntimePackage#getTaskPlayerScores()
 * @model
 * @generated
 */
public interface TaskPlayerScores extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see no.inela.ineruntime.IneruntimePackage#getTaskPlayerScores_Task()
	 * @model type="no.hal.pg.runtime.Task&lt;org.eclipse.emf.ecore.EBooleanObject&gt;"
	 * @generated
	 */
	Task<Boolean> getTask();

	/**
	 * Sets the value of the '{@link no.inela.ineruntime.TaskPlayerScores#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task<Boolean> value);

	/**
	 * Returns the value of the '<em><b>Player Scores</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Scores</em>' map.
	 * @see no.inela.ineruntime.IneruntimePackage#getTaskPlayerScores_PlayerScores()
	 * @model mapType="no.inela.ineruntime.PlayerToInt&lt;no.hal.pg.runtime.Player, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<Player, Integer> getPlayerScores();

} // TaskPlayerScores
