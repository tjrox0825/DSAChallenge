package lecture5PracticeProblems;
import java.util.Scanner;

public class practiceProblem1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1; i<=n;i++)
		{

			for(int j=1; j<=i; j++)
			{
				char jChar = (char) ('A'+j-1);
				System.out.print(jChar);

			}
			System.out.println("");
		}
	}

}
