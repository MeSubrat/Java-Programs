import java.util.Scanner;
class Squareprint
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row=s.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				if(i==0 || j==0 || i==(row-1) || j==(row-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}