/**
 */
package no.hal.pg.runtime.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.GameImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.GameImpl#getItems <em>Items</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.GameImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl<T extends Task<?>> extends MinimalEObjectImpl.Container implements Game<T> {
	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<T> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentWithInverseEList<Player>(Player.class, this, RuntimePackage.GAME__PLAYERS, RuntimePackage.PLAYER__GAME);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, RuntimePackage.GAME__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<T> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<T>(Task.class, this, RuntimePackage.GAME__TASKS, RuntimePackage.TASK__GAME);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.GAME__PLAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayers()).basicAdd(otherEnd, msgs);
			case RuntimePackage.GAME__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.GAME__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case RuntimePackage.GAME__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case RuntimePackage.GAME__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.GAME__PLAYERS:
				return getPlayers();
			case RuntimePackage.GAME__ITEMS:
				return getItems();
			case RuntimePackage.GAME__TASKS:
				return getTasks();
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
			case RuntimePackage.GAME__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case RuntimePackage.GAME__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case RuntimePackage.GAME__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends T>)newValue);
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
			case RuntimePackage.GAME__PLAYERS:
				getPlayers().clear();
				return;
			case RuntimePackage.GAME__ITEMS:
				getItems().clear();
				return;
			case RuntimePackage.GAME__TASKS:
				getTasks().clear();
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
			case RuntimePackage.GAME__PLAYERS:
				return players != null && !players.isEmpty();
			case RuntimePackage.GAME__ITEMS:
				return items != null && !items.isEmpty();
			case RuntimePackage.GAME__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameImpl
