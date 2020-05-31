/**
 */
package no.inlea.puzzletask.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.NoSuchElementException;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.OsmPackage;

import no.hal.pg.osm.geoutil.LatLong;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.impl.TaskImpl;
import no.inlea.puzzletask.runtime.PlayerTaskScore;
import no.inlea.puzzletask.runtime.PlayerTaskScores;
import no.inlea.puzzletask.runtime.Puzzle;
import no.inlea.puzzletask.runtime.PuzzleTask;
import no.inlea.puzzletask.runtime.RuntimeFactory;
import no.inlea.puzzletask.runtime.RuntimePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl#getPuzzles <em>Puzzles</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl#getPlayerLevels <em>Player Levels</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskImpl#getPlayerTaskScores <em>Player Task Scores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleTaskImpl extends TaskImpl<PlayerTaskScores> implements PuzzleTask {
	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected float latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected float longitude = LONGITUDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPuzzles() <em>Puzzles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuzzles()
	 * @generated
	 * @ordered
	 */
	protected EList<Puzzle> puzzles;

	/**
	 * The cached value of the '{@link #getPlayerLevels() <em>Player Levels</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerLevels()
	 * @generated
	 * @ordered
	 */
	protected EMap<Player, Integer> playerLevels;

	/**
	 * The cached value of the '{@link #getPlayerTaskScores() <em>Player Task Scores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerTaskScores()
	 * @generated
	 * @ordered
	 */
	protected PlayerTaskScores playerTaskScores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PUZZLE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setResult(PlayerTaskScores newResult) {
		super.setResult(newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(float newLatitude) {
		float oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(float newLongitude) {
		float oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Puzzle> getPuzzles() {
		if (puzzles == null) {
			puzzles = new EObjectContainmentEList<Puzzle>(Puzzle.class, this, RuntimePackage.PUZZLE_TASK__PUZZLES);
		}
		return puzzles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<Player, Integer> getPlayerLevels() {
		if (playerLevels == null) {
			playerLevels = new EcoreEMap<Player,Integer>(RuntimePackage.Literals.PLAYER_TO_INT, PlayerToIntImpl.class, this, RuntimePackage.PUZZLE_TASK__PLAYER_LEVELS);
		}
		return playerLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerTaskScores getPlayerTaskScores() {
		return playerTaskScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerTaskScores(PlayerTaskScores newPlayerTaskScores, NotificationChain msgs) {
		PlayerTaskScores oldPlayerTaskScores = playerTaskScores;
		playerTaskScores = newPlayerTaskScores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES, oldPlayerTaskScores, newPlayerTaskScores);
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
	public void setPlayerTaskScores(PlayerTaskScores newPlayerTaskScores) {
		if (newPlayerTaskScores != playerTaskScores) {
			NotificationChain msgs = null;
			if (playerTaskScores != null)
				msgs = ((InternalEObject)playerTaskScores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES, null, msgs);
			if (newPlayerTaskScores != null)
				msgs = ((InternalEObject)newPlayerTaskScores).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES, null, msgs);
			msgs = basicSetPlayerTaskScores(newPlayerTaskScores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES, newPlayerTaskScores, newPlayerTaskScores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean acceptPuzzleProposal(String proposal, Player player) {
		/* Uncomment when clock is mocked
		 * 
		 * if(System.currentTimeMillis() > getFinishTime()) { throw new
		 * IllegalStateException(); }
		 */
		int puzzleLevel = getPlayerLevels().get(player);
		Puzzle puzzle = this.getPuzzles().stream()
				.filter(e -> e.getLevel() == puzzleLevel).findFirst().orElseThrow(NoSuchElementException::new);
		RuntimeFactory runtimeFactory = RuntimeFactory.eINSTANCE;
		boolean isCorrect = puzzle.acceptProposal(proposal);		
		this.getPlayerLevels().stream().forEach(e -> System.out.println(e.getValue()));
		if (isCorrect) {
			//Create level score entry for player
			int score = calculateScore(puzzleLevel, player, isCorrect); //Maybe want puzzle to take care of scoring
			PlayerTaskScore newScore = runtimeFactory.createPlayerTaskScore();
			newScore.setLevel(puzzleLevel);
			newScore.setPlayer(player);
			newScore.setScore(score);
			this.getPlayerTaskScores().getScores().add(newScore);
			
			//Remove player from puzzle piece
			puzzle.finishPuzzle(player);
			
			//Return if final puzzle
			if(!getPuzzles().stream()
					.anyMatch(e -> e.getLevel() == puzzleLevel+1)) {
				System.out.println("finish");
				finish(this.getPlayerTaskScores());
				return isCorrect;
			}
			
			//Increment player level
			this.getPlayerLevels().put(player, puzzleLevel+1);
			
			//Start next puzzle
			getPuzzles().stream()
			.filter(e -> e.getLevel() == puzzleLevel+1)
			.findFirst().orElseThrow(NoSuchElementException::new)
			.startPuzzle(player); 
			
			
		} //else {
			// TODO: Increment attempt count used for scoring
		//}
		return isCorrect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int calculateScore(int puzzleLevel, Player player, boolean isProposalCorrect) {
		// TODO: Account for number of attempts. Uncomment when system clock is mocked
		/*
		 * long currentTime = System.currentTimeMillis(); int maxScore = 100; long
		 * finishTime = this.getFinishTime(); // numberOfAttempts return (int) (maxScore
		 * * (currentTime - finishTime)/(this.getStartTime() - finishTime) *
		 * puzzleLevel);
		 */
		return 100;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean acceptPlayer(Player player) {
		System.out.println("acceptPlayer");
		EMap<Player, Integer> playerLevels = this.getPlayerLevels();
		if (!playerLevels.containsKey(player)) {
			playerLevels.put(player, 1);
		}
		
		if (isPuzzleCompletedByPlayer(player)) return false;
		
		int playerLevel = playerLevels.get(player);
		
		getPuzzles().stream()
			.filter(e -> e.getLevel() == playerLevel)
			.findFirst().orElseThrow(NoSuchElementException::new)
			.startPuzzle(player); 
		return true;
	}
	
	
	private boolean isPuzzleCompletedByPlayer(Player player) {
		return this.getPlayerLevels().get(player) > this.getPuzzles().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LatLong getLatLong() {
		return new LatLong(getLatitude(), getLongitude());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK__PUZZLES:
				return ((InternalEList<?>)getPuzzles()).basicRemove(otherEnd, msgs);
			case RuntimePackage.PUZZLE_TASK__PLAYER_LEVELS:
				return ((InternalEList<?>)getPlayerLevels()).basicRemove(otherEnd, msgs);
			case RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES:
				return basicSetPlayerTaskScores(null, msgs);
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
			case RuntimePackage.PUZZLE_TASK__LATITUDE:
				return getLatitude();
			case RuntimePackage.PUZZLE_TASK__LONGITUDE:
				return getLongitude();
			case RuntimePackage.PUZZLE_TASK__PUZZLES:
				return getPuzzles();
			case RuntimePackage.PUZZLE_TASK__PLAYER_LEVELS:
				if (coreType) return getPlayerLevels();
				else return getPlayerLevels().map();
			case RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES:
				return getPlayerTaskScores();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK__PUZZLES:
				getPuzzles().clear();
				getPuzzles().addAll((Collection<? extends Puzzle>)newValue);
				return;
			case RuntimePackage.PUZZLE_TASK__PLAYER_LEVELS:
				((EStructuralFeature.Setting)getPlayerLevels()).set(newValue);
				return;
			case RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES:
				setPlayerTaskScores((PlayerTaskScores)newValue);
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
			case RuntimePackage.PUZZLE_TASK__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE_TASK__PUZZLES:
				getPuzzles().clear();
				return;
			case RuntimePackage.PUZZLE_TASK__PLAYER_LEVELS:
				getPlayerLevels().clear();
				return;
			case RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES:
				setPlayerTaskScores((PlayerTaskScores)null);
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
			case RuntimePackage.PUZZLE_TASK__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK__PUZZLES:
				return puzzles != null && !puzzles.isEmpty();
			case RuntimePackage.PUZZLE_TASK__PLAYER_LEVELS:
				return playerLevels != null && !playerLevels.isEmpty();
			case RuntimePackage.PUZZLE_TASK__PLAYER_TASK_SCORES:
				return playerTaskScores != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (derivedFeatureID) {
				case RuntimePackage.PUZZLE_TASK__LATITUDE: return OsmPackage.GEO_LOCATION__LATITUDE;
				case RuntimePackage.PUZZLE_TASK__LONGITUDE: return OsmPackage.GEO_LOCATION__LONGITUDE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (baseFeatureID) {
				case OsmPackage.GEO_LOCATION__LATITUDE: return RuntimePackage.PUZZLE_TASK__LATITUDE;
				case OsmPackage.GEO_LOCATION__LONGITUDE: return RuntimePackage.PUZZLE_TASK__LONGITUDE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (baseOperationID) {
				case OsmPackage.GEO_LOCATED___GET_LAT_LONG: return RuntimePackage.PUZZLE_TASK___GET_LAT_LONG;
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.PUZZLE_TASK___ACCEPT_PUZZLE_PROPOSAL__STRING_PLAYER:
				return acceptPuzzleProposal((String)arguments.get(0), (Player)arguments.get(1));
			case RuntimePackage.PUZZLE_TASK___CALCULATE_SCORE__INT_PLAYER_BOOLEAN:
				return calculateScore((Integer)arguments.get(0), (Player)arguments.get(1), (Boolean)arguments.get(2));
			case RuntimePackage.PUZZLE_TASK___ACCEPT_PLAYER__PLAYER:
				return acceptPlayer((Player)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK___GET_LAT_LONG:
				return getLatLong();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(')');
		return result.toString();
	}

} //PuzzleTaskImpl
