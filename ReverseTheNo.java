package programms;

public class ReverseTheNo 
{
	public static void main(String[] args) 
	{
		int no =146;
		int copy = no;
		int rem = 0;
		int rev = 0;
		
		  while(no!=0)
		  {
			  rem = no%10;
			  rev = rev*10+rem;
			  no=no/10;
			  
		  }
		 System.out.println(rev);
	}
}
