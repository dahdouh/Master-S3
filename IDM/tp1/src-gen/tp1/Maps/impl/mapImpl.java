/**
 */
package tp1.Maps.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp1.Maps.NewPackage1Package;
import tp1.Maps.PublicSpace;
import tp1.Maps.Road;
import tp1.Maps.map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tp1.Maps.impl.mapImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp1.Maps.impl.mapImpl#getRoads <em>Roads</em>}</li>
 *   <li>{@link tp1.Maps.impl.mapImpl#getSpaces <em>Spaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class mapImpl extends MinimalEObjectImpl.Container implements map {
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
	 * The cached value of the '{@link #getRoads() <em>Roads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoads()
	 * @generated
	 * @ordered
	 */
	protected EList<Road> roads;

	/**
	 * The cached value of the '{@link #getSpaces() <em>Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicSpace> spaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage1Package.MAP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Road> getRoads() {
		if (roads == null) {
			roads = new EObjectContainmentEList<Road>(Road.class, this, NewPackage1Package.MAP__ROADS);
		}
		return roads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublicSpace> getSpaces() {
		if (spaces == null) {
			spaces = new EObjectContainmentEList<PublicSpace>(PublicSpace.class, this, NewPackage1Package.MAP__SPACES);
		}
		return spaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NewPackage1Package.MAP__ROADS:
			return ((InternalEList<?>) getRoads()).basicRemove(otherEnd, msgs);
		case NewPackage1Package.MAP__SPACES:
			return ((InternalEList<?>) getSpaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NewPackage1Package.MAP__NAME:
			return getName();
		case NewPackage1Package.MAP__ROADS:
			return getRoads();
		case NewPackage1Package.MAP__SPACES:
			return getSpaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NewPackage1Package.MAP__NAME:
			setName((String) newValue);
			return;
		case NewPackage1Package.MAP__ROADS:
			getRoads().clear();
			getRoads().addAll((Collection<? extends Road>) newValue);
			return;
		case NewPackage1Package.MAP__SPACES:
			getSpaces().clear();
			getSpaces().addAll((Collection<? extends PublicSpace>) newValue);
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
		case NewPackage1Package.MAP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case NewPackage1Package.MAP__ROADS:
			getRoads().clear();
			return;
		case NewPackage1Package.MAP__SPACES:
			getSpaces().clear();
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
		case NewPackage1Package.MAP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case NewPackage1Package.MAP__ROADS:
			return roads != null && !roads.isEmpty();
		case NewPackage1Package.MAP__SPACES:
			return spaces != null && !spaces.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //mapImpl
