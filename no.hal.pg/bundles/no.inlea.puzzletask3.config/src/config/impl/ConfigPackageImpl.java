/**
 */
package config.impl;

import config.ConfigFactory;
import config.ConfigPackage;
import config.PuzzleTask3Config;

import no.hal.pg.app.AppPackage;

import no.hal.pg.arc.ArcPackage;

import no.hal.pg.osm.OsmPackage;
import no.inlea.puzzletask2.runtime.RuntimePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigPackageImpl extends EPackageImpl implements ConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puzzleTask3ConfigEClass = null;
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
	 * @see config.ConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigPackageImpl() {
		super(eNS_URI, ConfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigPackage init() {
		if (isInited) return (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigPackageImpl theConfigPackage = registeredConfigPackage instanceof ConfigPackageImpl ? (ConfigPackageImpl)registeredConfigPackage : new ConfigPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AppPackage.eINSTANCE.eClass();
		ArcPackage.eINSTANCE.eClass();
		no.hal.pg.config.ConfigPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		OsmPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		no.inlea.puzzletask3.runtime.RuntimePackage.eINSTANCE.eClass();
		no.hal.pg.runtime.RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigPackage.eNS_URI, theConfigPackage);
		return theConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuzzleTask3Config() {
		return puzzleTask3ConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuzzleTask3Config_Puzzle() {
		return (EReference)puzzleTask3ConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzleTask3Config_OpenTime() {
		return (EAttribute)puzzleTask3ConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzleTask3Config_CloseTime() {
		return (EAttribute)puzzleTask3ConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzleTask3Config_AcceptableTargetDistance() {
		return (EAttribute)puzzleTask3ConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzleTask3Config_MaxScore() {
		return (EAttribute)puzzleTask3ConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzleTask3Config_WrongAttemptPenalty() {
		return (EAttribute)puzzleTask3ConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuzzleTask3Config_Location() {
		return (EReference)puzzleTask3ConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzleTask3Config_NumCorrectRequired() {
		return (EAttribute)puzzleTask3ConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactory getConfigFactory() {
		return (ConfigFactory)getEFactoryInstance();
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
		puzzleTask3ConfigEClass = createEClass(PUZZLE_TASK3_CONFIG);
		createEReference(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__PUZZLE);
		createEAttribute(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__OPEN_TIME);
		createEAttribute(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__CLOSE_TIME);
		createEAttribute(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__ACCEPTABLE_TARGET_DISTANCE);
		createEAttribute(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__MAX_SCORE);
		createEAttribute(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__WRONG_ATTEMPT_PENALTY);
		createEReference(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__LOCATION);
		createEAttribute(puzzleTask3ConfigEClass, PUZZLE_TASK3_CONFIG__NUM_CORRECT_REQUIRED);
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
		no.hal.pg.config.ConfigPackage theConfigPackage_1 = (no.hal.pg.config.ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(no.hal.pg.config.ConfigPackage.eNS_URI);
		no.inlea.puzzletask3.runtime.RuntimePackage theRuntimePackage_1 = (no.inlea.puzzletask3.runtime.RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(no.inlea.puzzletask3.runtime.RuntimePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		OsmPackage theOsmPackage = (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theConfigPackage_1.getTaskConfig());
		EGenericType g2 = createEGenericType(theRuntimePackage_1.getPuzzleTask3());
		g1.getETypeArguments().add(g2);
		puzzleTask3ConfigEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(puzzleTask3ConfigEClass, PuzzleTask3Config.class, "PuzzleTask3Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPuzzleTask3Config_Puzzle(), theRuntimePackage_1.getPuzzle(), null, "puzzle", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask3Config_OpenTime(), theEcorePackage.getEDate(), "openTime", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask3Config_CloseTime(), theEcorePackage.getEDate(), "closeTime", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask3Config_AcceptableTargetDistance(), theEcorePackage.getEInt(), "acceptableTargetDistance", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask3Config_MaxScore(), theEcorePackage.getEInt(), "maxScore", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask3Config_WrongAttemptPenalty(), theEcorePackage.getEInt(), "wrongAttemptPenalty", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzleTask3Config_Location(), theOsmPackage.getGeoLocation(), null, "location", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask3Config_NumCorrectRequired(), theEcorePackage.getEInt(), "numCorrectRequired", null, 0, 1, PuzzleTask3Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigPackageImpl
