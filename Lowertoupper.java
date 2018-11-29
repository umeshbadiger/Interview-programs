package programms;

public class Lowertoupper 
{
	public static void main(String[] args)
	{
		char ch = 'Q';
		System.out.println((char)(ch+32));
		String s1 ="qspiders";
		s1=(char) (s1.charAt(0)-32)+s1.substring(1);
		System.out.println(s1);
	}

}
