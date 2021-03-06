/**
 */
package no.inlea.puzzletask.runtime.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>runtime</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RuntimeTests("runtime Tests");
		suite.addTestSuite(PuzzleTaskTest.class);
		suite.addTestSuite(PuzzleTaskViewTest.class);
		suite.addTestSuite(SimplePuzzleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeTests(String name) {
		super(name);
	}

} //RuntimeTests
