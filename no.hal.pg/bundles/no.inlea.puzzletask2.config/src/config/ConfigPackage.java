/**
 */
package config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/no.inlea.puzzletask2.config/model/config.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "puzzletask2-config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link config.impl.PuzzleTask2ConfigImpl <em>Puzzle Task2 Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.PuzzleTask2ConfigImpl
	 * @see config.impl.ConfigPackageImpl#getPuzzleTask2Config()
	 * @generated
	 */
	int PUZZLE_TASK2_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__NAME = no.hal.pg.config.ConfigPackage.TASK_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__DESCRIPTION = no.hal.pg.config.ConfigPackage.TASK_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Puzzle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__PUZZLE = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Open Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__OPEN_TIME = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Close Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__CLOSE_TIME = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Acceptable Target Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__ACCEPTABLE_TARGET_DISTANCE = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__MAX_SCORE = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wrong Attempt Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__WRONG_ATTEMPT_PENALTY = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG__LOCATION = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Puzzle Task2 Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG_FEATURE_COUNT = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Create Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG___CREATE_TASK__TASKPROXY = no.hal.pg.config.ConfigPackage.TASK_CONFIG___CREATE_TASK__TASKPROXY;

	/**
	 * The number of operations of the '<em>Puzzle Task2 Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_TASK2_CONFIG_OPERATION_COUNT = no.hal.pg.config.ConfigPackage.TASK_CONFIG_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link config.PuzzleTask2Config <em>Puzzle Task2 Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle Task2 Config</em>'.
	 * @see config.PuzzleTask2Config
	 * @generated
	 */
	EClass getPuzzleTask2Config();

	/**
	 * Returns the meta object for the reference '{@link config.PuzzleTask2Config#getPuzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Puzzle</em>'.
	 * @see config.PuzzleTask2Config#getPuzzle()
	 * @see #getPuzzleTask2Config()
	 * @generated
	 */
	EReference getPuzzleTask2Config_Puzzle();

	/**
	 * Returns the meta object for the attribute '{@link config.PuzzleTask2Config#getOpenTime <em>Open Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Time</em>'.
	 * @see config.PuzzleTask2Config#getOpenTime()
	 * @see #getPuzzleTask2Config()
	 * @generated
	 */
	EAttribute getPuzzleTask2Config_OpenTime();

	/**
	 * Returns the meta object for the attribute '{@link config.PuzzleTask2Config#getCloseTime <em>Close Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Time</em>'.
	 * @see config.PuzzleTask2Config#getCloseTime()
	 * @see #getPuzzleTask2Config()
	 * @generated
	 */
	EAttribute getPuzzleTask2Config_CloseTime();

	/**
	 * Returns the meta object for the attribute '{@link config.PuzzleTask2Config#getAcceptableTargetDistance <em>Acceptable Target Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptable Target Distance</em>'.
	 * @see config.PuzzleTask2Config#getAcceptableTargetDistance()
	 * @see #getPuzzleTask2Config()
	 * @generated
	 */
	EAttribute getPuzzleTask2Config_AcceptableTargetDistance();

	/**
	 * Returns the meta object for the attribute '{@link config.PuzzleTask2Config#getMaxScore <em>Max Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Score</em>'.
	 * @see config.PuzzleTask2Config#getMaxScore()
	 * @see #getPuzzleTask2Config()
	 * @generated
	 */
	EAttribute getPuzzleTask2Config_MaxScore();

	/**
	 * Returns the meta object for the attribute '{@link config.PuzzleTask2Config#getWrongAttemptPenalty <em>Wrong Attempt Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrong Attempt Penalty</em>'.
	 * @see config.PuzzleTask2Config#getWrongAttemptPenalty()
	 * @see #getPuzzleTask2Config()
	 * @generated
	 */
	EAttribute getPuzzleTask2Config_WrongAttemptPenalty();

	/**
	 * Returns the meta object for the reference '{@link config.PuzzleTask2Config#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see config.PuzzleTask2Config#getLocation()
	 * @see #getPuzzleTask2Config()
	 * @generated
	 */
	EReference getPuzzleTask2Config_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

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
		 * The meta object literal for the '{@link config.impl.PuzzleTask2ConfigImpl <em>Puzzle Task2 Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.PuzzleTask2ConfigImpl
		 * @see config.impl.ConfigPackageImpl#getPuzzleTask2Config()
		 * @generated
		 */
		EClass PUZZLE_TASK2_CONFIG = eINSTANCE.getPuzzleTask2Config();
		/**
		 * The meta object literal for the '<em><b>Puzzle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK2_CONFIG__PUZZLE = eINSTANCE.getPuzzleTask2Config_Puzzle();
		/**
		 * The meta object literal for the '<em><b>Open Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK2_CONFIG__OPEN_TIME = eINSTANCE.getPuzzleTask2Config_OpenTime();
		/**
		 * The meta object literal for the '<em><b>Close Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK2_CONFIG__CLOSE_TIME = eINSTANCE.getPuzzleTask2Config_CloseTime();
		/**
		 * The meta object literal for the '<em><b>Acceptable Target Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK2_CONFIG__ACCEPTABLE_TARGET_DISTANCE = eINSTANCE.getPuzzleTask2Config_AcceptableTargetDistance();
		/**
		 * The meta object literal for the '<em><b>Max Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK2_CONFIG__MAX_SCORE = eINSTANCE.getPuzzleTask2Config_MaxScore();
		/**
		 * The meta object literal for the '<em><b>Wrong Attempt Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE_TASK2_CONFIG__WRONG_ATTEMPT_PENALTY = eINSTANCE.getPuzzleTask2Config_WrongAttemptPenalty();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE_TASK2_CONFIG__LOCATION = eINSTANCE.getPuzzleTask2Config_Location();

	}

} //ConfigPackage
