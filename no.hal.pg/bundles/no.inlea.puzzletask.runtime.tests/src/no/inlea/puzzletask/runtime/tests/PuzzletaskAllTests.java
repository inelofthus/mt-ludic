/**
 */
package no.inlea.puzzletask.runtime.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Puzzletask</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class PuzzletaskAllTests extends TestSuite {

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
		TestSuite suite = new PuzzletaskAllTests("Puzzletask Tests");
		suite.addTest(RuntimeTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzletaskAllTests(String name) {
		super(name);
	}

} //PuzzletaskAllTests
