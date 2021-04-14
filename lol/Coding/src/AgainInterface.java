interface I1
{
	void show();
	default void showDisplay()
	{
		System.out.println("Showing and displaying....");
	}
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
		ch.showDisplay();
		ch.show();
		ch.displayShow();
	}


}
