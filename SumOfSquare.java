import java.util.Scanner;
class SumOfSquare
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+(i*i);
		}
		System.out.println(sum);
	}
}