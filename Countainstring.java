package programms;

public class Countainstring 
{
	public static void main(String[] args)
	{
		int count =0;
		String s1 = "Hellojava";
		for(int i=0; i< s1.length(); i++)
		{
			if(s1.charAt(i)=='a')
				count++;
			
		}
		System.out.println("count of a is: "+ count);
		
		System.out.println("*******************************");
		int a1[] = {6,5,7,8,5,5};
		int count1 = 0;
		for(int j=0; j<a1.length; j++)
		{
			if(a1[j]==5)
			{
				count1++;
				
			}
		}
		System.out.println("count of 5 is: "+count1);
	}

}
