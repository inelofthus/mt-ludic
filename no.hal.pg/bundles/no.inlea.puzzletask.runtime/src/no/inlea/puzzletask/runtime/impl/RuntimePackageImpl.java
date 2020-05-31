/**
 */
package no.inlea.puzzletask.runtime.impl;

import java.util.Map;

import no.hal.pg.app.AppPackage;

import no.hal.pg.arc.ArcPackage;

import no.hal.pg.osm.OsmPackage;

import no.inlea.puzzletask.runtime.PlayerTaskScore;
import no.inlea.puzzletask.runtime.PlayerTaskScores;
import no.inlea.puzzletask.runtime.Puzzle;
import no.inlea.puzzletask.runtime.PuzzlePiece;
import no.inlea.puzzletask.runtime.PuzzleTask;
import no.inlea.puzzletask.runtime.PuzzleTaskView;
import no.inlea.puzzletask.runtime.RuntimeFactory;
import no.inlea.puzzletask.runtime.RuntimePackage;
import no.inlea.puzzletask.runtime.SimplePuzzle;

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
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puzzleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puzzlePieceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puzzleTaskViewEClass = null;

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
	private EClass puzzleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePuzzleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerTaskScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerTaskScoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerToPuzzlePieceEClass = null;

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
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRuntimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RuntimePackageImpl theRuntimePackage = registeredRuntimePackage instanceof RuntimePackageImpl ? (RuntimePackageImpl)registeredRuntimePackage : new RuntimePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AppPackage.eINSTANCE.eClass();
		ArcPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		OsmPackage.eINSTANCE.eClass();
		no.hal.pg.runtime.RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPuzzleTask() {
		return puzzleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzleTask_Puzzles() {
		return (EReference)puzzleTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzleTask_PlayerLevels() {
		return (EReference)puzzleTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzleTask_PlayerTaskScores() {
		return (EReference)puzzleTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask__AcceptPuzzleProposal__String_Player() {
		return puzzleTaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask__CalculateScore__int_Player_boolean() {
		return puzzleTaskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask__AcceptPlayer__Player() {
		return puzzleTaskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPuzzlePiece() {
		return puzzlePieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzlePiece_Image() {
		return (EAttribute)puzzlePieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzlePiece_PlayerCount() {
		return (EAttribute)puzzlePieceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPuzzleTaskView() {
		return puzzleTaskViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_Image() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_Score() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_Level() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__ProposeAnswer__String() {
		return puzzleTaskViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__Finish() {
		return puzzleTaskViewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__StartPuzzle() {
		return puzzleTaskViewEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__AcceptPlayer() {
		return puzzleTaskViewEClass.getEOperations().get(3);
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
	public EClass getPuzzle() {
		return puzzleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzle_Level() {
		return (EAttribute)puzzleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzle__AcceptProposal__String() {
		return puzzleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzle__FinishPuzzle__Player() {
		return puzzleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzle__StartPuzzle__Player() {
		return puzzleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzle__GetImage__Player() {
		return puzzleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimplePuzzle() {
		return simplePuzzleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimplePuzzle_Instructions() {
		return (EReference)simplePuzzleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimplePuzzle_Solution() {
		return (EAttribute)simplePuzzleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimplePuzzle_PuzzlePieces() {
		return (EReference)simplePuzzleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimplePuzzle_PlayerPieces() {
		return (EReference)simplePuzzleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimplePuzzle__AcceptProposal__String() {
		return simplePuzzleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimplePuzzle__FinishPuzzle__Player() {
		return simplePuzzleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimplePuzzle__StartPuzzle__Player() {
		return simplePuzzleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimplePuzzle__GetImage__Player() {
		return simplePuzzleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerTaskScore() {
		return playerTaskScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerTaskScore_Player() {
		return (EReference)playerTaskScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerTaskScore_Score() {
		return (EAttribute)playerTaskScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerTaskScore_Level() {
		return (EAttribute)playerTaskScoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerTaskScores() {
		return playerTaskScoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerTaskScores_Scores() {
		return (EReference)playerTaskScoresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerToPuzzlePiece() {
		return playerToPuzzlePieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerToPuzzlePiece_Key() {
		return (EReference)playerToPuzzlePieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayerToPuzzlePiece_Value() {
		return (EReference)playerToPuzzlePieceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory)getEFactoryInstance();
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
		puzzleTaskEClass = createEClass(PUZZLE_TASK);
		createEReference(puzzleTaskEClass, PUZZLE_TASK__PUZZLES);
		createEReference(puzzleTaskEClass, PUZZLE_TASK__PLAYER_LEVELS);
		createEReference(puzzleTaskEClass, PUZZLE_TASK__PLAYER_TASK_SCORES);
		createEOperation(puzzleTaskEClass, PUZZLE_TASK___ACCEPT_PUZZLE_PROPOSAL__STRING_PLAYER);
		createEOperation(puzzleTaskEClass, PUZZLE_TASK___CALCULATE_SCORE__INT_PLAYER_BOOLEAN);
		createEOperation(puzzleTaskEClass, PUZZLE_TASK___ACCEPT_PLAYER__PLAYER);

		puzzlePieceEClass = createEClass(PUZZLE_PIECE);
		createEAttribute(puzzlePieceEClass, PUZZLE_PIECE__IMAGE);
		createEAttribute(puzzlePieceEClass, PUZZLE_PIECE__PLAYER_COUNT);

		puzzleTaskViewEClass = createEClass(PUZZLE_TASK_VIEW);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__IMAGE);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__SCORE);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__LEVEL);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___FINISH);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___START_PUZZLE);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___ACCEPT_PLAYER);

		playerToIntEClass = createEClass(PLAYER_TO_INT);
		createEReference(playerToIntEClass, PLAYER_TO_INT__KEY);
		createEAttribute(playerToIntEClass, PLAYER_TO_INT__VALUE);

		puzzleEClass = createEClass(PUZZLE);
		createEAttribute(puzzleEClass, PUZZLE__LEVEL);
		createEOperation(puzzleEClass, PUZZLE___ACCEPT_PROPOSAL__STRING);
		createEOperation(puzzleEClass, PUZZLE___FINISH_PUZZLE__PLAYER);
		createEOperation(puzzleEClass, PUZZLE___START_PUZZLE__PLAYER);
		createEOperation(puzzleEClass, PUZZLE___GET_IMAGE__PLAYER);

		simplePuzzleEClass = createEClass(SIMPLE_PUZZLE);
		createEReference(simplePuzzleEClass, SIMPLE_PUZZLE__INSTRUCTIONS);
		createEAttribute(simplePuzzleEClass, SIMPLE_PUZZLE__SOLUTION);
		createEReference(simplePuzzleEClass, SIMPLE_PUZZLE__PUZZLE_PIECES);
		createEReference(simplePuzzleEClass, SIMPLE_PUZZLE__PLAYER_PIECES);
		createEOperation(simplePuzzleEClass, SIMPLE_PUZZLE___ACCEPT_PROPOSAL__STRING);
		createEOperation(simplePuzzleEClass, SIMPLE_PUZZLE___FINISH_PUZZLE__PLAYER);
		createEOperation(simplePuzzleEClass, SIMPLE_PUZZLE___START_PUZZLE__PLAYER);
		createEOperation(simplePuzzleEClass, SIMPLE_PUZZLE___GET_IMAGE__PLAYER);

		playerTaskScoreEClass = createEClass(PLAYER_TASK_SCORE);
		createEReference(playerTaskScoreEClass, PLAYER_TASK_SCORE__PLAYER);
		createEAttribute(playerTaskScoreEClass, PLAYER_TASK_SCORE__SCORE);
		createEAttribute(playerTaskScoreEClass, PLAYER_TASK_SCORE__LEVEL);

		playerTaskScoresEClass = createEClass(PLAYER_TASK_SCORES);
		createEReference(playerTaskScoresEClass, PLAYER_TASK_SCORES__SCORES);

		playerToPuzzlePieceEClass = createEClass(PLAYER_TO_PUZZLE_PIECE);
		createEReference(playerToPuzzlePieceEClass, PLAYER_TO_PUZZLE_PIECE__KEY);
		createEReference(playerToPuzzlePieceEClass, PLAYER_TO_PUZZLE_PIECE__VALUE);
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
		no.hal.pg.runtime.RuntimePackage theRuntimePackage_1 = (no.hal.pg.runtime.RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(no.hal.pg.runtime.RuntimePackage.eNS_URI);
		OsmPackage theOsmPackage = (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		AppPackage theAppPackage = (AppPackage)EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theRuntimePackage_1.getTask());
		EGenericType g2 = createEGenericType(this.getPlayerTaskScores());
		g1.getETypeArguments().add(g2);
		puzzleTaskEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theOsmPackage.getGeoLocation());
		puzzleTaskEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAppPackage.getTaskView());
		g2 = createEGenericType(this.getPuzzleTask());
		g1.getETypeArguments().add(g2);
		puzzleTaskViewEClass.getEGenericSuperTypes().add(g1);
		simplePuzzleEClass.getESuperTypes().add(this.getPuzzle());

		// Initialize classes, features, and operations; add parameters
		initEClass(puzzleTaskEClass, PuzzleTask.class, "PuzzleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPuzzleTask_Puzzles(), this.getPuzzle(), null, "puzzles", null, 0, -1, PuzzleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzleTask_PlayerLevels(), this.getPlayerToInt(), null, "playerLevels", null, 0, -1, PuzzleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzleTask_PlayerTaskScores(), this.getPlayerTaskScores(), null, "playerTaskScores", null, 0, 1, PuzzleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPuzzleTask__AcceptPuzzleProposal__String_Player(), theEcorePackage.getEBoolean(), "acceptPuzzleProposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask__CalculateScore__int_Player_boolean(), theEcorePackage.getEInt(), "calculateScore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "puzzleLevel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "isProposalCorrect", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask__AcceptPlayer__Player(), theEcorePackage.getEBoolean(), "acceptPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(puzzlePieceEClass, PuzzlePiece.class, "PuzzlePiece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzlePiece_Image(), theEcorePackage.getEString(), "image", null, 0, 1, PuzzlePiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzlePiece_PlayerCount(), theEcorePackage.getEInt(), "playerCount", null, 0, 1, PuzzlePiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puzzleTaskViewEClass, PuzzleTaskView.class, "PuzzleTaskView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzleTaskView_Image(), theEcorePackage.getEString(), "image", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_Score(), theEcorePackage.getEInt(), "score", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPuzzleTaskView__ProposeAnswer__String(), this.getPuzzleTaskView(), "proposeAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPuzzleTaskView__Finish(), null, "finish", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPuzzleTaskView__StartPuzzle(), null, "startPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPuzzleTaskView__AcceptPlayer(), theEcorePackage.getEBoolean(), "acceptPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerToIntEClass, Map.Entry.class, "PlayerToInt", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerToInt_Key(), theRuntimePackage_1.getPlayer(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerToInt_Value(), theEcorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puzzleEClass, Puzzle.class, "Puzzle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzle_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, Puzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPuzzle__AcceptProposal__String(), theEcorePackage.getEBoolean(), "acceptProposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzle__FinishPuzzle__Player(), theEcorePackage.getEBoolean(), "finishPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzle__StartPuzzle__Player(), theEcorePackage.getEBoolean(), "startPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzle__GetImage__Player(), theEcorePackage.getEString(), "getImage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simplePuzzleEClass, SimplePuzzle.class, "SimplePuzzle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplePuzzle_Instructions(), theRuntimePackage_1.getInfoItem(), null, "instructions", null, 0, 1, SimplePuzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimplePuzzle_Solution(), theEcorePackage.getEString(), "solution", null, 0, 1, SimplePuzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplePuzzle_PuzzlePieces(), this.getPuzzlePiece(), null, "puzzlePieces", null, 0, -1, SimplePuzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplePuzzle_PlayerPieces(), this.getPlayerToPuzzlePiece(), null, "playerPieces", null, 0, -1, SimplePuzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSimplePuzzle__AcceptProposal__String(), theEcorePackage.getEBoolean(), "acceptProposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSimplePuzzle__FinishPuzzle__Player(), theEcorePackage.getEBoolean(), "finishPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSimplePuzzle__StartPuzzle__Player(), theEcorePackage.getEBoolean(), "startPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSimplePuzzle__GetImage__Player(), theEcorePackage.getEString(), "getImage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerTaskScoreEClass, PlayerTaskScore.class, "PlayerTaskScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerTaskScore_Player(), theRuntimePackage_1.getPlayer(), null, "player", null, 0, 1, PlayerTaskScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerTaskScore_Score(), theEcorePackage.getEInt(), "score", null, 0, 1, PlayerTaskScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerTaskScore_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, PlayerTaskScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerTaskScoresEClass, PlayerTaskScores.class, "PlayerTaskScores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerTaskScores_Scores(), this.getPlayerTaskScore(), null, "scores", null, 0, -1, PlayerTaskScores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerToPuzzlePieceEClass, Map.Entry.class, "PlayerToPuzzlePiece", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerToPuzzlePiece_Key(), theRuntimePackage_1.getPlayer(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayerToPuzzlePiece_Value(), this.getPuzzlePiece(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimePackageImpl
