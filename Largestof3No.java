package programms;

public class Largestof3No
{
	public static void main(String[] args)
	{
		int a=100, b=200, c=30;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
		else if(b>c)
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
		
	}

}
