package main.bank;
import java.math.BigDecimal;

public class BankAccount
{
	public String getAccountNum()
	{
		return accountNum;
	}

	public String getType()
	{
		return type;
	}

	public BigDecimal getBalance()
	{
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
