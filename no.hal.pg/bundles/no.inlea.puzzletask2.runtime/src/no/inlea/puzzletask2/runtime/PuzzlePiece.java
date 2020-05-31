/**
 */
package no.inlea.puzzletask2.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzlePiece#getHtml <em>Html</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzlePiece#getPlayerCount <em>Player Count</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.PuzzlePiece#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzlePiece()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PuzzlePiece extends EObject {
	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzlePiece_Html()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getHtml();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzlePiece_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask2.runtime.PuzzlePiece#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Count</em>' attribute.
	 * @see #setPlayerCount(int)
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getPuzzlePiece_PlayerCount()
	 * @model
	 * @generated
	 */
	int getPlayerCount();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask2.runtime.PuzzlePiece#getPlayerCount <em>Player Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Count</em>' attribute.
	 * @see #getPlayerCount()
	 * @generated
	 */
	void setPlayerCount(int value);

} // PuzzlePiece
