/**
 */
package no.inela.ineruntime;

import no.hal.pg.app.AppPackage;

import no.hal.pg.runtime.RuntimePackage;

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
 * @see no.inela.ineruntime.IneruntimeFactory
 * @model kind="package"
 * @generated
 */
public interface IneruntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ineruntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.inela.runtime/model/runtime.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ineruntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IneruntimePackage eINSTANCE = no.inela.ineruntime.impl.IneruntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.LeaderboardGameImpl <em>Leaderboard Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.LeaderboardGameImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getLeaderboardGame()
	 * @generated
	 */
	int LEADERBOARD_GAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME__PLAYERS = RuntimePackage.GAME__PLAYERS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME__ITEMS = RuntimePackage.GAME__ITEMS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME__TASKS = RuntimePackage.GAME__TASKS;

	/**
	 * The feature id for the '<em><b>Leaderboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME__LEADERBOARD = RuntimePackage.GAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Players Active Tasks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS = RuntimePackage.GAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME__TEAMS = RuntimePackage.GAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Leaderboard Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_FEATURE_COUNT = RuntimePackage.GAME_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Active Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME___GET_ACTIVE_TASK__PLAYER = RuntimePackage.GAME_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Leaderboard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME___UPDATE_LEADERBOARD__PLAYER_INT = RuntimePackage.GAME_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leaderboard Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_OPERATION_COUNT = RuntimePackage.GAME_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.LeaderboardImpl <em>Leaderboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.LeaderboardImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getLeaderboard()
	 * @generated
	 */
	int LEADERBOARD = 1;

	/**
	 * The feature id for the '<em><b>Player Total Scores</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD__PLAYER_TOTAL_SCORES = 0;

	/**
	 * The feature id for the '<em><b>Team Total Scores</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD__TEAM_TOTAL_SCORES = 1;

	/**
	 * The number of structural features of the '<em>Leaderboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Leaderboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.PlayerToIntImpl <em>Player To Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.PlayerToIntImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerToInt()
	 * @generated
	 */
	int PLAYER_TO_INT = 2;

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
	 * The meta object id for the '{@link no.inela.ineruntime.impl.LeaderboardGameViewImpl <em>Leaderboard Game View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.LeaderboardGameViewImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getLeaderboardGameView()
	 * @generated
	 */
	int LEADERBOARD_GAME_VIEW = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__USER = AppPackage.GAME_VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__MODEL = AppPackage.GAME_VIEW__MODEL;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__PLAYER = AppPackage.GAME_VIEW__PLAYER;

	/**
	 * The feature id for the '<em><b>Task Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__TASK_VIEWS = AppPackage.GAME_VIEW__TASK_VIEWS;

	/**
	 * The feature id for the '<em><b>All Item Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__ALL_ITEM_VIEWS = AppPackage.GAME_VIEW__ALL_ITEM_VIEWS;

	/**
	 * The feature id for the '<em><b>Item Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__ITEM_VIEWS = AppPackage.GAME_VIEW__ITEM_VIEWS;

	/**
	 * The feature id for the '<em><b>Map View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__MAP_VIEW = AppPackage.GAME_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__LOCATION = AppPackage.GAME_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leaderboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__LEADERBOARD = AppPackage.GAME_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Team Leaderboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW__TEAM_LEADERBOARD = AppPackage.GAME_VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Leaderboard Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW_FEATURE_COUNT = AppPackage.GAME_VIEW_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Player Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW___SET_PLAYER_LOCATION__FLOAT_FLOAT = AppPackage.GAME_VIEW_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaderboard Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_GAME_VIEW_OPERATION_COUNT = AppPackage.GAME_VIEW_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.PlayerToTaskImpl <em>Player To Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.PlayerToTaskImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerToTask()
	 * @generated
	 */
	int PLAYER_TO_TASK = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_TASK__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_TASK__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Player To Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player To Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TO_TASK_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.GroupToIntImpl <em>Group To Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.GroupToIntImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getGroupToInt()
	 * @generated
	 */
	int GROUP_TO_INT = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TO_INT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TO_INT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Group To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TO_INT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Group To Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TO_INT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link no.inela.ineruntime.PlayerAction <em>Player Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.PlayerAction
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerAction()
	 * @generated
	 */
	int PLAYER_ACTION = 6;

	/**
	 * The number of structural features of the '<em>Player Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ACTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ACTION___PERFORM__PLAYER = 0;

	/**
	 * The number of operations of the '<em>Player Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.CompositePlayerActionImpl <em>Composite Player Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.CompositePlayerActionImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getCompositePlayerAction()
	 * @generated
	 */
	int COMPOSITE_PLAYER_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Player Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS = PLAYER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Player Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_ACTION_FEATURE_COUNT = PLAYER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_ACTION___PERFORM__PLAYER = PLAYER_ACTION___PERFORM__PLAYER;

	/**
	 * The number of operations of the '<em>Composite Player Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_ACTION_OPERATION_COUNT = PLAYER_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.SetTaskToActiveActionImpl <em>Set Task To Active Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.SetTaskToActiveActionImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getSetTaskToActiveAction()
	 * @generated
	 */
	int SET_TASK_TO_ACTIVE_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_TO_ACTIVE_ACTION__TASK = PLAYER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Task To Active Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_TO_ACTIVE_ACTION_FEATURE_COUNT = PLAYER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_TO_ACTIVE_ACTION___PERFORM__PLAYER = PLAYER_ACTION___PERFORM__PLAYER;

	/**
	 * The number of operations of the '<em>Set Task To Active Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_TO_ACTIVE_ACTION_OPERATION_COUNT = PLAYER_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.RemoveTaskFromActiveActionImpl <em>Remove Task From Active Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.RemoveTaskFromActiveActionImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getRemoveTaskFromActiveAction()
	 * @generated
	 */
	int REMOVE_TASK_FROM_ACTIVE_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TASK_FROM_ACTIVE_ACTION__TASK = PLAYER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Task From Active Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TASK_FROM_ACTIVE_ACTION_FEATURE_COUNT = PLAYER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TASK_FROM_ACTIVE_ACTION___PERFORM__PLAYER = PLAYER_ACTION___PERFORM__PLAYER;

	/**
	 * The number of operations of the '<em>Remove Task From Active Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TASK_FROM_ACTIVE_ACTION_OPERATION_COUNT = PLAYER_ACTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.inela.ineruntime.PlayerCondition <em>Player Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.PlayerCondition
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerCondition()
	 * @generated
	 */
	int PLAYER_CONDITION = 10;

	/**
	 * The number of structural features of the '<em>Player Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_CONDITION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_CONDITION___TEST__PLAYER = 0;

	/**
	 * The number of operations of the '<em>Player Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_CONDITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.CompositePlayerConditionImpl <em>Composite Player Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.CompositePlayerConditionImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getCompositePlayerCondition()
	 * @generated
	 */
	int COMPOSITE_PLAYER_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_CONDITION__LOGIC = PLAYER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Player Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS = PLAYER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Player Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_CONDITION_FEATURE_COUNT = PLAYER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_CONDITION___TEST__PLAYER = PLAYER_CONDITION___TEST__PLAYER;

	/**
	 * The number of operations of the '<em>Composite Player Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PLAYER_CONDITION_OPERATION_COUNT = PLAYER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.inela.ineruntime.impl.IsOnlyTaskActiveForPlayerConditionImpl <em>Is Only Task Active For Player Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inela.ineruntime.impl.IsOnlyTaskActiveForPlayerConditionImpl
	 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getIsOnlyTaskActiveForPlayerCondition()
	 * @generated
	 */
	int IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK = PLAYER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Only Task Active For Player Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION_FEATURE_COUNT = PLAYER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION___TEST__PLAYER = PLAYER_CONDITION___TEST__PLAYER;

	/**
	 * The number of operations of the '<em>Is Only Task Active For Player Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION_OPERATION_COUNT = PLAYER_CONDITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.LeaderboardGame <em>Leaderboard Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaderboard Game</em>'.
	 * @see no.inela.ineruntime.LeaderboardGame
	 * @generated
	 */
	EClass getLeaderboardGame();

	/**
	 * Returns the meta object for the containment reference '{@link no.inela.ineruntime.LeaderboardGame#getLeaderboard <em>Leaderboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leaderboard</em>'.
	 * @see no.inela.ineruntime.LeaderboardGame#getLeaderboard()
	 * @see #getLeaderboardGame()
	 * @generated
	 */
	EReference getLeaderboardGame_Leaderboard();

	/**
	 * Returns the meta object for the map '{@link no.inela.ineruntime.LeaderboardGame#getPlayersActiveTasks <em>Players Active Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Players Active Tasks</em>'.
	 * @see no.inela.ineruntime.LeaderboardGame#getPlayersActiveTasks()
	 * @see #getLeaderboardGame()
	 * @generated
	 */
	EReference getLeaderboardGame_PlayersActiveTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link no.inela.ineruntime.LeaderboardGame#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see no.inela.ineruntime.LeaderboardGame#getTeams()
	 * @see #getLeaderboardGame()
	 * @generated
	 */
	EReference getLeaderboardGame_Teams();

	/**
	 * Returns the meta object for the '{@link no.inela.ineruntime.LeaderboardGame#getActiveTask(no.hal.pg.runtime.Player) <em>Get Active Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Task</em>' operation.
	 * @see no.inela.ineruntime.LeaderboardGame#getActiveTask(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getLeaderboardGame__GetActiveTask__Player();

	/**
	 * Returns the meta object for the '{@link no.inela.ineruntime.LeaderboardGame#updateLeaderboard(no.hal.pg.runtime.Player, int) <em>Update Leaderboard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Leaderboard</em>' operation.
	 * @see no.inela.ineruntime.LeaderboardGame#updateLeaderboard(no.hal.pg.runtime.Player, int)
	 * @generated
	 */
	EOperation getLeaderboardGame__UpdateLeaderboard__Player_int();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.Leaderboard <em>Leaderboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaderboard</em>'.
	 * @see no.inela.ineruntime.Leaderboard
	 * @generated
	 */
	EClass getLeaderboard();

	/**
	 * Returns the meta object for the map '{@link no.inela.ineruntime.Leaderboard#getPlayerTotalScores <em>Player Total Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Player Total Scores</em>'.
	 * @see no.inela.ineruntime.Leaderboard#getPlayerTotalScores()
	 * @see #getLeaderboard()
	 * @generated
	 */
	EReference getLeaderboard_PlayerTotalScores();

	/**
	 * Returns the meta object for the map '{@link no.inela.ineruntime.Leaderboard#getTeamTotalScores <em>Team Total Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Team Total Scores</em>'.
	 * @see no.inela.ineruntime.Leaderboard#getTeamTotalScores()
	 * @see #getLeaderboard()
	 * @generated
	 */
	EReference getLeaderboard_TeamTotalScores();

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
	 * Returns the meta object for class '{@link no.inela.ineruntime.LeaderboardGameView <em>Leaderboard Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaderboard Game View</em>'.
	 * @see no.inela.ineruntime.LeaderboardGameView
	 * @generated
	 */
	EClass getLeaderboardGameView();

	/**
	 * Returns the meta object for the containment reference '{@link no.inela.ineruntime.LeaderboardGameView#getMapView <em>Map View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map View</em>'.
	 * @see no.inela.ineruntime.LeaderboardGameView#getMapView()
	 * @see #getLeaderboardGameView()
	 * @generated
	 */
	EReference getLeaderboardGameView_MapView();

	/**
	 * Returns the meta object for the attribute '{@link no.inela.ineruntime.LeaderboardGameView#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see no.inela.ineruntime.LeaderboardGameView#getLocation()
	 * @see #getLeaderboardGameView()
	 * @generated
	 */
	EAttribute getLeaderboardGameView_Location();

	/**
	 * Returns the meta object for the attribute '{@link no.inela.ineruntime.LeaderboardGameView#getLeaderboard <em>Leaderboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaderboard</em>'.
	 * @see no.inela.ineruntime.LeaderboardGameView#getLeaderboard()
	 * @see #getLeaderboardGameView()
	 * @generated
	 */
	EAttribute getLeaderboardGameView_Leaderboard();

	/**
	 * Returns the meta object for the attribute '{@link no.inela.ineruntime.LeaderboardGameView#getTeamLeaderboard <em>Team Leaderboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Leaderboard</em>'.
	 * @see no.inela.ineruntime.LeaderboardGameView#getTeamLeaderboard()
	 * @see #getLeaderboardGameView()
	 * @generated
	 */
	EAttribute getLeaderboardGameView_TeamLeaderboard();

	/**
	 * Returns the meta object for the '{@link no.inela.ineruntime.LeaderboardGameView#setPlayerLocation(float, float) <em>Set Player Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Player Location</em>' operation.
	 * @see no.inela.ineruntime.LeaderboardGameView#setPlayerLocation(float, float)
	 * @generated
	 */
	EOperation getLeaderboardGameView__SetPlayerLocation__float_float();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Player To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player To Task</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="no.hal.pg.runtime.Player"
	 *        valueType="no.hal.pg.runtime.Task&lt;?&gt;"
	 * @generated
	 */
	EClass getPlayerToTask();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToTask()
	 * @generated
	 */
	EReference getPlayerToTask_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPlayerToTask()
	 * @generated
	 */
	EReference getPlayerToTask_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Group To Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group To Int</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="no.hal.pg.arc.Group"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
	 * @generated
	 */
	EClass getGroupToInt();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getGroupToInt()
	 * @generated
	 */
	EReference getGroupToInt_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getGroupToInt()
	 * @generated
	 */
	EAttribute getGroupToInt_Value();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.PlayerAction <em>Player Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Action</em>'.
	 * @see no.inela.ineruntime.PlayerAction
	 * @generated
	 */
	EClass getPlayerAction();

	/**
	 * Returns the meta object for the '{@link no.inela.ineruntime.PlayerAction#perform(no.hal.pg.runtime.Player) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see no.inela.ineruntime.PlayerAction#perform(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPlayerAction__Perform__Player();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.CompositePlayerAction <em>Composite Player Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Player Action</em>'.
	 * @see no.inela.ineruntime.CompositePlayerAction
	 * @generated
	 */
	EClass getCompositePlayerAction();

	/**
	 * Returns the meta object for the containment reference list '{@link no.inela.ineruntime.CompositePlayerAction#getPlayerActions <em>Player Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player Actions</em>'.
	 * @see no.inela.ineruntime.CompositePlayerAction#getPlayerActions()
	 * @see #getCompositePlayerAction()
	 * @generated
	 */
	EReference getCompositePlayerAction_PlayerActions();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.SetTaskToActiveAction <em>Set Task To Active Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Task To Active Action</em>'.
	 * @see no.inela.ineruntime.SetTaskToActiveAction
	 * @generated
	 */
	EClass getSetTaskToActiveAction();

	/**
	 * Returns the meta object for the reference '{@link no.inela.ineruntime.SetTaskToActiveAction#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see no.inela.ineruntime.SetTaskToActiveAction#getTask()
	 * @see #getSetTaskToActiveAction()
	 * @generated
	 */
	EReference getSetTaskToActiveAction_Task();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.RemoveTaskFromActiveAction <em>Remove Task From Active Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Task From Active Action</em>'.
	 * @see no.inela.ineruntime.RemoveTaskFromActiveAction
	 * @generated
	 */
	EClass getRemoveTaskFromActiveAction();

	/**
	 * Returns the meta object for the reference '{@link no.inela.ineruntime.RemoveTaskFromActiveAction#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see no.inela.ineruntime.RemoveTaskFromActiveAction#getTask()
	 * @see #getRemoveTaskFromActiveAction()
	 * @generated
	 */
	EReference getRemoveTaskFromActiveAction_Task();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.PlayerCondition <em>Player Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Condition</em>'.
	 * @see no.inela.ineruntime.PlayerCondition
	 * @generated
	 */
	EClass getPlayerCondition();

	/**
	 * Returns the meta object for the '{@link no.inela.ineruntime.PlayerCondition#test(no.hal.pg.runtime.Player) <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test</em>' operation.
	 * @see no.inela.ineruntime.PlayerCondition#test(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getPlayerCondition__Test__Player();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.CompositePlayerCondition <em>Composite Player Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Player Condition</em>'.
	 * @see no.inela.ineruntime.CompositePlayerCondition
	 * @generated
	 */
	EClass getCompositePlayerCondition();

	/**
	 * Returns the meta object for the attribute '{@link no.inela.ineruntime.CompositePlayerCondition#isLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic</em>'.
	 * @see no.inela.ineruntime.CompositePlayerCondition#isLogic()
	 * @see #getCompositePlayerCondition()
	 * @generated
	 */
	EAttribute getCompositePlayerCondition_Logic();

	/**
	 * Returns the meta object for the containment reference list '{@link no.inela.ineruntime.CompositePlayerCondition#getPlayerConditions <em>Player Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player Conditions</em>'.
	 * @see no.inela.ineruntime.CompositePlayerCondition#getPlayerConditions()
	 * @see #getCompositePlayerCondition()
	 * @generated
	 */
	EReference getCompositePlayerCondition_PlayerConditions();

	/**
	 * Returns the meta object for class '{@link no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition <em>Is Only Task Active For Player Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Only Task Active For Player Condition</em>'.
	 * @see no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition
	 * @generated
	 */
	EClass getIsOnlyTaskActiveForPlayerCondition();

	/**
	 * Returns the meta object for the reference '{@link no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see no.inela.ineruntime.IsOnlyTaskActiveForPlayerCondition#getTask()
	 * @see #getIsOnlyTaskActiveForPlayerCondition()
	 * @generated
	 */
	EReference getIsOnlyTaskActiveForPlayerCondition_Task();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IneruntimeFactory getIneruntimeFactory();

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
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.LeaderboardGameImpl <em>Leaderboard Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.LeaderboardGameImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getLeaderboardGame()
		 * @generated
		 */
		EClass LEADERBOARD_GAME = eINSTANCE.getLeaderboardGame();

		/**
		 * The meta object literal for the '<em><b>Leaderboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARD_GAME__LEADERBOARD = eINSTANCE.getLeaderboardGame_Leaderboard();

		/**
		 * The meta object literal for the '<em><b>Players Active Tasks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARD_GAME__PLAYERS_ACTIVE_TASKS = eINSTANCE.getLeaderboardGame_PlayersActiveTasks();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARD_GAME__TEAMS = eINSTANCE.getLeaderboardGame_Teams();

		/**
		 * The meta object literal for the '<em><b>Get Active Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEADERBOARD_GAME___GET_ACTIVE_TASK__PLAYER = eINSTANCE.getLeaderboardGame__GetActiveTask__Player();

		/**
		 * The meta object literal for the '<em><b>Update Leaderboard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEADERBOARD_GAME___UPDATE_LEADERBOARD__PLAYER_INT = eINSTANCE.getLeaderboardGame__UpdateLeaderboard__Player_int();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.LeaderboardImpl <em>Leaderboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.LeaderboardImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getLeaderboard()
		 * @generated
		 */
		EClass LEADERBOARD = eINSTANCE.getLeaderboard();

		/**
		 * The meta object literal for the '<em><b>Player Total Scores</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARD__PLAYER_TOTAL_SCORES = eINSTANCE.getLeaderboard_PlayerTotalScores();

		/**
		 * The meta object literal for the '<em><b>Team Total Scores</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARD__TEAM_TOTAL_SCORES = eINSTANCE.getLeaderboard_TeamTotalScores();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.PlayerToIntImpl <em>Player To Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.PlayerToIntImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerToInt()
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
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.LeaderboardGameViewImpl <em>Leaderboard Game View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.LeaderboardGameViewImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getLeaderboardGameView()
		 * @generated
		 */
		EClass LEADERBOARD_GAME_VIEW = eINSTANCE.getLeaderboardGameView();

		/**
		 * The meta object literal for the '<em><b>Map View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARD_GAME_VIEW__MAP_VIEW = eINSTANCE.getLeaderboardGameView_MapView();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEADERBOARD_GAME_VIEW__LOCATION = eINSTANCE.getLeaderboardGameView_Location();

		/**
		 * The meta object literal for the '<em><b>Leaderboard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEADERBOARD_GAME_VIEW__LEADERBOARD = eINSTANCE.getLeaderboardGameView_Leaderboard();

		/**
		 * The meta object literal for the '<em><b>Team Leaderboard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEADERBOARD_GAME_VIEW__TEAM_LEADERBOARD = eINSTANCE.getLeaderboardGameView_TeamLeaderboard();

		/**
		 * The meta object literal for the '<em><b>Set Player Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEADERBOARD_GAME_VIEW___SET_PLAYER_LOCATION__FLOAT_FLOAT = eINSTANCE.getLeaderboardGameView__SetPlayerLocation__float_float();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.PlayerToTaskImpl <em>Player To Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.PlayerToTaskImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerToTask()
		 * @generated
		 */
		EClass PLAYER_TO_TASK = eINSTANCE.getPlayerToTask();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TO_TASK__KEY = eINSTANCE.getPlayerToTask_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TO_TASK__VALUE = eINSTANCE.getPlayerToTask_Value();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.GroupToIntImpl <em>Group To Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.GroupToIntImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getGroupToInt()
		 * @generated
		 */
		EClass GROUP_TO_INT = eINSTANCE.getGroupToInt();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TO_INT__KEY = eINSTANCE.getGroupToInt_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TO_INT__VALUE = eINSTANCE.getGroupToInt_Value();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.PlayerAction <em>Player Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.PlayerAction
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerAction()
		 * @generated
		 */
		EClass PLAYER_ACTION = eINSTANCE.getPlayerAction();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER_ACTION___PERFORM__PLAYER = eINSTANCE.getPlayerAction__Perform__Player();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.CompositePlayerActionImpl <em>Composite Player Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.CompositePlayerActionImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getCompositePlayerAction()
		 * @generated
		 */
		EClass COMPOSITE_PLAYER_ACTION = eINSTANCE.getCompositePlayerAction();

		/**
		 * The meta object literal for the '<em><b>Player Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PLAYER_ACTION__PLAYER_ACTIONS = eINSTANCE.getCompositePlayerAction_PlayerActions();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.SetTaskToActiveActionImpl <em>Set Task To Active Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.SetTaskToActiveActionImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getSetTaskToActiveAction()
		 * @generated
		 */
		EClass SET_TASK_TO_ACTIVE_ACTION = eINSTANCE.getSetTaskToActiveAction();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TASK_TO_ACTIVE_ACTION__TASK = eINSTANCE.getSetTaskToActiveAction_Task();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.RemoveTaskFromActiveActionImpl <em>Remove Task From Active Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.RemoveTaskFromActiveActionImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getRemoveTaskFromActiveAction()
		 * @generated
		 */
		EClass REMOVE_TASK_FROM_ACTIVE_ACTION = eINSTANCE.getRemoveTaskFromActiveAction();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_TASK_FROM_ACTIVE_ACTION__TASK = eINSTANCE.getRemoveTaskFromActiveAction_Task();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.PlayerCondition <em>Player Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.PlayerCondition
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getPlayerCondition()
		 * @generated
		 */
		EClass PLAYER_CONDITION = eINSTANCE.getPlayerCondition();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER_CONDITION___TEST__PLAYER = eINSTANCE.getPlayerCondition__Test__Player();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.CompositePlayerConditionImpl <em>Composite Player Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.CompositePlayerConditionImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getCompositePlayerCondition()
		 * @generated
		 */
		EClass COMPOSITE_PLAYER_CONDITION = eINSTANCE.getCompositePlayerCondition();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_PLAYER_CONDITION__LOGIC = eINSTANCE.getCompositePlayerCondition_Logic();

		/**
		 * The meta object literal for the '<em><b>Player Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PLAYER_CONDITION__PLAYER_CONDITIONS = eINSTANCE.getCompositePlayerCondition_PlayerConditions();

		/**
		 * The meta object literal for the '{@link no.inela.ineruntime.impl.IsOnlyTaskActiveForPlayerConditionImpl <em>Is Only Task Active For Player Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.inela.ineruntime.impl.IsOnlyTaskActiveForPlayerConditionImpl
		 * @see no.inela.ineruntime.impl.IneruntimePackageImpl#getIsOnlyTaskActiveForPlayerCondition()
		 * @generated
		 */
		EClass IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION = eINSTANCE.getIsOnlyTaskActiveForPlayerCondition();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ONLY_TASK_ACTIVE_FOR_PLAYER_CONDITION__TASK = eINSTANCE.getIsOnlyTaskActiveForPlayerCondition_Task();

	}

} //IneruntimePackage
