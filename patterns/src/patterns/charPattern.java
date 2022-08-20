package patterns;
import java.util.Scanner;
public class charPattern {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i=1; i<=n; i++) {

			for (int j=1; j<=n; j++) 
			{
				//explicit conversion
				char jChar = (char) ('A'+j-1);
				System.out.print(jChar);
			}
			System.out.println();
		}

	}

}
