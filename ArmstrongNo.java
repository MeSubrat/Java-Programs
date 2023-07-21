//JAVA PROGRAM TO CHECK WHETHER A NUMBER IS ARMSTRONG OR NOT..
import java.util.Scanner;
class ArmstrongNo
{
	static boolean isArmstrong(int num)
	{
		int digits=0,sum=0;
		int n=num;
		while(n>0)
		{
			digits=n%10;
			sum=sum+(digits*digits*digits);
			n=n/10;
		}
		if(sum==num)
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number to check whether the number is armstrong or not");
		int num=s.nextInt();
		System.out.println(isArmstrong(num));
	}
}