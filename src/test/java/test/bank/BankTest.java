package test.bank;
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.bank.Bank;
import main.bank.BankAccount;

public class BankTest
{
	Bank bank = new Bank();
	
	@Before
	public void setUp()
	{
	}
	
/*	@Test
	public void shouldReturnBankAccounts()
	{
		BankAccount accSavings = new BankAccount("123", "Savings", new BigDecimal(10.00));
		BankAccount accCheckings = new BankAccount("123", "Checking", new BigDecimal(10.00));
		
		bank.accounts.put("1", accSavings);
		bank.accounts.put("2", accCheckings);
		
		Assert.assertEquals(bank.returnAccounts(), "test");
	}*/
	
	@Test
	public void shouldReturnNumberOfAccounts()
	{
		BankAccount myBank = bank.bankAccounts.put("1111", new BankAccount("", "", new BigDecimal(50.00)));
		int numOfAccounts = bank.returnAccounts().size();
		Assert.assertEquals(0, numOfAccounts);
	}
}
