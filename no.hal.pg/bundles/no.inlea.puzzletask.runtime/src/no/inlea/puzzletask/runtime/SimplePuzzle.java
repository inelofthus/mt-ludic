/**
 */
package no.inlea.puzzletask.runtime;

import no.hal.pg.runtime.InfoItem;

import no.hal.pg.runtime.Player;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Puzzle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.SimplePuzzle#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.SimplePuzzle#getSolution <em>Solution</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.SimplePuzzle#getPuzzlePieces <em>Puzzle Pieces</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.SimplePuzzle#getPlayerPieces <em>Player Pieces</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask.runtime.RuntimePackage#getSimplePuzzle()
 * @model
 * @generated
 */
public interface SimplePuzzle extends Puzzle {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference.
	 * @see #setInstructions(InfoItem)
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getSimplePuzzle_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	InfoItem getInstructions();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask.runtime.SimplePuzzle#getInstructions <em>Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' containment reference.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(InfoItem value);

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' attribute.
	 * @see #setSolution(String)
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getSimplePuzzle_Solution()
	 * @model
	 * @generated
	 */
	String getSolution();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask.runtime.SimplePuzzle#getSolution <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' attribute.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(String value);

	/**
	 * Returns the value of the '<em><b>Puzzle Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link no.inlea.puzzletask.runtime.PuzzlePiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puzzle Pieces</em>' containment reference list.
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getSimplePuzzle_PuzzlePieces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PuzzlePiece> getPuzzlePieces();

	/**
	 * Returns the value of the '<em><b>Player Pieces</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type {@link no.inlea.puzzletask.runtime.PuzzlePiece},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Pieces</em>' map.
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getSimplePuzzle_PlayerPieces()
	 * @model mapType="no.inlea.puzzletask.runtime.PlayerToPuzzlePiece&lt;no.hal.pg.runtime.Player, no.inlea.puzzletask.runtime.PuzzlePiece&gt;"
	 * @generated
	 */
	EMap<Player, PuzzlePiece> getPlayerPieces();

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
	boolean finishPuzzle(Player player);

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
	String getImage(Player player);

} // SimplePuzzle
