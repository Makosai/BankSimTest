package bankSimTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingsAccountTest {
	
	private double testCurrentBalance = 0.0;
	private double testNewBalance = 5.5;
	private double testDeposit;
	private double testWithdrawl;
	private double testDefaultDelta = 1.1;
	private double testGreatInterestRate = 0.2;
	Account testCustomerSavingsAccount;

	/**
	 * Test method for {@link bankSimTesting.SavingsAccount#}.
	 */
	@Test
	public final void testDeposit() {
		testDeposit = testCurrentBalance + testNewBalance;
		assertSame(testCustomerSavingsAccount, null);
		assertEquals(testCurrentBalance, testDeposit, testDefaultDelta);
	}

	/**
	 * Test method for {@link bankSimTesting.SavingsAccount#}.
	 */
	@Test
	public final void testWithdraw() {
		testWithdrawl = testCurrentBalance - testNewBalance;
		assertSame(testCustomerSavingsAccount, null);
		assertEquals(testCurrentBalance, testWithdrawl, testDefaultDelta);
	}

	/**
	 * Test method for {@link bankSimTesting.SavingsAccount#}.
	 */
	@Test
	public final void testAddInterestTransaction() {
		double testBalanceWithInterest = testCurrentBalance * testGreatInterestRate;
		assertSame(testCustomerSavingsAccount, null);
		assertEquals(testBalanceWithInterest, testNewBalance, testDefaultDelta);
	}

}
