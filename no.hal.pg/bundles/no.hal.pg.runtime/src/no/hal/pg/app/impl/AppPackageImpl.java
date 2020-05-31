/**
 */
package no.hal.pg.app.impl;

import no.hal.pg.app.AbstractGeoLocationView;
import no.hal.pg.app.App;
import no.hal.pg.app.AppFactory;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameApp;
import no.hal.pg.app.GameView;
import no.hal.pg.app.GeoLocatedView;
import no.hal.pg.app.GeoLocationView;
import no.hal.pg.app.GeoPolyline;
import no.hal.pg.app.ItemView;
import no.hal.pg.app.MapMarkerOptions;
import no.hal.pg.app.MapView;
import no.hal.pg.app.TaskView;
import no.hal.pg.app.View;
import no.hal.pg.app.View1;
import no.hal.pg.app.View2;

import no.hal.pg.arc.ArcPackage;

import no.hal.pg.osm.OsmPackage;

import no.hal.pg.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppPackageImpl extends EPackageImpl implements AppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass view1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass view2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeoLocationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapMarkerOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoLocatedViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoLocationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoPolylineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.pg.app.AppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppPackageImpl() {
		super(eNS_URI, AppFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppPackage init() {
		if (isInited) return (AppPackage)EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Obtain or create and register package
		AppPackageImpl theAppPackage = (AppPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArcPackage.eINSTANCE.eClass();
		OsmPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAppPackage.createPackageContents();

		// Initialize created meta-data
		theAppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAppPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppPackage.eNS_URI, theAppPackage);
		return theAppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_User() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView1() {
		return view1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView1_Model() {
		return (EReference)view1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView2() {
		return view2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView2_Model1() {
		return (EReference)view2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView2_Model2() {
		return (EReference)view2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameView() {
		return gameViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameView_Player() {
		return (EReference)gameViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameView_TaskViews() {
		return (EReference)gameViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameView_AllItemViews() {
		return (EReference)gameViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameView_ItemViews() {
		return (EReference)gameViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Model() {
		return (EReference)appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Views() {
		return (EReference)appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameApp() {
		return gameAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskView() {
		return taskViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskView_Description() {
		return (EAttribute)taskViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskView_Enabled() {
		return (EAttribute)taskViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskView_Started() {
		return (EAttribute)taskViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskView_Finished() {
		return (EAttribute)taskViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskView__Start() {
		return taskViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemView() {
		return itemViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemView_Description() {
		return (EAttribute)itemViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapView() {
		return mapViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapView_Zoom() {
		return (EAttribute)mapViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapView_GeoLocationViews() {
		return (EReference)mapViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapView_GeoPolylines() {
		return (EReference)mapViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapView__Navigate__float_float_int() {
		return mapViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeoLocationView() {
		return abstractGeoLocationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeoLocationView_LatLong() {
		return (EAttribute)abstractGeoLocationViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGeoLocationView_Options() {
		return (EReference)abstractGeoLocationViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapMarkerOptions() {
		return mapMarkerOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapMarkerOptions_Text() {
		return (EAttribute)mapMarkerOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapMarkerOptions_Radius() {
		return (EAttribute)mapMarkerOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapMarkerOptions_Color() {
		return (EAttribute)mapMarkerOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoLocatedView() {
		return geoLocatedViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoLocatedView_Location() {
		return (EReference)geoLocatedViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoLocationView() {
		return geoLocationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoPolyline() {
		return geoPolylineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoPolyline_Locations() {
		return (EReference)geoPolylineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoPolyline_Closed() {
		return (EAttribute)geoPolylineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppFactory getAppFactory() {
		return (AppFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__USER);

		view1EClass = createEClass(VIEW1);
		createEReference(view1EClass, VIEW1__MODEL);

		view2EClass = createEClass(VIEW2);
		createEReference(view2EClass, VIEW2__MODEL1);
		createEReference(view2EClass, VIEW2__MODEL2);

		gameViewEClass = createEClass(GAME_VIEW);
		createEReference(gameViewEClass, GAME_VIEW__PLAYER);
		createEReference(gameViewEClass, GAME_VIEW__TASK_VIEWS);
		createEReference(gameViewEClass, GAME_VIEW__ALL_ITEM_VIEWS);
		createEReference(gameViewEClass, GAME_VIEW__ITEM_VIEWS);

		appEClass = createEClass(APP);
		createEReference(appEClass, APP__MODEL);
		createEReference(appEClass, APP__VIEWS);

		gameAppEClass = createEClass(GAME_APP);

		taskViewEClass = createEClass(TASK_VIEW);
		createEAttribute(taskViewEClass, TASK_VIEW__DESCRIPTION);
		createEAttribute(taskViewEClass, TASK_VIEW__ENABLED);
		createEAttribute(taskViewEClass, TASK_VIEW__STARTED);
		createEAttribute(taskViewEClass, TASK_VIEW__FINISHED);
		createEOperation(taskViewEClass, TASK_VIEW___START);

		itemViewEClass = createEClass(ITEM_VIEW);
		createEAttribute(itemViewEClass, ITEM_VIEW__DESCRIPTION);

		mapViewEClass = createEClass(MAP_VIEW);
		createEAttribute(mapViewEClass, MAP_VIEW__ZOOM);
		createEReference(mapViewEClass, MAP_VIEW__GEO_LOCATION_VIEWS);
		createEReference(mapViewEClass, MAP_VIEW__GEO_POLYLINES);
		createEOperation(mapViewEClass, MAP_VIEW___NAVIGATE__FLOAT_FLOAT_INT);

		abstractGeoLocationViewEClass = createEClass(ABSTRACT_GEO_LOCATION_VIEW);
		createEAttribute(abstractGeoLocationViewEClass, ABSTRACT_GEO_LOCATION_VIEW__LAT_LONG);
		createEReference(abstractGeoLocationViewEClass, ABSTRACT_GEO_LOCATION_VIEW__OPTIONS);

		mapMarkerOptionsEClass = createEClass(MAP_MARKER_OPTIONS);
		createEAttribute(mapMarkerOptionsEClass, MAP_MARKER_OPTIONS__TEXT);
		createEAttribute(mapMarkerOptionsEClass, MAP_MARKER_OPTIONS__RADIUS);
		createEAttribute(mapMarkerOptionsEClass, MAP_MARKER_OPTIONS__COLOR);

		geoLocatedViewEClass = createEClass(GEO_LOCATED_VIEW);
		createEReference(geoLocatedViewEClass, GEO_LOCATED_VIEW__LOCATION);

		geoLocationViewEClass = createEClass(GEO_LOCATION_VIEW);

		geoPolylineEClass = createEClass(GEO_POLYLINE);
		createEReference(geoPolylineEClass, GEO_POLYLINE__LOCATIONS);
		createEAttribute(geoPolylineEClass, GEO_POLYLINE__CLOSED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		OsmPackage theOsmPackage = (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);

		// Create type parameters
		ETypeParameter viewEClass_U = addETypeParameter(viewEClass, "U");
		ETypeParameter view1EClass_U = addETypeParameter(view1EClass, "U");
		ETypeParameter view1EClass_M = addETypeParameter(view1EClass, "M");
		ETypeParameter view2EClass_U = addETypeParameter(view2EClass, "U");
		ETypeParameter view2EClass_M1 = addETypeParameter(view2EClass, "M1");
		ETypeParameter view2EClass_M2 = addETypeParameter(view2EClass, "M2");
		ETypeParameter gameViewEClass_T = addETypeParameter(gameViewEClass, "T");
		ETypeParameter appEClass_V = addETypeParameter(appEClass, "V");
		ETypeParameter appEClass_U = addETypeParameter(appEClass, "U");
		ETypeParameter appEClass_M = addETypeParameter(appEClass, "M");
		ETypeParameter gameAppEClass_T = addETypeParameter(gameAppEClass, "T");
		ETypeParameter taskViewEClass_T = addETypeParameter(taskViewEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theRuntimePackage.getTask());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		gameViewEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getView1());
		g2 = createEGenericType(appEClass_U);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(appEClass_M);
		g1.getETypeArguments().add(g2);
		appEClass_V.getEBounds().add(g1);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		gameAppEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		taskViewEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(view1EClass_U);
		g1.getETypeArguments().add(g2);
		view1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(view2EClass_U);
		g1.getETypeArguments().add(g2);
		view2EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView1());
		g2 = createEGenericType(theRuntimePackage.getPlayer());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theRuntimePackage.getGame());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(gameViewEClass_T);
		g2.getETypeArguments().add(g3);
		gameViewEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getApp());
		g2 = createEGenericType(this.getGameView());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(gameAppEClass_T);
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theRuntimePackage.getPlayer());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theRuntimePackage.getGame());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(gameAppEClass_T);
		g2.getETypeArguments().add(g3);
		gameAppEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView1());
		g2 = createEGenericType(theRuntimePackage.getPlayer());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(taskViewEClass_T);
		g1.getETypeArguments().add(g2);
		taskViewEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView1());
		g2 = createEGenericType(theRuntimePackage.getPlayer());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theRuntimePackage.getItem());
		g1.getETypeArguments().add(g2);
		itemViewEClass.getEGenericSuperTypes().add(g1);
		mapViewEClass.getESuperTypes().add(theOsmPackage.getGeoLocation());
		abstractGeoLocationViewEClass.getESuperTypes().add(theOsmPackage.getGeoLocated());
		geoLocatedViewEClass.getESuperTypes().add(this.getAbstractGeoLocationView());
		geoLocationViewEClass.getESuperTypes().add(this.getAbstractGeoLocationView());
		geoLocationViewEClass.getESuperTypes().add(theOsmPackage.getGeoLocation());

		// Initialize classes, features, and operations; add parameters
		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(viewEClass_U);
		initEReference(getView_User(), g1, null, "user", null, 1, 1, View.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(view1EClass, View1.class, "View1", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(view1EClass_M);
		initEReference(getView1_Model(), g1, null, "model", null, 1, 1, View1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(view2EClass, View2.class, "View2", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(view2EClass_M1);
		initEReference(getView2_Model1(), g1, null, "model1", null, 1, 1, View2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(view2EClass_M2);
		initEReference(getView2_Model2(), g1, null, "model2", null, 1, 1, View2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameViewEClass, GameView.class, "GameView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameView_Player(), theRuntimePackage.getPlayer(), null, "player", null, 0, 1, GameView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getTaskView());
		g2 = createEGenericType(gameViewEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getGameView_TaskViews(), g1, null, "taskViews", null, 0, -1, GameView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameView_AllItemViews(), this.getItemView(), null, "allItemViews", null, 0, -1, GameView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameView_ItemViews(), this.getItemView(), null, "itemViews", null, 0, -1, GameView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(appEClass, App.class, "App", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(appEClass_M);
		initEReference(getApp_Model(), g1, null, "model", null, 0, 1, App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(appEClass_V);
		initEReference(getApp_Views(), g1, null, "views", null, 0, -1, App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameAppEClass, GameApp.class, "GameApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskViewEClass, TaskView.class, "TaskView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskView_Description(), ecorePackage.getEString(), "description", null, 0, 1, TaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskView_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, TaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskView_Started(), ecorePackage.getEBoolean(), "started", null, 0, 1, TaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskView_Finished(), ecorePackage.getEBoolean(), "finished", null, 0, 1, TaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTaskView__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getTaskView());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(itemViewEClass, ItemView.class, "ItemView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemView_Description(), ecorePackage.getEString(), "description", null, 0, 1, ItemView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mapViewEClass, MapView.class, "MapView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapView_Zoom(), ecorePackage.getEInt(), "zoom", "10", 0, 1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapView_GeoLocationViews(), this.getAbstractGeoLocationView(), null, "geoLocationViews", null, 0, -1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapView_GeoPolylines(), this.getAbstractGeoLocationView(), null, "geoPolylines", null, 0, -1, MapView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMapView__Navigate__float_float_int(), null, "navigate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "latitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "longitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "zoom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractGeoLocationViewEClass, AbstractGeoLocationView.class, "AbstractGeoLocationView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractGeoLocationView_LatLong(), theOsmPackage.getLatLong(), "latLong", null, 0, 1, AbstractGeoLocationView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractGeoLocationView_Options(), this.getMapMarkerOptions(), null, "options", null, 0, 1, AbstractGeoLocationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapMarkerOptionsEClass, MapMarkerOptions.class, "MapMarkerOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapMarkerOptions_Text(), ecorePackage.getEString(), "text", null, 0, 1, MapMarkerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapMarkerOptions_Radius(), ecorePackage.getEIntegerObject(), "radius", null, 0, 1, MapMarkerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapMarkerOptions_Color(), ecorePackage.getEString(), "color", null, 0, 1, MapMarkerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoLocatedViewEClass, GeoLocatedView.class, "GeoLocatedView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeoLocatedView_Location(), theOsmPackage.getGeoLocated(), null, "location", null, 0, 1, GeoLocatedView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoLocationViewEClass, GeoLocationView.class, "GeoLocationView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geoPolylineEClass, GeoPolyline.class, "GeoPolyline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeoPolyline_Locations(), theOsmPackage.getGeoLocated(), null, "locations", null, 0, -1, GeoPolyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoPolyline_Closed(), ecorePackage.getEBoolean(), "closed", null, 0, 1, GeoPolyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// no.hal.pg.http.impl.JsonSerializer
		createNoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>no.hal.pg.http.impl.JsonSerializer</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNoAnnotations() {
		String source = "no.hal.pg.http.impl.JsonSerializer";	
		addAnnotation
		  (getGameView_AllItemViews(), 
		   source, 
		   new String[] {
			 "exclude", "true"
		   });	
		addAnnotation
		  (getGameView_ItemViews(), 
		   source, 
		   new String[] {
			 "include", "true"
		   });	
		addAnnotation
		  (getGeoPolyline_Locations(), 
		   source, 
		   new String[] {
			 "include", "true"
		   });
	}

} //AppPackageImpl
