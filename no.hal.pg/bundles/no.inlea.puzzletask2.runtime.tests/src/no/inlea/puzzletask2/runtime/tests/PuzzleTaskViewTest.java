/**
 */
package no.inlea.puzzletask2.runtime.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.pg.app.GameApp;
import no.hal.pg.app.GameView;
import no.hal.pg.app.View;
import no.inela.ineruntime.LeaderboardGameView;
import no.inlea.puzzletask2.runtime.PuzzleTaskView;
import no.inlea.puzzletask2.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Puzzle Task View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#proposeAnswer(java.lang.String) <em>Propose Answer</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#startPuzzle() <em>Start Puzzle</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#acceptPlayer() <em>Accept Player</em>}</li>
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

	private URI uri1;
	private URI uri2;
	private ResourceSet resourceSet;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createPuzzleTaskView());
		uri1 = URI.createURI(getClass().getResource("../../../../../Test1/PuzzleTask2ViewTest.xmi").toString());
		uri2 = URI.createURI(getClass().getResource("../../../../../Test2/PuzzleTask2ViewTest.xmi").toString());
		resourceSet = new ResourceSetImpl();
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
		Collection<EObject> rootObjects1 = loadRootObjects(uri1);
		Assert.assertEquals(1, rootObjects1.size());
		EObject first1 = rootObjects1.iterator().next();
		Assert.assertTrue(first1 instanceof GameApp);
		Assert.assertEquals(3, ((GameApp<?>) first1).getViews().size());
		Assert.assertTrue(((GameApp<?>) first1).getViews().get(0) instanceof LeaderboardGameView);
		GameView<?> gameView = (GameView<?>)((GameApp<?>) first1).getViews().get(0);
		Assert.assertEquals(12, gameView.getTaskViews().size());
		Assert.assertTrue(gameView.getTaskViews().get(0) instanceof PuzzleTaskView);
		
		Collection<EObject> rootObjects2 = loadRootObjects(uri2);
		Assert.assertEquals(1, rootObjects2.size());
		EObject first2 = rootObjects2.iterator().next();
		Assert.assertTrue(first2 instanceof GameApp);
		Assert.assertEquals(3, ((GameApp<?>) first2).getViews().size());
		Assert.assertTrue(((GameApp<?>) first2).getViews().get(0) instanceof LeaderboardGameView);
		GameView<?> gameView2 = (GameView<?>)((GameApp<?>) first2).getViews().get(0);
		Assert.assertEquals(12, gameView2.getTaskViews().size());
		Assert.assertTrue(gameView2.getTaskViews().get(0) instanceof PuzzleTaskView);
	}

	/**
	 * Tests the '{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#proposeAnswer(java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask2.runtime.PuzzleTaskView#proposeAnswer(java.lang.String)
	 * @generated
	 */
	public void testProposeAnswer__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#startPuzzle() <em>Start Puzzle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask2.runtime.PuzzleTaskView#startPuzzle()
	 * @generated
	 */
	public void testStartPuzzle() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link no.inlea.puzzletask2.runtime.PuzzleTaskView#acceptPlayer() <em>Accept Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.inlea.puzzletask2.runtime.PuzzleTaskView#acceptPlayer()
	 * @generated
	 */
	public void testAcceptPlayer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PuzzleTaskViewTest
