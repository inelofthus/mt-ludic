/**
 */
package no.inlea.puzzletask.runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Task Scores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.PlayerTaskScores#getScores <em>Scores</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPlayerTaskScores()
 * @model
 * @generated
 */
public interface PlayerTaskScores extends EObject {
	/**
	 * Returns the value of the '<em><b>Scores</b></em>' reference list.
	 * The list contents are of type {@link no.inlea.puzzletask.runtime.PlayerTaskScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scores</em>' reference list.
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPlayerTaskScores_Scores()
	 * @model
	 * @generated
	 */
	EList<PlayerTaskScore> getScores();

} // PlayerTaskScores
