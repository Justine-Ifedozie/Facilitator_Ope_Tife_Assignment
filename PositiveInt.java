import java.util.Scanner;
public class PositiveInt { 
	public static void main (String[] args) {
	
	// Create a Scanner
	Scanner keyboardInput = new Scanner(System.in);

	//Prompt the user to integer values
	System.out.print("Enter the first integer: ");
	int firstInt = keyboardInput.nextInt();

	System.out.print("Enter the second integer: ");
	int secondInt = keyboardInput.nextInt();

	//Check for positive integer

	int product = firstInt * secondInt ;
	int sum = firstInt + secondInt ;

	if (firstInt > 0 && secondInt > 0) {
	System.out.printf("The product is: %d%n", product);
	

	if (secondInt < 0 && secondInt < 0) {
	System.out.printf("The product is: %d%n", product);	
	}
	}

	if (firstInt < 0 && secondInt > 0) {
	System.out.printf("The sum is: %d%n", sum);
	}
	if (secondInt < 0 && firstInt > 0) {
	System.out.printf("The sum is: %d", sum);
	}
	

	}
}