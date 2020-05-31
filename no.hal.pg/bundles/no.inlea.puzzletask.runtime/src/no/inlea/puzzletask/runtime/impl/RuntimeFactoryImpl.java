/**
 */
package no.inlea.puzzletask.runtime.impl;

import java.util.Map;

import no.hal.pg.runtime.Player;

import no.inlea.puzzletask.runtime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFactoryImpl extends EFactoryImpl implements RuntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFactory init() {
		try {
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory(RuntimePackage.eNS_URI);
			if (theRuntimeFactory != null) {
				return theRuntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RuntimePackage.PUZZLE_TASK: return createPuzzleTask();
			case RuntimePackage.PUZZLE_PIECE: return createPuzzlePiece();
			case RuntimePackage.PUZZLE_TASK_VIEW: return createPuzzleTaskView();
			case RuntimePackage.PLAYER_TO_INT: return (EObject)createPlayerToInt();
			case RuntimePackage.SIMPLE_PUZZLE: return createSimplePuzzle();
			case RuntimePackage.PLAYER_TASK_SCORE: return createPlayerTaskScore();
			case RuntimePackage.PLAYER_TASK_SCORES: return createPlayerTaskScores();
			case RuntimePackage.PLAYER_TO_PUZZLE_PIECE: return (EObject)createPlayerToPuzzlePiece();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PuzzleTask createPuzzleTask() {
		PuzzleTaskImpl puzzleTask = new PuzzleTaskImpl();
		return puzzleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PuzzlePiece createPuzzlePiece() {
		PuzzlePieceImpl puzzlePiece = new PuzzlePieceImpl();
		return puzzlePiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PuzzleTaskView createPuzzleTaskView() {
		PuzzleTaskViewImpl puzzleTaskView = new PuzzleTaskViewImpl();
		return puzzleTaskView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Player, Integer> createPlayerToInt() {
		PlayerToIntImpl playerToInt = new PlayerToIntImpl();
		return playerToInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplePuzzle createSimplePuzzle() {
		SimplePuzzleImpl simplePuzzle = new SimplePuzzleImpl();
		return simplePuzzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerTaskScore createPlayerTaskScore() {
		PlayerTaskScoreImpl playerTaskScore = new PlayerTaskScoreImpl();
		return playerTaskScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerTaskScores createPlayerTaskScores() {
		PlayerTaskScoresImpl playerTaskScores = new PlayerTaskScoresImpl();
		return playerTaskScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Player, PuzzlePiece> createPlayerToPuzzlePiece() {
		PlayerToPuzzlePieceImpl playerToPuzzlePiece = new PlayerToPuzzlePieceImpl();
		return playerToPuzzlePiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimePackage getRuntimePackage() {
		return (RuntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimePackage getPackage() {
		return RuntimePackage.eINSTANCE;
	}

} //RuntimeFactoryImpl
