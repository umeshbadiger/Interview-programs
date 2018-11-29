package programms;

import java.util.Scanner;

public class ReverseNoheckPALINDROME
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int no = sc.nextInt();
		int rem = 0; int rev =0;
		int copy = no;
		
		while(no!=0)
		{
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
			
		}
		if(rev == copy) {
			System.out.println(rev+": is palindrome");
		}
		else
			System.out.println(copy+": is not a palindrome");
	}

}
