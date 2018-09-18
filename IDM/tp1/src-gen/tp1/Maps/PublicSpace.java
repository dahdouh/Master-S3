/**
 */
package tp1.Maps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp1.Maps.PublicSpace#getName <em>Name</em>}</li>
 *   <li>{@link tp1.Maps.PublicSpace#getBorderedBy <em>Bordered By</em>}</li>
 * </ul>
 *
 * @see tp1.Maps.NewPackage1Package#getPublicSpace()
 * @model abstract="true"
 * @generated
 */
public interface PublicSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tp1.Maps.NewPackage1Package#getPublicSpace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp1.Maps.PublicSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bordered By</b></em>' reference list.
	 * The list contents are of type {@link tp1.Maps.Road}.
	 * It is bidirectional and its opposite is '{@link tp1.Maps.Road#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bordered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bordered By</em>' reference list.
	 * @see tp1.Maps.NewPackage1Package#getPublicSpace_BorderedBy()
	 * @see tp1.Maps.Road#getBorder
	 * @model opposite="border" required="true"
	 * @generated
	 */
	EList<Road> getBorderedBy();

} // PublicSpace
