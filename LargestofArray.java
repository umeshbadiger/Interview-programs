package programms;

public class LargestofArray 
{
	public static void main(String[] args) {
		int a[] = {5,6,80,3,100};
		
		int largest=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]> largest)
			{
				largest = a[i];
			}
		}
	}

}
