import java.util.Scanner;
class Palindrome
{
	private String str,rev;
	
	public boolean checkPalindrome()
	{
		if(str.equals(rev))
			return true;
		else
			return false;
	}
	
	public void setStr(String str)
	{
		this.str = str;
	}
	
	public String getStr()
	{
		return str;
	}
	
	public String getRev()
	{
		return rev;
	}
	
	public void findRev()
	{
		rev = new String("");
		int i=0,len=str.length();
		char ch;
		while(i<len)
		{
			ch = str.charAt(len-i-1);
			rev += ch;
			i++;
		}
	}
}
class main
{
	public static void main(String[] args)
	{
		Palindrome obj = new Palindrome();
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		obj.setStr(str);
		obj.findRev();
		System.out.println("String : " + obj.getStr());
		System.out.println("Reverse : " + obj.getRev());
		System.out.println("Is it a  Palindrome? : " + obj.checkPalindrome());
		System.out.println();
	}
}