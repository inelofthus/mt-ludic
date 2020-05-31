/**
 */
package no.inlea.puzzletask3.runtime;

import no.hal.pg.runtime.Player;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Task Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask3.runtime.PlayerTaskScore#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.PlayerTaskScore#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPlayerTaskScore()
 * @model
 * @generated
 */
public interface PlayerTaskScore extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPlayerTaskScore_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PlayerTaskScore#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(int)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getPlayerTaskScore_Score()
	 * @model
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.PlayerTaskScore#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(int value);

} // PlayerTaskScore
