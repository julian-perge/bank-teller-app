package test.bank;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.bank.Bank;
import main.bank.BankAccount;

public class BankTest
{
	private Bank myBank = new Bank();
	private Map<String, BankAccount> bankAccounts = new HashMap<String, BankAccount>();
	private BankAccount account1 = new BankAccount("1111", "Checking", new BigDecimal(500.00));
	
/*	@Test
	public void shouldReturnBankAccounts()
	{
<<<<<<< Updated upstream
		BankAccount accSavings = new BankAccount("123", "Savings", new BigDecimal(10.00));
		BankAccount accCheckings = new BankAccount("123", "Checking", new BigDecimal(10.00));
		
		bank.accounts.put("1", accSavings);
		bank.accounts.put("2", accCheckings);
=======
		BankAccount acc = new BankAccount("123", "Savings", new BigDecimal(10.00));
		bank.bankAccounts.put("1", acc);
>>>>>>> Stashed changes
		
		Assert.assertEquals(bank.returnAccounts(), "test");
	}*/
	
	@Test
	public void shouldReturnNewBalance()
	{
		this.myBank.bankAccounts.put("1111", account1);
		
		BigDecimal moneyToAdd = new BigDecimal(500.00);
		BigDecimal balance = this.myBank.bankAccounts.get("1111").getBalance();
		balance = this.myBank.addMonies("1111", moneyToAdd);
		
		Assert.assertEquals(moneyToAdd, balance);
		
	}
	
//	@Test
//	public void shouldReturnNumberOfAccounts()
//	{
//		BankAccount myBank = bank.bankAccounts.put("1111", new BankAccount("", "", new BigDecimal(50.00)));
//		int numOfAccounts = bank.returnAccounts().size();
//		Assert.assertEquals(0, numOfAccounts);
//	}
}
