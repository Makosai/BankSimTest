/**
 * 
 */
package bankSimTesting;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class AccountTest {

	final private double testExpectedDouble = 0.0;
	final private double testDefaultDelta = 1.1;
	final private double testDefaultBalance = 2.2;
	private double testCurrentBalance = 0.0;
	private double testNewBalance = 5.5;
	final private String testCustomerFirstName = "";
	final private String testCustomerSurname = "";
	final private Bank testBank = new Bank("Bank of Java");
	Customer testCustomer = new Customer(testBank, testCustomerFirstName, testCustomerSurname);
	Customer testCustomerTwo = new Customer(testBank, testCustomerSurname, testCustomerSurname);
	Account testCustomerAccount;
	Account testCustomerAccountTwo;
	Account testExpectedAccount;
	
	/**
	 * Test method for {@link bankSimTesting.Account#deposit(double)}.
	 */
	@Test
	public final void testDeposit() {
		double testDeposit;
		testDeposit = testCurrentBalance + testNewBalance;
		assertSame(testExpectedAccount, testCustomerAccount);
		assertEquals(testCurrentBalance, testDeposit, testDefaultDelta);
	}

	/**
	 * Test method for {@link bankSimTesting.Account#withdraw(double)}.
	 */
	@Test
	public final void testWithdraw() {
		double testWithdrawl;
		testWithdrawl = testCurrentBalance - testNewBalance;
		assertSame(testExpectedAccount, testCustomerAccount);
		assertEquals(testCurrentBalance, testWithdrawl, testDefaultDelta);
	}

	/**
	 * Test method for {@link bankSimTesting.Account#transfer(bankSimTesting.Account, bankSimTesting.Account, double)}.
	 */
	@Test
	public final void testTransfer() {
		double testTransferAmount = testDefaultBalance - testExpectedDouble;
		assertNotSame(testCustomerAccount, testCustomerAccountTwo);
		assertEquals(testTransferAmount, testDefaultBalance, testDefaultDelta);
	}

	/**
	 * Test method for {@link bankSimTesting.Account#Account(bankSimTesting.Customer, double, java.lang.String)}.
	 */
	@Test
	public final void testAccount() {
		LocalDateTime creationDate = LocalDateTime.now();
		boolean accountID = new String("").equals("1");
		assertSame(testCustomer, testCustomerTwo);
		assertSame(creationDate, 0.0);
		assertSame(accountID, "0");
	}

}
