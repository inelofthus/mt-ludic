/**
 */
package no.inlea.puzzletask.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.inlea.puzzletask.runtime.PlayerTaskScores;
import no.inlea.puzzletask.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player Task Scores</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayerTaskScoresTest extends TestCase {

	/**
	 * The fixture for this Player Task Scores test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerTaskScores fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerTaskScoresTest.class);
	}

	/**
	 * Constructs a new Player Task Scores test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTaskScoresTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Player Task Scores test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PlayerTaskScores fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Player Task Scores test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerTaskScores getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createPlayerTaskScores());
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

} //PlayerTaskScoresTest
