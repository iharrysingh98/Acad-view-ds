import java.util.Scanner;

class Toggle
{
	static String toggleCase(String str)
	{
		int i=0,len=str.length();
		char ch;
		String newStr = new String();
		while(i<len)
		{
			ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				newStr += (char)(ch+32);
			else if(ch >= 'a' && ch <= 'z')
				newStr += (char)(ch-32);
			else
				newStr += ch;
			i++;
		}
		return newStr;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("String  : " + str);
		str = toggleCase(str);
		
		System.out.println("After toggling the case the answer is ,");
		System.out.println("String: " + str);
		System.out.println();
	}
}