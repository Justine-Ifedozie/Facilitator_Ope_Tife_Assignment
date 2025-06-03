import java.util.Scanner;
public class PalindromeNum {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	int userInput = 0, userInput2 = 0;

	System.out.print("Enter a three digit integer: ");
	userInput = keyboardInput.nextInt();

	while (userInput != -1) {
	if (userInput > 100 && userInput < 1000)
	userInput2 = userInput;
	}

	else {
	         System.out.print("You entered an invalid number, enter number again: ");
	         userInput = keyboardInput.nextInt();
	}
	System.out.print(userInput2);
	



	}

}