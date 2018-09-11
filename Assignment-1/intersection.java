import java.util.*;
class Intersection {
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    int n,i,j,max=0,k=0,n1;
    System.out.println("Enter the size of array 1");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements of array 1");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
    System.out.println("Enter the size of array 2");
    n1=o.nextInt();
    int arr1[]=new int[n1];
    System.out.println("Enter elements of array 2");
    for(i=0;i<n1;i++)
    {
      arr1[i]=o.nextInt();
    }
    int arr2[]=new int[20];
for(i=0;i<n;i++)
    {
      for(j=0;j<n1;j++)
      {
        if((arr[i]==arr1[j])&&(arr[i]!=-1)&&(arr1[j]!=-1))
        {
          arr2[k]=arr[i];
          k++;
          
          arr[i]=-1;
          arr1[j]=-1;
        }
      }
    }

    for(i=0;i<k;i++)
    {
      for(j=0;j<k-i-1;j++)
      {
        if(arr2[j]>arr2[j+1])
        {
          arr2[j]=arr2[j]^arr2[j+1];
          arr2[j+1]=arr2[j]^arr2[j+1];
          arr2[j]=arr2[j]^arr2[j+1];
        }
      }
      
    }
    System.out.println("final array:");
    for(i=0;i<k;i++)
    {
      System.out.print(arr2[i]+" ");
    }
    
  }
}
