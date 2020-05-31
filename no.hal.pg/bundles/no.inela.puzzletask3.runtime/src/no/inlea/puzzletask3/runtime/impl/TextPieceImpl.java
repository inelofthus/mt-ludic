/**
 */
package no.inlea.puzzletask3.runtime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.inlea.puzzletask3.runtime.RuntimePackage;
import no.inlea.puzzletask3.runtime.TextPiece;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.TextPieceImpl#getHtml <em>Html</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.TextPieceImpl#getPlayerCount <em>Player Count</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.TextPieceImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.TextPieceImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextPieceImpl extends MinimalEObjectImpl.Container implements TextPiece {
	/**
	 * The default value of the '{@link #getHtml() <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPlayerCount() <em>Player Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlayerCount() <em>Player Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerCount()
	 * @generated
	 * @ordered
	 */
	protected int playerCount = PLAYER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.TEXT_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtml() {
		// TODO: implement this method to return the 'Html' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlayerCount() {
		return playerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerCount(int newPlayerCount) {
		int oldPlayerCount = playerCount;
		playerCount = newPlayerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TEXT_PIECE__PLAYER_COUNT, oldPlayerCount, playerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TEXT_PIECE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TEXT_PIECE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.TEXT_PIECE__HTML:
				return getHtml();
			case RuntimePackage.TEXT_PIECE__PLAYER_COUNT:
				return getPlayerCount();
			case RuntimePackage.TEXT_PIECE__NAME:
				return getName();
			case RuntimePackage.TEXT_PIECE__TEXT:
				return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.TEXT_PIECE__PLAYER_COUNT:
				setPlayerCount((Integer)newValue);
				return;
			case RuntimePackage.TEXT_PIECE__NAME:
				setName((String)newValue);
				return;
			case RuntimePackage.TEXT_PIECE__TEXT:
				setText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.TEXT_PIECE__PLAYER_COUNT:
				setPlayerCount(PLAYER_COUNT_EDEFAULT);
				return;
			case RuntimePackage.TEXT_PIECE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RuntimePackage.TEXT_PIECE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.TEXT_PIECE__HTML:
				return HTML_EDEFAULT == null ? getHtml() != null : !HTML_EDEFAULT.equals(getHtml());
			case RuntimePackage.TEXT_PIECE__PLAYER_COUNT:
				return playerCount != PLAYER_COUNT_EDEFAULT;
			case RuntimePackage.TEXT_PIECE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RuntimePackage.TEXT_PIECE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (playerCount: ");
		result.append(playerCount);
		result.append(", name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //TextPieceImpl
