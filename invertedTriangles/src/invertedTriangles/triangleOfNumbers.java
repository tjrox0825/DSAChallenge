package invertedTriangles;
import java.util.Scanner;
public class triangleOfNumbers {

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int i=1;
		while(i<=n)

		{

			int spaces =1;
			while(spaces<=n-i)
			{
				System.out.print(".");
				spaces++;
			}

			//increasing numbers

			int inc=1; //Column loop controller
			int p =i; //to be printed
			while(inc<=i)
			{



				System.out.print(p);
				p++;
				inc++;


			}

			//printing spaces
			int dec = i-1; //Column loop controller
			int f=2*(i-1);//to be printed
			while(dec>=1)
			{
				System.out.print(f);
				dec--;
				f--;
			}

			System.out.println(); //next row should start with new line
			//increasing row
			i++;

		}
	}

}
