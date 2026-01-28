package com.example;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionMenu extends Account {

	Scanner s = new Scanner(System.in);
	
	HashMap<Integer, Integer> data = new HashMap<>();
	
	void getLogin() {
		
		data.put(11111, 111);
		data.put(11112, 222);
		data.put(11113, 333);
		data.put(11114, 111);
		data.put(11115, 222);
		
		do {
				System.out.println("Welcome to the ATM!");
				System.out.print("Enter your Customer Number: ");
			try {				
				setCustNo(s.nextInt());
				System.out.print("Enter your PIN: ");
				setPinNo(s.nextInt());

				int custNo = getCustNo();
				int pinNo = getPinNo();

				if (data.containsKey(custNo) && data.get(custNo) == pinNo) {
					getAccountType();
				} else {
					System.out.println("\nIncorrect Account Number OR PIN");
					System.out.println("-------------------------------");
					System.out.println("-------------------------------\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("Account number consists of only numbers");
				System.out.println("-------------------------------");
				System.out.println("-------------------------------\n");
				s.nextLine();
			} 
		} while (true);
	}
	
	void getAccountType() {
		System.out.println("\nSelect the ACCOUNT TYPE:\n");
		System.out.println("1. Current");
		System.out.println("2. Savings");
		System.out.println("3. EXIT");
		System.out.print("Your Choice: ");
		
		try {
			switch(s.nextInt()) {
			case 1:
				getCurrent();
				break;
				
			case 2:
				getSaving();
				break;
				
			case 3:
				System.out.println("\nGenerating Final Receipt...");
				Transaction t = new Transaction(); // Using the new class
				t.generateReceipt(0.00, "End Session"); 
				break;

			case 4:
				System.out.println("\nThank You for using this ATM. \nVISIT AGAIN!");
				System.out.println("-------------------------------");
				System.out.println("-------------------------------\n");
				break;
				
				default:
					System.out.println("\nInvalid Choice");
					System.out.println("Please enter a valid choice!");
					System.out.println("-------------------------------");
					System.out.println("-------------------------------");
					getAccountType();
					break;
			}
		} catch (InputMismatchException e) {
			System.out.println("\nInvalid Choice");
			System.out.println("Please enter a valid choice!");
			System.out.println("-------------------------------");
			System.out.println("-------------------------------\n");
			s.nextLine();
		}
		
	}

	void getCurrent() {
		System.out.println("\nCURRENT ACCOUNT----------\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");
		System.out.print("Your Choice: ");
		
		try {
			switch(s.nextInt()) {
			case 1:
				getCurrBal();
				getAccountType();
				break;
				
			case 2:
				getCurrWithdrawInput();
				getAccountType();
				break;
				
			case 3:
				getCurrDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("\nThank You for using this ATM. \nVISIT AGAIN!");
				System.out.println("-------------------------------");
				System.out.println("-------------------------------\n");
				break;
				
				default:
					System.out.println("\nInvalid Choice");
					System.out.println("Please enter a valid choice!");
					System.out.println("-------------------------------");
					System.out.println("-------------------------------");
					getCurrent();
					break;
			}
		} catch (InputMismatchException e) {
			System.out.println("\nInvalid Choice");
			System.out.println("Please enter a valid choice!");
			System.out.println("-------------------------------");
			System.out.println("-------------------------------");
			s.nextLine();
			getCurrent();
		}
	}
	
	void getSaving() {
		System.out.println("\nSAVINGS ACCOUNT----------\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Transfer Funds to Current"); // NEW OPTION
		System.out.println("5. EXIT");
		System.out.print("Your Choice: ");
		
		try {
			switch(s.nextInt()) {
			case 1:
				getSavBal();
				getAccountType();
				break;
				
			case 2:
				getSavWithdrawInput();
				getAccountType();
				break;
				
			case 3:
				getSavDepositInput();
				getAccountType();
				break;
				

			case 4: // NEW CASE
				getTransferInput();
				getAccountType();
				break;

			case 5: // CHANGED FROM 4 TO 5
				System.out.println("\nThank You for using this ATM. \nVISIT AGAIN!");
				System.out.println("-------------------------------");
				System.out.println("-------------------------------\n");
				break;
				
				default:
					System.out.println("\nInvalid Choice");
					System.out.println("Please enter a valid choice!");
					System.out.println("-------------------------------");
					System.out.println("-------------------------------");
					getCurrent();
					break;
			}
		} catch (InputMismatchException e) {
			System.out.println("\nInvalid Choice");
			System.out.println("Please enter a valid choice!");
			System.out.println("-------------------------------");
			System.out.println("-------------------------------");
			s.nextLine();
			getCurrent();
		}
	}
}
