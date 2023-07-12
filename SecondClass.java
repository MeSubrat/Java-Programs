import java.util.Scanner;
class FirstClass
{
	void show()
	{
		System.out.println("Hello World");
	}
} 
class SecondClass extends FirstClass
{
	public static void main(String[] args)
	{
		SecondClass obj=new SecondClass();
		obj.show();
	}
}