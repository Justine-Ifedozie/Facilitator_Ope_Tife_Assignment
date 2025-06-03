// From our question we need to receive input from our user so import the scanner

//Declare and name your class

//Declare your method

// Prompt the user to enter an integer (weight of the package), save it as a double variable.

// Use System.out to display the cost of shipping the package.

// Use the condition statement (if) to determine whether the weight is greater than 50 (use less than to determine if it is less than 21, use else = default to specify that anything above 21 shouln't be shipped), if it is display a message "the package cannot be shipped".


import java.util.Scanner;
public class Classwork {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the weight of the package: ");
	double weight = keyboardInput.nextDouble();

	double lessThanOne = 3.5;
	double lessThanThree = 5.5;
	double lessThanTen = 8.5;
	double lessThanTwenty = 10.5;

	if (weight <= 1) {
	System.out.printf("The shipping cost is: %.1f", lessThanOne);
	}

	else if (weight <= 3) {
	System.out.printf("The shipping cost is: %.1f", lessThanThree);
	}

	else if (weight <= 10) {
	System.out.printf("The shipping cost is: %.1f", lessThanTen);
	}

	else if (weight <= 20) {
	System.out.printf("The shipping cost is: %.1f", lessThanTwenty);
	}

	else {
	System.out.print("The package cannot be shipped");
	}

	}
}