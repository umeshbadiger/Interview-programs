package programms;

public class evenodd
{
	public static void main(String[] args) {
		int a[] = {5,6,8,7,9,4};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println(a[i]);
			}
		}
	
		System.out.println("***************************");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
