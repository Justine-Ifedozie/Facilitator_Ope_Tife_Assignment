import java.util.Scanner;
public class ProductOfTwoNum { 
	public static void main (String[] args) {
	
	// Create a Scanner
	Scanner keyboardInput = new Scanner(System.in);

	//Prompt the user to integer values
	System.out.print("Enter the first integer: ");
	int firstInt = keyboardInput.nextInt();

	System.out.print("Enter the second integer: ");
	int secondInt = keyboardInput.nextInt();

//Product of two numbers
	int product = firstInt * secondInt;
	System.out.printf("Expected Output: %d", product);
	}
}