package fundamentals;
import java.util.Scanner;
public class factors {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int div =2;
		for(div=2; div<n;div++) {
			if(n%div==0) {
				System.out.print(div+" ");
			}
		}
	}
}
