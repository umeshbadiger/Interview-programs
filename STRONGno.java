package programms;

public class STRONGno 
{
	public static void main(String[] args) {
		int no = 145; int copy = no;
		int rem =0; int sum =0;
		
		while(no!=0)
		{
			rem= no%10;
			 int fact=1;
			for(int i=1;i<=rem; i++)
			{
				fact= fact*i;
				
			}
			sum = sum+fact;
			
			no= no/10;
		}
		if(sum==copy)
			System.out.println(sum+": is strong no");
		else
			System.out.println(sum+": is not strong no");
	}

}
