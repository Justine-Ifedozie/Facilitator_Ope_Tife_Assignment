//Declare four integer variables for (N, N2 N3, N4).
	//Initialize variable N to 1.	

public class TabularOutput {
	public static void main (String[] args) {

		int firstN = 1, secondN = 0, thirdN =0, fourthN = 0, counter = 6;	

		System.out.println("N \t N2 \t N3 \t N4\n");

		while (firstN != counter) {
			int result = firstN++;
			secondN = (int) Math.pow(result,2);
			thirdN = (int) Math.pow(result,3);
			fourthN = (int) Math.pow(result,4);
	
			System.out.printf("%d\t %d\t %d\t %d%n", result, secondN, thirdN, fourthN);
			}

	}

}
