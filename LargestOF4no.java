package programms;

public class LargestOF4no
{
	public static void main(String[] args)
	{
		int a=100,b=20,c=3,d=40;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("A");
				}
				else
				{
					System.out.println("D");
				}
			}
			else if(c>d)
			{
				System.out.println("C");
			}
			else
			{
				System.out.println("D");
			}	
		}
		else if(b>c)
		{
			if(b>d)
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("D");
			}
		}
		else if(c>d)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}	
		
		
	}

}
