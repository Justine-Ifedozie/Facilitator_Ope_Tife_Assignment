import java.util.Scanner;
public class FirstIfStatement { 
	public static void main (String[] args) {
	
	// Create a Scanner
	Scanner keyboardInput = new Scanner(System.in);

	//Prompt the user to enter filing status
	System.out.print(" Enter the filing status: ");
	int status = keyboardInput.nextInt();
	
	//Promt the user to enter taxable income
	System.out.print(" Enter the taxable income: ");
	double income = keyboardInput.nextInt();

	//Compute tax
	double tax = 0;

	if (status == 0) { 
	    if (income <= 8350)
	        tax = income * 0.10;
* 0.10 + (income - 8350) * 0.15; 
	            
 

	}
}