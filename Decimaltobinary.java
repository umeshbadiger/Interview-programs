package programms;

public class Decimaltobinary 
{
	public static void main(String[] args)
	{
		int decimal = 13;
		int binary = 0;
		int mul = 1;
		
		while(decimal != 0)
		{
			int rem = decimal % 2;
			binary = binary+rem*mul;
			mul = mul*10;
			decimal = decimal/2;
		}
		System.out.println(binary);
	}

}
