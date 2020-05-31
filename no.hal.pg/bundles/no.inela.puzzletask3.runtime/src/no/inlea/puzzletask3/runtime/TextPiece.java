/**
 */
package no.inlea.puzzletask3.runtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask3.runtime.TextPiece#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getTextPiece()
 * @model
 * @generated
 */
public interface TextPiece extends PuzzlePiece {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see no.inlea.puzzletask3.runtime.RuntimePackage#getTextPiece_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link no.inlea.puzzletask3.runtime.TextPiece#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextPiece
