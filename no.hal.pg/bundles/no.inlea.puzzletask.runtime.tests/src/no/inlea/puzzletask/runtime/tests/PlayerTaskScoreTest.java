/**
 */
package no.inlea.puzzletask.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.inlea.puzzletask.runtime.PlayerTaskScore;
import no.inlea.puzzletask.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player Task Score</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayerTaskScoreTest extends TestCase {

	/**
	 * The fixture for this Player Task Score test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerTaskScore fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerTaskScoreTest.class);
	}

	/**
	 * Constructs a new Player Task Score test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTaskScoreTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Player Task Score test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PlayerTaskScore fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Player Task Score test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerTaskScore getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createPlayerTaskScore());
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

} //PlayerTaskScoreTest
