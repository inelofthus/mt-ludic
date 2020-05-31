/**
 */
package no.inlea.puzzletask3.runtime;

import no.hal.pg.app.AppPackage;

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
 * @see no.inlea.puzzletask3.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.inlea.puzzletask3.runtime/model/puzzletask3.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "puzzletask3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.PuzzleTask3Impl <em>Puzzle Task3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.PuzzleTask3Impl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzleTask3()
	 * @generated
	 */
	int PUZZLE_TASK3 = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__GAME = no.hal.pg.runtime.RuntimePackage.TASK__GAME;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__PLAYERS = no.hal.pg.runtime.RuntimePackage.TASK__PLAYERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__RESULT = no.hal.pg.runtime.RuntimePackage.TASK__RESULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__START_TIME = no.hal.pg.runtime.RuntimePackage.TASK__START_TIME;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__FINISH_TIME = no.hal.pg.runtime.RuntimePackage.TASK__FINISH_TIME;

	/**
	 * The feature id for the '<em><b>Start Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__START_CONDITIONS = no.hal.pg.runtime.RuntimePackage.TASK__START_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Finish Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__FINISH_CONDITIONS = no.hal.pg.runtime.RuntimePackage.TASK__FINISH_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Start Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__START_ACTIONS = no.hal.pg.runtime.RuntimePackage.TASK__START_ACTIONS;

	/**
	 * The feature id for the '<em><b>Finish Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__FINISH_ACTIONS = no.hal.pg.runtime.RuntimePackage.TASK__FINISH_ACTIONS;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__LATITUDE = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__LONGITUDE = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Puzzle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__PUZZLE = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task Scores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__TASK_SCORES = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__ATTEMPTS = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Open Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__OPEN_TIME = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Close Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__CLOSE_TIME = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Acceptable Target Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__ACCEPTABLE_TARGET_DISTANCE = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__MAX_SCORE = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Wrong Attempt Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__WRONG_ATTEMPT_PENALTY = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Num Correct Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3__NUM_CORRECT_REQUIRED = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Puzzle Task3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___GET_DESCRIPTION = no.hal.pg.runtime.RuntimePackage.TASK___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___CAN_START = no.hal.pg.runtime.RuntimePackage.TASK___CAN_START;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___IS_STARTED = no.hal.pg.runtime.RuntimePackage.TASK___IS_STARTED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___IS_FINISHED = no.hal.pg.runtime.RuntimePackage.TASK___IS_FINISHED;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___START = no.hal.pg.runtime.RuntimePackage.TASK___START;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___FINISH__OBJECT = no.hal.pg.runtime.RuntimePackage.TASK___FINISH__OBJECT;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___GET_LAT_LONG = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___ACCEPT_PROPOSAL__STRING_PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___CALCULATE_SCORE__INT = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___ACCEPT_PLAYER__PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Time Within Interval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___IS_TIME_WITHIN_INTERVAL = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___CAN_START__PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Quit Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___QUIT_PUZZLE__PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Completed By Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___IS_COMPLETED_BY_PLAYER__PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___START__PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Target Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___CHECK_TARGET_DISTANCE__GEOLOCATED = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Check Player Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3___CHECK_PLAYER_LOCATION__PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Puzzle Task3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK3_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.PuzzleImpl <em>Puzzle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.PuzzleImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzle()
	 * @generated
	 */
	int PUZZLE = 1;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.PlayerToIntImpl <em>Player To Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.PlayerToIntImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPlayerToInt()
	 * @generated
	 */
	int PLAYER_TO_INT = 7;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__SOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Puzzle Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__PUZZLE_PIECES = 2;

	/**
	 * The feature id for the '<em><b>Player Pieces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__PLAYER_PIECES = 3;

	/**
	 * The feature id for the '<em><b>Active Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__ACTIVE_PLAYERS = 4;

	/**
	 * The number of structural features of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Accept Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___ACCEPT_PROPOSAL__STRING = 0;

	/**
	 * The operation id for the '<em>Start Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___START_PUZZLE__PLAYER = 1;

	/**
	 * The operation id for the '<em>Finish Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___FINISH_PUZZLE__PLAYER = 2;

	/**
	 * The operation id for the '<em>Get Puzzle Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___GET_PUZZLE_CONTENT__PLAYER = 3;

	/**
	 * The operation id for the '<em>Quit Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___QUIT_PUZZLE__PLAYER = 4;

	/**
	 * The number of operations of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.PuzzlePiece <em>Puzzle Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.PuzzlePiece
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzlePiece()
	 * @generated
	 */
	int PUZZLE_PIECE = 2;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE__HTML = 0;

	/**
	 * The feature id for the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE__PLAYER_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Puzzle Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Puzzle Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.ImagePieceImpl <em>Image Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.ImagePieceImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getImagePiece()
	 * @generated
	 */
	int IMAGE_PIECE = 3;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PIECE__HTML = PUZZLE_PIECE__HTML;

	/**
	 * The feature id for the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PIECE__PLAYER_COUNT = PUZZLE_PIECE__PLAYER_COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PIECE__NAME = PUZZLE_PIECE__NAME;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PIECE__IMAGE_URL = PUZZLE_PIECE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PIECE__ALT_TEXT = PUZZLE_PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PIECE_FEATURE_COUNT = PUZZLE_PIECE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PIECE_OPERATION_COUNT = PUZZLE_PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.PlayerToPuzzlePieceImpl <em>Player To Puzzle Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.PlayerToPuzzlePieceImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPlayerToPuzzlePiece()
	 * @generated
	 */
	int PLAYER_TO_PUZZLE_PIECE = 8;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.PlayerToStringsImpl <em>Player To Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.PlayerToStringsImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPlayerToStrings()
	 * @generated
	 */
	int PLAYER_TO_STRINGS = 9;


	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask3.runtime.PuzzleTask3 <em>Puzzle Task3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle Task3</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3
	 * @generated
	 */
	EClass getPuzzleTask3();

	/**
	 * Returns the meta object for the containment reference '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getPuzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Puzzle</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getPuzzle()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EReference getPuzzleTask3_Puzzle();

	/**
	 * Returns the meta object for the containment reference '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getTaskScores <em>Task Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Scores</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getTaskScores()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EReference getPuzzleTask3_TaskScores();

	/**
	 * Returns the meta object for the map '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attempts</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getAttempts()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EReference getPuzzleTask3_Attempts();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getOpenTime <em>Open Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Time</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getOpenTime()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EAttribute getPuzzleTask3_OpenTime();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getCloseTime <em>Close Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Time</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getCloseTime()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EAttribute getPuzzleTask3_CloseTime();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptable Target Distance</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getAcceptableTargetDistance()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EAttribute getPuzzleTask3_AcceptableTargetDistance();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getMaxScore <em>Max Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Score</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getMaxScore()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EAttribute getPuzzleTask3_MaxScore();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrong Attempt Penalty</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getWrongAttemptPenalty()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EAttribute getPuzzleTask3_WrongAttemptPenalty();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#getNumCorrectRequired <em>Num Correct Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Correct Required</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#getNumCorrectRequired()
	 * @see #getPuzzleTask3()
	 * @generated
	 */
	EAttribute getPuzzleTask3_NumCorrectRequired();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#acceptProposal(java.lang.String, no.hal.pg.runtime.Player) <em>Accept Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Proposal</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#acceptProposal(java.lang.String, no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask3__AcceptProposal__String_Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#calculateScore(int) <em>Calculate Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Score</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#calculateScore(int)
	 * @generated
	 */
	EOperation getPuzzleTask3__CalculateScore__int();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#acceptPlayer(no.hal.pg.runtime.Player) <em>Accept Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Player</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#acceptPlayer(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask3__AcceptPlayer__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#isTimeWithinInterval() <em>Is Time Within Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Time Within Interval</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#isTimeWithinInterval()
	 * @generated
	 */
	EOperation getPuzzleTask3__IsTimeWithinInterval();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#canStart(no.hal.pg.runtime.Player) <em>Can Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Start</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#canStart(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask3__CanStart__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#quitPuzzle(no.hal.pg.runtime.Player) <em>Quit Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quit Puzzle</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#quitPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask3__QuitPuzzle__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#isCompletedByPlayer(no.hal.pg.runtime.Player) <em>Is Completed By Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Completed By Player</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#isCompletedByPlayer(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask3__IsCompletedByPlayer__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#start(no.hal.pg.runtime.Player) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#start(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask3__Start__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#checkTargetDistance(no.hal.pg.osm.GeoLocated) <em>Check Target Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Target Distance</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#checkTargetDistance(no.hal.pg.osm.GeoLocated)
	 * @generated
	 */
	EOperation getPuzzleTask3__CheckTargetDistance__GeoLocated();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTask3#checkPlayerLocation(no.hal.pg.runtime.Player) <em>Check Player Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Player Location</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3#checkPlayerLocation(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask3__CheckPlayerLocation__Player();

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl <em>Puzzle Task View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzleTaskView()
	 * @generated
	 */
	int PUZZLE_TASK_VIEW = 5;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.TaskScoresImpl <em>Task Scores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.TaskScoresImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getTaskScores()
	 * @generated
	 */
	int TASK_SCORES = 6;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask3.runtime.impl.TextPieceImpl <em>Text Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask3.runtime.impl.TextPieceImpl
	 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getTextPiece()
	 * @generated
	 */
	int TEXT_PIECE = 4;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PIECE__HTML = PUZZLE_PIECE__HTML;

	/**
	 * The feature id for the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PIECE__PLAYER_COUNT = PUZZLE_PIECE__PLAYER_COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PIECE__NAME = PUZZLE_PIECE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PIECE__TEXT = PUZZLE_PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PIECE_FEATURE_COUNT = PUZZLE_PIECE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PIECE_OPERATION_COUNT = PUZZLE_PIECE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__USER = AppPackage.TASK_VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__MODEL = AppPackage.TASK_VIEW__MODEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__DESCRIPTION = AppPackage.TASK_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__ENABLED = AppPackage.TASK_VIEW__ENABLED;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__STARTED = AppPackage.TASK_VIEW__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__FINISHED = AppPackage.TASK_VIEW__FINISHED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__CONTENT = AppPackage.TASK_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__SCORE = AppPackage.TASK_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__TASK_LOCATION = AppPackage.TASK_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Completed By Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__IS_COMPLETED_BY_PLAYER = AppPackage.TASK_VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__ACTIVE = AppPackage.TASK_VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__DISTANCE = AppPackage.TASK_VIEW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__INSTRUCTIONS = AppPackage.TASK_VIEW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Close Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__CLOSE_TIME = AppPackage.TASK_VIEW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number Of Active Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__NUMBER_OF_ACTIVE_PLAYERS = AppPackage.TASK_VIEW_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Puzzle Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW_FEATURE_COUNT = AppPackage.TASK_VIEW_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Propose Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING = AppPackage.TASK_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Start Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___START_PUZZLE = AppPackage.TASK_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___ACCEPT_PLAYER = AppPackage.TASK_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___START = AppPackage.TASK_VIEW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Quit Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___QUIT_PUZZLE = AppPackage.TASK_VIEW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___IS_ENABLED = AppPackage.TASK_VIEW_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Puzzle Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW_OPERATION_COUNT = AppPackage.TASK_VIEW_OPERATION_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Task Scores</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCORES__TASK_SCORES = 0;

	/**
	 * The number of structural features of the '<em>Task Scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCORES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCORES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_INT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_INT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Player To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_INT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_INT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_PUZZLE_PIECE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_PUZZLE_PIECE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Player To Puzzle Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_PUZZLE_PIECE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player To Puzzle Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_PUZZLE_PIECE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_STRINGS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_STRINGS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Player To Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_STRINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player To Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_STRINGS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask3.runtime.Puzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle</em>'.
	 * @see no.inlea.puzzletask3.runtime.Puzzle
	 * @generated
	 */
	EClass getPuzzle();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.Puzzle#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#getInstructions()
	 * @see #getPuzzle()
	 * @generated
	 */
	EAttribute getPuzzle_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.Puzzle#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution</em>'.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#getSolution()
	 * @see #getPuzzle()
	 * @generated
	 */
	EAttribute getPuzzle_Solution();

	/**
	 * Returns the meta object for the containment reference list '{@link no.inlea.puzzletask3.runtime.Puzzle#getPuzzlePieces <em>Puzzle Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Puzzle Pieces</em>'.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#getPuzzlePieces()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_PuzzlePieces();

	/**
	 * Returns the meta object for the map '{@link no.inlea.puzzletask3.runtime.Puzzle#getPlayerPieces <em>Player Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Player Pieces</em>'.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#getPlayerPieces()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_PlayerPieces();

	/**
	 * Returns the meta object for the reference list '{@link no.inlea.puzzletask3.runtime.Puzzle#getActivePlayers <em>Active Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Players</em>'.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#getActivePlayers()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_ActivePlayers();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.Puzzle#acceptProposal(java.lang.String) <em>Accept Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Proposal</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#acceptProposal(java.lang.String)
	 * @generated
	 */
	EOperation getPuzzle__AcceptProposal__String();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.Puzzle#startPuzzle(no.hal.pg.runtime.Player) <em>Start Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Puzzle</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#startPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzle__StartPuzzle__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.Puzzle#finishPuzzle(no.hal.pg.runtime.Player) <em>Finish Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Finish Puzzle</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#finishPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzle__FinishPuzzle__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.Puzzle#getPuzzleContent(no.hal.pg.runtime.Player) <em>Get Puzzle Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Puzzle Content</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#getPuzzleContent(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzle__GetPuzzleContent__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.Puzzle#quitPuzzle(no.hal.pg.runtime.Player) <em>Quit Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quit Puzzle</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.Puzzle#quitPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzle__QuitPuzzle__Player();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Player To Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player To Int</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="no.hal.pg.runtime.Player"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
	 * @generated
	 */
	EClass getPlayerToInt();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToInt()
	 * @generated
	 */
	EReference getPlayerToInt_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToInt()
	 * @generated
	 */
	EAttribute getPlayerToInt_Value();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask3.runtime.ImagePiece <em>Image Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Piece</em>'.
	 * @see no.inlea.puzzletask3.runtime.ImagePiece
	 * @generated
	 */
	EClass getImagePiece();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.ImagePiece#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see no.inlea.puzzletask3.runtime.ImagePiece#getImageUrl()
	 * @see #getImagePiece()
	 * @generated
	 */
	EAttribute getImagePiece_ImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.ImagePiece#getAltText <em>Alt Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Text</em>'.
	 * @see no.inlea.puzzletask3.runtime.ImagePiece#getAltText()
	 * @see #getImagePiece()
	 * @generated
	 */
	EAttribute getImagePiece_AltText();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask3.runtime.PuzzlePiece <em>Puzzle Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle Piece</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzlePiece
	 * @generated
	 */
	EClass getPuzzlePiece();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzlePiece#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzlePiece#getHtml()
	 * @see #getPuzzlePiece()
	 * @generated
	 */
	EAttribute getPuzzlePiece_Html();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzlePiece#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzlePiece#getName()
	 * @see #getPuzzlePiece()
	 * @generated
	 */
	EAttribute getPuzzlePiece_Name();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask3.runtime.TextPiece <em>Text Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Piece</em>'.
	 * @see no.inlea.puzzletask3.runtime.TextPiece
	 * @generated
	 */
	EClass getTextPiece();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.TextPiece#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see no.inlea.puzzletask3.runtime.TextPiece#getText()
	 * @see #getTextPiece()
	 * @generated
	 */
	EAttribute getTextPiece_Text();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzlePiece#getPlayerCount <em>Player Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player Count</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzlePiece#getPlayerCount()
	 * @see #getPuzzlePiece()
	 * @generated
	 */
	EAttribute getPuzzlePiece_PlayerCount();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Player To Puzzle Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player To Puzzle Piece</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="no.hal.pg.runtime.Player"
	 *        valueType="no.inlea.puzzletask3.runtime.PuzzlePiece"
	 * @generated
	 */
	EClass getPlayerToPuzzlePiece();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToPuzzlePiece()
	 * @generated
	 */
	EReference getPlayerToPuzzlePiece_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToPuzzlePiece()
	 * @generated
	 */
	EReference getPlayerToPuzzlePiece_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Player To Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player To Strings</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="no.hal.pg.runtime.Player"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueMany="true"
	 * @generated
	 */
	EClass getPlayerToStrings();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToStrings()
	 * @generated
	 */
	EReference getPlayerToStrings_Key();

	/**
	 * Returns the meta object for the attribute list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToStrings()
	 * @generated
	 */
	EAttribute getPlayerToStrings_Value();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView <em>Puzzle Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle Task View</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView
	 * @generated
	 */
	EClass getPuzzleTaskView();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#getContent()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Content();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#getScore()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Score();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#getTaskLocation <em>Task Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Location</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#getTaskLocation()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_TaskLocation();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#isIsCompletedByPlayer <em>Is Completed By Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Completed By Player</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#isIsCompletedByPlayer()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_IsCompletedByPlayer();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#isActive()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Active();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#getDistance()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Distance();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#getInstructions()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#getCloseTime <em>Close Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Time</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#getCloseTime()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_CloseTime();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#getNumberOfActivePlayers <em>Number Of Active Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Active Players</em>'.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#getNumberOfActivePlayers()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_NumberOfActivePlayers();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#proposeAnswer(java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Answer</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#proposeAnswer(java.lang.String)
	 * @generated
	 */
	EOperation getPuzzleTaskView__ProposeAnswer__String();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#startPuzzle() <em>Start Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Puzzle</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#startPuzzle()
	 * @generated
	 */
	EOperation getPuzzleTaskView__StartPuzzle();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#acceptPlayer() <em>Accept Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Player</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#acceptPlayer()
	 * @generated
	 */
	EOperation getPuzzleTaskView__AcceptPlayer();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#start()
	 * @generated
	 */
	EOperation getPuzzleTaskView__Start();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#quitPuzzle() <em>Quit Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quit Puzzle</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#quitPuzzle()
	 * @generated
	 */
	EOperation getPuzzleTaskView__QuitPuzzle();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView#isEnabled() <em>Is Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enabled</em>' operation.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView#isEnabled()
	 * @generated
	 */
	EOperation getPuzzleTaskView__IsEnabled();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask3.runtime.TaskScores <em>Task Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Scores</em>'.
	 * @see no.inlea.puzzletask3.runtime.TaskScores
	 * @generated
	 */
	EClass getTaskScores();

	/**
	 * Returns the meta object for the map '{@link no.inlea.puzzletask3.runtime.TaskScores#getTaskScores <em>Task Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Task Scores</em>'.
	 * @see no.inlea.puzzletask3.runtime.TaskScores#getTaskScores()
	 * @see #getTaskScores()
	 * @generated
	 */
	EReference getTaskScores_TaskScores();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.PuzzleTask3Impl <em>Puzzle Task3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.PuzzleTask3Impl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzleTask3()
		 * @generated
		 */
		EClass PUZZLE_TASK3 = eINSTANCE.getPuzzleTask3();

		/**
		 * The meta object literal for the '<em><b>Puzzle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK3__PUZZLE = eINSTANCE.getPuzzleTask3_Puzzle();

		/**
		 * The meta object literal for the '<em><b>Task Scores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK3__TASK_SCORES = eINSTANCE.getPuzzleTask3_TaskScores();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK3__ATTEMPTS = eINSTANCE.getPuzzleTask3_Attempts();

		/**
		 * The meta object literal for the '<em><b>Open Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK3__OPEN_TIME = eINSTANCE.getPuzzleTask3_OpenTime();

		/**
		 * The meta object literal for the '<em><b>Close Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK3__CLOSE_TIME = eINSTANCE.getPuzzleTask3_CloseTime();

		/**
		 * The meta object literal for the '<em><b>Acceptable Target Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK3__ACCEPTABLE_TARGET_DISTANCE = eINSTANCE.getPuzzleTask3_AcceptableTargetDistance();

		/**
		 * The meta object literal for the '<em><b>Max Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK3__MAX_SCORE = eINSTANCE.getPuzzleTask3_MaxScore();

		/**
		 * The meta object literal for the '<em><b>Wrong Attempt Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK3__WRONG_ATTEMPT_PENALTY = eINSTANCE.getPuzzleTask3_WrongAttemptPenalty();

		/**
		 * The meta object literal for the '<em><b>Num Correct Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK3__NUM_CORRECT_REQUIRED = eINSTANCE.getPuzzleTask3_NumCorrectRequired();

		/**
		 * The meta object literal for the '<em><b>Accept Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___ACCEPT_PROPOSAL__STRING_PLAYER = eINSTANCE.getPuzzleTask3__AcceptProposal__String_Player();

		/**
		 * The meta object literal for the '<em><b>Calculate Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___CALCULATE_SCORE__INT = eINSTANCE.getPuzzleTask3__CalculateScore__int();

		/**
		 * The meta object literal for the '<em><b>Accept Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___ACCEPT_PLAYER__PLAYER = eINSTANCE.getPuzzleTask3__AcceptPlayer__Player();

		/**
		 * The meta object literal for the '<em><b>Is Time Within Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___IS_TIME_WITHIN_INTERVAL = eINSTANCE.getPuzzleTask3__IsTimeWithinInterval();

		/**
		 * The meta object literal for the '<em><b>Can Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___CAN_START__PLAYER = eINSTANCE.getPuzzleTask3__CanStart__Player();

		/**
		 * The meta object literal for the '<em><b>Quit Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___QUIT_PUZZLE__PLAYER = eINSTANCE.getPuzzleTask3__QuitPuzzle__Player();

		/**
		 * The meta object literal for the '<em><b>Is Completed By Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___IS_COMPLETED_BY_PLAYER__PLAYER = eINSTANCE.getPuzzleTask3__IsCompletedByPlayer__Player();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___START__PLAYER = eINSTANCE.getPuzzleTask3__Start__Player();

		/**
		 * The meta object literal for the '<em><b>Check Target Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___CHECK_TARGET_DISTANCE__GEOLOCATED = eINSTANCE.getPuzzleTask3__CheckTargetDistance__GeoLocated();

		/**
		 * The meta object literal for the '<em><b>Check Player Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK3___CHECK_PLAYER_LOCATION__PLAYER = eINSTANCE.getPuzzleTask3__CheckPlayerLocation__Player();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.PuzzleImpl <em>Puzzle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.PuzzleImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzle()
		 * @generated
		 */
		EClass PUZZLE = eINSTANCE.getPuzzle();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE__INSTRUCTIONS = eINSTANCE.getPuzzle_Instructions();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE__SOLUTION = eINSTANCE.getPuzzle_Solution();

		/**
		 * The meta object literal for the '<em><b>Puzzle Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__PUZZLE_PIECES = eINSTANCE.getPuzzle_PuzzlePieces();

		/**
		 * The meta object literal for the '<em><b>Player Pieces</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__PLAYER_PIECES = eINSTANCE.getPuzzle_PlayerPieces();

		/**
		 * The meta object literal for the '<em><b>Active Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__ACTIVE_PLAYERS = eINSTANCE.getPuzzle_ActivePlayers();

		/**
		 * The meta object literal for the '<em><b>Accept Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___ACCEPT_PROPOSAL__STRING = eINSTANCE.getPuzzle__AcceptProposal__String();

		/**
		 * The meta object literal for the '<em><b>Start Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___START_PUZZLE__PLAYER = eINSTANCE.getPuzzle__StartPuzzle__Player();

		/**
		 * The meta object literal for the '<em><b>Finish Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___FINISH_PUZZLE__PLAYER = eINSTANCE.getPuzzle__FinishPuzzle__Player();

		/**
		 * The meta object literal for the '<em><b>Get Puzzle Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___GET_PUZZLE_CONTENT__PLAYER = eINSTANCE.getPuzzle__GetPuzzleContent__Player();

		/**
		 * The meta object literal for the '<em><b>Quit Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___QUIT_PUZZLE__PLAYER = eINSTANCE.getPuzzle__QuitPuzzle__Player();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.PlayerToIntImpl <em>Player To Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.PlayerToIntImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPlayerToInt()
		 * @generated
		 */
		EClass PLAYER_TO_INT = eINSTANCE.getPlayerToInt();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TO_INT__KEY = eINSTANCE.getPlayerToInt_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_TO_INT__VALUE = eINSTANCE.getPlayerToInt_Value();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.ImagePieceImpl <em>Image Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.ImagePieceImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getImagePiece()
		 * @generated
		 */
		EClass IMAGE_PIECE = eINSTANCE.getImagePiece();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PIECE__IMAGE_URL = eINSTANCE.getImagePiece_ImageUrl();

		/**
		 * The meta object literal for the '<em><b>Alt Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PIECE__ALT_TEXT = eINSTANCE.getImagePiece_AltText();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.PuzzlePiece <em>Puzzle Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.PuzzlePiece
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzlePiece()
		 * @generated
		 */
		EClass PUZZLE_PIECE = eINSTANCE.getPuzzlePiece();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_PIECE__HTML = eINSTANCE.getPuzzlePiece_Html();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_PIECE__NAME = eINSTANCE.getPuzzlePiece_Name();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.TextPieceImpl <em>Text Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.TextPieceImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getTextPiece()
		 * @generated
		 */
		EClass TEXT_PIECE = eINSTANCE.getTextPiece();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PIECE__TEXT = eINSTANCE.getTextPiece_Text();

		/**
		 * The meta object literal for the '<em><b>Player Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_PIECE__PLAYER_COUNT = eINSTANCE.getPuzzlePiece_PlayerCount();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.PlayerToPuzzlePieceImpl <em>Player To Puzzle Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.PlayerToPuzzlePieceImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPlayerToPuzzlePiece()
		 * @generated
		 */
		EClass PLAYER_TO_PUZZLE_PIECE = eINSTANCE.getPlayerToPuzzlePiece();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TO_PUZZLE_PIECE__KEY = eINSTANCE.getPlayerToPuzzlePiece_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TO_PUZZLE_PIECE__VALUE = eINSTANCE.getPlayerToPuzzlePiece_Value();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.PlayerToStringsImpl <em>Player To Strings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.PlayerToStringsImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPlayerToStrings()
		 * @generated
		 */
		EClass PLAYER_TO_STRINGS = eINSTANCE.getPlayerToStrings();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TO_STRINGS__KEY = eINSTANCE.getPlayerToStrings_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_TO_STRINGS__VALUE = eINSTANCE.getPlayerToStrings_Value();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl <em>Puzzle Task View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.PuzzleTaskViewImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getPuzzleTaskView()
		 * @generated
		 */
		EClass PUZZLE_TASK_VIEW = eINSTANCE.getPuzzleTaskView();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__CONTENT = eINSTANCE.getPuzzleTaskView_Content();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__SCORE = eINSTANCE.getPuzzleTaskView_Score();

		/**
		 * The meta object literal for the '<em><b>Task Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__TASK_LOCATION = eINSTANCE.getPuzzleTaskView_TaskLocation();

		/**
		 * The meta object literal for the '<em><b>Is Completed By Player</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__IS_COMPLETED_BY_PLAYER = eINSTANCE.getPuzzleTaskView_IsCompletedByPlayer();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__ACTIVE = eINSTANCE.getPuzzleTaskView_Active();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__DISTANCE = eINSTANCE.getPuzzleTaskView_Distance();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__INSTRUCTIONS = eINSTANCE.getPuzzleTaskView_Instructions();

		/**
		 * The meta object literal for the '<em><b>Close Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__CLOSE_TIME = eINSTANCE.getPuzzleTaskView_CloseTime();

		/**
		 * The meta object literal for the '<em><b>Number Of Active Players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__NUMBER_OF_ACTIVE_PLAYERS = eINSTANCE.getPuzzleTaskView_NumberOfActivePlayers();

		/**
		 * The meta object literal for the '<em><b>Propose Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING = eINSTANCE.getPuzzleTaskView__ProposeAnswer__String();

		/**
		 * The meta object literal for the '<em><b>Start Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___START_PUZZLE = eINSTANCE.getPuzzleTaskView__StartPuzzle();

		/**
		 * The meta object literal for the '<em><b>Accept Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___ACCEPT_PLAYER = eINSTANCE.getPuzzleTaskView__AcceptPlayer();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___START = eINSTANCE.getPuzzleTaskView__Start();

		/**
		 * The meta object literal for the '<em><b>Quit Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___QUIT_PUZZLE = eINSTANCE.getPuzzleTaskView__QuitPuzzle();

		/**
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___IS_ENABLED = eINSTANCE.getPuzzleTaskView__IsEnabled();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask3.runtime.impl.TaskScoresImpl <em>Task Scores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask3.runtime.impl.TaskScoresImpl
		 * @see no.inlea.puzzletask3.runtime.impl.RuntimePackageImpl#getTaskScores()
		 * @generated
		 */
		EClass TASK_SCORES = eINSTANCE.getTaskScores();

		/**
		 * The meta object literal for the '<em><b>Task Scores</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SCORES__TASK_SCORES = eINSTANCE.getTaskScores_TaskScores();

	}

} //RuntimePackage
