package programms;

public class ArrayReverse {
	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,2,5};
		int count = 0;
		int size = a.length-1;
		
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++ )
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=a[size-1];
					size--;
					j--;
					
				}
			}
		
		}
		System.out.println(count);
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]);
		}
	}
}
