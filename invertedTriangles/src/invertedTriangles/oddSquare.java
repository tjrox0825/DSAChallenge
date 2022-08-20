package invertedTriangles;
import java.util.Scanner;
public class oddSquare {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//to print 4 rows

		for(int row=1; row<=n; row++)
		{

			//to print odd numbers in columns
			int num1= ((2*row)-1);

            //printing increasing odd numbers
            //1357
            //357
            //57
            //7
			for(int num=1; num<=(n-row+1); num++)
			{
				System.out.print(num1);
				num1=num1+2;
			}
			
            //printing decreasing odd numbers
            //
            //1
            //13
            //135
			int num2=1;
			for(int num=1; num<=row-1; num++)
			{
				System.out.print(num2);
				num2=num2+2;

			}

			System.out.println("");
		}


	}



}
