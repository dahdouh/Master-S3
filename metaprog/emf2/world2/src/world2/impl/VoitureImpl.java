/**
 */
package world2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import world2.Voiture;
import world2.World2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link world2.impl.VoitureImpl#getMarque <em>Marque</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoitureImpl extends MinimalEObjectImpl.Container implements Voiture {
	/**
	 * The default value of the '{@link #getMarque() <em>Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarque()
	 * @generated
	 * @ordered
	 */
	protected static final String MARQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarque() <em>Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarque()
	 * @generated
	 * @ordered
	 */
	protected String marque = MARQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoitureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return World2Package.Literals.VOITURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarque(String newMarque) {
		String oldMarque = marque;
		marque = newMarque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, World2Package.VOITURE__MARQUE, oldMarque, marque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case World2Package.VOITURE__MARQUE:
				return getMarque();
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
			case World2Package.VOITURE__MARQUE:
				setMarque((String)newValue);
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
			case World2Package.VOITURE__MARQUE:
				setMarque(MARQUE_EDEFAULT);
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
			case World2Package.VOITURE__MARQUE:
				return MARQUE_EDEFAULT == null ? marque != null : !MARQUE_EDEFAULT.equals(marque);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Marque: ");
		result.append(marque);
		result.append(')');
		return result.toString();
	}

} //VoitureImpl
