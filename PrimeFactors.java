import java.util.Scanner;


public class PrimeFactors {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(" The Prime factors for the given numbers are :" );
		for(int i=1; i<=n; i++){
			while(n % i == 0 ){

				System.out.println(i+"");
				
			}
		}

	}
}