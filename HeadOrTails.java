import java.util.Random;
import java.util.Scanner;
public class HeadOrTails { 
	public static void main (String[] args) {

	Random onlyRandom = new Random();
	int randomNum = onlyRandom.nextInt(2);

	//System.out.print(randomNum);

	// Create a Scanner
	Scanner keyboardInput = new Scanner(System.in);

	//Prompt the user to enter a guess
	System.out.print("Enter a guess, 0 for heads and 1 for tails: ");
	int userGuess = keyboardInput.nextInt();

	//Use conditional statement to check if te random matches user guess
	if (randomNum == 0 && userGuess == 1) {
	System.out.printf("Incorrect! computer chose 0 (heads), you chose 1 (tails). Sorry you loose!");
	}

	else if (randomNum == 1 && userGuess == 0) {
	System.out.printf("Incorrect! computer chose 1 (tails), you chose 0 (heads). Sorry you loose!");
	}

	else if (randomNum == 0 && userGuess == 0) {
	System.out.printf("Correct! computer chose 0 (heads), you chose 0 (heads). You Win!");
	}

	else if (randomNum == 1 && userGuess == 1) {
	System.out.printf("Correct! computer chose 1 (tails), you chose 1 (tails). You Win!");
	}

	}
}