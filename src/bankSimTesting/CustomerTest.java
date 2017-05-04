/**
 * 
 */
package bankSimTesting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Yosvany
 *
 */
public class CustomerTest {

	final private double testExpectedDouble = 0.0;
	final private double testDefaultBalance = 2.2;
	final private double testDefaultDelta = 1.1;
	final private String testCustomerFirstName = "";
	final private String testCustomerSurname = "";
	final private String customerID = "";
	final private String accountDescription = "";
	final private Bank testBank = new Bank(null);
	Account testCustomerAccount;
	Customer testCustomer;
	Customer testDefaultCustomer;

	/**
	 * Test method for {@link bankSimTesting.Customer#Customer(bankSimTesting.Bank, java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testCustomer() {
		
		assertSame(testBank, null);
        assertSame(customerID, null);
        assertSame(testCustomerFirstName, null);
        assertSame(testCustomerSurname, null);
	}

	/**
	 * Test method for {@link bankSimTesting.Customer#ytdFees()}.
	 */
	@Test
	public final void testYtdFees() {
		double testDefaultFee = 2.2;
		assertEquals(testExpectedDouble, testDefaultFee, testDefaultDelta);
	}

	/**
	 * Test method for {@link bankSimTesting.Customer#ytdInterest()}.
	 */
	@Test
	public final void testYtdInterest() {
		double testDefaultInterest = 2.2;
		assertEquals(testExpectedDouble, testDefaultInterest, testDefaultDelta);
	}

	/**
	 * Test method for {@link bankSimTesting.Customer#addSavingsAccount(double, java.lang.String)}.
	 */
	@Test
	public final void testAddSavingsAccount() {
		assertSame(testCustomerAccount, null);
		assertSame(accountDescription, null);
		assertEquals(testExpectedDouble, testDefaultBalance, testDefaultDelta);
		
	}

	/**
	 * Test method for {@link bankSimTesting.Customer#removeAccount(java.lang.String)}.
	 */
	@Test
	public final void testRemoveAccount() {
		String accountID = "";
		assertSame(accountID, "");
	}

}
