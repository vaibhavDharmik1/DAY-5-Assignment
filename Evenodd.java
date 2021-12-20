import java.util.*;
class Evenodd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		if (n%2==0)
			System.out.println(n+" number is even ");
		else
			System.out.println(n+" number is odd ");
	}
}

