package main.bank;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bank
{
	public BankAccount bankAcc = new BankAccount("14471", "Checking", new BigDecimal(1.00));
	public Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();
	
	public Collection<BankAccount> returnAccounts()
	{
		for (Entry<String, BankAccount> entry : accounts.entrySet())
		{
			System.out.println(entry.getValue());
		}
		
		return accounts.values();
	}
	
//	public void addBankAccount(BankAccount acc)
//	{
//		accounts.put(acc.getType(), acc);
//	}
}
