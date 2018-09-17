import java.util.*;
class strsum {
  public int sum(String num)
  {
    int i,sum=0;
    if(num.length()==0)
    {return 0;}
    String s="";
    for(i=1;i<num.length();i++)
    {
      s=s+num.charAt(i);
    }
    int p=sum(s);
    if(p!=0)
    {
      sum=-48+p+(int)num.charAt(0);
      return sum;
    }
    else
    {
      return (int)num.charAt(0)-48;
    }
    
  }  
  public static void main(String[] args) {
    strsum m=new strsum();
    int n,i;
    String num;
    Scanner o=new Scanner(System.in);
    System.out.println("Enter the string");
    num=o.nextLine();
    int a=m.sum(num);
    System.out.println("The Sum is: "+a);
    
  }
}