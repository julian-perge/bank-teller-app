package main.bank;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bank
{
	private Map<String, BankAccount> bankAccounts = new HashMap<String, BankAccount>();

	public Collection<BankAccount> returnAccounts()
	{	
		return bankAccounts.values();
	}
	
	public BigDecimal getAccountBalance(String acctNum)
	{
		for (BankAccount entry : returnAccounts()) {
			System.out.println(entry.getAccountNum() + " " + entry.getType() + " " + entry.getBalance());
		}
		
		return bankAccounts.get(acctNum).getBalance();
	}
	
	public void addBankAccount(String acctNum, BankAccount newAccount)
	{
		bankAccounts.put(acctNum, newAccount);
	}
	
	public BankAccount getBankAccount(String acctNum)
	{
		return bankAccounts.get(acctNum);
	}
	
	public void closeBankAccountNumber(String acctNum)
	{
		bankAccounts.remove(acctNum);
	}
}
