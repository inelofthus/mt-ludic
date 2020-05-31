/**
 */
package no.inlea.puzzletask.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.inlea.puzzletask.runtime.PuzzlePiece;
import no.inlea.puzzletask.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Puzzle Piece</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PuzzlePieceTest extends TestCase {

	/**
	 * The fixture for this Puzzle Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzlePiece fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PuzzlePieceTest.class);
	}

	/**
	 * Constructs a new Puzzle Piece test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzlePieceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Puzzle Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PuzzlePiece fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Puzzle Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzlePiece getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createPuzzlePiece());
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

} //PuzzlePieceTest
