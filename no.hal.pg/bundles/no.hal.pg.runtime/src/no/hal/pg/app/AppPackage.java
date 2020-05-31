/**
 */
package no.hal.pg.app;

import no.hal.pg.osm.OsmPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pg.app.AppFactory
 * @model kind="package"
 * @generated
 */
public interface AppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "app";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.runtime/model/app.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppPackage eINSTANCE = no.hal.pg.app.impl.AppPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.ViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__USER = 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.View1Impl <em>View1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.View1Impl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView1()
	 * @generated
	 */
	int VIEW1 = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__USER = VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__MODEL = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.View2Impl <em>View2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.View2Impl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView2()
	 * @generated
	 */
	int VIEW2 = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__USER = VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__MODEL1 = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__MODEL2 = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GameViewImpl <em>Game View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GameViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGameView()
	 * @generated
	 */
	int GAME_VIEW = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__USER = VIEW1__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__MODEL = VIEW1__MODEL;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__PLAYER = VIEW1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__TASK_VIEWS = VIEW1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Item Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__ALL_ITEM_VIEWS = VIEW1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__ITEM_VIEWS = VIEW1_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_FEATURE_COUNT = VIEW1_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_OPERATION_COUNT = VIEW1_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.AppImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getApp()
	 * @generated
	 */
	int APP = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__VIEWS = 1;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GameAppImpl <em>Game App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GameAppImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGameApp()
	 * @generated
	 */
	int GAME_APP = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP__MODEL = APP__MODEL;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP__VIEWS = APP__VIEWS;

	/**
	 * The number of structural features of the '<em>Game App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP_FEATURE_COUNT = APP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP_OPERATION_COUNT = APP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.TaskViewImpl <em>Task View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.TaskViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getTaskView()
	 * @generated
	 */
	int TASK_VIEW = 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__USER = VIEW1__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__MODEL = VIEW1__MODEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__DESCRIPTION = VIEW1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__ENABLED = VIEW1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__STARTED = VIEW1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__FINISHED = VIEW1_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW_FEATURE_COUNT = VIEW1_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW___START = VIEW1_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW_OPERATION_COUNT = VIEW1_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.ItemViewImpl <em>Item View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.ItemViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getItemView()
	 * @generated
	 */
	int ITEM_VIEW = 7;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_VIEW__USER = VIEW1__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_VIEW__MODEL = VIEW1__MODEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_VIEW__DESCRIPTION = VIEW1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_VIEW_FEATURE_COUNT = VIEW1_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_VIEW_OPERATION_COUNT = VIEW1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.MapViewImpl <em>Map View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.MapViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getMapView()
	 * @generated
	 */
	int MAP_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__LATITUDE = OsmPackage.GEO_LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__LONGITUDE = OsmPackage.GEO_LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__ZOOM = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Location Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__GEO_LOCATION_VIEWS = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geo Polylines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__GEO_POLYLINES = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_FEATURE_COUNT = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW___GET_LAT_LONG = OsmPackage.GEO_LOCATION___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Navigate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW___NAVIGATE__FLOAT_FLOAT_INT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Map View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_OPERATION_COUNT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.AbstractGeoLocationViewImpl <em>Abstract Geo Location View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.AbstractGeoLocationViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getAbstractGeoLocationView()
	 * @generated
	 */
	int ABSTRACT_GEO_LOCATION_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Lat Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEO_LOCATION_VIEW__LAT_LONG = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEO_LOCATION_VIEW__OPTIONS = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Geo Location View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEO_LOCATION_VIEW_FEATURE_COUNT = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEO_LOCATION_VIEW___GET_LAT_LONG = OsmPackage.GEO_LOCATED___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Abstract Geo Location View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEO_LOCATION_VIEW_OPERATION_COUNT = OsmPackage.GEO_LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.MapMarkerOptionsImpl <em>Map Marker Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.MapMarkerOptionsImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getMapMarkerOptions()
	 * @generated
	 */
	int MAP_MARKER_OPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER_OPTIONS__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER_OPTIONS__RADIUS = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER_OPTIONS__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Map Marker Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER_OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Map Marker Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GeoLocatedViewImpl <em>Geo Located View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GeoLocatedViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGeoLocatedView()
	 * @generated
	 */
	int GEO_LOCATED_VIEW = 11;

	/**
	 * The feature id for the '<em><b>Lat Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_VIEW__LAT_LONG = ABSTRACT_GEO_LOCATION_VIEW__LAT_LONG;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_VIEW__OPTIONS = ABSTRACT_GEO_LOCATION_VIEW__OPTIONS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_VIEW__LOCATION = ABSTRACT_GEO_LOCATION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geo Located View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_VIEW_FEATURE_COUNT = ABSTRACT_GEO_LOCATION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_VIEW___GET_LAT_LONG = ABSTRACT_GEO_LOCATION_VIEW___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Geo Located View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATED_VIEW_OPERATION_COUNT = ABSTRACT_GEO_LOCATION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GeoLocationViewImpl <em>Geo Location View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GeoLocationViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGeoLocationView()
	 * @generated
	 */
	int GEO_LOCATION_VIEW = 12;

	/**
	 * The feature id for the '<em><b>Lat Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_VIEW__LAT_LONG = ABSTRACT_GEO_LOCATION_VIEW__LAT_LONG;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_VIEW__OPTIONS = ABSTRACT_GEO_LOCATION_VIEW__OPTIONS;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_VIEW__LATITUDE = ABSTRACT_GEO_LOCATION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_VIEW__LONGITUDE = ABSTRACT_GEO_LOCATION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Geo Location View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_VIEW_FEATURE_COUNT = ABSTRACT_GEO_LOCATION_VIEW_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_VIEW___GET_LAT_LONG = ABSTRACT_GEO_LOCATION_VIEW___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Geo Location View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_VIEW_OPERATION_COUNT = ABSTRACT_GEO_LOCATION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GeoPolylineImpl <em>Geo Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GeoPolylineImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGeoPolyline()
	 * @generated
	 */
	int GEO_POLYLINE = 13;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POLYLINE__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POLYLINE__CLOSED = 1;

	/**
	 * The number of structural features of the '<em>Geo Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POLYLINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Geo Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POLYLINE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see no.hal.pg.app.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see no.hal.pg.app.View#getUser()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_User();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View1 <em>View1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View1</em>'.
	 * @see no.hal.pg.app.View1
	 * @generated
	 */
	EClass getView1();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View1#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see no.hal.pg.app.View1#getModel()
	 * @see #getView1()
	 * @generated
	 */
	EReference getView1_Model();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View2 <em>View2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View2</em>'.
	 * @see no.hal.pg.app.View2
	 * @generated
	 */
	EClass getView2();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View2#getModel1 <em>Model1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model1</em>'.
	 * @see no.hal.pg.app.View2#getModel1()
	 * @see #getView2()
	 * @generated
	 */
	EReference getView2_Model1();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View2#getModel2 <em>Model2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model2</em>'.
	 * @see no.hal.pg.app.View2#getModel2()
	 * @see #getView2()
	 * @generated
	 */
	EReference getView2_Model2();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game View</em>'.
	 * @see no.hal.pg.app.GameView
	 * @generated
	 */
	EClass getGameView();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.GameView#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.hal.pg.app.GameView#getPlayer()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_Player();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.GameView#getTaskViews <em>Task Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Views</em>'.
	 * @see no.hal.pg.app.GameView#getTaskViews()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_TaskViews();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.GameView#getAllItemViews <em>All Item Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Item Views</em>'.
	 * @see no.hal.pg.app.GameView#getAllItemViews()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_AllItemViews();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.app.GameView#getItemViews <em>Item Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Views</em>'.
	 * @see no.hal.pg.app.GameView#getItemViews()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_ItemViews();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see no.hal.pg.app.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.App#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see no.hal.pg.app.App#getModel()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.App#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see no.hal.pg.app.App#getViews()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Views();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GameApp <em>Game App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game App</em>'.
	 * @see no.hal.pg.app.GameApp
	 * @generated
	 */
	EClass getGameApp();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.TaskView <em>Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task View</em>'.
	 * @see no.hal.pg.app.TaskView
	 * @generated
	 */
	EClass getTaskView();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.hal.pg.app.TaskView#getDescription()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Description();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see no.hal.pg.app.TaskView#isEnabled()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see no.hal.pg.app.TaskView#isStarted()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Started();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see no.hal.pg.app.TaskView#isFinished()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Finished();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.app.TaskView#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see no.hal.pg.app.TaskView#start()
	 * @generated
	 */
	EOperation getTaskView__Start();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.ItemView <em>Item View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item View</em>'.
	 * @see no.hal.pg.app.ItemView
	 * @generated
	 */
	EClass getItemView();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.ItemView#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.hal.pg.app.ItemView#getDescription()
	 * @see #getItemView()
	 * @generated
	 */
	EAttribute getItemView_Description();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.MapView <em>Map View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View</em>'.
	 * @see no.hal.pg.app.MapView
	 * @generated
	 */
	EClass getMapView();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapView#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom</em>'.
	 * @see no.hal.pg.app.MapView#getZoom()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_Zoom();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.MapView#getGeoLocationViews <em>Geo Location Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geo Location Views</em>'.
	 * @see no.hal.pg.app.MapView#getGeoLocationViews()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_GeoLocationViews();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.MapView#getGeoPolylines <em>Geo Polylines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geo Polylines</em>'.
	 * @see no.hal.pg.app.MapView#getGeoPolylines()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_GeoPolylines();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.app.MapView#navigate(float, float, int) <em>Navigate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Navigate</em>' operation.
	 * @see no.hal.pg.app.MapView#navigate(float, float, int)
	 * @generated
	 */
	EOperation getMapView__Navigate__float_float_int();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.AbstractGeoLocationView <em>Abstract Geo Location View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Geo Location View</em>'.
	 * @see no.hal.pg.app.AbstractGeoLocationView
	 * @generated
	 */
	EClass getAbstractGeoLocationView();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.AbstractGeoLocationView#getLatLong <em>Lat Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat Long</em>'.
	 * @see no.hal.pg.app.AbstractGeoLocationView#getLatLong()
	 * @see #getAbstractGeoLocationView()
	 * @generated
	 */
	EAttribute getAbstractGeoLocationView_LatLong();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.app.AbstractGeoLocationView#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see no.hal.pg.app.AbstractGeoLocationView#getOptions()
	 * @see #getAbstractGeoLocationView()
	 * @generated
	 */
	EReference getAbstractGeoLocationView_Options();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.MapMarkerOptions <em>Map Marker Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Marker Options</em>'.
	 * @see no.hal.pg.app.MapMarkerOptions
	 * @generated
	 */
	EClass getMapMarkerOptions();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarkerOptions#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see no.hal.pg.app.MapMarkerOptions#getText()
	 * @see #getMapMarkerOptions()
	 * @generated
	 */
	EAttribute getMapMarkerOptions_Text();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarkerOptions#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see no.hal.pg.app.MapMarkerOptions#getRadius()
	 * @see #getMapMarkerOptions()
	 * @generated
	 */
	EAttribute getMapMarkerOptions_Radius();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarkerOptions#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see no.hal.pg.app.MapMarkerOptions#getColor()
	 * @see #getMapMarkerOptions()
	 * @generated
	 */
	EAttribute getMapMarkerOptions_Color();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GeoLocatedView <em>Geo Located View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Located View</em>'.
	 * @see no.hal.pg.app.GeoLocatedView
	 * @generated
	 */
	EClass getGeoLocatedView();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.GeoLocatedView#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see no.hal.pg.app.GeoLocatedView#getLocation()
	 * @see #getGeoLocatedView()
	 * @generated
	 */
	EReference getGeoLocatedView_Location();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GeoLocationView <em>Geo Location View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Location View</em>'.
	 * @see no.hal.pg.app.GeoLocationView
	 * @generated
	 */
	EClass getGeoLocationView();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GeoPolyline <em>Geo Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Polyline</em>'.
	 * @see no.hal.pg.app.GeoPolyline
	 * @generated
	 */
	EClass getGeoPolyline();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.app.GeoPolyline#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see no.hal.pg.app.GeoPolyline#getLocations()
	 * @see #getGeoPolyline()
	 * @generated
	 */
	EReference getGeoPolyline_Locations();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.GeoPolyline#isClosed <em>Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed</em>'.
	 * @see no.hal.pg.app.GeoPolyline#isClosed()
	 * @see #getGeoPolyline()
	 * @generated
	 */
	EAttribute getGeoPolyline_Closed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppFactory getAppFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.ViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__USER = eINSTANCE.getView_User();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.View1Impl <em>View1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.View1Impl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView1()
		 * @generated
		 */
		EClass VIEW1 = eINSTANCE.getView1();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW1__MODEL = eINSTANCE.getView1_Model();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.View2Impl <em>View2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.View2Impl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView2()
		 * @generated
		 */
		EClass VIEW2 = eINSTANCE.getView2();

		/**
		 * The meta object literal for the '<em><b>Model1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW2__MODEL1 = eINSTANCE.getView2_Model1();

		/**
		 * The meta object literal for the '<em><b>Model2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW2__MODEL2 = eINSTANCE.getView2_Model2();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GameViewImpl <em>Game View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GameViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGameView()
		 * @generated
		 */
		EClass GAME_VIEW = eINSTANCE.getGameView();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__PLAYER = eINSTANCE.getGameView_Player();

		/**
		 * The meta object literal for the '<em><b>Task Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__TASK_VIEWS = eINSTANCE.getGameView_TaskViews();

		/**
		 * The meta object literal for the '<em><b>All Item Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__ALL_ITEM_VIEWS = eINSTANCE.getGameView_AllItemViews();

		/**
		 * The meta object literal for the '<em><b>Item Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__ITEM_VIEWS = eINSTANCE.getGameView_ItemViews();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.AppImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__MODEL = eINSTANCE.getApp_Model();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__VIEWS = eINSTANCE.getApp_Views();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GameAppImpl <em>Game App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GameAppImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGameApp()
		 * @generated
		 */
		EClass GAME_APP = eINSTANCE.getGameApp();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.TaskViewImpl <em>Task View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.TaskViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getTaskView()
		 * @generated
		 */
		EClass TASK_VIEW = eINSTANCE.getTaskView();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__DESCRIPTION = eINSTANCE.getTaskView_Description();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__ENABLED = eINSTANCE.getTaskView_Enabled();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__STARTED = eINSTANCE.getTaskView_Started();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__FINISHED = eINSTANCE.getTaskView_Finished();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_VIEW___START = eINSTANCE.getTaskView__Start();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.ItemViewImpl <em>Item View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.ItemViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getItemView()
		 * @generated
		 */
		EClass ITEM_VIEW = eINSTANCE.getItemView();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_VIEW__DESCRIPTION = eINSTANCE.getItemView_Description();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.MapViewImpl <em>Map View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.MapViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getMapView()
		 * @generated
		 */
		EClass MAP_VIEW = eINSTANCE.getMapView();

		/**
		 * The meta object literal for the '<em><b>Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__ZOOM = eINSTANCE.getMapView_Zoom();

		/**
		 * The meta object literal for the '<em><b>Geo Location Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__GEO_LOCATION_VIEWS = eINSTANCE.getMapView_GeoLocationViews();

		/**
		 * The meta object literal for the '<em><b>Geo Polylines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__GEO_POLYLINES = eINSTANCE.getMapView_GeoPolylines();

		/**
		 * The meta object literal for the '<em><b>Navigate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_VIEW___NAVIGATE__FLOAT_FLOAT_INT = eINSTANCE.getMapView__Navigate__float_float_int();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.AbstractGeoLocationViewImpl <em>Abstract Geo Location View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.AbstractGeoLocationViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getAbstractGeoLocationView()
		 * @generated
		 */
		EClass ABSTRACT_GEO_LOCATION_VIEW = eINSTANCE.getAbstractGeoLocationView();

		/**
		 * The meta object literal for the '<em><b>Lat Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GEO_LOCATION_VIEW__LAT_LONG = eINSTANCE.getAbstractGeoLocationView_LatLong();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_GEO_LOCATION_VIEW__OPTIONS = eINSTANCE.getAbstractGeoLocationView_Options();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.MapMarkerOptionsImpl <em>Map Marker Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.MapMarkerOptionsImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getMapMarkerOptions()
		 * @generated
		 */
		EClass MAP_MARKER_OPTIONS = eINSTANCE.getMapMarkerOptions();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER_OPTIONS__TEXT = eINSTANCE.getMapMarkerOptions_Text();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER_OPTIONS__RADIUS = eINSTANCE.getMapMarkerOptions_Radius();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER_OPTIONS__COLOR = eINSTANCE.getMapMarkerOptions_Color();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GeoLocatedViewImpl <em>Geo Located View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GeoLocatedViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGeoLocatedView()
		 * @generated
		 */
		EClass GEO_LOCATED_VIEW = eINSTANCE.getGeoLocatedView();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_LOCATED_VIEW__LOCATION = eINSTANCE.getGeoLocatedView_Location();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GeoLocationViewImpl <em>Geo Location View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GeoLocationViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGeoLocationView()
		 * @generated
		 */
		EClass GEO_LOCATION_VIEW = eINSTANCE.getGeoLocationView();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GeoPolylineImpl <em>Geo Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GeoPolylineImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGeoPolyline()
		 * @generated
		 */
		EClass GEO_POLYLINE = eINSTANCE.getGeoPolyline();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_POLYLINE__LOCATIONS = eINSTANCE.getGeoPolyline_Locations();

		/**
		 * The meta object literal for the '<em><b>Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POLYLINE__CLOSED = eINSTANCE.getGeoPolyline_Closed();

	}

} //AppPackage
