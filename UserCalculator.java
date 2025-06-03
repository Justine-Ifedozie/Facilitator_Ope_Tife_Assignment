import java.util.Scanner;
public class UserCalculator {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		String welcome = """
			Welcome to our online calculator! 

			A list of the arithmetic operations you can do:
			Press

			1. Addition
			2. Subtraction
			3. Multiplication
			4. Division
				""";
		int wElcome = 0, userInput = 0, sum = 0, divisionUserInput = 0, subtractInput = 0, subtractInput1 = 0, totalSub = 0;

		double divisionSum = 0;

	while (true) {

			System.out.print(welcome);
			System.out.print("Make a selction: ");
			wElcome = keyboardInput.nextInt();

		switch (wElcome) { // Opening outtermost case
			case 1: {
				System.out.print("Enter a number to add or -1 to end the session: ");
				userInput = keyboardInput.nextInt();
				
				while (userInput != -1) {
				sum = sum + userInput;

				System.out.print("Enter a number to add: ");
				userInput = keyboardInput.nextInt();
				}
				System.out.println("The sum of the numbers you entered is: " + sum); 

				System.out.println("Press 0 to go to the main menu: ");
				wElcome = keyboardInput.nextInt();

				} // Welcome case 1 closing brace

			case 2: {
				System.out.print("Enter a number to subtract: ");
				subtractInput = keyboardInput.nextInt();
				
				System.out.print("Enter a number to subtract: ");
				subtractInput1 = keyboardInput.nextInt();

				totalSub = subtractInput - subtractInput1;

				System.out.println("The result of the numbers you subtracted is: " + totalSub); 

				System.out.println("Press 0 to go to the main menu: ");
				wElcome = keyboardInput.nextInt();

				} // Case 2 closing brace 


			case 3: {
				System.out.print("Enter a number to multiply: ");
				subtractInput = keyboardInput.nextInt();
				
				System.out.print("Enter a number to multiply: ");
				subtractInput1 = keyboardInput.nextInt();

				totalSub = subtractInput * subtractInput1;

				System.out.println("The result of the numbers you multiplied is: " + totalSub); 

				System.out.println("Press 0 to go to the main menu: ");
				wElcome = keyboardInput.nextInt();

				} // Case 3 closing brace 


			case 4: {
				System.out.print("Enter a number to divide: ");
				subtractInput = keyboardInput.nextInt();
				
				System.out.print("Enter a number to divide: ");
				subtractInput1 = keyboardInput.nextInt();

				totalSub = subtractInput / subtractInput1;

				System.out.println("The result of the numbers you divided is: " + totalSub); 

				System.out.println("Press 0 to go to the main menu: ");
				wElcome = keyboardInput.nextInt();

				} // Case 4 closing brace 


			} // Closing outtermost Switch


		} //End of outter while loop


	}


}