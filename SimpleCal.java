import java.util.Scanner;
class Ask
{
	void ask()
	{
		System.out.println("Enter two numbers");
	}
}
//Addition class extends Ask class
class Addition extends Ask
{
	int add(int a,int b)
	{
		Addition ad=new Addition();
		//ad.ask();
		int c=a+b;
		return c;
	}
}
//Multiplication class extends Addition which already extends Ask class
class Multiplication extends Addition
{
	int multiplication(int a,int b)
	{
		Multiplication m = new Multiplication();
		//m.ask();
		int c=a*b;
		return c;
	}
}
//Main Function
//SimpleCal class extends Multiplication class which already extends Addition(which already exetends Ask class)
class SimpleCal extends Multiplication
{
	public static void main(String []args)
	{
		Scanner	s=new Scanner(System.in);
		SimpleCal obj=new SimpleCal();
		obj.ask();
		int x=s.nextInt();
		int y=s.nextInt();
		//obj.add(x,y);
		//obj.multiplication(x,y);
		System.out.println("Sum is "+obj.add(x,y));
		System.out.println("Multiplication "+obj.multiplication(x,y));
	}
}
		
		
		
		