/**
 */
package no.inela.ineruntime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collections;
import no.hal.pg.app.AppFactory;
import no.hal.pg.app.MapView;
import no.hal.pg.app.impl.GameViewImpl;
import no.hal.pg.arc.Group;
import no.hal.pg.osm.geoutil.LatLong;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import no.inela.ineruntime.IneruntimePackage;
import no.inela.ineruntime.LeaderboardGame;
import no.inela.ineruntime.LeaderboardGameView;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaderboard Game View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardGameViewImpl#getMapView <em>Map View</em>}</li>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardGameViewImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardGameViewImpl#getLeaderboard <em>Leaderboard</em>}</li>
 *   <li>{@link no.inela.ineruntime.impl.LeaderboardGameViewImpl#getTeamLeaderboard <em>Team Leaderboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeaderboardGameViewImpl extends GameViewImpl<Task<?>> implements LeaderboardGameView {
	/**
	 * The cached value of the '{@link #getMapView() <em>Map View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapView()
	 * @generated
	 * @ordered
	 */
	protected MapView mapView;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final LatLong LOCATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeaderboardGameViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IneruntimePackage.Literals.LEADERBOARD_GAME_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MapView getMapView() {
		if (mapView == null) {
			MapView mapView = AppFactory.eINSTANCE.createMapView();
			mapView.navigate(getUser().getLatitude(), getUser().getLongitude(), 15);
			setMapView(mapView);
		}
		return mapView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapView(MapView newMapView, NotificationChain msgs) {
		MapView oldMapView = mapView;
		mapView = newMapView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW, oldMapView, newMapView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapView(MapView newMapView) {
		if (newMapView != mapView) {
			NotificationChain msgs = null;
			if (mapView != null)
				msgs = ((InternalEObject)mapView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW, null, msgs);
			if (newMapView != null)
				msgs = ((InternalEObject)newMapView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW, null, msgs);
			msgs = basicSetMapView(newMapView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW, newMapView, newMapView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LatLong getLocation() {
		return getUser().getLatLong();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, Integer> getLeaderboard() {
		EMap<Player, Integer> leaderboard = ((LeaderboardGame) this.getModel()).getLeaderboard().getPlayerTotalScores();
		/*
		 * Map<String, Integer> returnLeaderboard = new HashMap<String, Integer>(); for
		 * (Entry<Player, Integer> entry : leaderboard) {
		 * returnLeaderboard.put(entry.getKey().getName(), entry.getValue()); }
		 */
		Map<String, Integer> sorted = leaderboard
				.entrySet()
		        .stream()
		        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		        .collect(
		            Collectors.toMap(e -> e.getKey().getName(), e -> e.getValue(), (e1, e2) -> e2,
		                LinkedHashMap::new));
		return sorted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LeaderboardGameView setPlayerLocation(float latitude, float longitude) {
		Player player = getUser();
		player.setLatitude(latitude);
		player.setLongitude(longitude);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW:
				return basicSetMapView(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW:
				return getMapView();
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__LOCATION:
				return getLocation();
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__LEADERBOARD:
				return getLeaderboard();
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__TEAM_LEADERBOARD:
				return getTeamLeaderboard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW:
				setMapView((MapView)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW:
				setMapView((MapView)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__MAP_VIEW:
				return mapView != null;
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__LEADERBOARD:
				return getLeaderboard() != null;
			case IneruntimePackage.LEADERBOARD_GAME_VIEW__TEAM_LEADERBOARD:
				return getTeamLeaderboard() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IneruntimePackage.LEADERBOARD_GAME_VIEW___SET_PLAYER_LOCATION__FLOAT_FLOAT:
				return setPlayerLocation((Float)arguments.get(0), (Float)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Map<String, Integer> getTeamLeaderboard() {
		EMap<Group, Integer> leaderboard = ((LeaderboardGame) this.getModel()).getLeaderboard().getTeamTotalScores();
		Map<String, Integer> sorted = leaderboard
				.entrySet()
		        .stream()
		        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		        .limit(10)
		        .collect(
		            Collectors.toMap(e -> e.getKey().getName(), e -> e.getValue(), (e1, e2) -> e2,
		                LinkedHashMap::new));
		return sorted;
	}
	
	
} //LeaderboardGameViewImpl
