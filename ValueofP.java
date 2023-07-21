//WRITE A JAVA PROGRAM TO FIND THE VALUE OF THE GIVEN EXPRESSION P=(A^2+B^2)/(A-B)
import java.util.Scanner;
import java.lang.Math;
class ValueofP
{
	public static void main(String []args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=s.nextInt();
		System.out.println("Enter the value of b: ");
		int b=s.nextInt();
		double p;
		//p=((a*a)+(b*b))/(a-b);METHOD1
		p=(Math.pow(a,2)+Math.pow(b,2))/(a-b);//METHOD2
		System.out.println("P= "+p);
	}
}
	