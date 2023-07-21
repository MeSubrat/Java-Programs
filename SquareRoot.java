import java.util.Scanner;
import java.lang.Math;
class SquareRoot
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		double num=s.nextDouble();
		double sqroot=Math.pow(num,0.5);
		System.out.println("The square root of "+num+"is "+sqroot);
	}
}