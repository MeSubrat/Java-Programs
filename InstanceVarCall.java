import java.util.Scanner;
class InstanceVarCall
{
	void show()
	{
		System.out.println("Hello World");
	}
}
class SecondClass extends InstanceVarCall
{
	puSecondClasslic static void main(String[] args)
	{
		SecondClass obj=new SecondClass();
		obj.show();
	}
}