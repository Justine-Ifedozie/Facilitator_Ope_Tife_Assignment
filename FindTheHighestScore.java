import java.util.Scanner;
public class FindTheHighestScore {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		int numStudents = 0, studentScore = 0, highestScore = 0, counter = 0;
		String studentName = "", nameSaver = "";

		System.out.print("Enter the number of students: ");
		numStudents = keyboardInput.nextInt();

		while (counter != numStudents) {

			System.out.print("Enter student name: ");
			studentName = keyboardInput.next();

			System.out.print("Enter student score: ");
			studentScore = keyboardInput.nextInt();
			counter++;

			if (studentScore > highestScore) {
			highestScore = studentScore;
			nameSaver = studentName;
			}
	

		}

			System.out.println(nameSaver + " has the highest score of: " + highestScore);


	}
}