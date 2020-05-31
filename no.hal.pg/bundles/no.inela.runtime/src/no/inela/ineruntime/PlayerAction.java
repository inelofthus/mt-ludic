/**
 */
package no.inela.ineruntime;

import no.hal.pg.runtime.Player;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.inela.ineruntime.IneruntimePackage#getPlayerAction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PlayerAction extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void perform(Player player);

} // PlayerAction
