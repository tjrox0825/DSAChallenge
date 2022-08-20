package patterns;

import java.util.Scanner;
public class squarePattern {

	//Print 4321 in four rows
	// 1) n =4 
	// 2) j = 4
	// 3 // to print n-j+1

	public static void main(String [] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i =1; i<=n; i++) {
			int j = 1;
			while (j<=n)
			{
				System.out.print(n-j+1);
				j++;
			}

			System.out.println();
		}
	}
}
