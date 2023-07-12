import java.util.Scanner;
import java.lang.Math;
class Exponential
{
	static double fact(double n)
	{
		if(n<=1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		double x=s.nextDouble();
		System.out.print("Enter the value of n: ");
		double n=s.nextDouble();
		double sum=0,result=0;
		double power;
		//System.out.println(fact(n));
		for(double i=1;i<=n;i++)
		{
			power=Math.pow(x,i);
			result=power/fact(i);
			sum=sum+(result);
		}
		System.out.print("Result= "+sum);
	}
}