/**
 */
package no.inela.ineruntime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import no.hal.pg.runtime.Player;
import no.inela.ineruntime.CompositePlayerAction;
import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.PlayerAction;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Player Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.impl.CompositePlayerActionImpl#getPlayerActions <em>Player Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositePlayerActionImpl extends MinimalEObjectImpl.Container implements CompositePlayerAction {
	/**
	 * The cached value of the '{@link #getPlayerActions() <em>Player Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerActions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerAction> playerActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePlayerActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IneruntimePackage.Literals.COMPOSITE_PLAYER_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayerAction> getPlayerActions() {
		if (playerActions == null) {
			playerActions = new EObjectContainmentEList<PlayerAction>(PlayerAction.class, this, IneruntimePackage.COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS);
		}
		return playerActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void perform(Player player) {
		performPlayerActions(getPlayerActions(), player);
	}
	
	static void performPlayerActions(Iterable<PlayerAction> playerActions, Player player){
		for (PlayerAction playerAction : playerActions) {
			playerAction.perform(player);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS:
				return ((InternalEList<?>)getPlayerActions()).basicRemove(otherEnd, msgs);
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
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS:
				return getPlayerActions();
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
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS:
				getPlayerActions().clear();
				getPlayerActions().addAll((Collection<? extends PlayerAction>)newValue);
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
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS:
				getPlayerActions().clear();
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
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS:
				return playerActions != null && !playerActions.isEmpty();
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
			case IneruntimePackage.COMPOSITE_PLAYER_ACTION___PERFORM__PLAYER:
				perform((Player)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositePlayerActionImpl
