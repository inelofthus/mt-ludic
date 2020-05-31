/**
 */
package no.inela.ineruntime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Player Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.CompositePlayerCondition#isLogic <em>Logic</em>}</li>
 *   <li>{@link no.inela.ineruntime.CompositePlayerCondition#getPlayerConditions <em>Player Conditions</em>}</li>
 * </ul>
 *
 * @see no.inela.ineruntime.IneruntimePackage#getCompositePlayerCondition()
 * @model
 * @generated
 */
public interface CompositePlayerCondition extends PlayerCondition {
	/**
	 * Returns the value of the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic</em>' attribute.
	 * @see #setLogic(boolean)
	 * @see no.inela.ineruntime.IneruntimePackage#getCompositePlayerCondition_Logic()
	 * @model
	 * @generated
	 */
	boolean isLogic();

	/**
	 * Sets the value of the '{@link no.inela.ineruntime.CompositePlayerCondition#isLogic <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' attribute.
	 * @see #isLogic()
	 * @generated
	 */
	void setLogic(boolean value);

	/**
	 * Returns the value of the '<em><b>Player Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.inela.ineruntime.PlayerCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Conditions</em>' containment reference list.
	 * @see no.inela.ineruntime.IneruntimePackage#getCompositePlayerCondition_PlayerConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlayerCondition> getPlayerConditions();

} // CompositePlayerCondition
