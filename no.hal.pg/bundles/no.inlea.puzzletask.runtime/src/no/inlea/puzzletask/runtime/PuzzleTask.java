/**
 */
package no.inlea.puzzletask.runtime;

import no.hal.pg.osm.GeoLocation;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTask#getPuzzles <em>Puzzles</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTask#getPlayerLevels <em>Player Levels</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTask#getPlayerTaskScores <em>Player Task Scores</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTask()
 * @model
 * @generated
 */
public interface PuzzleTask extends Task<PlayerTaskScores>, GeoLocation {
	/**
	 * Returns the value of the '<em><b>Puzzles</b></em>' containment reference list.
	 * The list contents are of type {@link no.inlea.puzzletask.runtime.Puzzle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puzzles</em>' containment reference list.
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTask_Puzzles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Puzzle> getPuzzles();

	/**
	 * Returns the value of the '<em><b>Player Levels</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Levels</em>' map.
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTask_PlayerLevels()
	 * @model mapType="no.inlea.puzzletask.runtime.PlayerToInt&lt;no.hal.pg.runtime.Player, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<Player, Integer> getPlayerLevels();

	/**
	 * Returns the value of the '<em><b>Player Task Scores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Task Scores</em>' containment reference.
	 * @see #setPlayerTaskScores(PlayerTaskScores)
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzleTask_PlayerTaskScores()
	 * @model containment="true"
	 * @generated
	 */
	PlayerTaskScores getPlayerTaskScores();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask.runtime.PuzzleTask#getPlayerTaskScores <em>Player Task Scores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Task Scores</em>' containment reference.
	 * @see #getPlayerTaskScores()
	 * @generated
	 */
	void setPlayerTaskScores(PlayerTaskScores value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean acceptPuzzleProposal(String proposal, Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int calculateScore(int puzzleLevel, Player player, boolean isProposalCorrect);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean acceptPlayer(Player player);

} // PuzzleTask
