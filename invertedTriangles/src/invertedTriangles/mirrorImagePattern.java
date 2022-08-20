package invertedTriangles;
import java.util.Scanner;
public class mirrorImagePattern {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1; i<=n; i++)
		{
			//printing spaces
			int j=1;
			int k=1;

			for(j=1; j<=n-i; j++)
			{
				System.out.print(".");
			}

			for(j=1; j<=i;j++)
			{
				System.out.print(k);
				k++;
			}

			System.out.println();
		}




	}

}
