import java.util.Scanner;
public class SecondLargestNumber {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		int number = 0, largest = 0, counter = 0;

				while (counter != 10) {

				System.out.print("Enter a number: ");
				number = keyboardInput.nextInt();

				if (number > largest) largest = number;
				counter++;
			}

				System.out.print("The Largest number entered is: " + largest); 

	}
}