package fundamentals;
import java.util.Scanner;
public class checkPrime {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int div=2;
		boolean isPrime = true;

		for(div=2; div*div <=n; div++)
		{
			if(n%div==0)
			{
				isPrime = false;
			}

		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}

	}

}
