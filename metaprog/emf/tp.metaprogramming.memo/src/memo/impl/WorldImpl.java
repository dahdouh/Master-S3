/**
 */
package memo.impl;

import java.util.Collection;

import memo.Automobile;
import memo.MemoPackage;
import memo.Person;
import memo.World;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link memo.impl.WorldImpl#getAutomobiles <em>Automobiles</em>}</li>
 *   <li>{@link memo.impl.WorldImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldImpl extends MemoclassImpl implements World {
	/**
	 * The cached value of the '{@link #getAutomobiles() <em>Automobiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomobiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Automobile> automobiles;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoPackage.Literals.WORLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Automobile> getAutomobiles() {
		if (automobiles == null) {
			automobiles = new EObjectContainmentEList<Automobile>(Automobile.class, this, MemoPackage.WORLD__AUTOMOBILES);
		}
		return automobiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<Person>(Person.class, this, MemoPackage.WORLD__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MemoPackage.WORLD__AUTOMOBILES:
				return ((InternalEList<?>)getAutomobiles()).basicRemove(otherEnd, msgs);
			case MemoPackage.WORLD__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
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
			case MemoPackage.WORLD__AUTOMOBILES:
				return getAutomobiles();
			case MemoPackage.WORLD__POPULATION:
				return getPopulation();
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
			case MemoPackage.WORLD__AUTOMOBILES:
				getAutomobiles().clear();
				getAutomobiles().addAll((Collection<? extends Automobile>)newValue);
				return;
			case MemoPackage.WORLD__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends Person>)newValue);
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
			case MemoPackage.WORLD__AUTOMOBILES:
				getAutomobiles().clear();
				return;
			case MemoPackage.WORLD__POPULATION:
				getPopulation().clear();
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
			case MemoPackage.WORLD__AUTOMOBILES:
				return automobiles != null && !automobiles.isEmpty();
			case MemoPackage.WORLD__POPULATION:
				return population != null && !population.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorldImpl
