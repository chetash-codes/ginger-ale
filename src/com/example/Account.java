package com.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	Scanner s = new Scanner(System.in);
	
	DecimalFormat df = new DecimalFormat("###,##0.00 'Rs'");
	private int custNo;
	private int pinNo;
	double currBal = 2000;
	double savBal = 1000;
	
	void setCustNo (int custNo) {
		this.custNo = custNo;
	}
	
	void setPinNo (int pinNo) {
		this.pinNo = pinNo;
	}
	
	int getCustNo () {
		return custNo;
	}
	
	int getPinNo () {
		return pinNo;
	}
	
	void getCurrBal() {
		System.out.println("\nCURRENT ACCOUNT----------");
		System.out.println("Account Balance: " + df.format(currBal));
		System.out.println();
	}
	
	void getSavBal() {
		System.out.println("\nSAVINGS ACCOUNT----------");
		System.out.println("Account Balance: " + df.format(savBal));
		System.out.println();
	}
	
	void getCurrWithdrawInput() {
		System.out.println("\nAccount Balance: " + df.format(currBal));
		System.out.println("Enter the amount you want to withdraw : ");
		double amount = s.nextDouble();
		if((currBal - amount) >= 0) {
			calcCurrWithdraw(amount);
			System.out.println("\nTransaction Successful!");
			System.out.println("Account Balance: " + df.format(currBal));
		} else {
			System.out.println("\nInsufficient Balance!");
		}
	}
	
	void getCurrDepositInput() {
		System.out.println("\nAccount Balance: " + df.format(currBal));
		System.out.println("Enter the amount you want to deposit : ");
		double amount = s.nextDouble();
		calcCurrDeposit(amount);
		System.out.println("\nAmount Deposited Successfully!");
		System.out.println("Account Balance: " + df.format(currBal));
	}
	
	double calcCurrWithdraw(double amt) {
		currBal = currBal - amt;
		return currBal;
	}
	
	double calcCurrDeposit(double amt) {
		currBal = currBal + amt;
		return currBal;
	}
	
	void getSavWithdrawInput() {
		System.out.println("\nAccount Balance: " + df.format(savBal));
		System.out.println("Enter the amount you want to withdraw : ");
		double amount = s.nextDouble();
		if((savBal - amount) >= 0) {
			calcSavWithdraw(amount);
			System.out.println("\nTransaction Successful!");
			System.out.println("Account Balance: " + df.format(savBal));
		} else {
			System.out.println("\nInsufficient Balance!");
		}
	}
	
	void getSavDepositInput() {
		System.out.println("\nAccount Balance: " + df.format(savBal));
		System.out.println("Enter the amount you want to deposit : ");
		double amount = s.nextDouble();
		calcSavDeposit(amount);
		System.out.println("\nAmount Deposited Successfully!");
		System.out.println("Account Balance: " + df.format(savBal));
	}
	
	void calcSavWithdraw(double amt) {
		savBal = savBal - amt;
	}
	
	void calcSavDeposit(double amt) {
		savBal = savBal + amt;
	}
}







