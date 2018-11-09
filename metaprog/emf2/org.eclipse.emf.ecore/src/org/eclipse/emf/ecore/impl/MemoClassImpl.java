/**
 */
package org.eclipse.emf.ecore.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.MemoClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memo Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.impl.MemoClassImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoClassImpl extends EClassImpl implements MemoClass {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.MEMO_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getInstance() {
		if (instance == null) {
			instance = new EDataTypeUniqueEList<Object>(Object.class, this, EcorePackage.MEMO_CLASS__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.MEMO_CLASS__EANNOTATIONS:
				return getEAnnotations();
			case EcorePackage.MEMO_CLASS__NAME:
				return getName();
			case EcorePackage.MEMO_CLASS__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
			case EcorePackage.MEMO_CLASS__INSTANCE_CLASS:
				return getInstanceClass();
			case EcorePackage.MEMO_CLASS__DEFAULT_VALUE:
				return getDefaultValue();
			case EcorePackage.MEMO_CLASS__INSTANCE_TYPE_NAME:
				return getInstanceTypeName();
			case EcorePackage.MEMO_CLASS__EPACKAGE:
				if (resolve) return getEPackage();
				return basicGetEPackage();
			case EcorePackage.MEMO_CLASS__ETYPE_PARAMETERS:
				return getETypeParameters();
			case EcorePackage.MEMO_CLASS__ABSTRACT:
				return isAbstract();
			case EcorePackage.MEMO_CLASS__INTERFACE:
				return isInterface();
			case EcorePackage.MEMO_CLASS__ESUPER_TYPES:
				return getESuperTypes();
			case EcorePackage.MEMO_CLASS__EOPERATIONS:
				return getEOperations();
			case EcorePackage.MEMO_CLASS__EALL_ATTRIBUTES:
				return getEAllAttributes();
			case EcorePackage.MEMO_CLASS__EALL_REFERENCES:
				return getEAllReferences();
			case EcorePackage.MEMO_CLASS__EREFERENCES:
				return getEReferences();
			case EcorePackage.MEMO_CLASS__EATTRIBUTES:
				return getEAttributes();
			case EcorePackage.MEMO_CLASS__EALL_CONTAINMENTS:
				return getEAllContainments();
			case EcorePackage.MEMO_CLASS__EALL_OPERATIONS:
				return getEAllOperations();
			case EcorePackage.MEMO_CLASS__EALL_STRUCTURAL_FEATURES:
				return getEAllStructuralFeatures();
			case EcorePackage.MEMO_CLASS__EALL_SUPER_TYPES:
				return getEAllSuperTypes();
			case EcorePackage.MEMO_CLASS__EID_ATTRIBUTE:
				return getEIDAttribute();
			case EcorePackage.MEMO_CLASS__ESTRUCTURAL_FEATURES:
				return getEStructuralFeatures();
			case EcorePackage.MEMO_CLASS__EGENERIC_SUPER_TYPES:
				return getEGenericSuperTypes();
			case EcorePackage.MEMO_CLASS__EALL_GENERIC_SUPER_TYPES:
				return getEAllGenericSuperTypes();
			case EcorePackage.MEMO_CLASS__INSTANCE:
				return getInstance();
		}
		return eDynamicGet(featureID, resolve, coreType);
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
			case EcorePackage.MEMO_CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case EcorePackage.MEMO_CLASS__NAME:
				setName((String)newValue);
				return;
			case EcorePackage.MEMO_CLASS__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
				return;
			case EcorePackage.MEMO_CLASS__INSTANCE_TYPE_NAME:
				setInstanceTypeName((String)newValue);
				return;
			case EcorePackage.MEMO_CLASS__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((Collection<? extends ETypeParameter>)newValue);
				return;
			case EcorePackage.MEMO_CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EcorePackage.MEMO_CLASS__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case EcorePackage.MEMO_CLASS__ESUPER_TYPES:
				getESuperTypes().clear();
				getESuperTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case EcorePackage.MEMO_CLASS__EOPERATIONS:
				getEOperations().clear();
				getEOperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case EcorePackage.MEMO_CLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				getEStructuralFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case EcorePackage.MEMO_CLASS__EGENERIC_SUPER_TYPES:
				getEGenericSuperTypes().clear();
				getEGenericSuperTypes().addAll((Collection<? extends EGenericType>)newValue);
				return;
			case EcorePackage.MEMO_CLASS__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends Object>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorePackage.MEMO_CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case EcorePackage.MEMO_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcorePackage.MEMO_CLASS__INSTANCE_CLASS_NAME:
				unsetInstanceClassName();
				return;
			case EcorePackage.MEMO_CLASS__INSTANCE_TYPE_NAME:
				unsetInstanceTypeName();
				return;
			case EcorePackage.MEMO_CLASS__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				return;
			case EcorePackage.MEMO_CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EcorePackage.MEMO_CLASS__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case EcorePackage.MEMO_CLASS__ESUPER_TYPES:
				unsetESuperTypes();
				return;
			case EcorePackage.MEMO_CLASS__EOPERATIONS:
				getEOperations().clear();
				return;
			case EcorePackage.MEMO_CLASS__ESTRUCTURAL_FEATURES:
				getEStructuralFeatures().clear();
				return;
			case EcorePackage.MEMO_CLASS__EGENERIC_SUPER_TYPES:
				unsetEGenericSuperTypes();
				return;
			case EcorePackage.MEMO_CLASS__INSTANCE:
				getInstance().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcorePackage.MEMO_CLASS__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case EcorePackage.MEMO_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcorePackage.MEMO_CLASS__INSTANCE_CLASS_NAME:
				return isSetInstanceClassName();
			case EcorePackage.MEMO_CLASS__INSTANCE_CLASS:
				return getInstanceClass() != null;
			case EcorePackage.MEMO_CLASS__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? getDefaultValue() != null : !DEFAULT_VALUE_EDEFAULT.equals(getDefaultValue());
			case EcorePackage.MEMO_CLASS__INSTANCE_TYPE_NAME:
				return isSetInstanceTypeName();
			case EcorePackage.MEMO_CLASS__EPACKAGE:
				return basicGetEPackage() != null;
			case EcorePackage.MEMO_CLASS__ETYPE_PARAMETERS:
				return eTypeParameters != null && !eTypeParameters.isEmpty();
			case EcorePackage.MEMO_CLASS__ABSTRACT:
				return ((eFlags & ABSTRACT_EFLAG) != 0) != ABSTRACT_EDEFAULT;
			case EcorePackage.MEMO_CLASS__INTERFACE:
				return ((eFlags & INTERFACE_EFLAG) != 0) != INTERFACE_EDEFAULT;
			case EcorePackage.MEMO_CLASS__ESUPER_TYPES:
				return isSetESuperTypes();
			case EcorePackage.MEMO_CLASS__EOPERATIONS:
				return eOperations != null && !eOperations.isEmpty();
			case EcorePackage.MEMO_CLASS__EALL_ATTRIBUTES:
				return !getEAllAttributes().isEmpty();
			case EcorePackage.MEMO_CLASS__EALL_REFERENCES:
				return !getEAllReferences().isEmpty();
			case EcorePackage.MEMO_CLASS__EREFERENCES:
				return !getEReferences().isEmpty();
			case EcorePackage.MEMO_CLASS__EATTRIBUTES:
				return !getEAttributes().isEmpty();
			case EcorePackage.MEMO_CLASS__EALL_CONTAINMENTS:
				return !getEAllContainments().isEmpty();
			case EcorePackage.MEMO_CLASS__EALL_OPERATIONS:
				return !getEAllOperations().isEmpty();
			case EcorePackage.MEMO_CLASS__EALL_STRUCTURAL_FEATURES:
				return !getEAllStructuralFeatures().isEmpty();
			case EcorePackage.MEMO_CLASS__EALL_SUPER_TYPES:
				return !getEAllSuperTypes().isEmpty();
			case EcorePackage.MEMO_CLASS__EID_ATTRIBUTE:
				return getEIDAttribute() != null;
			case EcorePackage.MEMO_CLASS__ESTRUCTURAL_FEATURES:
				return eStructuralFeatures != null && !eStructuralFeatures.isEmpty();
			case EcorePackage.MEMO_CLASS__EGENERIC_SUPER_TYPES:
				return isSetEGenericSuperTypes();
			case EcorePackage.MEMO_CLASS__EALL_GENERIC_SUPER_TYPES:
				return !getEAllGenericSuperTypes().isEmpty();
			case EcorePackage.MEMO_CLASS__INSTANCE:
				return instance != null && !instance.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (instance: ");
		result.append(instance);
		result.append(')');
		return result.toString();
	}

} //MemoClassImpl
