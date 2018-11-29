package programms;

public class sumofsquaresofdigit 
{
	public static void main(String[] args) {
		int no = 123;
		int sum = 0;
		int rem;
		while(no != 0)
		{
			rem = no%10;
			sum= sum+(rem*rem);
			no= no/10;		
		}
		System.out.println(sum);
	}

}
