package main.bank;
import java.math.BigDecimal;

public class BankAccount
{
	public String getAccountNum()
	{
		return this.accountNum;
	}

	public String getType()
	{
		return this.type;
	}

	public BigDecimal getBalance()
	{
		return this.balance;
	}
	
	public BigDecimal addMonies(BigDecimal moniesToBeAdded)
	{
		balance = balance.add(moniesToBeAdded);
		
		return balance;
	}

	private String accountNum = "";
	private String type = "";
	private BigDecimal balance = new BigDecimal(0.00);
	
	public BankAccount(String accNum, String typeOf, BigDecimal balance)
	{
		this.accountNum = accNum;
		this.type = typeOf;
		this.balance = balance;
	}
}
