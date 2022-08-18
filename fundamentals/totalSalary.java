package fundamentals;
import java.util.Scanner;
import java.lang.Math;

public class totalSalary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int basic = input.nextInt();
		String str= input.next();
		char grade = str.charAt(0);
		int allow = 0;


		if(grade=='A')
		{
			allow = 1700;


		}
		else if (grade == 'B')
		{
			allow = 1500;


		}
		else if(grade=='C')
		{
			allow = 1300;


		}
		else {
			System.out.println("Wrong grade entered");
			return;
		}

		double totalSalary = (basic + ( 0.2 * basic) + (0.5 * basic) + allow) - (0.11 * basic); 
		totalSalary = Math.round(totalSalary);
		int h = (int) totalSalary;
		System.out.println(h);


	}

}
