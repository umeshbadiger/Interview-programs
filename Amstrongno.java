package programms;

public class Amstrongno 
{
	public static void main(String[] args) {
		int no = 371;
		int copy = no;
		int sum = 0; int rem = 0;
		
		while(no!=0)
		{
			rem = no%10;
			sum = sum+(rem*rem*rem);
			no = no/10;
			
					
		}
		if(sum==copy)
			System.out.println("the no is amstrong no");
		else
			System.out.println("the no is not amstrong no");
	}

}
