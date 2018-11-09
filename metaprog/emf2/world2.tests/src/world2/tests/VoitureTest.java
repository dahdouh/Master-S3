/**
 */
package world2.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import world2.Voiture;
import world2.World2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VoitureTest extends TestCase {

	/**
	 * The fixture for this Voiture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Voiture fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VoitureTest.class);
	}

	/**
	 * Constructs a new Voiture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoitureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Voiture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Voiture fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Voiture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Voiture getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(World2Factory.eINSTANCE.createVoiture());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VoitureTest
