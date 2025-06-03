//Randomly generate two integers
//Add the two randomly generated integers together 
//Prompt the user to guess the sum of these two integers
//Use while loop to guess if the user got the number then keep repeating for him to guess.


import java.util.Scanner;
public class AddThreeIntegers {
	public static void main (String[] args) {
	int ranNumOne = (int) (Math.random() * 11 +1);
	int ranNumTwo = (int) (Math.random() * 11 +1);

	int ranAddition = ranNumOne + ranNumTwo;

	Scanner keyboardInput = new Scanner(System.in);
	System.out.print("Enter a guess of the sum of two randomly generated number: ");
	int userGuess = keyboardInput.nextInt();
	
System.out.println("Computer sum for testing: " + ranAddition);

	while (userGuess != ranAddition) {
	System.out.print("Oops you guessed wrong, try again! Enter a guess: ");
	userGuess = keyboardInput.nextInt();
	if (userGuess == ranAddition) 	System.out.println("You are correct!");
	//userGuess = userGuess +1;
	}




	}
}