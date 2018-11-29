package programms;

public class ar1 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		int a[] = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=4;
		a[3]=6;
		a[4]=8;
	
		for(int i=0; i<=a.length; i++ )
		{
			System.out.println(a[i]);
		}
	
		for(int j=a.length-1; j>=0; j--)
		{
			System.out.println(a[j]);
		}
		System.out.println("main ended");
		
	}

}
