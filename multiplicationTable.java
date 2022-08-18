package fundamentals;
import java.util.Scanner;
public class multiplicationTable {
	
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(n*i);
			i++;
		}
		
	}

}
