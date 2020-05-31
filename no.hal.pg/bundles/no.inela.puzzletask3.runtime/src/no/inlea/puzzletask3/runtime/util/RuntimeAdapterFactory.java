/**
 */
package no.inlea.puzzletask3.runtime.util;

import java.util.Map;

import no.hal.pg.app.TaskView;
import no.hal.pg.app.View;
import no.hal.pg.app.View1;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.runtime.Described;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;
import no.inlea.puzzletask3.runtime.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.inlea.puzzletask3.runtime.RuntimePackage
 * @generated
 */
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeSwitch<Adapter> modelSwitch =
		new RuntimeSwitch<Adapter>() {
			@Override
			public Adapter casePuzzleTask3(PuzzleTask3 object) {
				return createPuzzleTask3Adapter();
			}
			@Override
			public Adapter casePuzzle(Puzzle object) {
				return createPuzzleAdapter();
			}
			@Override
			public Adapter casePuzzlePiece(PuzzlePiece object) {
				return createPuzzlePieceAdapter();
			}
			@Override
			public Adapter caseImagePiece(ImagePiece object) {
				return createImagePieceAdapter();
			}
			@Override
			public Adapter caseTextPiece(TextPiece object) {
				return createTextPieceAdapter();
			}
			@Override
			public Adapter casePuzzleTaskView(PuzzleTaskView object) {
				return createPuzzleTaskViewAdapter();
			}
			@Override
			public Adapter caseTaskScores(TaskScores object) {
				return createTaskScoresAdapter();
			}
			@Override
			public Adapter casePlayerToInt(Map.Entry<Player, Integer> object) {
				return createPlayerToIntAdapter();
			}
			@Override
			public Adapter casePlayerToPuzzlePiece(Map.Entry<Player, PuzzlePiece> object) {
				return createPlayerToPuzzlePieceAdapter();
			}
			@Override
			public Adapter casePlayerToStrings(Map.Entry<Player, EList<String>> object) {
				return createPlayerToStringsAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public <R> Adapter caseTask(Task<R> object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseGeoLocated(GeoLocated object) {
				return createGeoLocatedAdapter();
			}
			@Override
			public Adapter caseGeoLocation(GeoLocation object) {
				return createGeoLocationAdapter();
			}
			@Override
			public <U> Adapter caseView(View<U> object) {
				return createViewAdapter();
			}
			@Override
			public <U, M> Adapter caseView1(View1<U, M> object) {
				return createView1Adapter();
			}
			@Override
			public <T extends Task<?>> Adapter caseTaskView(TaskView<T> object) {
				return createTaskViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.inlea.puzzletask3.runtime.PuzzleTask3 <em>Puzzle Task3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTask3
	 * @generated
	 */
	public Adapter createPuzzleTask3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inlea.puzzletask3.runtime.Puzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inlea.puzzletask3.runtime.Puzzle
	 * @generated
	 */
	public Adapter createPuzzleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Player To Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPlayerToIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inlea.puzzletask3.runtime.ImagePiece <em>Image Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inlea.puzzletask3.runtime.ImagePiece
	 * @generated
	 */
	public Adapter createImagePieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inlea.puzzletask3.runtime.PuzzlePiece <em>Puzzle Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inlea.puzzletask3.runtime.PuzzlePiece
	 * @generated
	 */
	public Adapter createPuzzlePieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inlea.puzzletask3.runtime.TextPiece <em>Text Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inlea.puzzletask3.runtime.TextPiece
	 * @generated
	 */
	public Adapter createTextPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Player To Puzzle Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPlayerToPuzzlePieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Player To Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPlayerToStringsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inlea.puzzletask3.runtime.PuzzleTaskView <em>Puzzle Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inlea.puzzletask3.runtime.PuzzleTaskView
	 * @generated
	 */
	public Adapter createPuzzleTaskViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.inlea.puzzletask3.runtime.TaskScores <em>Task Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.inlea.puzzletask3.runtime.TaskScores
	 * @generated
	 */
	public Adapter createTaskScoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.osm.GeoLocated <em>Geo Located</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.osm.GeoLocated
	 * @generated
	 */
	public Adapter createGeoLocatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.osm.GeoLocation <em>Geo Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.osm.GeoLocation
	 * @generated
	 */
	public Adapter createGeoLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.app.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.app.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.app.View1 <em>View1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.app.View1
	 * @generated
	 */
	public Adapter createView1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.app.TaskView <em>Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.app.TaskView
	 * @generated
	 */
	public Adapter createTaskViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RuntimeAdapterFactory
