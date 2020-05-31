/**
 */
package no.inlea.puzzletask2.runtime;

import no.hal.pg.runtime.Player;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.Puzzle#getSolution <em>Solution</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.Puzzle#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.Puzzle#getPuzzlePieces <em>Puzzle Pieces</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.Puzzle#getPlayerPieces <em>Player Pieces</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.Puzzle#getActivePlayers <em>Active Players</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzle()
 * @model
 * @generated
 */
public interface Puzzle extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute.
	 * @see #setInstructions(String)
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzle_Instructions()
	 * @model
	 * @generated
	 */
	String getInstructions();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask2.runtime.Puzzle#getInstructions <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' attribute.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' attribute.
	 * @see #setSolution(String)
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzle_Solution()
	 * @model
	 * @generated
	 */
	String getSolution();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask2.runtime.Puzzle#getSolution <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' attribute.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(String value);

	/**
	 * Returns the value of the '<em><b>Puzzle Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link no.inlea.puzzletask2.runtime.PuzzlePiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puzzle Pieces</em>' containment reference list.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzle_PuzzlePieces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PuzzlePiece> getPuzzlePieces();

	/**
	 * Returns the value of the '<em><b>Player Pieces</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type {@link no.inlea.puzzletask2.runtime.PuzzlePiece},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Pieces</em>' map.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzle_PlayerPieces()
	 * @model mapType="no.inlea.puzzletask2.runtime.PlayerToPuzzlePiece&lt;no.hal.pg.runtime.Player, no.inlea.puzzletask2.runtime.PuzzlePiece&gt;"
	 * @generated
	 */
	EMap<Player, PuzzlePiece> getPlayerPieces();

	/**
	 * Returns the value of the '<em><b>Active Players</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Players</em>' reference list.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzle_ActivePlayers()
	 * @model
	 * @generated
	 */
	EList<Player> getActivePlayers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean acceptProposal(String proposal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean startPuzzle(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean finishPuzzle(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getPuzzleContent(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean quitPuzzle(Player player);

} // Puzzle
