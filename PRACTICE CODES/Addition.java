// This programme is used for collecting number from the user
// Justine
// Last modified: 28/03/2025 Time-2:37

import java.util.Scanner;
public class Addition {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter first integar: ");
int number1 = input.nextInt();
 System.out.print("Enter second integar: ");
int number2 = input.nextInt();
int sum = number1 + number2;
 System.out.printf("Sum is %d%n", sum);

}
}
