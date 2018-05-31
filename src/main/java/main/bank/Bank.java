package main.bank;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bank
{
	//public BankAccount bankAcc = new BankAccount("14471", "Checking", new BigDecimal(1.00));
	public Map<String, BankAccount> bankAccounts = new HashMap<String, BankAccount>();
	
	public Collection<BankAccount> returnAccounts()
	{	
		return bankAccounts.values();
	}
	
	public void addBankAccount(BankAccount newAccount)
	{
		bankAccounts.put("4444", newAccount);
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
