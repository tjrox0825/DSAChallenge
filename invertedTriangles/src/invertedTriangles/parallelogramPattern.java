package invertedTriangles;
import java.util.Scanner;
public class parallelogramPattern {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			//printing spaces

			for(int spaces=1; spaces <=i-1; spaces++)
			{
				System.out.print(".");
			}

			//printing stars
			for(int stars=1; stars<=n; stars++)
			{
				System.out.print("*");
			}

			System.out.println("");
		}
	}

}
