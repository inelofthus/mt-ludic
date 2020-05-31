/**
 */
package config;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	String eNS_URI = "platform:/resource/no.inela.runtime.config/model/config.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ineruntime-config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link config.impl.RuntimeConfigImpl <em>Runtime Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see config.impl.RuntimeConfigImpl
	 * @see config.impl.ConfigPackageImpl#getRuntimeConfig()
	 * @generated
	 */
	int RUNTIME_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__TASKS = no.hal.pg.config.ConfigPackage.GAME_CONFIG__TASKS;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__PLAYERS = no.hal.pg.config.ConfigPackage.GAME_CONFIG__PLAYERS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__ITEMS = no.hal.pg.config.ConfigPackage.GAME_CONFIG__ITEMS;

	/**
	 * The feature id for the '<em><b>Task Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__TASK_PROXIES = no.hal.pg.config.ConfigPackage.GAME_CONFIG__TASK_PROXIES;

	/**
	 * The feature id for the '<em><b>Item Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__ITEM_PROXIES = no.hal.pg.config.ConfigPackage.GAME_CONFIG__ITEM_PROXIES;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG__LOCATIONS = no.hal.pg.config.ConfigPackage.GAME_CONFIG__LOCATIONS;

	/**
	 * The number of structural features of the '<em>Runtime Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG_FEATURE_COUNT = no.hal.pg.config.ConfigPackage.GAME_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Runtime Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONFIG_OPERATION_COUNT = no.hal.pg.config.ConfigPackage.GAME_CONFIG_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link config.RuntimeConfig <em>Runtime Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Config</em>'.
	 * @see config.RuntimeConfig
	 * @generated
	 */
	EClass getRuntimeConfig();

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
		 * The meta object literal for the '{@link config.impl.RuntimeConfigImpl <em>Runtime Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see config.impl.RuntimeConfigImpl
		 * @see config.impl.ConfigPackageImpl#getRuntimeConfig()
		 * @generated
		 */
		EClass RUNTIME_CONFIG = eINSTANCE.getRuntimeConfig();

	}

} //ConfigPackage
