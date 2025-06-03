//Use loop to prompt the user to input 10 different numbers.
//Determine and print the largest number entered. 
	//Declare three variables.

import java.util.Scanner;
public class LargestInt10 {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		int number, counter = 0, largest = 0, secondLargest = 0;
	
		while (counter != 10) {
		System.out.print("Enter a number: ");
		number = keyboardInput.nextInt();

		if (number > largest) {
		secondLargest = largest;
		largest = number;
		}

		else if (number > secondLargest) {
		secondLargest = number;
		}
		
		counter++;
		}

		System.out.println("The largest number entered is "+ largest);

		System.out.println("The second largest number entered is "+ secondLargest);

	}
}