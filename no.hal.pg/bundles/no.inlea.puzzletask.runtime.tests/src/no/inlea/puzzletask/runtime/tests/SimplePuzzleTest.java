/**
 */
package no.inlea.puzzletask.runtime.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import junit.textui.TestRunner;

import no.inlea.puzzletask.runtime.RuntimeFactory;
import no.inlea.puzzletask.runtime.SimplePuzzle;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Puzzle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplePuzzleTest extends PuzzleTest {
	
	private URI uri;
	private ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimplePuzzleTest.class);
	}

	/**
	 * Constructs a new Simple Puzzle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePuzzleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Puzzle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimplePuzzle getFixture() {
		return (SimplePuzzle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		//setFixture(RuntimeFactory.eINSTANCE.createSimplePuzzle());
		uri = URI.createURI(getClass().getResource("SimplePuzzleTest.xmi").toString());
		resourceSet = new ResourceSetImpl();
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
	

	public void testAcceptProposal__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		
		fail();
	}


	public void testFinishPuzzle__Player() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	public void testStartPuzzle__Player() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SimplePuzzleTest
