/**
 */
package no.inlea.puzzletask2.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.inlea.puzzletask2.runtime.RuntimeFactory;
import no.inlea.puzzletask2.runtime.TaskScores;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Scores</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskScoresTest extends TestCase {

	/**
	 * The fixture for this Task Scores test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskScores fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskScoresTest.class);
	}

	/**
	 * Constructs a new Task Scores test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScoresTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Scores test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskScores fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Scores test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskScores getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createTaskScores());
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

} //TaskScoresTest
