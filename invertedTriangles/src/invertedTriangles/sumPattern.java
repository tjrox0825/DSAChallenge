package invertedTriangles;
import java.util.Scanner;
public class sumPattern {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//iterating the rows with outer loop
		for (int i =1; i<=n; i++)
		{
			//printing numbers in each row
			int sum=0;

			for(int j=1; j<=i; j++)
			{
				sum=sum+j;

				if(j<=i-1)
				{
					System.out.print(j);
					System.out.print("+");

				}
				else {
					System.out.print(j);

				}





			}



			//printing "+" between numbers



			//printing the sum of these numbers
			System.out.print("=");
			System.out.print(sum);



			System.out.println(""); //each row starts with new line
		}
	}

}
