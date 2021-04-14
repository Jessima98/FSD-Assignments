interface I1
{
	void show();
}
interface I2 extends I1
{
	void display();
}
interface I3 extends I2
{
	void displayShow();
}
class Chess implements I3
{
	public void show()
	{
		System.out.println("SHOWING...");
	}
	public void display()
	{
		System.out.println("Displaying....");
	}
	public void displayShow()
	{
		System.out.println("DISPLAYING AND SHOWING....");
	}
}
public class AgainInterface {
	public static void main(String[] args)
	{
		Chess ch=new Chess();
		ch.display();
		ch.show();
		ch.displayShow();
	}


}
