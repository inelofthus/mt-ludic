/**
 */
package no.inela.ineruntime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Player Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.CompositePlayerAction#getPlayerActions <em>Player Actions</em>}</li>
 * </ul>
 *
 * @see no.inela.ineruntime.IneruntimePackage#getCompositePlayerAction()
 * @model
 * @generated
 */
public interface CompositePlayerAction extends PlayerAction {
	/**
	 * Returns the value of the '<em><b>Player Actions</b></em>' containment reference list.
	 * The list contents are of type {@link no.inela.ineruntime.PlayerAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Actions</em>' containment reference list.
	 * @see no.inela.ineruntime.IneruntimePackage#getCompositePlayerAction_PlayerActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlayerAction> getPlayerActions();

} // CompositePlayerAction
