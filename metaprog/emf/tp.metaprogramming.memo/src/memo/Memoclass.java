/**
 */
package memo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memoclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link memo.Memoclass#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see memo.MemoPackage#getMemoclass()
 * @model abstract="true"
 * @generated
 */
public interface Memoclass extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' attribute list.
	 * @see memo.MemoPackage#getMemoclass_Instances()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<Object> getInstances();

} // Memoclass
