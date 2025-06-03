//amount * (numOfMonths + interestRate) 
//Question 5.30 on the blue textbook

import java.util.Scanner;
public class CompoundValue {
`	public static void main (String[] args) {   
                  Scanner keyboardInput = new Scanner(System.in);

	int interestRate = 0, total = 0;

                  System.out.print("Enter an amount: ");
	int amount = keyboardInput.nextInt();

                  System.out.print("Enter an anual interest rate: ");
	int monthlyInterestRate = keyboardInput.nextInt();       

                  System.out.print("Enter the number of months you want to calculate: ");
	int numOfMonths = keyboardInput.nextInt();


	interestRate = monthlyInterestRate / numOfMonths;

	total = amount * (numOfMonths + interestRate);

	System.out.print(The amount in savings after thr 

	