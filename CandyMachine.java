package computer_programming2;

import java.util.Scanner;

public class CandyMachine {
	static Scanner keyboard = new Scanner(System.in);{
		
	}
	// Displays item choices	
	public static double displayChoices() {
		double price = -1;
		
		System.out.println("Here are your choices:");
		System.out.println("A. 	Gummy Candy 		23.50");
		System.out.println("B. 	Pretzels 		33.70");
		System.out.println("C. 	Kit-Kat 		53.00");
		System.out.println("D. 	Nips 			20.75");
		System.out.println("E. 	Nerds 			63.o0");
		
		System.out.println();
		System.out.print("Which would you like? Please choose a letter.");
		String choice = keyboard.next().toUpperCase(); 
		
		if(choice.equals("A")){
			return 23.50;
		}
		else if(choice.equals("B")){
			price = 33.70;
			return 33.70;
		}
		else if(choice.equals("C")){
			price = 53.00;
			return 53.00;
		}
		else if(choice.equals("D")){
			price = 20.75;
			return 20.75;
		}
		else if(choice.equals("E")) {
			price = 63.00;
			return 63.00;
		}
		else {
			return price;
		}
		 
	}
		// to dispense candy and return change
	public static void dispense(double moneyinserted, double candyPrice) {
		if(moneyinserted > candyPrice) {
			System.out.println("Vending...");
			System.out.println("Here is your candy!");
			double change = moneyinserted - candyPrice;
			System.out.println("Here's your "+change+" in change");
		}
		else {
			System.out.println("Sorry! You don't have enough money. Here's your "+moneyinserted+" back. Thank You!");
		}
	}
		
	public static void main(String[] args) {
		// Welcome statement of the Candy machine
		System.out.println("Welcome to Alex's Candy Machine!");
		
		System.out.print("How much money do you have?");
		double moneyinserted = keyboard.nextDouble();
		
		double candyPrice = displayChoices();
		
		dispense(moneyinserted, candyPrice);

	}

}
