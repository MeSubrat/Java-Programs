//PROGRAM TO FIND THE ADDITION OF TWO MATRIX
import java.util.Scanner;
class MatrixAdd
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the row size: ");
		int row=s.nextInt();
		System.out.print("Enter the coloumn size: ");
		int col=s.nextInt();
		int matrix1[][]=new int[row][col];
		int matrix2[][]=new int[row][col];
		
		int sum[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=0;
			}
		}
		//TAKING INPUT TO MATRIX1
		System.out.print("Enter the elements to the first matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=s.nextInt();
			}
		}
		//TAKING INPUT TO MATRIX2
		System.out.print("Enter the elements to the second matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix2[i][j]=s.nextInt();
			}
		}
		//CALCULATION..
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=sum[i][j]+matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("\n");
		System.out.println("After Addition the matrix is: ");
		//PRINTING THE ELEMENTS OF THE ARRAY AFTER ADDITION..
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}