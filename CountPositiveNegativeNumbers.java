//Prompt users to input numbers
	//Use sentinel value to end collection of input when the user is done.
//Deteremine how many positive and negative values
	//Use if statement to prevent count of zeros
//Compute the total and average of input values
	//Add up the sum of inputs in a variable
	//Add up the number of inputs with a counter
	//Divide the sum of input with the number of inputs to get the average

//Use zero to end the program


import java.util.Scanner;
public class CountPositiveNegativeNumbers {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		int counter = 0, negativeCounter = 0, positiveCounter = 0, totalNum = 0;
		double average = 0, total = 0;

		System.out.print("Enter an integer or press 0 to quit: ");
		int userNum = keyboardInput.nextInt();

		while (userNum != 0) {
		total = total + userNum;

		if (userNum > 0) {
		positiveCounter++;
		}

		if (userNum < 0) negativeCounter++;

		System.out.print("Enter an integer or press 0 to quit: ");
		userNum = keyboardInput.nextInt();

		counter++;
		}

		average = total / counter;

		System.out.println("The number of positives is: " + positiveCounter);

		System.out.println("The number of negatives is: " + negativeCounter);

		System.out.println("Total of numbers entered: " + total);

		System.out.println("Average of numbers entered: " + average);













	}

}