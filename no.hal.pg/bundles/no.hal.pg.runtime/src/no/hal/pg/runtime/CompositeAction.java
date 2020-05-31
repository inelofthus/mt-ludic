/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.CompositeAction#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getCompositeAction()
 * @model
 * @generated
 */
public interface CompositeAction extends Action {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getCompositeAction_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // CompositeAction
