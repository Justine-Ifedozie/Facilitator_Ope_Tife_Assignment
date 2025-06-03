import java.util.Scanner;
public class LowestScore {
	public static void main (String[] args) {   
                  Scanner keyboardInput = new Scanner(System.in);

	int numOfStudents = 0, studentScore = 0, counter = 0;
	int lowestScore = 0, secondLowestScore = 0;
	String studentName = " ", lowestStudentName = " ", secondLowestStudentName = " ";

	System.out.print("Enter the number of students: ");
	numOfStudents = keyboardInput.nextInt();

	while (counter != numOfStudents) {

	System.out.print("Enter the student name: ");
	studentName = keyboardInput.next();

	System.out.print("Enter the student score: ");
	studentScore = keyboardInput.nextInt();

	counter++;

	if (studentScore < lowestScore) {
	lowestScore = studentScore;
	lowestStudentName = studentName;
	}

	}

	System.out.println(lowestScore);
	System.out.println(studentName);

	//System.out.print("The student with the lowest score is: " + lowestStudentName + " and his score is: " + lowestScore);

	//System.out.println(secondLowestScore + secondLowestStudentName);

/*	if (studentScore < lowestScore) {
	secondLowestScore = lowestScore;
	secondLowestStudentName = lowestStudentName;
	lowestScore = studentScore;
	lowestStudentName = studentName;
	}

	else if (studentScore < secondLowestScore) {
	secondLowestScore = studentScore;
	lowestStudentName = studentName;
	} */


	}

}