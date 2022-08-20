package patterns;
import java.util.Scanner;

public class printNPattern {

	//print n * n pattern with n as every element
	//1. n=4
	//2. j =4
	//3. to print n =4 

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i=1; i<=n; i++) {

			for(int j=1; j<=n; j++) 
			{
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
