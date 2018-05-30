package test.bank;
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import main.bank.Bank;
import main.bank.BankAccount;

public class BankTest
{
	Bank bank = new Bank();
	
	@Test
	public void shouldReturnBankAccounts()
	{
		BankAccount acc = new BankAccount("123", "Savings", new BigDecimal(10.00));
		bank.accounts.put("1", acc);
		
		Assert.assertEquals(bank.returnAccounts(), "test");
	}
	
	@Test
	public void shouldReturnAddedAccounts()
	{
		
		Assert.assertEquals(bank.bankAcc.getType(), "test");
	}
}
