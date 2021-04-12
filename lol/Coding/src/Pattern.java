
public class Pattern {
	public static void main(String[] args)
	{
				//pyramid
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=2*(5-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
					
		
	}

}
