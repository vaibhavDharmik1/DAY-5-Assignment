import java.util.*;
class Biggestof3Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter 3 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int big;
		if(a>b)
			big = a;
		else
			big = b;
		if (c>big)
		 big = c;
		System.out.println("Biggest number among 3 numbers"+big);
	}
}