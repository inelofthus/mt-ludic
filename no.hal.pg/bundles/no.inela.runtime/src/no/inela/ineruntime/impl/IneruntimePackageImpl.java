/**
 */
package no.inela.ineruntime.impl;

import java.util.Map;

import no.hal.pg.app.AppPackage;

import no.hal.pg.arc.ArcPackage;

import no.hal.pg.osm.OsmPackage;

import no.hal.pg.runtime.RuntimePackage;

import no.inela.ineruntime.CompositePlayerAction;
import no.inela.ineruntime.CompositePlayerCondition;
import no.inela.ineruntime.IneruntimeFactory;
import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition;
import no.inela.ineruntime.Leaderboard;
import no.inela.ineruntime.LeaderboardGame;
import no.inela.ineruntime.LeaderboardGameView;
import no.inela.ineruntime.PlayerAction;
import no.inela.ineruntime.PlayerCondition;
import no.inela.ineruntime.RemoveTaskFromActiveAction;
import no.inela.ineruntime.SetTaskToActiveAction;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
public class IneruntimePackageImpl extends EPackageImpl implements IneruntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leaderboardGameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leaderboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerToIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leaderboardGameViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerToTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupToIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositePlayerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTaskToActiveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeTaskFromActiveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositePlayerConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isOnlyTaskActiveForPlayerConditionEClass = null;

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
	 * @see no.inela.ineruntime.IneruntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IneruntimePackageImpl() {
		super(eNS_URI, IneruntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IneruntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IneruntimePackage init() {
		if (isInited) return (IneruntimePackage)EPackage.Registry.INSTANCE.getEPackage(IneruntimePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIneruntimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IneruntimePackageImpl theIneruntimePackage = registeredIneruntimePackage instanceof IneruntimePackageImpl ? (IneruntimePackageImpl)registeredIneruntimePackage : new IneruntimePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AppPackage.eINSTANCE.eClass();
		ArcPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		OsmPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIneruntimePackage.createPackageContents();

		// Initialize created meta-data
		theIneruntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIneruntimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IneruntimePackage.eNS_URI, theIneruntimePackage);
		return theIneruntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeaderboardGame() {
		return leaderboardGameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeaderboardGame_Leaderboard() {
		return (EReference)leaderboardGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeaderboardGame_PlayersActiveTasks() {
		return (EReference)leaderboardGameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeaderboardGame_Teams() {
		return (EReference)leaderboardGameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLeaderboardGame__GetActiveTask__Player() {
		return leaderboardGameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLeaderboardGame__UpdateLeaderboard__Player_int() {
		return leaderboardGameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeaderboard() {
		return leaderboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeaderboard_PlayerTotalScores() {
		return (EReference)leaderboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeaderboard_TeamTotalScores() {
		return (EReference)leaderboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerToInt() {
		return playerToIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerToInt_Key() {
		return (EReference)playerToIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerToInt_Value() {
		return (EAttribute)playerToIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeaderboardGameView() {
		return leaderboardGameViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeaderboardGameView_MapView() {
		return (EReference)leaderboardGameViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeaderboardGameView_Location() {
		return (EAttribute)leaderboardGameViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeaderboardGameView_Leaderboard() {
		return (EAttribute)leaderboardGameViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeaderboardGameView_TeamLeaderboard() {
		return (EAttribute)leaderboardGameViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLeaderboardGameView__SetPlayerLocation__float_float() {
		return leaderboardGameViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerToTask() {
		return playerToTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerToTask_Key() {
		return (EReference)playerToTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerToTask_Value() {
		return (EReference)playerToTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupToInt() {
		return groupToIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroupToInt_Key() {
		return (EReference)groupToIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupToInt_Value() {
		return (EAttribute)groupToIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerAction() {
		return playerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlayerAction__Perform__Player() {
		return playerActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositePlayerAction() {
		return compositePlayerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositePlayerAction_PlayerActions() {
		return (EReference)compositePlayerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetTaskToActiveAction() {
		return setTaskToActiveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetTaskToActiveAction_Task() {
		return (EReference)setTaskToActiveActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoveTaskFromActiveAction() {
		return removeTaskFromActiveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRemoveTaskFromActiveAction_Task() {
		return (EReference)removeTaskFromActiveActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerCondition() {
		return playerConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlayerCondition__Test__Player() {
		return playerConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositePlayerCondition() {
		return compositePlayerConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositePlayerCondition_Logic() {
		return (EAttribute)compositePlayerConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositePlayerCondition_PlayerConditions() {
		return (EReference)compositePlayerConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsOnlyTaskActiveForPlayerCondition() {
		return isOnlyTaskActiveForPlayerConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsOnlyTaskActiveForPlayerCondition_Task() {
		return (EReference)isOnlyTaskActiveForPlayerConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IneruntimeFactory getIneruntimeFactory() {
		return (IneruntimeFactory)getEFactoryInstance();
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
		leaderboardGameEClass = createEClass(LEADERBOARD_GAME);
		createEReference(leaderboardGameEClass, LEADERBOARD_GAME__LEADERBOARD);
		createEReference(leaderboardGameEClass, LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS);
		createEReference(leaderboardGameEClass, LEADERBOARD_GAME__TEAMS);
		createEOperation(leaderboardGameEClass, LEADERBOARD_GAME___GET_ACTIVE_TASK__PLAYER);
		createEOperation(leaderboardGameEClass, LEADERBOARD_GAME___UPDATE_LEADERBOARD__PLAYER_INT);

		leaderboardEClass = createEClass(LEADERBOARD);
		createEReference(leaderboardEClass, LEADERBOARD__PLAYER_TOTAL_SCORES);
		createEReference(leaderboardEClass, LEADERBOARD__TEAM_TOTAL_SCORES);

		playerToIntEClass = createEClass(PLAYER_TO_INT);
		createEReference(playerToIntEClass, PLAYER_TO_INT__KEY);
		createEAttribute(playerToIntEClass, PLAYER_TO_INT__VALUE);

		leaderboardGameViewEClass = createEClass(LEADERBOARD_GAME_VIEW);
		createEReference(leaderboardGameViewEClass, LEADERBOARD_GAME_VIEW__MAP_VIEW);
		createEAttribute(leaderboardGameViewEClass, LEADERBOARD_GAME_VIEW__LOCATION);
		createEAttribute(leaderboardGameViewEClass, LEADERBOARD_GAME_VIEW__LEADERBOARD);
		createEAttribute(leaderboardGameViewEClass, LEADERBOARD_GAME_VIEW__TEAM_LEADERBOARD);
		createEOperation(leaderboardGameViewEClass, LEADERBOARD_GAME_VIEW___SET_PLAYER_LOCATION__FLOAT_FLOAT);

		playerToTaskEClass = createEClass(PLAYER_TO_TASK);
		createEReference(playerToTaskEClass, PLAYER_TO_TASK__KEY);
		createEReference(playerToTaskEClass, PLAYER_TO_TASK__VALUE);

		groupToIntEClass = createEClass(GROUP_TO_INT);
		createEReference(groupToIntEClass, GROUP_TO_INT__KEY);
		createEAttribute(groupToIntEClass, GROUP_TO_INT__VALUE);

		playerActionEClass = createEClass(PLAYER_ACTION);
		createEOperation(playerActionEClass, PLAYER_ACTION___PERFORM__PLAYER);

		compositePlayerActionEClass = createEClass(COMPOSITE_PLAYER_ACTION);
		createEReference(compositePlayerActionEClass, COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS);

		setTaskToActiveActionEClass = createEClass(SET_TASK_TO_ACTIVE_ACTION);
		createEReference(setTaskToActiveActionEClass, SET_TASK_TO_ACTIVE_ACTION__TASK);

		removeTaskFromActiveActionEClass = createEClass(REMOVE_TASK_FROM_ACTIVE_ACTION);
		createEReference(removeTaskFromActiveActionEClass, REMOVE_TASK_FROM_ACTIVE_ACTION__TASK);

		playerConditionEClass = createEClass(PLAYER_CONDITION);
		createEOperation(playerConditionEClass, PLAYER_CONDITION___TEST__PLAYER);

		compositePlayerConditionEClass = createEClass(COMPOSITE_PLAYER_CONDITION);
		createEAttribute(compositePlayerConditionEClass, COMPOSITE_PLAYER_CONDITION__LOGIC);
		createEReference(compositePlayerConditionEClass, COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS);

		isOnlyTaskActiveForPlayerConditionEClass = createEClass(IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION);
		createEReference(isOnlyTaskActiveForPlayerConditionEClass, IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK);
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
		ArcPackage theArcPackage = (ArcPackage)EPackage.Registry.INSTANCE.getEPackage(ArcPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		AppPackage theAppPackage = (AppPackage)EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);
		OsmPackage theOsmPackage = (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theRuntimePackage.getGame());
		EGenericType g2 = createEGenericType(theRuntimePackage.getTask());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		leaderboardGameEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAppPackage.getGameView());
		g2 = createEGenericType(theRuntimePackage.getTask());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		leaderboardGameViewEClass.getEGenericSuperTypes().add(g1);
		compositePlayerActionEClass.getESuperTypes().add(this.getPlayerAction());
		setTaskToActiveActionEClass.getESuperTypes().add(this.getPlayerAction());
		removeTaskFromActiveActionEClass.getESuperTypes().add(this.getPlayerAction());
		compositePlayerConditionEClass.getESuperTypes().add(this.getPlayerCondition());
		isOnlyTaskActiveForPlayerConditionEClass.getESuperTypes().add(this.getPlayerCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(leaderboardGameEClass, LeaderboardGame.class, "LeaderboardGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeaderboardGame_Leaderboard(), this.getLeaderboard(), null, "leaderboard", null, 0, 1, LeaderboardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeaderboardGame_PlayersActiveTasks(), this.getPlayerToTask(), null, "playersActiveTasks", null, 0, -1, LeaderboardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeaderboardGame_Teams(), theArcPackage.getGroup(), null, "teams", null, 0, -1, LeaderboardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLeaderboardGame__GetActiveTask__Player(), null, "getActiveTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getLeaderboardGame__UpdateLeaderboard__Player_int(), null, "updateLeaderboard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "score", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(leaderboardEClass, Leaderboard.class, "Leaderboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeaderboard_PlayerTotalScores(), this.getPlayerToInt(), null, "playerTotalScores", null, 0, -1, Leaderboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeaderboard_TeamTotalScores(), this.getGroupToInt(), null, "teamTotalScores", null, 0, -1, Leaderboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerToIntEClass, Map.Entry.class, "PlayerToInt", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerToInt_Key(), theRuntimePackage.getPlayer(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerToInt_Value(), theEcorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leaderboardGameViewEClass, LeaderboardGameView.class, "LeaderboardGameView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeaderboardGameView_MapView(), theAppPackage.getMapView(), null, "mapView", null, 0, 1, LeaderboardGameView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeaderboardGameView_Location(), theOsmPackage.getLatLong(), "location", null, 0, 1, LeaderboardGameView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getLeaderboardGameView_Leaderboard(), g1, "leaderboard", null, 0, 1, LeaderboardGameView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getLeaderboardGameView_TeamLeaderboard(), g1, "teamLeaderboard", null, 0, 1, LeaderboardGameView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLeaderboardGameView__SetPlayerLocation__float_float(), this.getLeaderboardGameView(), "setPlayerLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "latitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "longitude", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerToTaskEClass, Map.Entry.class, "PlayerToTask", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerToTask_Key(), theRuntimePackage.getPlayer(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getPlayerToTask_Value(), g1, null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupToIntEClass, Map.Entry.class, "GroupToInt", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupToInt_Key(), theArcPackage.getGroup(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupToInt_Value(), theEcorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerActionEClass, PlayerAction.class, "PlayerAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPlayerAction__Perform__Player(), null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositePlayerActionEClass, CompositePlayerAction.class, "CompositePlayerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositePlayerAction_PlayerActions(), this.getPlayerAction(), null, "playerActions", null, 0, -1, CompositePlayerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTaskToActiveActionEClass, SetTaskToActiveAction.class, "SetTaskToActiveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getSetTaskToActiveAction_Task(), g1, null, "task", null, 0, 1, SetTaskToActiveAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeTaskFromActiveActionEClass, RemoveTaskFromActiveAction.class, "RemoveTaskFromActiveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getRemoveTaskFromActiveAction_Task(), g1, null, "task", null, 0, 1, RemoveTaskFromActiveAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerConditionEClass, PlayerCondition.class, "PlayerCondition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPlayerCondition__Test__Player(), theEcorePackage.getEBoolean(), "test", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositePlayerConditionEClass, CompositePlayerCondition.class, "CompositePlayerCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositePlayerCondition_Logic(), theEcorePackage.getEBoolean(), "logic", null, 0, 1, CompositePlayerCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositePlayerCondition_PlayerConditions(), this.getPlayerCondition(), null, "playerConditions", null, 0, -1, CompositePlayerCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isOnlyTaskActiveForPlayerConditionEClass, IsOnlyTaskActiveForPlayerCondition.class, "IsOnlyTaskActiveForPlayerCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getIsOnlyTaskActiveForPlayerCondition_Task(), g1, null, "task", null, 0, 1, IsOnlyTaskActiveForPlayerCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IneruntimePackageImpl
