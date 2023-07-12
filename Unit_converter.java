import java.util.Scanner;
class Unit_converter
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("\tUNIT CONVERTER\t");
		System.out.println("Press 1 for Km-M\nPress 2 for Km-cm\nPress 3 for Km-feet\n");
		int choice=in.nextInt();
		double value;
		double answer;
		switch(choice)
		{
			case 1: System.out.print("Enter a value(in Kms)\nYour Answer:");
				value=in.nextDouble();
				answer=value*1000;
				System.out.println(answer);
				break;
			case 2: System.out.print("Enter a value(in Kms)\nYour Answer:");
				value=in.nextDouble();
				answer=value*100000;
				System.out.println(answer);
				break;
			case 3: System.out.print("Enter a value(in Kms)\nYour Answer:");
				value=in.nextDouble();
				answer=value*3280.84;
				System.out.println(answer);
				break;
			default:System.out.println("Enter a valid input");
				break;
		}
	}
}