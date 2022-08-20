package invertedTriangles;
import java.util.Scanner;
public class halfDiamond {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();



		if(n==0) 
		{
			System.out.print("*\n");
			System.out.print("*");

		}

		else {
			int upperRows = n+1;

			//upper Triangle
			for(int upperRow=1; upperRow<=upperRows; upperRow++)
			{
				System.out.print("*"); //printing of first columns as stars

				//now print increasing numbers

				for(int incNum=1; incNum<=upperRow-1;incNum++)
				{
					System.out.print(incNum);
				}

				//now print decreasing numbers

				int toPrint = upperRow-2;
				for(int decNum=1; decNum<=upperRow-1; decNum++)
				{
					int x = toPrint;
					if(x==0)
					{
						System.out.print("*");
					}
					else {
						System.out.print(x);
					}

					toPrint--;


				}

				System.out.println();




			}




			//lower Triangle
			int lowerRows = ((2*n)+1)/2;

			for(int lowerRow=lowerRows; lowerRow>=1; lowerRow--)
			{
				System.out.print("*");

				//now print increasing numbers

				for(int incNum=1; incNum<=lowerRow-1;incNum++)
				{
					System.out.print(incNum);
				}


				//printing decreasing numbers
				int toPrint = lowerRow -2;
				for(int decNum = 1; decNum<=lowerRow-1; decNum++)
				{
					int x = toPrint; 
					if(x==0)
					{
						System.out.print("*");
					}
					else {
						System.out.print(x);
					}
					toPrint--;

				}




				System.out.println();
			}

			System.out.println(); // new line for every row



		}
	}

}
