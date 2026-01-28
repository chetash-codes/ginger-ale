package com.example;

import java.util.Random;

public class Transaction {
	
	public void generateReceipt(double amount, String type) {
		Random rand = new Random();
		int receiptNo = rand.nextInt(900000) + 100000; // Random 6 digit number
		
		System.out.println("\n--- TRANSACTION RECEIPT ---");
		System.out.println("Receipt No : " + receiptNo);
		System.out.println("Type       : " + type);
		System.out.println("Amount     : " + amount);
		System.out.println("Date       : " + java.time.LocalDate.now());
		System.out.println("---------------------------");
		System.out.println("Thank you for banking with us!");
		System.out.println("---------------------------\n");
	}
}