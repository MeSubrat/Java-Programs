import java.util.Scanner;
class Table
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number for the multiplication table: ");
		int num=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int result=num*i;
			System.out.println(num+" X "+i+" = "+result);
		}
	}
}