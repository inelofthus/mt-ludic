/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.runtime.CompositeCondition;
import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.CompositeConditionImpl#isLogic <em>Logic</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.CompositeConditionImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionImpl<E> extends MinimalEObjectImpl.Container implements CompositeCondition<E> {
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
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.COMPOSITE_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.COMPOSITE_CONDITION__LOGIC, oldLogic, logic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, RuntimePackage.COMPOSITE_CONDITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean test() {
		return test(getConditions(), isLogic());
	}

	static boolean and(Iterable<Condition> conditions) {
		return test(conditions, false);
	}
	static boolean or(Iterable<Condition> conditions) {
		return test(conditions, true);
	}
	static boolean test(Iterable<Condition> conditions, boolean logic) {
		// short-circuit when the test value becomes logic
		// use logic == true for || and logic == false for &&
		for (Condition cond : conditions) {
			Boolean result = result(cond.test(), logic);
			if (result != null) {
				return result;
			}
		}
		return result(logic);
	}
	
	public static Boolean result(boolean value, boolean logic) {
		if (value == logic) {
			return Boolean.valueOf(logic);
		}
		return null;
	}
	public static Boolean result(boolean logic) {
		return ! logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.COMPOSITE_CONDITION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.COMPOSITE_CONDITION__LOGIC:
				return isLogic();
			case RuntimePackage.COMPOSITE_CONDITION__CONDITIONS:
				return getConditions();
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
			case RuntimePackage.COMPOSITE_CONDITION__LOGIC:
				setLogic((Boolean)newValue);
				return;
			case RuntimePackage.COMPOSITE_CONDITION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
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
			case RuntimePackage.COMPOSITE_CONDITION__LOGIC:
				setLogic(LOGIC_EDEFAULT);
				return;
			case RuntimePackage.COMPOSITE_CONDITION__CONDITIONS:
				getConditions().clear();
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
			case RuntimePackage.COMPOSITE_CONDITION__LOGIC:
				return logic != LOGIC_EDEFAULT;
			case RuntimePackage.COMPOSITE_CONDITION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
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
			case RuntimePackage.COMPOSITE_CONDITION___TEST:
				return test();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logic: ");
		result.append(logic);
		result.append(')');
		return result.toString();
	}

} //CompositePredicateImpl
