import java.util.Scanner;
public class FindTheHighestScore2 {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		int numStudents = 0, studentScore = 0, highestScore = 0, secondHighestScore = 0, counter = 0;
		String studentName = "", nameSaver = "", nameSaver2 = "";

		System.out.print("Enter the number of students: ");
		numStudents = keyboardInput.nextInt();

		while (counter != numStudents) {

			System.out.print("Enter student name: ");
			studentName = keyboardInput.next();

			System.out.print("Enter student score: ");
			studentScore = keyboardInput.nextInt();
			counter++;

			if (studentScore > highestScore) {
			secondHighestScore = highestScore;
			nameSaver2 = nameSaver;
			highestScore = studentScore;
			nameSaver = studentName;
			}
			else if (studentScore > secondHighestScore) {
			secondHighestScore = studentScore;
			nameSaver2 = studentName;
			}

		}

			System.out.println(nameSaver + " has the highest score of " + highestScore + " then " + nameSaver2 + " has the second highest score " + secondHighestScore);



	}
}