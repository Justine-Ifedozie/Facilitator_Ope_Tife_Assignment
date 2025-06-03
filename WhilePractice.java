import java.util.Scanner;
public class WhilePractice {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		int counter = 1;

		while (counter != 6) {
		System.out.print("Enter an integer " + counter + ": ");
		int userNum = keyboardInput.nextInt();
		counter = counter + 1;
		}







	}
}