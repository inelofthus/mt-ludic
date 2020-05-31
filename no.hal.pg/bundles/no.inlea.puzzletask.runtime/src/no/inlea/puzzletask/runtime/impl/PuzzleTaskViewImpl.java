/**
 */
package no.inlea.puzzletask.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;

import no.hal.pg.app.impl.TaskViewImpl;
import no.inlea.puzzletask.runtime.Puzzle;
import no.inlea.puzzletask.runtime.PuzzleTask;
import no.inlea.puzzletask.runtime.PuzzleTaskView;
import no.inlea.puzzletask.runtime.RuntimePackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle Task View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskViewImpl#getImage <em>Image</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskViewImpl#getScore <em>Score</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.impl.PuzzleTaskViewImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleTaskViewImpl extends TaskViewImpl<PuzzleTask> implements PuzzleTaskView {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final int SCORE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleTaskViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PUZZLE_TASK_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getImage() {
		int playerLevel = getModel().getPlayerLevels().get(getUser());
		return getModel().getPuzzles().stream()
		.filter(e -> e.getLevel() == playerLevel)
		.findFirst().orElseThrow(NoSuchElementException::new)
		.getImage(getUser()); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getScore() {
		try { 
			return getModel().getPlayerTaskScores().getScores().stream()
			.filter(e -> e.getPlayer().equals(getUser()))
			.findFirst().orElseThrow(NoSuchElementException::new)
			.getScore();
			
		} catch (NoSuchElementException e){
			return 0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLevel() {
		return getModel().getPlayerLevels().get(getUser());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLevel() {
		// TODO: implement this method to return whether the 'Level' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PuzzleTaskView proposeAnswer(String proposal) {
		this.getModel().acceptPuzzleProposal(proposal, this.getUser());
		return this;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void finish() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK_VIEW__IMAGE:
				return getImage();
			case RuntimePackage.PUZZLE_TASK_VIEW__SCORE:
				return getScore();
			case RuntimePackage.PUZZLE_TASK_VIEW__LEVEL:
				return getLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.PUZZLE_TASK_VIEW__IMAGE:
				return IMAGE_EDEFAULT == null ? getImage() != null : !IMAGE_EDEFAULT.equals(getImage());
			case RuntimePackage.PUZZLE_TASK_VIEW__SCORE:
				return getScore() != SCORE_EDEFAULT;
			case RuntimePackage.PUZZLE_TASK_VIEW__LEVEL:
				return isSetLevel();
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
			case RuntimePackage.PUZZLE_TASK_VIEW___PROPOSE_ANSWER__STRING:
				return proposeAnswer((String)arguments.get(0));
			case RuntimePackage.PUZZLE_TASK_VIEW___FINISH:
				finish();
				return null;
			case RuntimePackage.PUZZLE_TASK_VIEW___START_PUZZLE:
				startPuzzle();
				return null;
			case RuntimePackage.PUZZLE_TASK_VIEW___ACCEPT_PLAYER:
				return acceptPlayer();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	//TODO: Is this necessary? Already called in acceptPlayer
	public void startPuzzle() {
		System.out.println("startPuzzle");
		Puzzle puzzle = getModel().getPuzzles().stream()
				.filter(e -> e.getLevel() == getLevel()).findFirst().orElseThrow(NoSuchElementException::new);
		puzzle.startPuzzle(getUser());
		
	}

	@Override 
	public boolean acceptPlayer() {
		System.out.println("Accepting player...");
		return this.getModel().acceptPlayer(getUser());
	}

} //PuzzleTaskViewImpl
