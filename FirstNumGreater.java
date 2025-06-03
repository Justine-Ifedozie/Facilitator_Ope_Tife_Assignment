import java.util.Scanner;
public class FirstNumGreater {
	public static void main (String[] args) { 

	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the first input: ");
	int firstInput = keyboardInput.nextInt();

	System.out.print("Enter the second input: ");
	int secondInput = keyboardInput.nextInt();

	int difference = firstInput - secondInput;

//Determining the greater number

	if (firstInput > secondInput) {
	System.out.printf("Difference between first number and second number is: %d", difference);
	}

	}
}