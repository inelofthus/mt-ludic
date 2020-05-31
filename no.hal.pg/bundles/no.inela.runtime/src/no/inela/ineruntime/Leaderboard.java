/**
 */
package no.inela.ineruntime;

import no.hal.pg.arc.Group;
import no.hal.pg.runtime.Player;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaderboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.Leaderboard#getPlayerTotalScores <em>Player Total Scores</em>}</li>
 *   <li>{@link no.inela.ineruntime.Leaderboard#getTeamTotalScores <em>Team Total Scores</em>}</li>
 * </ul>
 *
 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboard()
 * @model
 * @generated
 */
public interface Leaderboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Player Total Scores</b></em>' map.
	 * The key is of type {@link no.hal.pg.runtime.Player},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Total Scores</em>' map.
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboard_PlayerTotalScores()
	 * @model mapType="no.inela.ineruntime.PlayerToInt&lt;no.hal.pg.runtime.Player, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<Player, Integer> getPlayerTotalScores();

	/**
	 * Returns the value of the '<em><b>Team Total Scores</b></em>' map.
	 * The key is of type {@link no.hal.pg.arc.Group},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Total Scores</em>' map.
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboard_TeamTotalScores()
	 * @model mapType="no.inela.ineruntime.GroupToInt&lt;no.hal.pg.arc.Group, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<Group, Integer> getTeamTotalScores();

} // Leaderboard
