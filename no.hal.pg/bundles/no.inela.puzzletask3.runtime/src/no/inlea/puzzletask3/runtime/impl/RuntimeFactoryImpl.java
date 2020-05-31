/**
 */
package no.inlea.puzzletask3.runtime.impl;

import java.util.Map;

import no.hal.pg.runtime.Player;
import no.inlea.puzzletask3.runtime.*;

import org.eclipse.emf.common.util.EList;
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
			case RuntimePackage.PUZZLE_TASK3: return createPuzzleTask3();
			case RuntimePackage.PUZZLE: return createPuzzle();
			case RuntimePackage.IMAGE_PIECE: return createImagePiece();
			case RuntimePackage.TEXT_PIECE: return createTextPiece();
			case RuntimePackage.PUZZLE_TASK_VIEW: return createPuzzleTaskView();
			case RuntimePackage.TASK_SCORES: return createTaskScores();
			case RuntimePackage.PLAYER_TO_INT: return (EObject)createPlayerToInt();
			case RuntimePackage.PLAYER_TO_PUZZLE_PIECE: return (EObject)createPlayerToPuzzlePiece();
			case RuntimePackage.PLAYER_TO_STRINGS: return (EObject)createPlayerToStrings();
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
	public PuzzleTask3 createPuzzleTask3() {
		PuzzleTask3Impl puzzleTask3 = new PuzzleTask3Impl();
		return puzzleTask3;
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
	public Puzzle createPuzzle() {
		PuzzleImpl puzzle = new PuzzleImpl();
		return puzzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagePiece createImagePiece() {
		ImagePieceImpl imagePiece = new ImagePieceImpl();
		return imagePiece;
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
	public Map.Entry<Player, EList<String>> createPlayerToStrings() {
		PlayerToStringsImpl playerToStrings = new PlayerToStringsImpl();
		return playerToStrings;
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
	@Override
	public TaskScores createTaskScores() {
		TaskScoresImpl taskScores = new TaskScoresImpl();
		return taskScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextPiece createTextPiece() {
		TextPieceImpl textPiece = new TextPieceImpl();
		return textPiece;
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
