/**
 */
package memo.tests;

import junit.textui.TestRunner;

import memo.Automobile;
import memo.MemoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Automobile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomobileTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AutomobileTest.class);
	}

	/**
	 * Constructs a new Automobile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomobileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Automobile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Automobile getFixture() {
		return (Automobile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MemoFactory.eINSTANCE.createAutomobile());
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

} //AutomobileTest
