import java.util.Scanner;
public class ValidatingUserInput {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	int passes = 0, failures = 0, studentCounter = 1;

	while (studentCounter <= 10) {

	System.out.print("Input the next exam result between 1 and 2: ");
	int nextExamResult = keyboardInput.nextInt();

	if (nextExamResult == 1 || nextExamResult == 2) {
	studentCounter++;
		if (nextExamResult == 1) passes++;
		else if (nextExamResult == 2) failures++;
	}
	


	}
	System.out.println("The number of passes is: " + passes);

	System.out.println("The number of failures is: " + failures);

	if (passes > 8) System.out.println("Bonus to instructor!");

	}

}