//PRINT THE FIBONACCI SERIES USING DO-WHILE LOOP
import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args)
	{
		int sum,a=0,b=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number till which the series will continue: ");
		int num=s.nextInt();
		int i=0;
		do
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
			i++;
		}while(i<=num);
	}
}