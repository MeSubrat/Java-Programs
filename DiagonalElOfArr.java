//WRITE A JAVA PROGRAM TO PRINT THE DIAGONALS OF A 2D ARRAY..
import java.util.Scanner;
class DiagonalElOfArr
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
		System.out.println("The matrix array elements are: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("The diagonal elements are: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]+"  ");
				}
			}
			//System.out.println("\n");
		}
		System.out.println("\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if((i+j)==(row-1) && (i+j)==(col-1)){
					System.out.print(arr[i][j]+"  ");
				}
			}
			//System.out.println("\n");
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if((i+j)==(col-1)&&(i+j)==(row-1))
				{
					int temp=arr[i][(col-1)-i];
					arr[i][(col-1)-i]=arr[i][i];
					arr[i][i]=temp;
				}		
			}
		}
		System.out.println("\n");
		System.out.println("The elements after diagonal swapping are: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}