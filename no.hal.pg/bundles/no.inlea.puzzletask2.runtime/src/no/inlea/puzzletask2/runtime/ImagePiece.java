/**
 */
package no.inlea.puzzletask2.runtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask2.runtime.ImagePiece#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link no.inlea.puzzletask2.runtime.ImagePiece#getAltText <em>Alt Text</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getImagePiece()
 * @model
 * @generated
 */
public interface ImagePiece extends PuzzlePiece {
	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getImagePiece_ImageUrl()
	 * @model
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask2.runtime.ImagePiece#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Alt Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Text</em>' attribute.
	 * @see #setAltText(String)
	 * @see no.inlea.puzzletask2.runtime.RuntimePackage#getImagePiece_AltText()
	 * @model
	 * @generated
	 */
	String getAltText();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask2.runtime.ImagePiece#getAltText <em>Alt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Text</em>' attribute.
	 * @see #getAltText()
	 * @generated
	 */
	void setAltText(String value);

} // ImagePiece
