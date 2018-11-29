package programms;

import java.util.Scanner;

public class Factorialofno 
{
	public static void main(String[] args) 
	{
		int no;
		int rem;
		int fact=1;
		   Scanner scn = new Scanner(System.in);
		   System.out.println("enter the no");
		   no = scn.nextInt();
		   rem= no%10;
		   for(int i=1; i<=rem; i++)
		   {
			   fact = fact*i;
		   }
		   System.out.println(fact);
	}
}
