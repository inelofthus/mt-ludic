/**
 */
package no.inlea.puzzletask.runtime.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.runtime.Player;

import no.inlea.puzzletask.runtime.PuzzlePiece;
import no.inlea.puzzletask.runtime.RuntimeFactory;
import no.inlea.puzzletask.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player To Puzzle Piece</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayerToPuzzlePieceTest extends TestCase {

	/**
	 * The fixture for this Player To Puzzle Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Player, PuzzlePiece> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerToPuzzlePieceTest.class);
	}

	/**
	 * Constructs a new Player To Puzzle Piece test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerToPuzzlePieceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Player To Puzzle Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<Player, PuzzlePiece> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Player To Puzzle Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Player, PuzzlePiece> getFixture() {
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
		setFixture((Map.Entry<Player, PuzzlePiece>)RuntimeFactory.eINSTANCE.create(RuntimePackage.Literals.PLAYER_TO_PUZZLE_PIECE));
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

} //PlayerToPuzzlePieceTest
