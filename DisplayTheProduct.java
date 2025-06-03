import java.util.Scanner;

public class DisplayTheProduct {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Input first number: ");
	int numOne = keyboardInput.nextInt();

	System.out.print("Input second number: ");
 	int numTwo = keyboardInput.nextInt();

	int product = numOne * numTwo;

	System.out.printf("Expected Output: %d", product);

	}
}