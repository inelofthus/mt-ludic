/**
 */
package no.inlea.puzzletask2.runtime.impl;

import java.util.Map;

import no.hal.pg.app.AppPackage;

import no.hal.pg.arc.ArcPackage;

import no.hal.pg.osm.OsmPackage;
import no.inlea.puzzletask2.runtime.ImagePiece;
import no.inlea.puzzletask2.runtime.Puzzle;
import no.inlea.puzzletask2.runtime.PuzzlePiece;
import no.inlea.puzzletask2.runtime.PuzzleTask2;
import no.inlea.puzzletask2.runtime.PuzzleTaskView;
import no.inlea.puzzletask2.runtime.RuntimeFactory;
import no.inlea.puzzletask2.runtime.RuntimePackage;
import no.inlea.puzzletask2.runtime.TaskScores;

import no.inlea.puzzletask2.runtime.TextPiece;
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
	private EClass puzzleTask2EClass = null;

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
	private EClass playerToIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagePieceEClass = null;

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
	private EClass textPieceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerToPuzzlePieceEClass = null;

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
	private EClass taskScoresEClass = null;

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
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#eNS_URI
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
	public EClass getPuzzleTask2() {
		return puzzleTask2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzleTask2_Puzzle() {
		return (EReference)puzzleTask2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzleTask2_TaskScores() {
		return (EReference)puzzleTask2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzleTask2_Attempts() {
		return (EReference)puzzleTask2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTask2_OpenTime() {
		return (EAttribute)puzzleTask2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTask2_CloseTime() {
		return (EAttribute)puzzleTask2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTask2_AcceptableTargetDistance() {
		return (EAttribute)puzzleTask2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTask2_MaxScore() {
		return (EAttribute)puzzleTask2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTask2_WrongAttemptPenalty() {
		return (EAttribute)puzzleTask2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__AcceptProposal__String_Player() {
		return puzzleTask2EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__CalculateScore__Player_boolean() {
		return puzzleTask2EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__AcceptPlayer__Player() {
		return puzzleTask2EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__IsTimeWithinInterval() {
		return puzzleTask2EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__CanStart__Player() {
		return puzzleTask2EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__QuitPuzzle__Player() {
		return puzzleTask2EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__IsCompletedByPlayer__Player() {
		return puzzleTask2EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__Start__Player() {
		return puzzleTask2EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__CheckTargetDistance__GeoLocated() {
		return puzzleTask2EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTask2__CheckPlayerLocation__Player() {
		return puzzleTask2EClass.getEOperations().get(9);
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
	public EAttribute getPuzzle_Instructions() {
		return (EAttribute)puzzleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzle_Solution() {
		return (EAttribute)puzzleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzle_PuzzlePieces() {
		return (EReference)puzzleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzle_PlayerPieces() {
		return (EReference)puzzleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzle_ActivePlayers() {
		return (EReference)puzzleEClass.getEStructuralFeatures().get(4);
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
	public EOperation getPuzzle__StartPuzzle__Player() {
		return puzzleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzle__FinishPuzzle__Player() {
		return puzzleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzle__GetPuzzleContent__Player() {
		return puzzleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzle__QuitPuzzle__Player() {
		return puzzleEClass.getEOperations().get(4);
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
	public EClass getImagePiece() {
		return imagePieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagePiece_ImageUrl() {
		return (EAttribute)imagePieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagePiece_AltText() {
		return (EAttribute)imagePieceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPuzzlePiece_Html() {
		return (EAttribute)puzzlePieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzlePiece_Name() {
		return (EAttribute)puzzlePieceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextPiece() {
		return textPieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextPiece_Text() {
		return (EAttribute)textPieceEClass.getEStructuralFeatures().get(0);
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
	public EClass getPuzzleTaskView() {
		return puzzleTaskViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_Content() {
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
	public EAttribute getPuzzleTaskView_TaskLocation() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_IsCompletedByPlayer() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_Active() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_Distance() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_Instructions() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_CloseTime() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPuzzleTaskView_NumberOfActivePlayers() {
		return (EAttribute)puzzleTaskViewEClass.getEStructuralFeatures().get(8);
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
	public EOperation getPuzzleTaskView__StartPuzzle() {
		return puzzleTaskViewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__AcceptPlayer() {
		return puzzleTaskViewEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__Start() {
		return puzzleTaskViewEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__QuitPuzzle() {
		return puzzleTaskViewEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPuzzleTaskView__IsEnabled() {
		return puzzleTaskViewEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskScores() {
		return taskScoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskScores_TaskScores() {
		return (EReference)taskScoresEClass.getEStructuralFeatures().get(0);
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
		puzzleTask2EClass = createEClass(PUZZLE_TASK2);
		createEReference(puzzleTask2EClass, PUZZLE_TASK2__PUZZLE);
		createEReference(puzzleTask2EClass, PUZZLE_TASK2__TASK_SCORES);
		createEReference(puzzleTask2EClass, PUZZLE_TASK2__ATTEMPTS);
		createEAttribute(puzzleTask2EClass, PUZZLE_TASK2__OPEN_TIME);
		createEAttribute(puzzleTask2EClass, PUZZLE_TASK2__CLOSE_TIME);
		createEAttribute(puzzleTask2EClass, PUZZLE_TASK2__ACCEPTABLE_TARGET_DISTANCE);
		createEAttribute(puzzleTask2EClass, PUZZLE_TASK2__MAX_SCORE);
		createEAttribute(puzzleTask2EClass, PUZZLE_TASK2__WRONG_ATTEMPT_PENALTY);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___ACCEPT_PROPOSAL__STRING_PLAYER);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___CALCULATE_SCORE__PLAYER_BOOLEAN);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___ACCEPT_PLAYER__PLAYER);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___IS_TIME_WITHIN_INTERVAL);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___CAN_START__PLAYER);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___QUIT_PUZZLE__PLAYER);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___IS_COMPLETED_BY_PLAYER__PLAYER);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___START__PLAYER);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___CHECK_TARGET_DISTANCE__GEOLOCATED);
		createEOperation(puzzleTask2EClass, PUZZLE_TASK2___CHECK_PLAYER_LOCATION__PLAYER);

		playerToIntEClass = createEClass(PLAYER_TO_INT);
		createEReference(playerToIntEClass, PLAYER_TO_INT__KEY);
		createEAttribute(playerToIntEClass, PLAYER_TO_INT__VALUE);

		puzzleEClass = createEClass(PUZZLE);
		createEAttribute(puzzleEClass, PUZZLE__SOLUTION);
		createEAttribute(puzzleEClass, PUZZLE__INSTRUCTIONS);
		createEReference(puzzleEClass, PUZZLE__PUZZLE_PIECES);
		createEReference(puzzleEClass, PUZZLE__PLAYER_PIECES);
		createEReference(puzzleEClass, PUZZLE__ACTIVE_PLAYERS);
		createEOperation(puzzleEClass, PUZZLE___ACCEPT_PROPOSAL__STRING);
		createEOperation(puzzleEClass, PUZZLE___START_PUZZLE__PLAYER);
		createEOperation(puzzleEClass, PUZZLE___FINISH_PUZZLE__PLAYER);
		createEOperation(puzzleEClass, PUZZLE___GET_PUZZLE_CONTENT__PLAYER);
		createEOperation(puzzleEClass, PUZZLE___QUIT_PUZZLE__PLAYER);

		imagePieceEClass = createEClass(IMAGE_PIECE);
		createEAttribute(imagePieceEClass, IMAGE_PIECE__IMAGE_URL);
		createEAttribute(imagePieceEClass, IMAGE_PIECE__ALT_TEXT);

		playerToPuzzlePieceEClass = createEClass(PLAYER_TO_PUZZLE_PIECE);
		createEReference(playerToPuzzlePieceEClass, PLAYER_TO_PUZZLE_PIECE__KEY);
		createEReference(playerToPuzzlePieceEClass, PLAYER_TO_PUZZLE_PIECE__VALUE);

		puzzleTaskViewEClass = createEClass(PUZZLE_TASK_VIEW);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__CONTENT);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__SCORE);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__TASK_LOCATION);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__IS_COMPLETED_BY_PLAYER);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__ACTIVE);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__DISTANCE);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__INSTRUCTIONS);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__CLOSE_TIME);
		createEAttribute(puzzleTaskViewEClass, PUZZLE_TASK_VIEW__NUMBER_OF_ACTIVE_PLAYERS);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___START_PUZZLE);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___ACCEPT_PLAYER);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___START);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___QUIT_PUZZLE);
		createEOperation(puzzleTaskViewEClass, PUZZLE_TASK_VIEW___IS_ENABLED);

		taskScoresEClass = createEClass(TASK_SCORES);
		createEReference(taskScoresEClass, TASK_SCORES__TASK_SCORES);

		puzzlePieceEClass = createEClass(PUZZLE_PIECE);
		createEAttribute(puzzlePieceEClass, PUZZLE_PIECE__HTML);
		createEAttribute(puzzlePieceEClass, PUZZLE_PIECE__PLAYER_COUNT);
		createEAttribute(puzzlePieceEClass, PUZZLE_PIECE__NAME);

		textPieceEClass = createEClass(TEXT_PIECE);
		createEAttribute(textPieceEClass, TEXT_PIECE__TEXT);
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
		EGenericType g2 = createEGenericType(this.getTaskScores());
		g1.getETypeArguments().add(g2);
		puzzleTask2EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theOsmPackage.getGeoLocation());
		puzzleTask2EClass.getEGenericSuperTypes().add(g1);
		imagePieceEClass.getESuperTypes().add(this.getPuzzlePiece());
		g1 = createEGenericType(theAppPackage.getTaskView());
		g2 = createEGenericType(this.getPuzzleTask2());
		g1.getETypeArguments().add(g2);
		puzzleTaskViewEClass.getEGenericSuperTypes().add(g1);
		textPieceEClass.getESuperTypes().add(this.getPuzzlePiece());

		// Initialize classes, features, and operations; add parameters
		initEClass(puzzleTask2EClass, PuzzleTask2.class, "PuzzleTask2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPuzzleTask2_Puzzle(), this.getPuzzle(), null, "puzzle", null, 0, 1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzleTask2_TaskScores(), this.getTaskScores(), null, "taskScores", null, 0, 1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzleTask2_Attempts(), this.getPlayerToInt(), null, "attempts", null, 0, -1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask2_OpenTime(), theEcorePackage.getEDate(), "openTime", null, 0, 1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask2_CloseTime(), theEcorePackage.getEDate(), "closeTime", null, 0, 1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask2_AcceptableTargetDistance(), theEcorePackage.getEInt(), "acceptableTargetDistance", "10", 0, 1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask2_MaxScore(), theEcorePackage.getEInt(), "maxScore", "300", 0, 1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTask2_WrongAttemptPenalty(), theEcorePackage.getEInt(), "wrongAttemptPenalty", "100", 0, 1, PuzzleTask2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPuzzleTask2__AcceptProposal__String_Player(), theEcorePackage.getEBoolean(), "acceptProposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__CalculateScore__Player_boolean(), theEcorePackage.getEInt(), "calculateScore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "isProposalCorrect", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__AcceptPlayer__Player(), theEcorePackage.getEBoolean(), "acceptPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPuzzleTask2__IsTimeWithinInterval(), theEcorePackage.getEBoolean(), "isTimeWithinInterval", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__CanStart__Player(), theEcorePackage.getEBoolean(), "canStart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__QuitPuzzle__Player(), theEcorePackage.getEBoolean(), "quitPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__IsCompletedByPlayer__Player(), theEcorePackage.getEBoolean(), "isCompletedByPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__Start__Player(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__CheckTargetDistance__GeoLocated(), theEcorePackage.getEDouble(), "checkTargetDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOsmPackage.getGeoLocated(), "geoLocated", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTask2__CheckPlayerLocation__Player(), theEcorePackage.getEBoolean(), "checkPlayerLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerToIntEClass, Map.Entry.class, "PlayerToInt", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerToInt_Key(), theRuntimePackage_1.getPlayer(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerToInt_Value(), theEcorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puzzleEClass, Puzzle.class, "Puzzle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzle_Solution(), theEcorePackage.getEString(), "solution", null, 0, 1, Puzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzle_Instructions(), theEcorePackage.getEString(), "instructions", null, 0, 1, Puzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzle_PuzzlePieces(), this.getPuzzlePiece(), null, "puzzlePieces", null, 0, -1, Puzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzle_PlayerPieces(), this.getPlayerToPuzzlePiece(), null, "playerPieces", null, 0, -1, Puzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzle_ActivePlayers(), theRuntimePackage_1.getPlayer(), null, "activePlayers", null, 0, -1, Puzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPuzzle__AcceptProposal__String(), theEcorePackage.getEBoolean(), "acceptProposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzle__StartPuzzle__Player(), theEcorePackage.getEBoolean(), "startPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzle__FinishPuzzle__Player(), theEcorePackage.getEBoolean(), "finishPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzle__GetPuzzleContent__Player(), theEcorePackage.getEString(), "getPuzzleContent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzle__QuitPuzzle__Player(), theEcorePackage.getEBoolean(), "quitPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imagePieceEClass, ImagePiece.class, "ImagePiece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagePiece_ImageUrl(), theEcorePackage.getEString(), "imageUrl", null, 0, 1, ImagePiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePiece_AltText(), theEcorePackage.getEString(), "altText", null, 0, 1, ImagePiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerToPuzzlePieceEClass, Map.Entry.class, "PlayerToPuzzlePiece", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayerToPuzzlePiece_Key(), theRuntimePackage_1.getPlayer(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayerToPuzzlePiece_Value(), this.getPuzzlePiece(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puzzleTaskViewEClass, PuzzleTaskView.class, "PuzzleTaskView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzleTaskView_Content(), theEcorePackage.getEString(), "content", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_Score(), theEcorePackage.getEInt(), "score", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_TaskLocation(), theOsmPackage.getLatLong(), "taskLocation", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_IsCompletedByPlayer(), theEcorePackage.getEBoolean(), "isCompletedByPlayer", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_Distance(), theEcorePackage.getEInt(), "distance", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_Instructions(), theEcorePackage.getEString(), "instructions", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_CloseTime(), theEcorePackage.getEDate(), "closeTime", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzleTaskView_NumberOfActivePlayers(), theEcorePackage.getEInt(), "numberOfActivePlayers", null, 0, 1, PuzzleTaskView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPuzzleTaskView__ProposeAnswer__String(), theEcorePackage.getEBoolean(), "proposeAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPuzzleTaskView__StartPuzzle(), null, "startPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPuzzleTaskView__AcceptPlayer(), theEcorePackage.getEBoolean(), "acceptPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPuzzleTaskView__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theAppPackage.getTaskView());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getPuzzleTaskView__QuitPuzzle(), theEcorePackage.getEBoolean(), "quitPuzzle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPuzzleTaskView__IsEnabled(), theEcorePackage.getEBoolean(), "isEnabled", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskScoresEClass, TaskScores.class, "TaskScores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskScores_TaskScores(), this.getPlayerToInt(), null, "taskScores", null, 0, -1, TaskScores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puzzlePieceEClass, PuzzlePiece.class, "PuzzlePiece", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzlePiece_Html(), theEcorePackage.getEString(), "html", null, 0, 1, PuzzlePiece.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzlePiece_PlayerCount(), theEcorePackage.getEInt(), "playerCount", null, 0, 1, PuzzlePiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzlePiece_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PuzzlePiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textPieceEClass, TextPiece.class, "TextPiece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextPiece_Text(), theEcorePackage.getEString(), "text", null, 0, 1, TextPiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimePackageImpl
