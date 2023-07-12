import java.util.Scanner;
class NumberDivision
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=s.nextInt();
		int odd=0,even=0,sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				even=i;
				sum=sum-i;
			}
			else if(i%2!=0)
			{
				odd=i;
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}