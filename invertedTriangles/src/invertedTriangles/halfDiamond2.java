package invertedTriangles;
import java.util.Scanner;
public class halfDiamond2 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.print("*");
		System.out.println("");

		//upper Triangle
		for(int upperRow=1; upperRow<=n; upperRow++)
		{
			System.out.print("*"); //printing of first columns as stars

			//now print increasing numbers

			for(int incNum=1; incNum<=upperRow;incNum++)
			{
				System.out.print(incNum);
			}

			//now print decreasing numbers


			for(int decNum=upperRow-1; decNum>=1; decNum--)
			{

				System.out.print(decNum);


			}
			System.out.print("*");

			System.out.println("");

		}




		//lower Triangle


		for(int lowerRow=n-1; lowerRow>=1; lowerRow--)
		{
			System.out.print("*");

			//now print increasing numbers

			for(int incNum=1; incNum<=lowerRow;incNum++)
			{
				System.out.print(incNum);
			}


			//printing decreasing numbers

			for(int decNum = lowerRow-1; decNum>=1; decNum--)
			{
				System.out.print(decNum);

			}
			System.out.print("*");

			System.out.println();
		}

		System.out.print("*");

	}



}
