package fundamentals;
import java.util.Scanner;
public class sumOfDigits {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int sumEven=0;
		int sumOdd =0;
		int i;
		
		while(N>0) {
			i = N%10;
			N=N/10;
			if(i%2==0) 
			{
				sumEven= sumEven+i;
				
				
			}
			else {
				sumOdd = sumOdd+i;
			}
			
		}
		
		System.out.println(sumEven + " "+sumOdd);
		
	}

}
