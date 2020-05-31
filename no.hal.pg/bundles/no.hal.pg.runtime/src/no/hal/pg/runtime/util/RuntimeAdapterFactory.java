/**
 */
package no.hal.pg.runtime.util;

import no.hal.pg.arc.Arc;
import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.runtime.AbstractCondition;
import no.hal.pg.runtime.AbstractGiveItemsAction;
import no.hal.pg.runtime.Action;
import no.hal.pg.runtime.CompositeAction;
import no.hal.pg.runtime.CompositeCondition;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.GiveTaskPlayersItemsAction;
import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.IsByGeoLocationCondition;
import no.hal.pg.runtime.IsTaskFinishedCondition;
import no.hal.pg.runtime.IsTaskStartedCondition;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.PlayersHaveItemsCondition;
import no.hal.pg.runtime.ResettableTask;
import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.Described;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.runtime.RuntimePackage
 * @generated
 */
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeSwitch<Adapter> modelSwitch =
		new RuntimeSwitch<Adapter>() {
			@Override
			public <T extends Task<?>> Adapter caseGame(Game<T> object) {
				return createGameAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseInfoItem(InfoItem object) {
				return createInfoItemAdapter();
			}
			@Override
			public <R> Adapter caseTask(Task<R> object) {
				return createTaskAdapter();
			}
			@Override
			public <R> Adapter caseResettableTask(ResettableTask<R> object) {
				return createResettableTaskAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public <E> Adapter caseAbstractCondition(AbstractCondition<E> object) {
				return createAbstractConditionAdapter();
			}
			@Override
			public <E> Adapter caseCompositeCondition(CompositeCondition<E> object) {
				return createCompositeConditionAdapter();
			}
			@Override
			public Adapter caseIsTaskStartedCondition(IsTaskStartedCondition object) {
				return createIsTaskStartedConditionAdapter();
			}
			@Override
			public Adapter caseIsTaskFinishedCondition(IsTaskFinishedCondition object) {
				return createIsTaskFinishedConditionAdapter();
			}
			@Override
			public Adapter caseIsByGeoLocationCondition(IsByGeoLocationCondition object) {
				return createIsByGeoLocationConditionAdapter();
			}
			@Override
			public Adapter casePlayersHaveItemsCondition(PlayersHaveItemsCondition object) {
				return createPlayersHaveItemsConditionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCompositeAction(CompositeAction object) {
				return createCompositeActionAdapter();
			}
			@Override
			public Adapter caseAbstractGiveItemsAction(AbstractGiveItemsAction object) {
				return createAbstractGiveItemsActionAdapter();
			}
			@Override
			public Adapter caseGiveTaskPlayersItemsAction(GiveTaskPlayersItemsAction object) {
				return createGiveTaskPlayersItemsActionAdapter();
			}
			@Override
			public Adapter caseRuntime(no.hal.pg.runtime.Runtime object) {
				return createRuntimeAdapter();
			}
			@Override
			public Adapter caseGeoLocated(GeoLocated object) {
				return createGeoLocatedAdapter();
			}
			@Override
			public Adapter caseGeoLocation(GeoLocation object) {
				return createGeoLocationAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.InfoItem <em>Info Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.InfoItem
	 * @generated
	 */
	public Adapter createInfoItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.ResettableTask <em>Resettable Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.ResettableTask
	 * @generated
	 */
	public Adapter createResettableTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.AbstractCondition <em>Abstract Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.AbstractCondition
	 * @generated
	 */
	public Adapter createAbstractConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.CompositeCondition
	 * @generated
	 */
	public Adapter createCompositeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.IsTaskStartedCondition <em>Is Task Started Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.IsTaskStartedCondition
	 * @generated
	 */
	public Adapter createIsTaskStartedConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.IsTaskFinishedCondition <em>Is Task Finished Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.IsTaskFinishedCondition
	 * @generated
	 */
	public Adapter createIsTaskFinishedConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.IsByGeoLocationCondition <em>Is By Geo Location Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.IsByGeoLocationCondition
	 * @generated
	 */
	public Adapter createIsByGeoLocationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.PlayersHaveItemsCondition <em>Players Have Items Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.PlayersHaveItemsCondition
	 * @generated
	 */
	public Adapter createPlayersHaveItemsConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.CompositeAction <em>Composite Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.CompositeAction
	 * @generated
	 */
	public Adapter createCompositeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.AbstractGiveItemsAction <em>Abstract Give Items Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.AbstractGiveItemsAction
	 * @generated
	 */
	public Adapter createAbstractGiveItemsActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.GiveTaskPlayersItemsAction <em>Give Task Players Items Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.GiveTaskPlayersItemsAction
	 * @generated
	 */
	public Adapter createGiveTaskPlayersItemsActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Runtime
	 * @generated
	 */
	public Adapter createRuntimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.osm.GeoLocated <em>Geo Located</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.osm.GeoLocated
	 * @generated
	 */
	public Adapter createGeoLocatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.osm.GeoLocation <em>Geo Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.osm.GeoLocation
	 * @generated
	 */
	public Adapter createGeoLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.arc.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.arc.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PgAdapterFactory
