import java.util.Scanner;

class Maxfreq
{
    static char findMaxFreq(String str)
    {
        int i=0,len=str.length(),pos=0;
        char ch = str.charAt(i);
        int freq[] = new int[26];
        while(i<len)
        {
            ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                freq[(ch-65)]++;
            else if(ch >= 'a' && ch <= 'z')
                freq[(ch-97)]++;
            i++;
        }
        int max = freq[0];
        for(i=0;i<26;i++)
        {
            if(max < freq[i])
            {
                max = freq[i];
                pos = i;
            }
        }
        ch = (char)(pos+65);
        return ch;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println("String : " + str);
        char max = findMaxFreq(str);
        System.out.println("Character with the max frequency : '" + max + "'");
        System.out.println();
    }
}