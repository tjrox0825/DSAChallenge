package patterns;

import java.util.Scanner;
public class interestingAlphabets {

	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();

		char temp=(char)(65+n);
		for(int i=1;i<=n;i++)
		{            
			temp=(char)(temp-i);
			for(int j=0;j<i;j++)
			{    
				System.out.print(temp);
				temp++;
			}   
			System.out.println("");
		}

	}

}
