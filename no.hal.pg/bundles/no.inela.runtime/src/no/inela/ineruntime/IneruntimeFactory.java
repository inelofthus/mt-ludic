/**
 */
package no.inela.ineruntime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.inela.ineruntime.IneruntimePackage
 * @generated
 */
public interface IneruntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IneruntimeFactory eINSTANCE = no.inela.ineruntime.impl.IneruntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Leaderboard Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaderboard Game</em>'.
	 * @generated
	 */
	LeaderboardGame createLeaderboardGame();

	/**
	 * Returns a new object of class '<em>Leaderboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaderboard</em>'.
	 * @generated
	 */
	Leaderboard createLeaderboard();

	/**
	 * Returns a new object of class '<em>Leaderboard Game View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaderboard Game View</em>'.
	 * @generated
	 */
	LeaderboardGameView createLeaderboardGameView();

	/**
	 * Returns a new object of class '<em>Composite Player Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Player Action</em>'.
	 * @generated
	 */
	CompositePlayerAction createCompositePlayerAction();

	/**
	 * Returns a new object of class '<em>Set Task To Active Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Task To Active Action</em>'.
	 * @generated
	 */
	SetTaskToActiveAction createSetTaskToActiveAction();

	/**
	 * Returns a new object of class '<em>Remove Task From Active Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Task From Active Action</em>'.
	 * @generated
	 */
	RemoveTaskFromActiveAction createRemoveTaskFromActiveAction();

	/**
	 * Returns a new object of class '<em>Composite Player Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Player Condition</em>'.
	 * @generated
	 */
	CompositePlayerCondition createCompositePlayerCondition();

	/**
	 * Returns a new object of class '<em>Is Only Task Active For Player Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Only Task Active For Player Condition</em>'.
	 * @generated
	 */
	IsOnlyTaskActiveForPlayerCondition createIsOnlyTaskActiveForPlayerCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IneruntimePackage getIneruntimePackage();

} //IneruntimeFactory
