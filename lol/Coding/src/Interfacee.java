//  we cannot use the method which is not declared in the interface if the.....
//....object creation is like line  number 22

interface Demo1

{
	public void show();

}
class Demo2 implements Demo1
{
	public void show()
	{
		System.out.println("SHOWING");
	}
	public void display()
	{
		System.out.println("DISPLAYING");
	}
}
public class Interfacee {
public static void main(String[] args)
{
	Demo1 obj=new Demo2();
	obj.show();
	
}
}
