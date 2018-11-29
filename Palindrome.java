package programms;

public class Palindrome 
{
	public static void main(String[] args) {
		int no = 1221;
		int copy = no;
		int rem=0;
		int rev = 0;
		while(no!=0)
		{
			rem= no%10;
			rev = rev*10+rem;
			no=no/10;
		}
		if(rev == copy)
			System.out.println("the no is palindrome");
		else
			System.out.println("the no is not palindrome");
	}

}
