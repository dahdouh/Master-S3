/**
 */
package memo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link memo.World#getAutomobiles <em>Automobiles</em>}</li>
 *   <li>{@link memo.World#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see memo.MemoPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends Memoclass {
	/**
	 * Returns the value of the '<em><b>Automobiles</b></em>' containment reference list.
	 * The list contents are of type {@link memo.Automobile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automobiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automobiles</em>' containment reference list.
	 * @see memo.MemoPackage#getWorld_Automobiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Automobile> getAutomobiles();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link memo.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see memo.MemoPackage#getWorld_Population()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPopulation();

} // World
