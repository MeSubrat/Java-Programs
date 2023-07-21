//WRITE A JAVA PROGRAM TO PRINT THE TRANSPOSE OF A 2D MATRIX...
import java.util.Scanner;
class TransposeOfArr
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row=s.nextInt();
		System.out.println("Enter the coloumn size: ");
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter the elements to the array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
	}
}	