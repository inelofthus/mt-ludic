/**
 */
package no.inlea.puzzletask.runtime.tests;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.pg.app.GameView;
import no.inlea.puzzletask.runtime.PuzzleTaskView;
import no.inlea.puzzletask.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Puzzle Task View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getImage() <em>Image</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getScore() <em>Score</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getImageId() <em>Image Id</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getLevel() <em>Level</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#proposeAnswer(java.lang.String) <em>Propose Answer</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzleTaskView#finish() <em>Finish</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PuzzleTaskViewTest extends TestCase {

	/**
	 * The fixture for this Puzzle Task View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleTaskView fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PuzzleTaskViewTest.class);
	}

	/**
	 * Constructs a new Puzzle Task View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleTaskViewTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Puzzle Task View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PuzzleTaskView fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Puzzle Task View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleTaskView getFixture() {
		return fixture;
	}

	
	private URI uri;
	private ResourceSet resourceSet;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createPuzzleTaskView());
		uri = URI.createURI(getClass().getResource("../../../../../PuzzleView1/ViewTest1.xmi").toString());
		
		resourceSet = new ResourceSetImpl();
	}
	
	protected Collection<EObject> loadRootObjects() {
		return loadRootObjects(uri);
	}

	protected Collection<EObject> loadRootObjects(URI uri) {
		System.out.println(uri);
		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			return resource.getContents();
		} catch (IOException e) {
			Assert.fail();
		}
		return null;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testLoad() {
		Collection<EObject> rootObjects = loadRootObjects();
		Assert.assertEquals(1, rootObjects.size());
		EObject first = rootObjects.iterator().next();
		Assert.assertTrue(first instanceof GameView<?>);
		GameView<?> gameView = (GameView<?>) first;
		Assert.assertEquals(1, gameView.getTaskViews().size());
		Assert.assertTrue(gameView.getTaskViews().get(0) instanceof PuzzleTaskView);
	}
	
	@Test
	public void testPuzzleTaskViewUser() {
		Collection<EObject> rootObjects = loadRootObjects();
		GameView<?> gameView = (GameView<?>) rootObjects.iterator().next();
		PuzzleTaskView taskView = (PuzzleTaskView) gameView.getTaskViews().get(0);
		Assert.assertEquals(taskView.getUser(), gameView.getPlayer());
	}
	
	/**
	 * Tests the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getImage() <em>Image</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#getImage()
	 * @generated NOT
	 */
	public void testGetImage() {
		// TODO: Fix xml to include delegated puzzle pieces/images. get a specific task view?
		Collection<EObject> rootObjects = loadRootObjects();
		GameView<?> gameView = (GameView<?>) rootObjects.iterator().next();
		PuzzleTaskView taskView = (PuzzleTaskView) gameView.getTaskViews().get(0);
		Assert.assertEquals("banana", taskView.getImage());
	}

	/**
	 * Tests the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getScore() <em>Score</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#getScore()
	 * @generated NOT
	 */
	public void testGetScore() {
		// TODO: Fix xml to include scores
		Collection<EObject> rootObjects = loadRootObjects();
		GameView<?> gameView = (GameView<?>) rootObjects.iterator().next();
		PuzzleTaskView taskView = (PuzzleTaskView) gameView.getTaskViews().get(0);
		Assert.assertEquals(0, taskView.getScore());
		taskView.proposeAnswer("fruit");
		Assert.assertEquals(100, taskView.getScore());
	}


	/**
	 * Tests the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#getLevel() <em>Level</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#getLevel()
	 * @generated NOT
	 */
	public void testGetLevel() {
		Collection<EObject> rootObjects = loadRootObjects();
		GameView<?> gameView = (GameView<?>) rootObjects.iterator().next();
		PuzzleTaskView taskView = (PuzzleTaskView) gameView.getTaskViews().get(0);
		Assert.assertEquals(1, taskView.getLevel());
		
		taskView.proposeAnswer("fruit");
		Assert.assertEquals(2, taskView.getLevel());
	}

	/**
	 * Tests the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#isSetLevel() <em>isSetLevel()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#isSetLevel()
	 * @generated
	 */
	public void testIsSetLevel() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#proposeAnswer(java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#proposeAnswer(java.lang.String)
	 * @generated NOT
	 */
	public void testProposeAnswer__String() {
		// TODO: What else happens?
		
		Collection<EObject> rootObjects = loadRootObjects();
		GameView<?> gameView = (GameView<?>) rootObjects.iterator().next();
		PuzzleTaskView taskView = (PuzzleTaskView) gameView.getTaskViews().get(0);
		
		Assert.assertEquals(1, taskView.getLevel());
		taskView.proposeAnswer("vegetable");
		Assert.assertEquals(1, taskView.getLevel());
		taskView.proposeAnswer("fruit");
		Assert.assertEquals(2, taskView.getLevel());
		taskView.startPuzzle();
		Assert.assertEquals("pipe organ", taskView.getImage());
	}

	/**
	 * Tests the '{@link no.inlea.puzzletask.runtime.PuzzleTaskView#finish() <em>Finish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask.runtime.PuzzleTaskView#finish()
	 * @generated
	 */
	public void testFinish() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
	

	
	
} //PuzzleTaskViewTest
