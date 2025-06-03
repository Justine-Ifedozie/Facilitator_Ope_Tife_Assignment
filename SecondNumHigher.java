import java.util.Scanner;
public class SecondNumHigher { 
	public static void main (String[] args) {
	
	// Create a Scanner
	Scanner keyboardInput = new Scanner(System.in);

	//Prompt the user to integer values
	System.out.print("Enter the first integer: ");
	int firstInt = keyboardInput.nextInt();

	System.out.print("Enter the second integer: ");
	int secondInt = keyboardInput.nextInt();

	System.out.print("Enter the third integer: ");
	int thirdInt = keyboardInput.nextInt();

	if (secondInt > firstInt && thirdInt > secondInt) {
	System.out.print("The result is: true");
	}



	}
}