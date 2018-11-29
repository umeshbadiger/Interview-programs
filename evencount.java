package programms;

public class evencount 
{
	public static void main(String[] args) {
		int a[] = {5,6,8,7,9,4};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]%2 == 0)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println("count of evendigits is:"+sum);
		sum=0;
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]%2 != 0)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println("count of evendigits is:"+sum);
	}

}
