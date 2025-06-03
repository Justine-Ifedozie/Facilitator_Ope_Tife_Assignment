//Declare a class then name the class.
//Declare the main method to be used.
//Collect input (Exchange rate) from the user by importing and declaring a scanner and using System.in.
//Hold the inputs in a variable, use double because we are dealing with currency.
// Create a prompt for the user to enter 0 to convert from U.S. dollar to Chinese RMB.
// Create another prompt for the user to enter 1 to convert from Chinese RMB to to U.S. dollars
// Multiply exchange rate by the amount entered.

//Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars respectively.


import java.util.Scanner;
public class MoneyExchange {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

//Collect Exchange rate

	System.out.print("Enter the exchange rate from dollars to RMB: ");
	double echangeRate = keyboardInput.nextDouble();

//Prevent user from entereing exchange 
//Create a prompt for the user to enter 0 to convert from U.S dollar to Chinese RMB and 1 to convert from RMB to U.S. dollars.
	
	if (echangeRate > 0) {	
	System.out.println("Enter 0 to convert from U.S. dollars to RMB and 1 to convert from RMB to U.S. dollars: ");
	int currencyDeterminer = keyboardInput.nextInt();
	}

//System.out.println("You entered a valid exchange rate, press 0 to continue");
//int currencyDeterminer = keyboardInput.nextInt();

	else {
	System.out.print("You entered an invalid number");
	//System.exit(0);
	}

	System.out.println("Enter 0 to convert from U.S. dollars to RMB and 1 to convert from RMB to U.S. dollars: ");
	int currencyDeterminer = keyboardInput.nextInt();

//Condition statement to determine currency to be converted

	if (currencyDeterminer == 0) {
	System.out.print("Enter the dollar amount: ");
	double dollarAmount = keyboardInput.nextDouble();
	double convertedAmount = echangeRate * dollarAmount;
	System.out.printf("$%.1f is %.1f yuan", dollarAmount, convertedAmount);
	}

	if (currencyDeterminer == 1) {
	System.out.print("Enter the RMB amount: ");
	double rmbAmount = keyboardInput.nextDouble();
	double convertedRmb = echangeRate * rmbAmount;
	System.out.printf("yuan %.1f is %.1f $", rmbAmount, convertedRmb);
	}

	}
}