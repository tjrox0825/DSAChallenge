package invertedTriangles;

import java.util.Scanner;
public class diamondofStars {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();


		//upper triangle
		for(int i=1; i<=n; i=i+2)
		{
			//print spaces
			for(int j=1; j<=(n-i)/2; j++ )
			{
				System.out.print(".");
			}

			//print *
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}


		//lower triangle

		for(int i=(n/2)+(n/2)-1; i>=1; i=i-2)
		{

			//printing spaces
			for(int j=1; j<=(n-i)/2; j=j+2)
			{
				System.out.print(".");
			}

			//print *
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}




	}
}
