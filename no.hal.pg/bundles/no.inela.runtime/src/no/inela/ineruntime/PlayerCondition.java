/**
 */
package no.inela.ineruntime;

import no.hal.pg.runtime.Player;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.inela.ineruntime.IneruntimePackage#getPlayerCondition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PlayerCondition extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean test(Player player);

} // PlayerCondition
