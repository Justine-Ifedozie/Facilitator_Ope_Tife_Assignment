import java.util.Scanner;
public class SmallestValue {
	public static void main (String[] args) { 

	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the first input: ");
	int firstInput = keyboardInput.nextInt();

	System.out.print("Enter the second input: ");
	int secondInput = keyboardInput.nextInt();

//Checking for the smallest value if the two values have the 

//Condition statements to determine the largest and smallest value.

	if (firstInput > secondInput) {
	System.out.printf("The largest value entered is: %d%n", firstInput);
	}

	else if (secondInput > firstInput) {
	System.out.printf("%nThe largest value entered is: %d%n", secondInput);
	}

	else if (firstInput == secondInput && secondInput == firstInput) {
	System.out.printf("0%n");
	}
	
//Condition to determine if the two values have the same remainder when divided by 6.

	int firstRemainder = firstInput %  6;
	int secRemainder = secondInput % 6;

	if (firstRemainder == secRemainder) {
		if (firstInput < secondInput) {
		System.out.printf("The smallest number is: %d", firstInput);
		}
		else if (secondInput < firstInput) {
		System.out.printf("The smallest number is: %d", secondInput);
		}
	}
	}
}
