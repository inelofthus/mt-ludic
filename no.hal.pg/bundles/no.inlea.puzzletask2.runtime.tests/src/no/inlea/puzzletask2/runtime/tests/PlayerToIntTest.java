/**
 */
package no.inlea.puzzletask2.runtime.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.runtime.Player;

import no.inlea.puzzletask2.runtime.RuntimeFactory;
import no.inlea.puzzletask2.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player To Int</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayerToIntTest extends TestCase {

	/**
	 * The fixture for this Player To Int test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Player, Integer> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerToIntTest.class);
	}

	/**
	 * Constructs a new Player To Int test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerToIntTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Player To Int test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<Player, Integer> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Player To Int test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Player, Integer> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<Player, Integer>)RuntimeFactory.eINSTANCE.create(RuntimePackage.Literals.PLAYER_TO_INT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PlayerToIntTest
