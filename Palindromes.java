import java.util.Scanner;
public class Palindromes {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

	int userInput = 0, counter = 0, condition = 0, reversedNum = 0;

	System.out.print("Enter a five digit number: ");
	userInput = keyboardInput.nextInt();

	while (condition != -1) {
	if (userInput < 10000 || userInput > 99999) {
	System.out.print("You entered an invalid number. Kindly enter a five digit number: ");
	userInput = keyboardInput.nextInt();
	}

	else if (userInput > 10000 || userInput < 99999) {
	System.out.println("You entered a valid number");
	counter++;
	}
	if (counter == 1) condition = -1;
	
	}
	
	int result = userInput / 1000;
	int result1 = userInput % 1000;

	System.out.println(result1);

	System.out.println(result);


	//System.out.print("The number you entered is a palindrome number");




	}

}