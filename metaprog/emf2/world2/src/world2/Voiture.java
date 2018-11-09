/**
 */
package world2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link world2.Voiture#getMarque <em>Marque</em>}</li>
 * </ul>
 *
 * @see world2.World2Package#getVoiture()
 * @model
 * @generated
 */
public interface Voiture extends EObject {
	/**
	 * Returns the value of the '<em><b>Marque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marque</em>' attribute.
	 * @see #setMarque(String)
	 * @see world2.World2Package#getVoiture_Marque()
	 * @model
	 * @generated
	 */
	String getMarque();

	/**
	 * Sets the value of the '{@link world2.Voiture#getMarque <em>Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marque</em>' attribute.
	 * @see #getMarque()
	 * @generated
	 */
	void setMarque(String value);

} // Voiture
