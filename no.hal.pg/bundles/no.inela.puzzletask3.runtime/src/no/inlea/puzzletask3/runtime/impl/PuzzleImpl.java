/**
 */
package no.inlea.puzzletask3.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import no.hal.pg.runtime.Player;
import no.inlea.puzzletask3.runtime.Puzzle;
import no.inlea.puzzletask3.runtime.PuzzlePiece;
import no.inlea.puzzletask3.runtime.RuntimePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleImpl#getPuzzlePieces <em>Puzzle Pieces</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleImpl#getPlayerPieces <em>Player Pieces</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.PuzzleImpl#getActivePlayers <em>Active Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleImpl extends MinimalEObjectImpl.Container implements Puzzle {
	/**
	 * The default value of the '{@link #getSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected String solution = SOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected String instructions = INSTRUCTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPuzzlePieces() <em>Puzzle Pieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuzzlePieces()
	 * @generated
	 * @ordered
	 */
	protected EList<PuzzlePiece> puzzlePieces;

	/**
	 * The cached value of the '{@link #getPlayerPieces() <em>Player Pieces</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerPieces()
	 * @generated
	 * @ordered
	 */
	protected EMap<Player, PuzzlePiece> playerPieces;

	/**
	 * The cached value of the '{@link #getActivePlayers() <em>Active Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> activePlayers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PUZZLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructions(String newInstructions) {
		String oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE__INSTRUCTIONS, oldInstructions, instructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolution(String newSolution) {
		String oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PUZZLE__SOLUTION, oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PuzzlePiece> getPuzzlePieces() {
		if (puzzlePieces == null) {
			puzzlePieces = new EObjectContainmentEList<PuzzlePiece>(PuzzlePiece.class, this, RuntimePackage.PUZZLE__PUZZLE_PIECES);
		}
		return puzzlePieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<Player, PuzzlePiece> getPlayerPieces() {
		if (playerPieces == null) {
			playerPieces = new EcoreEMap<Player,PuzzlePiece>(RuntimePackage.Literals.PLAYER_TO_PUZZLE_PIECE, PlayerToPuzzlePieceImpl.class, this, RuntimePackage.PUZZLE__PLAYER_PIECES);
		}
		return playerPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getActivePlayers() {
		if (activePlayers == null) {
			activePlayers = new EObjectResolvingEList<Player>(Player.class, this, RuntimePackage.PUZZLE__ACTIVE_PLAYERS);
		}
		return activePlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean acceptProposal(String proposal) {
		return proposal.toLowerCase().equals(this.getSolution().toLowerCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean startPuzzle(Player player) {
		if (!getPlayerPieces().containsKey(player)) {
			PuzzlePiece piece = getPuzzlePieces().stream()
					.min(Comparator.comparing(e -> e.getPlayerCount()))
					.orElseThrow(NoSuchElementException::new);
			getPlayerPieces().put(player, piece);
			
			int count = piece.getPlayerCount();
			piece.setPlayerCount(count + 1);
			getActivePlayers().add(player);
		}
		
		if (!getActivePlayers().contains(player)) {
			getActivePlayers().add(player);
			getPlayerPieces().get(player).setPlayerCount(getPlayerPieces().get(player).getPlayerCount()+1);
		}
			
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean finishPuzzle(Player player) {
		PuzzlePiece piece = getPlayerPieces().removeKey(player);
		piece.setPlayerCount(piece.getPlayerCount() - 1);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getPuzzleContent(Player player) {
		return this.getPlayerPieces().get(player).getHtml();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean quitPuzzle(Player player) {
		getActivePlayers().remove(player);
		int count = getPlayerPieces().get(player).getPlayerCount();
		getPlayerPieces().get(player).setPlayerCount(count - 1);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.PUZZLE__PUZZLE_PIECES:
				return ((InternalEList<?>)getPuzzlePieces()).basicRemove(otherEnd, msgs);
			case RuntimePackage.PUZZLE__PLAYER_PIECES:
				return ((InternalEList<?>)getPlayerPieces()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.PUZZLE__SOLUTION:
				return getSolution();
			case RuntimePackage.PUZZLE__INSTRUCTIONS:
				return getInstructions();
			case RuntimePackage.PUZZLE__PUZZLE_PIECES:
				return getPuzzlePieces();
			case RuntimePackage.PUZZLE__PLAYER_PIECES:
				if (coreType) return getPlayerPieces();
				else return getPlayerPieces().map();
			case RuntimePackage.PUZZLE__ACTIVE_PLAYERS:
				return getActivePlayers();
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
			case RuntimePackage.PUZZLE__SOLUTION:
				setSolution((String)newValue);
				return;
			case RuntimePackage.PUZZLE__INSTRUCTIONS:
				setInstructions((String)newValue);
				return;
			case RuntimePackage.PUZZLE__PUZZLE_PIECES:
				getPuzzlePieces().clear();
				getPuzzlePieces().addAll((Collection<? extends PuzzlePiece>)newValue);
				return;
			case RuntimePackage.PUZZLE__PLAYER_PIECES:
				((EStructuralFeature.Setting)getPlayerPieces()).set(newValue);
				return;
			case RuntimePackage.PUZZLE__ACTIVE_PLAYERS:
				getActivePlayers().clear();
				getActivePlayers().addAll((Collection<? extends Player>)newValue);
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
			case RuntimePackage.PUZZLE__SOLUTION:
				setSolution(SOLUTION_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE__INSTRUCTIONS:
				setInstructions(INSTRUCTIONS_EDEFAULT);
				return;
			case RuntimePackage.PUZZLE__PUZZLE_PIECES:
				getPuzzlePieces().clear();
				return;
			case RuntimePackage.PUZZLE__PLAYER_PIECES:
				getPlayerPieces().clear();
				return;
			case RuntimePackage.PUZZLE__ACTIVE_PLAYERS:
				getActivePlayers().clear();
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
			case RuntimePackage.PUZZLE__SOLUTION:
				return SOLUTION_EDEFAULT == null ? solution != null : !SOLUTION_EDEFAULT.equals(solution);
			case RuntimePackage.PUZZLE__INSTRUCTIONS:
				return INSTRUCTIONS_EDEFAULT == null ? instructions != null : !INSTRUCTIONS_EDEFAULT.equals(instructions);
			case RuntimePackage.PUZZLE__PUZZLE_PIECES:
				return puzzlePieces != null && !puzzlePieces.isEmpty();
			case RuntimePackage.PUZZLE__PLAYER_PIECES:
				return playerPieces != null && !playerPieces.isEmpty();
			case RuntimePackage.PUZZLE__ACTIVE_PLAYERS:
				return activePlayers != null && !activePlayers.isEmpty();
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
			case RuntimePackage.PUZZLE___ACCEPT_PROPOSAL__STRING:
				return acceptProposal((String)arguments.get(0));
			case RuntimePackage.PUZZLE___START_PUZZLE__PLAYER:
				return startPuzzle((Player)arguments.get(0));
			case RuntimePackage.PUZZLE___FINISH_PUZZLE__PLAYER:
				return finishPuzzle((Player)arguments.get(0));
			case RuntimePackage.PUZZLE___GET_PUZZLE_CONTENT__PLAYER:
				return getPuzzleContent((Player)arguments.get(0));
			case RuntimePackage.PUZZLE___QUIT_PUZZLE__PLAYER:
				return quitPuzzle((Player)arguments.get(0));
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
		result.append(" (solution: ");
		result.append(solution);
		result.append(", instructions: ");
		result.append(instructions);
		result.append(')');
		return result.toString();
	}

} //PuzzleImpl
