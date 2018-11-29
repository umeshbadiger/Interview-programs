package programms;

public class SecondLargestOF4 
{
	public static void main(String[] args)
	{
		int a=100,b=20,c=300,d=400;
		int temp =0;
	
		if(a>b && a>c && a>d)
		{
			temp = a;
			a=d;
			d=temp;
		}
		else if(b>a && b>c && b>d)
		{
			temp =b;
			b= d;
			d= temp;
		}
		else if(c>a && c>b && c>d)
		{
			temp=c;
			c= d;
			d = temp;
		}
		
		if(a>b && a>c)
		{
			System.out.println(a+" is second largest");
		}
		
		else if(b>c)
		{
			System.out.println(b+" is second largest");
		}
		else
			System.out.println(c+" is second largest");
	
	}
}
