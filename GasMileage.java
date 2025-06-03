//Use Sentinel controlled iteration to prompt user for input.
	//Prompt the user to input the miles driven. (integer).
	//Prompt the user to input the gallon used for each trip. (integer).
//Calculate and display the miles per gallon obtained for each trip. 
	//Divide the miles driven with the gallons used each trip. (Convert to float).
//Calculate and display the combined miles per gallon obtained for all trips up to this point.
	//Add the miles for all the trips then divide with the . (Convert to float).

import java.util.Scanner;
public class GasMileage {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

//Miles driven and gallons used for each trip.
	double milesDriven = 0;
	double gallonsUsed = 0;
	double milesDrivenCombined = 0;
	double milesPerGallonEachTrip = 0;
	double gallonsTripCombined = 0;
	double milesPerGallonAllTrip = 0;

	System.out.print("Enter -1 if you wish to stop this action. To continue Enter miles driven: ");
	milesDriven = keyboardInput.nextDouble();

	while (milesDriven != -1) {

	System.out.print("Enter gallons used for each trip: ");
	gallonsUsed = keyboardInput.nextDouble();

//Miles per Gallon obtained for each trip.
	
	if (milesDriven != -1) {
	milesPerGallonEachTrip = milesDriven / gallonsUsed;
	System.out.printf("Miles Per Gallon for each trip is: %.3f%n", milesPerGallonEachTrip);

//Miles per Gallon obtained for all trips.
	 if (milesDriven != -1) { 
	milesPerGallonAllTrip = milesPerGallonAllTrip + milesPerGallonEachTrip;
	System.out.printf("Miles Per Gallon for all trips: %.3f%n", milesPerGallonAllTrip);
	}

	System.out.print("Enter -1 if you wish to stop this action. To continue Enter miles driven: ");
	milesDriven = keyboardInput.nextDouble();
	}
	}


	}
}

