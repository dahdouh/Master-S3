/**
 */
package memo.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>memo</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MemoTests("memo Tests");
		suite.addTestSuite(WorldTest.class);
		suite.addTestSuite(PersonTest.class);
		suite.addTestSuite(AutomobileTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoTests(String name) {
		super(name);
	}

} //MemoTests
