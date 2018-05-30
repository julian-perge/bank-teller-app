package test.bank;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import main.bank.BankAccount;

public class BankAccountTest
{
	BankAccount newBankAccount = new BankAccount("14471", 
													"Checking", 
													new BigDecimal(1.00));
	
	@Test
	public void shouldReturnAccountNumber()
	{
		String testExpectedBankAccountNumber = newBankAccount.getAccountNum();
		
		Assert.assertEquals(testExpectedBankAccountNumber, "14471");
	}
	
	@Test
	public void shouldReturnTypeOfBankAccount()
	{
		String testExpectedTypeOfBankAccount = newBankAccount.getType(); 
				//newBankAccount.getAccountNum();
		Assert.assertEquals(testExpectedTypeOfBankAccount, "Checking");
	}
	
	@Test
	public void shouldReturnAccountBalance()
	{
		BigDecimal testExpectedBankAccountBalance = newBankAccount.getBalance();
			//= newBankAccount.getAccountNum();
		Assert.assertEquals(testExpectedBankAccountBalance, new BigDecimal(1.00));
	}
}
