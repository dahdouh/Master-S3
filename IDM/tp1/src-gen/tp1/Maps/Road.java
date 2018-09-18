/**
 */
package tp1.Maps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp1.Maps.Road#getBorder <em>Border</em>}</li>
 *   <li>{@link tp1.Maps.Road#getName <em>Name</em>}</li>
 *   <li>{@link tp1.Maps.Road#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see tp1.Maps.NewPackage1Package#getRoad()
 * @model abstract="true"
 * @generated
 */
public interface Road extends EObject {
	/**
	 * Returns the value of the '<em><b>Border</b></em>' reference list.
	 * The list contents are of type {@link tp1.Maps.PublicSpace}.
	 * It is bidirectional and its opposite is '{@link tp1.Maps.PublicSpace#getBorderedBy <em>Bordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' reference list.
	 * @see tp1.Maps.NewPackage1Package#getRoad_Border()
	 * @see tp1.Maps.PublicSpace#getBorderedBy
	 * @model opposite="borderedBy"
	 * @generated
	 */
	EList<PublicSpace> getBorder();

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
	 * @see tp1.Maps.NewPackage1Package#getRoad_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp1.Maps.Road#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see tp1.Maps.NewPackage1Package#getRoad_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link tp1.Maps.Road#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Road
