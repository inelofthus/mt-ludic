/**
 */
package no.inlea.puzzletask.runtime.impl;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.Player;

import no.inlea.puzzletask.runtime.PuzzlePiece;
import no.inlea.puzzletask.runtime.RuntimePackage;
import no.inlea.puzzletask.runtime.SimplePuzzle;

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
 * An implementation of the model object '<em><b>Simple Puzzle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl#getPuzzlePieces <em>Puzzle Pieces</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.SimplePuzzleImpl#getPlayerPieces <em>Player Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimplePuzzleImpl extends PuzzleImpl implements SimplePuzzle {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected InfoItem instructions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplePuzzleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SIMPLE_PUZZLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfoItem getInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructions(InfoItem newInstructions, NotificationChain msgs) {
		InfoItem oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS, oldInstructions, newInstructions);
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
	public void setInstructions(InfoItem newInstructions) {
		if (newInstructions != instructions) {
			NotificationChain msgs = null;
			if (instructions != null)
				msgs = ((InternalEObject)instructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS, null, msgs);
			if (newInstructions != null)
				msgs = ((InternalEObject)newInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS, null, msgs);
			msgs = basicSetInstructions(newInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS, newInstructions, newInstructions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SIMPLE_PUZZLE__SOLUTION, oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PuzzlePiece> getPuzzlePieces() {
		if (puzzlePieces == null) {
			puzzlePieces = new EObjectContainmentEList<PuzzlePiece>(PuzzlePiece.class, this, RuntimePackage.SIMPLE_PUZZLE__PUZZLE_PIECES);
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
			playerPieces = new EcoreEMap<Player,PuzzlePiece>(RuntimePackage.Literals.PLAYER_TO_PUZZLE_PIECE, PlayerToPuzzlePieceImpl.class, this, RuntimePackage.SIMPLE_PUZZLE__PLAYER_PIECES);
		}
		return playerPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS:
				return basicSetInstructions(null, msgs);
			case RuntimePackage.SIMPLE_PUZZLE__PUZZLE_PIECES:
				return ((InternalEList<?>)getPuzzlePieces()).basicRemove(otherEnd, msgs);
			case RuntimePackage.SIMPLE_PUZZLE__PLAYER_PIECES:
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
			case RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS:
				return getInstructions();
			case RuntimePackage.SIMPLE_PUZZLE__SOLUTION:
				return getSolution();
			case RuntimePackage.SIMPLE_PUZZLE__PUZZLE_PIECES:
				return getPuzzlePieces();
			case RuntimePackage.SIMPLE_PUZZLE__PLAYER_PIECES:
				if (coreType) return getPlayerPieces();
				else return getPlayerPieces().map();
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
			case RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS:
				setInstructions((InfoItem)newValue);
				return;
			case RuntimePackage.SIMPLE_PUZZLE__SOLUTION:
				setSolution((String)newValue);
				return;
			case RuntimePackage.SIMPLE_PUZZLE__PUZZLE_PIECES:
				getPuzzlePieces().clear();
				getPuzzlePieces().addAll((Collection<? extends PuzzlePiece>)newValue);
				return;
			case RuntimePackage.SIMPLE_PUZZLE__PLAYER_PIECES:
				((EStructuralFeature.Setting)getPlayerPieces()).set(newValue);
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
			case RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS:
				setInstructions((InfoItem)null);
				return;
			case RuntimePackage.SIMPLE_PUZZLE__SOLUTION:
				setSolution(SOLUTION_EDEFAULT);
				return;
			case RuntimePackage.SIMPLE_PUZZLE__PUZZLE_PIECES:
				getPuzzlePieces().clear();
				return;
			case RuntimePackage.SIMPLE_PUZZLE__PLAYER_PIECES:
				getPlayerPieces().clear();
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
			case RuntimePackage.SIMPLE_PUZZLE__INSTRUCTIONS:
				return instructions != null;
			case RuntimePackage.SIMPLE_PUZZLE__SOLUTION:
				return SOLUTION_EDEFAULT == null ? solution != null : !SOLUTION_EDEFAULT.equals(solution);
			case RuntimePackage.SIMPLE_PUZZLE__PUZZLE_PIECES:
				return puzzlePieces != null && !puzzlePieces.isEmpty();
			case RuntimePackage.SIMPLE_PUZZLE__PLAYER_PIECES:
				return playerPieces != null && !playerPieces.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean acceptProposal(String proposal) {
		return proposal.toLowerCase().equals(this.getSolution().toLowerCase());
	}

	@Override
	public boolean finishPuzzle(Player player) {
		PuzzlePiece piece = getPlayerPieces().removeKey(player);
		piece.setPlayerCount(piece.getPlayerCount() - 1);
		return true;
	}

	@Override
	public boolean startPuzzle(Player player) {
		if (!getPlayerPieces().containsKey(player)) {
			PuzzlePiece piece = getPuzzlePieces().stream()
					.min(Comparator.comparing(e -> e.getPlayerCount()))
					.orElseThrow(NoSuchElementException::new);
			getPlayerPieces().put(player, piece);
			int count = piece.getPlayerCount();
			piece.setPlayerCount(count + 1);
			getPlayerPieces().stream().forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));
			System.out.println(getPlayerPieces().get(player));
		}
		return true;
	}

	@Override
	public String getImage(Player player) {
		return this.getPlayerPieces().get(player).getImage();
	}

} //SimplePuzzleImpl
