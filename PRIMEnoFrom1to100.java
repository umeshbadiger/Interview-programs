package programms;

public class PRIMEnoFrom1to100
{
	public static void main(String[] args)
	{
		int count =0;
		
		for(int i=3;i<=100;i++)
		{
			boolean flag=true;
			for(int j=2; j<i; j++)
			{
				if(i%j ==0)
				{
					flag = false;
				}
			
			}
			if(flag ==true)
			{
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("total prime nos: "+count);
	}

}
