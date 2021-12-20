import java.util.*;
class Swap2Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter value of x");
		x = sc.nextInt();
		System.out.println("Enter value of y");
		y = sc.nextInt();
		
		z = x;
		x = y;
		y = z;
		System.out.println("After Swapping : x="+" "+x+" y= "+y);
	}
}
