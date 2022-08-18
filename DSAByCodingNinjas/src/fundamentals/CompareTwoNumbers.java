package fundamentals;
import java.util.Scanner;
public class CompareTwoNumbers {

	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2= input.nextInt();

		if(num1>num2)
		{
			System.out.println("First Number is greater than Second Number");
		}
		else if(num2>num1) 
		{
			System.out.println("Second Number is greater than First Number");
		}
		else {
			System.out.println("Both numbers are equal");
		}
	}
}

