/**
 */
package no.inlea.puzzletask.runtime;

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
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzlePiece#getImage <em>Image</em>}</li>
 *   <li>{@link no.inlea.puzzletask.runtime.PuzzlePiece#getPlayerCount <em>Player Count</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzlePiece()
 * @model
 * @generated
 */
public interface PuzzlePiece extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzlePiece_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask.runtime.PuzzlePiece#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Count</em>' attribute.
	 * @see #setPlayerCount(int)
	 * @see no.inlea.puzzletask.runtime.RuntimePackage#getPuzzlePiece_PlayerCount()
	 * @model
	 * @generated
	 */
	int getPlayerCount();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask.runtime.PuzzlePiece#getPlayerCount <em>Player Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Count</em>' attribute.
	 * @see #getPlayerCount()
	 * @generated
	 */
	void setPlayerCount(int value);

} // PuzzlePiece
