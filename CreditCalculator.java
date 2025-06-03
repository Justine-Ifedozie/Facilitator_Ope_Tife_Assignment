//Prompt user to enter account number.
//Prompt user to enter the balance at the begining of the month.
//Prompt the user to enter total of all items charged by the customer this month.
//Prompt user to enter the total of all credits applied to the customer’s account this month.
//Prompt user to enter  allowed credit limit.
//Calculate the new balance. 
	//
//Display the new balance and determine whether the new balance exceeds the
 customer’s credit limit.
//For those customers whose credit limit is exceeded, the program should dis
play the message "Credit limit exceeded"


import java.util.Scanner;
public class CreditCalculator {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter your account number: ");
	int accountNum = keyboardInput.nextInt();

	System.out.print("Enter your balance at the beginning of the month: ");
	int balanceMonth = keyboardInput.nextInt();

	System.out.print("Enter the total of all items charged by you this month: ");
	int itemsCharged = keyboardInput.nextInt();

	System.out.print("Enter the total of all credits applied to you: ");
	int creditsApplied = keyboardInput.nextInt();

	System.out.print("Enter your allowed credit limit: ");
	int creditsApplied = keyboardInput.nextInt();


	}
}






















