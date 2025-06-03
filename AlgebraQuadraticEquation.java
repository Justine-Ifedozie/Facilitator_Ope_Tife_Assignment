import java.util.Scanner; 
public class AlgebraQuadraticEquation {
	public static void main (String[] args) {

	Scanner keyboardInput = new Scanner(System.in);

//Collected input from the user. 

	System.out.print("Enter value for \"a\": "); 
	double a = keyboardInput.nextDouble();

	System.out.print("Enter value for \"b\": "); 
	double b = keyboardInput.nextDouble();

	System.out.print("Enter value for \"c\": "); 
	double c = keyboardInput.nextDouble();

//Commenced calculation for r1.

	double bCal = b * b;
	double firstCal = bCal - (4 * (a) * (c));

	double secCal = Math.sqrt(firstCal);

	double r1 = - (b + secCal) / (2 * a);

	System.out.println("r1 is: " + r1);

//Commenced calculation for r2.

	double r2 = - (b - secCal) / (2 * a);
	System.out.println("r2 is: " + r2);

//Check for discriminant.
 
	if 

	}
}