import java.util.*;
class max_val {
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    int n,i,j,max=0;
    System.out.println("Enter the size of array");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println("Max value in array is: "+max);
  }
}