import java.util.*;
class power {
  public int pow(int num,int n)
  {
    int ans;
    if(n!=0)
    {
      ans=num*pow(num,n-1);
      return ans;
    }
    else
    return 1;
  }
  public static void main(String[] args) {
    power m=new power();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter the number");
    num=o.nextInt();
    System.out.println("enter the power");
    n=o.nextInt();
    int a=m.pow(num,n);
    System.out.println("number is: "+a);
    
  }
}