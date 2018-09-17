import java.util.*;
class fibonacci {
    public int fibo(int n)
    {
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        fibonacci m=new fibonacci();
        int n,i,num;
        Scanner o=new Scanner(System.in);
        System.out.println("enter nth term of fibbonacci series");
        n=o.nextInt();
        int a=m.fibo(n);
        System.out.println("term is: "+a);

    }
}