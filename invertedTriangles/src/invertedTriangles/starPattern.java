package invertedTriangles;
import java.util.Scanner;
public class starPattern {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int i=1;
		while(i<=n)
		{
			int spaces=1;
			//printing spaces n-i times
			while(spaces<=n-i)
			{
				System.out.print(".");
				spaces++;
			}

			int star=1;
			//printing star i times
			while(star<=i)
			{
				System.out.print("*");
				star++;
			}

			int star2=i-1;
			while(star2>=1)
			{
				System.out.print(star2);
				star2--;
			}
			System.out.println();
			i++;
		}

	}
}
