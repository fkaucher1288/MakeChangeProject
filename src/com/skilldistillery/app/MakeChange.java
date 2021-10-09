package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tender = 0;

		System.out.println("Amount: ");
		double price = sc.nextDouble();
		
		do {
			System.out.println("Tendered: ");
			tender = sc.nextDouble();

			if (tender < price) {
				System.out.println("Error: Insufficient funds");
			}

		} while (tender < price);

		double amount = tender - price;

		int remainingBalance = (int) (amount * 100);

		int numOfTwenty = remainingBalance / 2000;
		remainingBalance = remainingBalance % 2000;

		if (numOfTwenty > 0) {
			System.out.println(numOfTwenty + " twenties ");
		}

		int numOfTen = remainingBalance / 1000;
		remainingBalance = remainingBalance % 1000;
		
		if (numOfTen > 0) {
			System.out.println(numOfTen + " tens ");
		}

		int numOfFive = remainingBalance / 500;
		remainingBalance = remainingBalance % 500;
		
		if (numOfFive > 0) {
			System.out.println(numOfFive + " fives ");
		}

		int numOfOne = remainingBalance / 100;
		remainingBalance = remainingBalance % 100;
		
		if (numOfOne > 0) {
			System.out.println(numOfOne + " ones ");
		}

		int numOfQuarter = remainingBalance / 25;
		remainingBalance = remainingBalance % 25;
		
		if (numOfQuarter > 0) {
			System.out.println(numOfQuarter + " quarters ");
		}

		int numOfDime = remainingBalance / 10;
		remainingBalance = remainingBalance % 10;
		
		if (numOfDime > 0) {
			System.out.println(numOfDime + " dimes ");
		}

		int numOfNickel = remainingBalance / 5;
		remainingBalance = remainingBalance % 5;
		
		if (numOfNickel > 0) {
			System.out.println(numOfNickel + " nickels ");
		}

		int numOfPenny = remainingBalance;
		remainingBalance = remainingBalance;
		
		if (numOfPenny > 0) {
			System.out.println(numOfPenny + " pennies ");
		}

		
	}

}
