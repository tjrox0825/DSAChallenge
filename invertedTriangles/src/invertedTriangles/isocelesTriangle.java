package invertedTriangles;
import java.util.Scanner;
public class isocelesTriangle {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i =1;
		while(i<=n)
		{
			int spaces=1;
			//printing spaces for n-i times
			while(spaces<=n-i)
			{
				System.out.print(".");
				spaces++;
			}
			
			int num=1;
			//printing numbers = i times;
			while(num<=i)
			{
				System.out.print(num);
				num++;
			}
			
			int dec=i-1;
			//printing decreasing numbers
			while(dec>=1)
			{
				System.out.print(dec);
				dec--;
			}
			System.out.println("");
			
			i++;
		}
	}

}
