/**
 */
package no.inela.ineruntime;

import java.util.Map;
import no.hal.pg.app.GameView;
import no.hal.pg.app.MapView;
import no.hal.pg.osm.geoutil.LatLong;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaderboard Game View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.LeaderboardGameView#getMapView <em>Map View</em>}</li>
 *   <li>{@link no.inela.ineruntime.LeaderboardGameView#getLocation <em>Location</em>}</li>
 *   <li>{@link no.inela.ineruntime.LeaderboardGameView#getLeaderboard <em>Leaderboard</em>}</li>
 *   <li>{@link no.inela.ineruntime.LeaderboardGameView#getTeamLeaderboard <em>Team Leaderboard</em>}</li>
 * </ul>
 *
 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGameView()
 * @model
 * @generated
 */
public interface LeaderboardGameView extends GameView<Task<?>> {
	/**
	 * Returns the value of the '<em><b>Map View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map View</em>' containment reference.
	 * @see #setMapView(MapView)
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGameView_MapView()
	 * @model containment="true"
	 * @generated
	 */
	MapView getMapView();

	/**
	 * Sets the value of the '{@link no.inela.ineruntime.LeaderboardGameView#getMapView <em>Map View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map View</em>' containment reference.
	 * @see #getMapView()
	 * @generated
	 */
	void setMapView(MapView value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGameView_Location()
	 * @model dataType="no.hal.pg.osm.LatLong" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	LatLong getLocation();

	/**
	 * Returns the value of the '<em><b>Leaderboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaderboard</em>' attribute.
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGameView_Leaderboard()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Map<String, Integer> getLeaderboard();

	/**
	 * Returns the value of the '<em><b>Team Leaderboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Leaderboard</em>' attribute.
	 * @see no.inela.ineruntime.IneruntimePackage#getLeaderboardGameView_TeamLeaderboard()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Map<String, Integer> getTeamLeaderboard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LeaderboardGameView setPlayerLocation(float latitude, float longitude);

} // LeaderboardGameView
