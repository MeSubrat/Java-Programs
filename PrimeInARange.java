import java.util.Scanner;
class PrimeInARange
{
	static boolean checkPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int range1,range2;
		System.out.print("Enter the first range: ");
		range1=s.nextInt();
		System.out.print("Enter the last range: ");
		range2=s.nextInt();
		for(int i=range1;i<=range2;i++)
		{
			if(checkPrime(i)==true)
			{
				System.out.println(i);
			}
		}
	}
}