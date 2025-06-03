//Use a loop to determine the total tax for each of three citizens.
	//Declare a constant variable for first tax rate  and initialize it with 15% (0.15 percent) for citizens earnings up to $30,000.
	//Declare a constant variable for second tax rate  and initialize it with 20% (0.20 percent) for citizens earnings more than $30,000.
//Prompt citizens to enter their name.
//Prompt citizens to enter their earning. 
//Prompt citizens to enter the year for the tax rate they wish to calculate.
	//Input the above information for three citizens one after the other.
//Determine and display the citizen's name, year and tax.
	//Multiply their earnings with the required tax percent depending on their earning.
	//Rest counter and print out each citizen detail immediately after they input it.

import java.util.Scanner;
public class TaxCalculator {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		double lessThanThirty = 0.15;
		double greaterThanThirty = 0.20;
		int  earningPerYear = 0;
		int taxYear = 0;
		int loopCounter = 0;
		double result = 0;
		String nameSaver = "";

		while (loopCounter != 3) {
		System.out.print("Enter a name: ");
		String name = keyboardInput.next();

		System.out.print("Enter your earnings in a given year: $");
		earningPerYear = keyboardInput.nextInt();

		System.out.print("Enter the given tax year: ");
		taxYear = keyboardInput.nextInt();

		++loopCounter;

		if (loopCounter == 1 && earningPerYear <= 30000) {
		result = earningPerYear * lessThanThirty;
		System.out.println(name + " tax for the year " + taxYear + " is $" + result);
		}

		else if (loopCounter == 1 && earningPerYear >= 30000) {
		result = earningPerYear * greaterThanThirty;
		System.out.println(name + " tax for the year " + taxYear + " is $" + result);
		}

		if (loopCounter == 2 && earningPerYear <= 30000) {
		result = earningPerYear * lessThanThirty;
		System.out.println(name + " tax for the year " + taxYear + " is $" + result);
		}

		else if (loopCounter == 2 && earningPerYear >= 30000) {
		result = earningPerYear * greaterThanThirty;
		System.out.println(name + " tax for the year " + taxYear + " is $" + result);
		}


		if (loopCounter == 3 && earningPerYear <= 30000) {
		result = earningPerYear * lessThanThirty;
		System.out.println(name + " tax for the year " + taxYear + " is $" + result);
		}

		else if (loopCounter == 3 && earningPerYear >= 30000) {
		result = earningPerYear * greaterThanThirty;
		System.out.println(name + " tax for the year " + taxYear + " is $" + result);
		}


	}



	}
}


