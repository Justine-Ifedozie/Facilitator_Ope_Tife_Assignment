import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main (String[] args) {
	Random computerRandom = new Random();

	int randomNum = computerRandom.nextInt(3);
	System.out.println(randomNum);

//Prompt the user to enter a number
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter a number, (0) for scissors, (1) for rock, (2) for paper: ");
	int enteredNum = keyboardInput.nextInt();

//Use condition statement to determine
	if (randomNum == 0 && enteredNum == 1) {
	System.out.println("You're rock, you won! Computer is scissors");
	}
	else if (randomNum == 0 && enteredNum == 2) {
	System.out.println("You're rock, you won! Computer is rock");
	}
	else if (randomNum == 0 && enteredNum == 0) {
	System.out.println("You're scissor, it is a draw! Computer is scissors");
	}

	else if (randomNum == 1 && enteredNum == 0) {
	System.out.println("You're scissor, you loose! Computer is rock");
	}
	else if (randomNum == 1 && enteredNum == 1) {
	System.out.println("You're rock, it is a draw! Computer is rock");
	}
	else if (randomNum == 1 && enteredNum == 2) {
	System.out.println("You're paper, you won! Computer is rock");
	}
	else if (randomNum == 2 && enteredNum == 0) {
	System.out.println("You're scissor, you loose! Computer is paper");
	}
	else if (randomNum == 2 && enteredNum == 1) {
	System.out.println("You're rock, you loose! Computer is paper");
	}
	else if (randomNum == 2 && enteredNum == 2) {
	System.out.println("You're paper, it is a draw! Computer is paper");
	}
	else {
	System.out.println("You'entered an invalid number");
	}



	}
}