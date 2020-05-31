/**
 */
package no.hal.pg.app.util;

import no.hal.pg.app.*;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.pg.app.AppPackage
 * @generated
 */
public class AppSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSwitch() {
		if (modelPackage == null) {
			modelPackage = AppPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AppPackage.VIEW: {
				View<?> view = (View<?>)theEObject;
				T1 result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.VIEW1: {
				View1<?, ?> view1 = (View1<?, ?>)theEObject;
				T1 result = caseView1(view1);
				if (result == null) result = caseView(view1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.VIEW2: {
				View2<?, ?, ?> view2 = (View2<?, ?, ?>)theEObject;
				T1 result = caseView2(view2);
				if (result == null) result = caseView(view2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.GAME_VIEW: {
				GameView<?> gameView = (GameView<?>)theEObject;
				T1 result = caseGameView(gameView);
				if (result == null) result = caseView1(gameView);
				if (result == null) result = caseView(gameView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.APP: {
				App<?, ?, ?> app = (App<?, ?, ?>)theEObject;
				T1 result = caseApp(app);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.GAME_APP: {
				GameApp<?> gameApp = (GameApp<?>)theEObject;
				T1 result = caseGameApp(gameApp);
				if (result == null) result = caseApp(gameApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.TASK_VIEW: {
				TaskView<?> taskView = (TaskView<?>)theEObject;
				T1 result = caseTaskView(taskView);
				if (result == null) result = caseView1(taskView);
				if (result == null) result = caseView(taskView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ITEM_VIEW: {
				ItemView itemView = (ItemView)theEObject;
				T1 result = caseItemView(itemView);
				if (result == null) result = caseView1(itemView);
				if (result == null) result = caseView(itemView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.MAP_VIEW: {
				MapView mapView = (MapView)theEObject;
				T1 result = caseMapView(mapView);
				if (result == null) result = caseGeoLocation(mapView);
				if (result == null) result = caseGeoLocated(mapView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW: {
				AbstractGeoLocationView abstractGeoLocationView = (AbstractGeoLocationView)theEObject;
				T1 result = caseAbstractGeoLocationView(abstractGeoLocationView);
				if (result == null) result = caseGeoLocated(abstractGeoLocationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.MAP_MARKER_OPTIONS: {
				MapMarkerOptions mapMarkerOptions = (MapMarkerOptions)theEObject;
				T1 result = caseMapMarkerOptions(mapMarkerOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.GEO_LOCATED_VIEW: {
				GeoLocatedView geoLocatedView = (GeoLocatedView)theEObject;
				T1 result = caseGeoLocatedView(geoLocatedView);
				if (result == null) result = caseAbstractGeoLocationView(geoLocatedView);
				if (result == null) result = caseGeoLocated(geoLocatedView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.GEO_LOCATION_VIEW: {
				GeoLocationView geoLocationView = (GeoLocationView)theEObject;
				T1 result = caseGeoLocationView(geoLocationView);
				if (result == null) result = caseAbstractGeoLocationView(geoLocationView);
				if (result == null) result = caseGeoLocation(geoLocationView);
				if (result == null) result = caseGeoLocated(geoLocationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.GEO_POLYLINE: {
				GeoPolyline geoPolyline = (GeoPolyline)theEObject;
				T1 result = caseGeoPolyline(geoPolyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U> T1 caseView(View<U> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U, M> T1 caseView1(View1<U, M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U, M1, M2> T1 caseView2(View2<U, M1, M2> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseGameView(GameView<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <V extends View1<U, M>, U, M> T1 caseApp(App<V, U, M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseGameApp(GameApp<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseTaskView(TaskView<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseItemView(ItemView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMapView(MapView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geo Location View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geo Location View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractGeoLocationView(AbstractGeoLocationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Marker Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Marker Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMapMarkerOptions(MapMarkerOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Located View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Located View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocatedView(GeoLocatedView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Location View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Location View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocationView(GeoLocationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoPolyline(GeoPolyline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocated(GeoLocated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocation(GeoLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //AppSwitch
