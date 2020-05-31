/**
 */
package no.inela.ineruntime.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import no.hal.pg.runtime.Player;

import no.inela.ineruntime.CompositePlayerCondition;
import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.PlayerCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Player Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.impl.CompositePlayerConditionImpl#isLogic <em>Logic</em>}</li>
 *   <li>{@link no.inela.ineruntime.impl.CompositePlayerConditionImpl#getPlayerConditions <em>Player Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositePlayerConditionImpl extends MinimalEObjectImpl.Container implements CompositePlayerCondition {
	/**
	 * The default value of the '{@link #isLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOGIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogic()
	 * @generated
	 * @ordered
	 */
	protected boolean logic = LOGIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayerConditions() <em>Player Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerCondition> playerConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePlayerConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IneruntimePackage.Literals.COMPOSITE_PLAYER_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogic(boolean newLogic) {
		boolean oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IneruntimePackage.COMPOSITE_PLAYER_CONDITION__LOGIC, oldLogic, logic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayerCondition> getPlayerConditions() {
		if (playerConditions == null) {
			playerConditions = new EObjectContainmentEList<PlayerCondition>(PlayerCondition.class, this, IneruntimePackage.COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS);
		}
		return playerConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean test(Player player) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS:
				return ((InternalEList<?>)getPlayerConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__LOGIC:
				return isLogic();
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS:
				return getPlayerConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__LOGIC:
				setLogic((Boolean)newValue);
				return;
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS:
				getPlayerConditions().clear();
				getPlayerConditions().addAll((Collection<? extends PlayerCondition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__LOGIC:
				setLogic(LOGIC_EDEFAULT);
				return;
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS:
				getPlayerConditions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__LOGIC:
				return logic != LOGIC_EDEFAULT;
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS:
				return playerConditions != null && !playerConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IneruntimePackage.COMPOSITE_PLAYER_CONDITION___TEST__PLAYER:
				return test((Player)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (logic: ");
		result.append(logic);
		result.append(')');
		return result.toString();
	}

} //CompositePlayerConditionImpl
