package fundamentals;
import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int S = input.nextInt();
		int E = input.nextInt();
		int W = input.nextInt();
		int C1=0;

		while(S<=E) {

			C1 = ((5*(S-32))/9);
			System.out.println(S+"\t"+C1);

			S=S+W;

		}
	}

}
