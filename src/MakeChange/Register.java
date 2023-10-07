package MakeChange;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Price of item: ");
		double price = sc.nextDouble();

		System.out.println("Cash tendered: ");
		double cashRecieved = sc.nextDouble();

		double changeDue = cashRecieved - price;
		changeDue += 0.004;

		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quaters = 0;
		int dimes = 0;
		int nickles = 0;
		int penny = 0;
		
		sc.close();

		if (cashRecieved == price) {
			System.out.println("No change required... Tell customer to have a great day! ");
		}
		else if (cashRecieved < price) {
			System.out.println("Insufficient Funds.... Ask Customer for remainder of funds.");
		} else {
			System.out.printf("%.2f  : Cash to be returned |\n  ", changeDue );
			if (changeDue / 20 >= 1) {
				twenties = (int) changeDue / 20;
				changeDue = changeDue % 20;
				System.out.println("\n Twenty Dollar Bills: " + twenties);
			}
			if (changeDue / 10 >= 1) {
				tens = (int) changeDue / 10;
				changeDue = changeDue % 10;
				System.out.println("\n Ten Dollar Bills: " + tens);
			}
			if (changeDue / 5 >= 1) {
				fives = (int) changeDue / 5;
				changeDue = changeDue % 5;
				System.out.println("\n Five Dollar Bills: " + fives);

			}
			if (changeDue / 1 >= 1) {
				ones = (int) changeDue / 1;
				changeDue = changeDue % 1;
				System.out.println("\n One Dollar Bills: " + ones);

			}
			if (changeDue / 0.25 >= 1) {
				quaters = (int) (changeDue / 0.25);
				changeDue = changeDue % 0.25;
				System.out.println("\n Quaters: " + quaters);
			}
			if (changeDue / 0.10 >= 1) {
				dimes = (int) (changeDue / 0.10);
				changeDue = changeDue % 0.10;
				System.out.println("\n Dimes: " + dimes);
			}
			if (changeDue / 0.05 >= 1) {
				nickles = (int) (changeDue / 0.05);
				changeDue = changeDue % 0.05;
				System.out.println("\n Nickles: " + nickles);

			}
			if (changeDue / 0.01 >= 1) {
				penny = (int) (changeDue / 0.01);
				changeDue = changeDue % 0.01;
				System.out.println("\n Pennies: " + penny);
				}
		}

	}

}
