/**
 */
package no.inlea.puzzletask2.runtime;

import no.hal.pg.runtime.Player;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Scores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.TaskScores#getTaskScores <em>Task Scores</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getTaskScores()
 * @model
 * @generated
 */
public interface TaskScores extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Scores</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Scores</em>' map.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getTaskScores_TaskScores()
	 * @model mapType="no.inlea.puzzletask2.runtime.PlayerToInt&lt;no.hal.pg.runtime.Player, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<Player, Integer> getTaskScores();

} // TaskScores
