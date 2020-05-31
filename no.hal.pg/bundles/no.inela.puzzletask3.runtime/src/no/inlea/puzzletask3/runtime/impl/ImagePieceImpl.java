/**
 */
package no.inlea.puzzletask3.runtime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.inlea.puzzletask3.runtime.ImagePiece;
import no.inlea.puzzletask3.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.ImagePieceImpl#getHtml <em>Html</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.ImagePieceImpl#getPlayerCount <em>Player Count</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.ImagePieceImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.ImagePieceImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link no.inlea.puzzletask3.runtime.impl.ImagePieceImpl#getAltText <em>Alt Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagePieceImpl extends MinimalEObjectImpl.Container implements ImagePiece {
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
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltText() <em>Alt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltText()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltText() <em>Alt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltText()
	 * @generated
	 * @ordered
	 */
	protected String altText = ALT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagePieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.IMAGE_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getHtml() {
		return "<img src=\"" + imageUrl + "\" alt=\"" + getName() + "\">";
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IMAGE_PIECE__PLAYER_COUNT, oldPlayerCount, playerCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IMAGE_PIECE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		String oldImageUrl = imageUrl;
		imageUrl = newImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IMAGE_PIECE__IMAGE_URL, oldImageUrl, imageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAltText() {
		return altText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltText(String newAltText) {
		String oldAltText = altText;
		altText = newAltText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IMAGE_PIECE__ALT_TEXT, oldAltText, altText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.IMAGE_PIECE__HTML:
				return getHtml();
			case RuntimePackage.IMAGE_PIECE__PLAYER_COUNT:
				return getPlayerCount();
			case RuntimePackage.IMAGE_PIECE__NAME:
				return getName();
			case RuntimePackage.IMAGE_PIECE__IMAGE_URL:
				return getImageUrl();
			case RuntimePackage.IMAGE_PIECE__ALT_TEXT:
				return getAltText();
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
			case RuntimePackage.IMAGE_PIECE__PLAYER_COUNT:
				setPlayerCount((Integer)newValue);
				return;
			case RuntimePackage.IMAGE_PIECE__NAME:
				setName((String)newValue);
				return;
			case RuntimePackage.IMAGE_PIECE__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case RuntimePackage.IMAGE_PIECE__ALT_TEXT:
				setAltText((String)newValue);
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
			case RuntimePackage.IMAGE_PIECE__PLAYER_COUNT:
				setPlayerCount(PLAYER_COUNT_EDEFAULT);
				return;
			case RuntimePackage.IMAGE_PIECE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RuntimePackage.IMAGE_PIECE__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case RuntimePackage.IMAGE_PIECE__ALT_TEXT:
				setAltText(ALT_TEXT_EDEFAULT);
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
			case RuntimePackage.IMAGE_PIECE__HTML:
				return HTML_EDEFAULT == null ? getHtml() != null : !HTML_EDEFAULT.equals(getHtml());
			case RuntimePackage.IMAGE_PIECE__PLAYER_COUNT:
				return playerCount != PLAYER_COUNT_EDEFAULT;
			case RuntimePackage.IMAGE_PIECE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RuntimePackage.IMAGE_PIECE__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
			case RuntimePackage.IMAGE_PIECE__ALT_TEXT:
				return ALT_TEXT_EDEFAULT == null ? altText != null : !ALT_TEXT_EDEFAULT.equals(altText);
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
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(", altText: ");
		result.append(altText);
		result.append(')');
		return result.toString();
	}

} //ImagePieceImpl
