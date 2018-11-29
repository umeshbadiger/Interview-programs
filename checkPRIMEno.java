package programms;

public class checkPRIMEno
{
	public static void main(String[] args) 
	{
		int no = 5;
		boolean Flag = true;
		for(int i=2; i<5; i++)
		{
			if(no%i == 0)
			{
				Flag =false;
			}
		}
		
			if(Flag = true)
			{
				System.out.println("no is prime");
			}
			else
				System.out.println("not prime no");
		
	}

}
