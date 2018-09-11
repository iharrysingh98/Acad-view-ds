import java.util.*;
class Wave{
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    int r,c,n,i,j=0,max=0,k=-1,n1;
    System.out.println("Enter the size of rows and cols");
    r=o.nextInt();
    c=o.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("Enter elements of array");
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        arr[i][j]=o.nextInt();
      }
    }
    for(i=0;i<r;i++)
    {
      if(k==-1)
      {
        for(k=0;k<c;k++)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      else
      {
        for(k=c-1;k>=0;k--)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      
    }
    
  }
}