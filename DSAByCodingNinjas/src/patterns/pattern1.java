package patterns;

import java.util.Scanner;

public class pattern1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 1;
		for (i=1; i<=n; i++)
		{
			int j=1;
			for(j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
