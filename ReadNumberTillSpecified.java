import java.util.Scanner;
public class ReadNumberTillSpecified {
	public static void main (String[] args) {   
	Scanner keyboardInput = new Scanner(System.in);

	int userInput = 0, firstNum = 0, sumOfNum = 0, deducted = 0;
	int counter = 0;

	while (counter != -1) {
	System.out.print("Enter a number: ");
	userInput = keyboardInput.nextInt();
	counter++;

	sumOfNum = sumOfNum + userInput;

	if (counter == 1) {
	firstNum = userInput; 
	}

	if (sumOfNum - firstNum >= firstNum) {
	deducted = sumOfNum - firstNum;
	counter = -1;
	}

	}
	System.out.print("The sum of all the numbers except the first number: " + deducted + "  is equal to or greater than the first number entered " + firstNum);
	}

}