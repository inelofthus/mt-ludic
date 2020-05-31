/**
 */
package no.inlea.puzzletask.runtime;

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
 * @see no.inlea.puzzletask.runtime.RuntimeFactory
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
	String eNS_URI = "platform:/plugin/no.inela.puzzletask.runtime/model/puzzletask.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "puzzletask";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = no.inlea.puzzletask.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl <em>Puzzle Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzleTask()
	 * @generated
	 */
	int PUZZLE_TASK = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__GAME = no.hal.pg.runtime.RuntimePackage.TASK__GAME;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__PLAYERS = no.hal.pg.runtime.RuntimePackage.TASK__PLAYERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__RESULT = no.hal.pg.runtime.RuntimePackage.TASK__RESULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__START_TIME = no.hal.pg.runtime.RuntimePackage.TASK__START_TIME;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__FINISH_TIME = no.hal.pg.runtime.RuntimePackage.TASK__FINISH_TIME;

	/**
	 * The feature id for the '<em><b>Start Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__START_CONDITIONS = no.hal.pg.runtime.RuntimePackage.TASK__START_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Finish Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__FINISH_CONDITIONS = no.hal.pg.runtime.RuntimePackage.TASK__FINISH_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Start Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__START_ACTIONS = no.hal.pg.runtime.RuntimePackage.TASK__START_ACTIONS;

	/**
	 * The feature id for the '<em><b>Finish Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__FINISH_ACTIONS = no.hal.pg.runtime.RuntimePackage.TASK__FINISH_ACTIONS;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__LATITUDE = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__LONGITUDE = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Puzzles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__PUZZLES = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Player Levels</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__PLAYER_LEVELS = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Player Task Scores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK__PLAYER_TASK_SCORES = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Puzzle Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___GET_DESCRIPTION = no.hal.pg.runtime.RuntimePackage.TASK___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___CAN_START = no.hal.pg.runtime.RuntimePackage.TASK___CAN_START;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___IS_STARTED = no.hal.pg.runtime.RuntimePackage.TASK___IS_STARTED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___IS_FINISHED = no.hal.pg.runtime.RuntimePackage.TASK___IS_FINISHED;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___START = no.hal.pg.runtime.RuntimePackage.TASK___START;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___FINISH__OBJECT = no.hal.pg.runtime.RuntimePackage.TASK___FINISH__OBJECT;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___GET_LAT_LONG = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept Puzzle Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___ACCEPT_PUZZLE_PROPOSAL__STRING_PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___CALCULATE_SCORE__INT_PLAYER_BOOLEAN = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK___ACCEPT_PLAYER__PLAYER = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Puzzle Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PuzzlePieceImpl <em>Puzzle Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PuzzlePieceImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzlePiece()
	 * @generated
	 */
	int PUZZLE_PIECE = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE__PLAYER_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Puzzle Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Puzzle Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskViewImpl <em>Puzzle Task View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PuzzleTaskViewImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzleTaskView()
	 * @generated
	 */
	int PUZZLE_TASK_VIEW = 2;

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
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__IMAGE = AppPackage.TASK_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__SCORE = AppPackage.TASK_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW__LEVEL = AppPackage.TASK_VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Puzzle Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW_FEATURE_COUNT = AppPackage.TASK_VIEW_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___START = AppPackage.TASK_VIEW___START;

	/**
	 * The operation id for the '<em>Propose Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING = AppPackage.TASK_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___FINISH = AppPackage.TASK_VIEW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Start Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___START_PUZZLE = AppPackage.TASK_VIEW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW___ACCEPT_PLAYER = AppPackage.TASK_VIEW_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Puzzle Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK_VIEW_OPERATION_COUNT = AppPackage.TASK_VIEW_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PlayerToIntImpl <em>Player To Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PlayerToIntImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerToInt()
	 * @generated
	 */
	int PLAYER_TO_INT = 3;

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
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PuzzleImpl <em>Puzzle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PuzzleImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzle()
	 * @generated
	 */
	int PUZZLE = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Accept Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___ACCEPT_PROPOSAL__STRING = 0;

	/**
	 * The operation id for the '<em>Finish Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___FINISH_PUZZLE__PLAYER = 1;

	/**
	 * The operation id for the '<em>Start Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___START_PUZZLE__PLAYER = 2;

	/**
	 * The operation id for the '<em>Get Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE___GET_IMAGE__PLAYER = 3;

	/**
	 * The number of operations of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl <em>Simple Puzzle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getSimplePuzzle()
	 * @generated
	 */
	int SIMPLE_PUZZLE = 5;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE__LEVEL = PUZZLE__LEVEL;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE__INSTRUCTIONS = PUZZLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE__SOLUTION = PUZZLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Puzzle Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE__PUZZLE_PIECES = PUZZLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Player Pieces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE__PLAYER_PIECES = PUZZLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE_FEATURE_COUNT = PUZZLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE___ACCEPT_PROPOSAL__STRING = PUZZLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Finish Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE___FINISH_PUZZLE__PLAYER = PUZZLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Start Puzzle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE___START_PUZZLE__PLAYER = PUZZLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE___GET_IMAGE__PLAYER = PUZZLE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Simple Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PUZZLE_OPERATION_COUNT = PUZZLE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PlayerTaskScoreImpl <em>Player Task Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PlayerTaskScoreImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerTaskScore()
	 * @generated
	 */
	int PLAYER_TASK_SCORE = 6;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORE__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORE__SCORE = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORE__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Player Task Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Player Task Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PlayerTaskScoresImpl <em>Player Task Scores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PlayerTaskScoresImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerTaskScores()
	 * @generated
	 */
	int PLAYER_TASK_SCORES = 7;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORES__SCORES = 0;

	/**
	 * The number of structural features of the '<em>Player Task Scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Player Task Scores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TASK_SCORES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.inlea.puzzletask.runtime.impl.PlayerToPuzzlePieceImpl <em>Player To Puzzle Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.impl.PlayerToPuzzlePieceImpl
	 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerToPuzzlePiece()
	 * @generated
	 */
	int PLAYER_TO_PUZZLE_PIECE = 8;

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
	 * Returns the meta object for class '{@link no.inlea.puzzletask.runtime.PuzzleTask <em>Puzzle Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle Task</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTask
	 * @generated
	 */
	EClass getPuzzleTask();

	/**
	 * Returns the meta object for the containment reference list '{@link no.inlea.puzzletask.runtime.PuzzleTask#getPuzzles <em>Puzzles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Puzzles</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTask#getPuzzles()
	 * @see #getPuzzleTask()
	 * @generated
	 */
	EReference getPuzzleTask_Puzzles();

	/**
	 * Returns the meta object for the map '{@link no.inlea.puzzletask.runtime.PuzzleTask#getPlayerLevels <em>Player Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Player Levels</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTask#getPlayerLevels()
	 * @see #getPuzzleTask()
	 * @generated
	 */
	EReference getPuzzleTask_PlayerLevels();

	/**
	 * Returns the meta object for the containment reference '{@link no.inlea.puzzletask.runtime.PuzzleTask#getPlayerTaskScores <em>Player Task Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Task Scores</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTask#getPlayerTaskScores()
	 * @see #getPuzzleTask()
	 * @generated
	 */
	EReference getPuzzleTask_PlayerTaskScores();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.PuzzleTask#acceptPuzzleProposal(java.lang.String, no.hal.pg.runtime.Player) <em>Accept Puzzle Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Puzzle Proposal</em>' operation.
	 * @see no.inlea.puzzletask.runtime.PuzzleTask#acceptPuzzleProposal(java.lang.String, no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask__AcceptPuzzleProposal__String_Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.PuzzleTask#calculateScore(int, no.hal.pg.runtime.Player, boolean) <em>Calculate Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Score</em>' operation.
	 * @see no.inlea.puzzletask.runtime.PuzzleTask#calculateScore(int, no.hal.pg.runtime.Player, boolean)
	 * @generated
	 */
	EOperation getPuzzleTask__CalculateScore__int_Player_boolean();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.PuzzleTask#acceptPlayer(no.hal.pg.runtime.Player) <em>Accept Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Player</em>' operation.
	 * @see no.inlea.puzzletask.runtime.PuzzleTask#acceptPlayer(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzleTask__AcceptPlayer__Player();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask.runtime.PuzzlePiece <em>Puzzle Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle Piece</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzlePiece
	 * @generated
	 */
	EClass getPuzzlePiece();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.PuzzlePiece#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzlePiece#getImage()
	 * @see #getPuzzlePiece()
	 * @generated
	 */
	EAttribute getPuzzlePiece_Image();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.PuzzlePiece#getPlayerCount <em>Player Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player Count</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzlePiece#getPlayerCount()
	 * @see #getPuzzlePiece()
	 * @generated
	 */
	EAttribute getPuzzlePiece_PlayerCount();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask.runtime.PuzzleTaskView <em>Puzzle Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle Task View</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView
	 * @generated
	 */
	EClass getPuzzleTaskView();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#getImage()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Image();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#getScore()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Score();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#getLevel()
	 * @see #getPuzzleTaskView()
	 * @generated
	 */
	EAttribute getPuzzleTaskView_Level();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#proposeAnswer(java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Answer</em>' operation.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#proposeAnswer(java.lang.String)
	 * @generated
	 */
	EOperation getPuzzleTaskView__ProposeAnswer__String();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#finish() <em>Finish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Finish</em>' operation.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#finish()
	 * @generated
	 */
	EOperation getPuzzleTaskView__Finish();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#startPuzzle() <em>Start Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Puzzle</em>' operation.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#startPuzzle()
	 * @generated
	 */
	EOperation getPuzzleTaskView__StartPuzzle();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#acceptPlayer() <em>Accept Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Player</em>' operation.
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#acceptPlayer()
	 * @generated
	 */
	EOperation getPuzzleTaskView__AcceptPlayer();

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
	 * Returns the meta object for class '{@link no.inlea.puzzletask.runtime.Puzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle</em>'.
	 * @see no.inlea.puzzletask.runtime.Puzzle
	 * @generated
	 */
	EClass getPuzzle();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.Puzzle#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see no.inlea.puzzletask.runtime.Puzzle#getLevel()
	 * @see #getPuzzle()
	 * @generated
	 */
	EAttribute getPuzzle_Level();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.Puzzle#acceptProposal(java.lang.String) <em>Accept Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Proposal</em>' operation.
	 * @see no.inlea.puzzletask.runtime.Puzzle#acceptProposal(java.lang.String)
	 * @generated
	 */
	EOperation getPuzzle__AcceptProposal__String();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.Puzzle#finishPuzzle(no.hal.pg.runtime.Player) <em>Finish Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Finish Puzzle</em>' operation.
	 * @see no.inlea.puzzletask.runtime.Puzzle#finishPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzle__FinishPuzzle__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.Puzzle#startPuzzle(no.hal.pg.runtime.Player) <em>Start Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Puzzle</em>' operation.
	 * @see no.inlea.puzzletask.runtime.Puzzle#startPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzle__StartPuzzle__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.Puzzle#getImage(no.hal.pg.runtime.Player) <em>Get Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image</em>' operation.
	 * @see no.inlea.puzzletask.runtime.Puzzle#getImage(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPuzzle__GetImage__Player();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask.runtime.SimplePuzzle <em>Simple Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Puzzle</em>'.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle
	 * @generated
	 */
	EClass getSimplePuzzle();

	/**
	 * Returns the meta object for the containment reference '{@link no.inlea.puzzletask.runtime.SimplePuzzle#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instructions</em>'.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#getInstructions()
	 * @see #getSimplePuzzle()
	 * @generated
	 */
	EReference getSimplePuzzle_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.SimplePuzzle#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution</em>'.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#getSolution()
	 * @see #getSimplePuzzle()
	 * @generated
	 */
	EAttribute getSimplePuzzle_Solution();

	/**
	 * Returns the meta object for the containment reference list '{@link no.inlea.puzzletask.runtime.SimplePuzzle#getPuzzlePieces <em>Puzzle Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Puzzle Pieces</em>'.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#getPuzzlePieces()
	 * @see #getSimplePuzzle()
	 * @generated
	 */
	EReference getSimplePuzzle_PuzzlePieces();

	/**
	 * Returns the meta object for the map '{@link no.inlea.puzzletask.runtime.SimplePuzzle#getPlayerPieces <em>Player Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Player Pieces</em>'.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#getPlayerPieces()
	 * @see #getSimplePuzzle()
	 * @generated
	 */
	EReference getSimplePuzzle_PlayerPieces();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.SimplePuzzle#acceptProposal(java.lang.String) <em>Accept Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Proposal</em>' operation.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#acceptProposal(java.lang.String)
	 * @generated
	 */
	EOperation getSimplePuzzle__AcceptProposal__String();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.SimplePuzzle#finishPuzzle(no.hal.pg.runtime.Player) <em>Finish Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Finish Puzzle</em>' operation.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#finishPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getSimplePuzzle__FinishPuzzle__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.SimplePuzzle#startPuzzle(no.hal.pg.runtime.Player) <em>Start Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Puzzle</em>' operation.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#startPuzzle(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getSimplePuzzle__StartPuzzle__Player();

	/**
	 * Returns the meta object for the '{@link no.inlea.puzzletask.runtime.SimplePuzzle#getImage(no.hal.pg.runtime.Player) <em>Get Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image</em>' operation.
	 * @see no.inlea.puzzletask.runtime.SimplePuzzle#getImage(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getSimplePuzzle__GetImage__Player();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask.runtime.PlayerTaskScore <em>Player Task Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Task Score</em>'.
	 * @see no.inlea.puzzletask.runtime.PlayerTaskScore
	 * @generated
	 */
	EClass getPlayerTaskScore();

	/**
	 * Returns the meta object for the reference '{@link no.inlea.puzzletask.runtime.PlayerTaskScore#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.inlea.puzzletask.runtime.PlayerTaskScore#getPlayer()
	 * @see #getPlayerTaskScore()
	 * @generated
	 */
	EReference getPlayerTaskScore_Player();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.PlayerTaskScore#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see no.inlea.puzzletask.runtime.PlayerTaskScore#getScore()
	 * @see #getPlayerTaskScore()
	 * @generated
	 */
	EAttribute getPlayerTaskScore_Score();

	/**
	 * Returns the meta object for the attribute '{@link no.inlea.puzzletask.runtime.PlayerTaskScore#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see no.inlea.puzzletask.runtime.PlayerTaskScore#getLevel()
	 * @see #getPlayerTaskScore()
	 * @generated
	 */
	EAttribute getPlayerTaskScore_Level();

	/**
	 * Returns the meta object for class '{@link no.inlea.puzzletask.runtime.PlayerTaskScores <em>Player Task Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Task Scores</em>'.
	 * @see no.inlea.puzzletask.runtime.PlayerTaskScores
	 * @generated
	 */
	EClass getPlayerTaskScores();

	/**
	 * Returns the meta object for the reference list '{@link no.inlea.puzzletask.runtime.PlayerTaskScores#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scores</em>'.
	 * @see no.inlea.puzzletask.runtime.PlayerTaskScores#getScores()
	 * @see #getPlayerTaskScores()
	 * @generated
	 */
	EReference getPlayerTaskScores_Scores();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Player To Puzzle Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player To Puzzle Piece</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="no.hal.pg.runtime.Player"
	 *        valueType="no.inlea.puzzletask.runtime.PuzzlePiece"
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
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl <em>Puzzle Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzleTask()
		 * @generated
		 */
		EClass PUZZLE_TASK = eINSTANCE.getPuzzleTask();

		/**
		 * The meta object literal for the '<em><b>Puzzles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK__PUZZLES = eINSTANCE.getPuzzleTask_Puzzles();

		/**
		 * The meta object literal for the '<em><b>Player Levels</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK__PLAYER_LEVELS = eINSTANCE.getPuzzleTask_PlayerLevels();

		/**
		 * The meta object literal for the '<em><b>Player Task Scores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK__PLAYER_TASK_SCORES = eINSTANCE.getPuzzleTask_PlayerTaskScores();

		/**
		 * The meta object literal for the '<em><b>Accept Puzzle Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK___ACCEPT_PUZZLE_PROPOSAL__STRING_PLAYER = eINSTANCE.getPuzzleTask__AcceptPuzzleProposal__String_Player();

		/**
		 * The meta object literal for the '<em><b>Calculate Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK___CALCULATE_SCORE__INT_PLAYER_BOOLEAN = eINSTANCE.getPuzzleTask__CalculateScore__int_Player_boolean();

		/**
		 * The meta object literal for the '<em><b>Accept Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK___ACCEPT_PLAYER__PLAYER = eINSTANCE.getPuzzleTask__AcceptPlayer__Player();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PuzzlePieceImpl <em>Puzzle Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PuzzlePieceImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzlePiece()
		 * @generated
		 */
		EClass PUZZLE_PIECE = eINSTANCE.getPuzzlePiece();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_PIECE__IMAGE = eINSTANCE.getPuzzlePiece_Image();

		/**
		 * The meta object literal for the '<em><b>Player Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_PIECE__PLAYER_COUNT = eINSTANCE.getPuzzlePiece_PlayerCount();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskViewImpl <em>Puzzle Task View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PuzzleTaskViewImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzleTaskView()
		 * @generated
		 */
		EClass PUZZLE_TASK_VIEW = eINSTANCE.getPuzzleTaskView();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__IMAGE = eINSTANCE.getPuzzleTaskView_Image();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__SCORE = eINSTANCE.getPuzzleTaskView_Score();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK_VIEW__LEVEL = eINSTANCE.getPuzzleTaskView_Level();

		/**
		 * The meta object literal for the '<em><b>Propose Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING = eINSTANCE.getPuzzleTaskView__ProposeAnswer__String();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE_TASK_VIEW___FINISH = eINSTANCE.getPuzzleTaskView__Finish();

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
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PlayerToIntImpl <em>Player To Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PlayerToIntImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerToInt()
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
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PuzzleImpl <em>Puzzle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PuzzleImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPuzzle()
		 * @generated
		 */
		EClass PUZZLE = eINSTANCE.getPuzzle();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE__LEVEL = eINSTANCE.getPuzzle_Level();

		/**
		 * The meta object literal for the '<em><b>Accept Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___ACCEPT_PROPOSAL__STRING = eINSTANCE.getPuzzle__AcceptProposal__String();

		/**
		 * The meta object literal for the '<em><b>Finish Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___FINISH_PUZZLE__PLAYER = eINSTANCE.getPuzzle__FinishPuzzle__Player();

		/**
		 * The meta object literal for the '<em><b>Start Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___START_PUZZLE__PLAYER = eINSTANCE.getPuzzle__StartPuzzle__Player();

		/**
		 * The meta object literal for the '<em><b>Get Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUZZLE___GET_IMAGE__PLAYER = eINSTANCE.getPuzzle__GetImage__Player();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl <em>Simple Puzzle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getSimplePuzzle()
		 * @generated
		 */
		EClass SIMPLE_PUZZLE = eINSTANCE.getSimplePuzzle();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PUZZLE__INSTRUCTIONS = eINSTANCE.getSimplePuzzle_Instructions();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PUZZLE__SOLUTION = eINSTANCE.getSimplePuzzle_Solution();

		/**
		 * The meta object literal for the '<em><b>Puzzle Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PUZZLE__PUZZLE_PIECES = eINSTANCE.getSimplePuzzle_PuzzlePieces();

		/**
		 * The meta object literal for the '<em><b>Player Pieces</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PUZZLE__PLAYER_PIECES = eINSTANCE.getSimplePuzzle_PlayerPieces();

		/**
		 * The meta object literal for the '<em><b>Accept Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_PUZZLE___ACCEPT_PROPOSAL__STRING = eINSTANCE.getSimplePuzzle__AcceptProposal__String();

		/**
		 * The meta object literal for the '<em><b>Finish Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_PUZZLE___FINISH_PUZZLE__PLAYER = eINSTANCE.getSimplePuzzle__FinishPuzzle__Player();

		/**
		 * The meta object literal for the '<em><b>Start Puzzle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_PUZZLE___START_PUZZLE__PLAYER = eINSTANCE.getSimplePuzzle__StartPuzzle__Player();

		/**
		 * The meta object literal for the '<em><b>Get Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_PUZZLE___GET_IMAGE__PLAYER = eINSTANCE.getSimplePuzzle__GetImage__Player();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PlayerTaskScoreImpl <em>Player Task Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PlayerTaskScoreImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerTaskScore()
		 * @generated
		 */
		EClass PLAYER_TASK_SCORE = eINSTANCE.getPlayerTaskScore();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TASK_SCORE__PLAYER = eINSTANCE.getPlayerTaskScore_Player();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_TASK_SCORE__SCORE = eINSTANCE.getPlayerTaskScore_Score();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_TASK_SCORE__LEVEL = eINSTANCE.getPlayerTaskScore_Level();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PlayerTaskScoresImpl <em>Player Task Scores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PlayerTaskScoresImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerTaskScores()
		 * @generated
		 */
		EClass PLAYER_TASK_SCORES = eINSTANCE.getPlayerTaskScores();

		/**
		 * The meta object literal for the '<em><b>Scores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TASK_SCORES__SCORES = eINSTANCE.getPlayerTaskScores_Scores();

		/**
		 * The meta object literal for the '{@link no.inlea.puzzletask.runtime.impl.PlayerToPuzzlePieceImpl <em>Player To Puzzle Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inlea.puzzletask.runtime.impl.PlayerToPuzzlePieceImpl
		 * @see no.inlea.puzzletask.runtime.impl.RuntimePackageImpl#getPlayerToPuzzlePiece()
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

	}

} //RuntimePackage
