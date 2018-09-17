import java.util.*;
class bracket {
  public boolean isValid(String s, int i, int open, int closed){
    if(i == s.length()){
        if(open != closed)
         return false;
        return true;
    }   

    if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '[') open = open+1;

    if(s.charAt(i) == ')'||s.charAt(i) == '}'||s.charAt(i) == ']'){
        if(open > closed) closed = closed+1;
        else return false;
    } 

    return isValid(s, i+1, open, closed);
}
public boolean brac(String s)
{
  return isValid(s,0,0,0);
}
   public static void main(String[] args) {
    bracket m=new bracket();
    int n,i;
    String num;
    Scanner o=new Scanner(System.in);
    System.out.println("Enter the string");
    num=o.nextLine();
    boolean a=m.brac(num);
    System.out.println("Sring is: "+a);
    
  }
}