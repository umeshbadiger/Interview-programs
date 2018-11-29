package programms;

public class CheckTotalBinarynos {
	public static void main(String[] args) {
		int decimal = 167101 ;
		int binary =0;
		int rem = 0;
		int mul =1; int count=0;
		
		while(decimal != 0)
		{
			rem = decimal %10;

			if(rem==1 || rem ==0)
				count++;
			decimal = decimal/10;
		}
		System.out.println(count);
	}
}
