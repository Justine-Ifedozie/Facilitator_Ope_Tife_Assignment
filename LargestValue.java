import java.util.Scanner;
public class LargestValue {
	public static void main (String[] args) { 

	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the first input: ");
	int firstInput = keyboardInput.nextInt();

	System.out.print("Enter the second input: ");
	int secondInput = keyboardInput.nextInt();

	int sum = firstInput + secondInput;
	System.out.printf("Sum of two integers: %d%n", sum);

	int product = firstInput * secondInput;
	System.out.printf("Product of two integers: %d%n", product);

	double average = (firstInput + secondInput) / 2;
	System.out.printf("Average of two integers: %.2f%n", average);

	int distanceBetween = firstInput - secondInput;
	System.out.printf("Distance of two integers: %d%n", distanceBetween);

//Max and Min integer calculation

	if (firstInput > secondInput) {
	System.out.printf("Max integer: %d%n", firstInput);
	}
	else {
	System.out.printf("Max integer: %d%n", secondInput);
	}

	if (firstInput < secondInput) {
	System.out.printf("Min integer: %d%n", firstInput);
	}

	else {
	System.out.printf("Min integer: %d%n", secondInput);
	}

	}
}