package bankSimTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	
	final private String testDefaultString = "Default";
	final private int testDefaultInt = 0;
	
	/**
	 * Test method for {@link bankSimTesting.Bank#Bank(java.lang.String)}.
	 */
	@Test
	public void testBank() {
		boolean testName = new String(testDefaultString).equals("");
		assertTrue(testName);
	}
	
	/**
	 * Test method for {@link bankSimTesting.Bank#addAccountWizard()}.
	 */
	@Test
	public void testAddAccountWizard() {
		int[] testAccountID = { 0, 1, 2 };
		int[] testOpenID = {testDefaultInt};
		boolean testCustomerName = new String(testDefaultString).equals("");
		assertArrayEquals("Checks for next available ID", testAccountID, testOpenID);
		assertTrue(testCustomerName);
	}

	/**
	 * Test method for {@link bankSimTesting.Bank#addCustomer(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddCustomer() {
		boolean testCustomerSurname = new String(testDefaultString).equals("");
		boolean testCustomerFirstName = new String(testDefaultString).equals("");
		int testCustomerID = 0;
		int testCustomerCurrent = 0;
		assertTrue(testCustomerSurname);
		assertTrue(testCustomerFirstName);
		assertEquals(testCustomerID, testDefaultInt);
		assertEquals(testCustomerCurrent, testDefaultInt);
	}

	/**
	 * Test method for {@link bankSimTesting.Bank#removeCustomer(java.lang.String)}.
	 */
	@Test
	public void testRemoveCustomer() {
		int testCustomerCurrent = 1;
		assertEquals(testCustomerCurrent, testDefaultInt);
	}

}
