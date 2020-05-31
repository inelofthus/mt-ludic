/**
 */
package no.inela.ineruntime;

import no.hal.pg.arc.Group;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaderboard Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.LeaderboardGame#getLeaderboard <em>Leaderboard</em>}</li>
 *   <li>{@link no.inela.ineruntime.LeaderboardGame#getPlayersActiveTasks <em>Players Active Tasks</em>}</li>
 *   <li>{@link no.inela.ineruntime.LeaderboardGame#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGame()
 * @model
 * @generated
 */
public interface LeaderboardGame extends Game<Task<?>> {
	/**
	 * Returns the value of the '<em><b>Leaderboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaderboard</em>' containment reference.
	 * @see #setLeaderboard(Leaderboard)
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGame_Leaderboard()
	 * @model containment="true"
	 * @generated
	 */
	Leaderboard getLeaderboard();

	/**
	 * Sets the value of the '{@link no.inela.ineruntime.LeaderboardGame#getLeaderboard <em>Leaderboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaderboard</em>' containment reference.
	 * @see #getLeaderboard()
	 * @generated
	 */
	void setLeaderboard(Leaderboard value);

	/**
	 * Returns the value of the '<em><b>Players Active Tasks</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type {@link no.hal.pg.runtime.Task<?>},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players Active Tasks</em>' map.
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGame_PlayersActiveTasks()
	 * @model mapType="no.inela.ineruntime.PlayerToTask&lt;no.hal.pg.runtime.Player, no.hal.pg.runtime.Task&lt;?&gt;&gt;"
	 * @generated
	 */
	EMap<Player, Task<?>> getPlayersActiveTasks();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.arc.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGame_Teams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getTeams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Task<?> getActiveTask(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateLeaderboard(Player player, int score);

} // LeaderboardGame
