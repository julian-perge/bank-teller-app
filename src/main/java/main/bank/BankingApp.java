package main.bank;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		boolean hasTypedExitCode = true;
		BankAccount account1 = new BankAccount("1111", "Checking", new BigDecimal(500.00));
		BankAccount account2 = new BankAccount("2222", "Savings", new BigDecimal(2500.00));
		Bank myBank = new Bank();

		myBank.addBankAccount(account1.getAccountNum(), account1);
		myBank.addBankAccount(account2.getAccountNum(), account2);

		Scanner input = new Scanner(System.in);
		String userInput = "";


		// myBank.addBankAccount("1111", account1);
		// myBank.addBankAccount("2222", account2);
		//
		// System.out.println("Here are your accounts at our bank:");
		// myBank.closeBankAccountNumber("2222");
		// System.out.println(myBank.getBankAccount("1111").getBalance());
		//
		// BigDecimal myBankBalance = myBank.getBankAccount("1111").getBalance();
		// System.out.println("Before: " + myBankBalance + "\n");
		//
		// System.out.println("Enter the amount to deposit:");
		// BigDecimal amountToDeposit = input.nextBigDecimal();
		//
		// myBank.addMonies("1111", amountToDeposit);
		// System.out.println("After: " + myBank.getBankAccount("1111").getBalance());

		do {
			bankMenu();
			userInput = input.nextLine();
			String accountNumber = "";
			
			switch (userInput) {
			case "1":
				// balance
				System.out.println("You want to check balances. \n");
				System.out.println(myBank.getAccountBalance("1111"));

//				if (myBank.getBankAccount(accountNumber) != null) {
//					System.out.println(
//							"Balance of " + accountNumber + " is " + myBank.getBankAccount(accountNumber).getBalance());
//				} else {
//					System.out.println("Wrong answer");
//				}

				break;
				
			case "2":
				//deposit
				break;
				
			case "3":
				// withdraw
				System.out.println("Select the account by (acct num) to perform this transaction.");
				accountNumber = input.nextLine();
				
				System.out.println("Enter the amount to deposit:");
				BigDecimal amountToDeposit = input.nextBigDecimal();
				input.nextLine();
				
				myBank.getBankAccount(accountNumber).addMonies(amountToDeposit);
				

				if (myBank.getBankAccount(accountNumber) != null) {
					BigDecimal myBankBalance = myBank.getBankAccount(accountNumber).getBalance();
					System.out.println("Before: " + myBankBalance + "\n");

					System.out.println("Enter the amount to deposit:");
					BigDecimal amountToDeposit = input.nextBigDecimal();
					input.nextLine();

					//myBankBalance = myBank.addMonies(accountNumber, amountToDeposit);
					System.out.println("After: " + myBankBalance);

					System.out.println("Breaking...");
					break;

				} else {
					System.out.println("Wrong answer");
				}
				
				break;
			case "4":
				// close
				System.out.println("You would like to close an account.\nPlease specify the account number to close:  ");
				userInput = input.nextLine();
				myBank.closeBankAccountNumber(userInput);
				System.out.println("You are closing # " + userInput);
				break;
				
			case "5":
				// add
				System.out.println("Add an account. Please specifiy the acct number you'd like: ");
				userInput = input.nextLine();

				System.out.println("Now the type of acct: Checkings or Savings");
				String userTypeOf = input.nextLine();

				System.out.println("Now balance to add: ");
				BigDecimal userNewBalance = input.nextBigDecimal();
				input.nextLine();

				BankAccount newAccount = new BankAccount(userInput, userTypeOf, userNewBalance);

				myBank.addBankAccount(userInput, newAccount);
			case "0":
				hasTypedExitCode = true;
				break;

			default:
				break;
			}
			hasTypedExitCode = false;

		} while (!hasTypedExitCode);

		// System.out.println("Add type of account");
		// String newTypeOf = input.nextLine();
		//
		// System.out.println("Add money to new account");
		// BigDecimal newBalance = input.nextBigDecimal();
		//
		// BankAccount newAccount = new BankAccount("332323", newTypeOf, newBalance);
		//
		// myBank.addBankAccount(newAccount);
		// System.out.println(newAccount);
		//
		// for (BankAccount entry : myBank.returnAccounts())
		// {
		// System.out.println(entry.getAccountNum() + " " + entry.getType() + " " +
		// entry.getBalance());
		// }

	}

	public static void bankMenu() {
		System.out.println("\nWhat would you like to do?\n" + "Press 1 to check balances\n" + "Press 2 to withdraw\n"
				+ "Press 3 to deposit\n" + "Press 4 to close an account\n" + "Press 5 to add an account\n"
				+ "Press 0 to exit\n");
	}

}
