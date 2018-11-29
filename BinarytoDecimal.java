package programms;

public class BinarytoDecimal
{
	public static void main(String[] args) 
	{
		int binary = 1101;
		int decimal = 0; int rem= 0;
		int mul =1;
		
		while(binary!=0)
		{
			rem = binary % 10;
			decimal = decimal+rem*mul;
			mul = mul *2;
			binary = binary/10;
			
		}
		System.out.println(decimal);
	}

}
