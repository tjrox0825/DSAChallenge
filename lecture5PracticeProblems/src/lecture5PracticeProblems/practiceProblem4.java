package lecture5PracticeProblems;
import java.util.Scanner;
public class practiceProblem4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				char temp = (char) ('A'+i-1);

				System.out.print(temp);


			}
			System.out.println("");
		}



	}
}
