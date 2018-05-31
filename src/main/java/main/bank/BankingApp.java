package main.bank;
import java.math.BigDecimal;
import java.util.Scanner;

public class BankingApp
{

	public static void main(String[] args)
	{
		Bank myBank = new Bank();
		
		Scanner input = new Scanner(System.in);

		BankAccount account1 = new BankAccount("1111", "Checking", new BigDecimal(500.00));
		BankAccount account2 = new BankAccount("2222", "Savings", new BigDecimal(2500.00));
		
		myBank.bankAccounts.put("1111", account1);
		myBank.bankAccounts.put("2222", account2);
		
		System.out.println("Here are your accounts at our bank:");
		for (BankAccount entry : myBank.returnAccounts())
		{
			System.out.println(entry.getType() + " " + entry.getBalance());
		}
		
		System.out.println("What would you like to do?");
		bankMenu();
		String userInput = input.nextLine();
		
		switch (userInput)
		{
			case "1":
				System.out.println("You want to check balances. Of which account do you want to check?\n");
				listAllBankAccounts(myBank);
				String acctToCheck = input.nextLine();
				
				if (myBank.bankAccounts.containsKey(acctToCheck) )
				{
					System.out.println("Balance of " + acctToCheck + " is " + myBank.getBankAccount(acctToCheck).getBalance());
				}
				else
				{
					System.out.println("Wrong answer");
				}
				
				break;
			case "2":
				
				listAllBankAccounts(myBank);
				break;
			case "3":
				
				listAllBankAccounts(myBank);
				break;
			case "4":
				System.out.println("You would like to close an account");
				break;
			case "0":
				
				break;

			default:
				break;
		}
		
//		System.out.println("Add type of account");
//		String newTypeOf = input.nextLine();
//		
//		System.out.println("Add money to new account");
//		BigDecimal newBalance = input.nextBigDecimal();
//		
//		BankAccount newAccount = new BankAccount("332323", newTypeOf, newBalance);
//		
//		myBank.addBankAccount(newAccount);
//		System.out.println(newAccount);
//		
//		for (BankAccount entry : myBank.returnAccounts())
//		{
//			System.out.println(entry.getAccountNum() + " " + entry.getType() + " " + entry.getBalance());
//		}
		
	}

	private static void listAllBankAccounts(Bank myBank)
	{
		System.out.println("Here are your accounts");
		for (BankAccount entry : myBank.returnAccounts())
		{
			System.out.println("(" +entry.getAccountNum() + ") " 
							+ entry.getType() + " " 
							+ entry.getBalance());
		}
	}
	
	public static void bankMenu()
	{
		System.out.println("Press 1 to deposit\n"
						+ "Press 2 to withdraw\n"
						+ "Press 3 to check balance\n"
						+ "Press 4 to close an account\n"
						+ "Press 0 to exit\n");
	}

}
