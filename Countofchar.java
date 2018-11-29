package programms;

public class Countofchar
{
	public static void main(String[] args) {
		String s1 = "javamava";
		int count =0;int sum=0;
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(ch == 'a')
			{
				count++;
				sum = sum+(int)ch;
			}
				
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
