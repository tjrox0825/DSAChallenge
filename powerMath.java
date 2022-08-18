package fundamentals;
import java.util.Scanner;
public class powerMath {
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int n = input.nextInt();
		int i =1;
		int ans=1;
		
		for(i=1; i<=n; i++)
		{
			ans = ans*x;
		}
		System.out.println(ans);
	}

}
