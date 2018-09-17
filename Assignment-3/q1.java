import java.util.Scanner;
class Search
{
    public static boolean search(int[] arr, int num)
    {
        if(arr.length == 0)
        {
            return false;
        }
        int smallArray[] = new int[arr.length-1];

        for(int i = 0 ; i < smallArray.length ; i++)
        {
            smallArray[i] = arr[i+1];
        }
        boolean smallans = search(smallArray, num);
        if(smallans)
        {
            return true;
        }
        else
        {
            if(arr[0] == num)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int arr[] = new int[n] ;

        System.out.println("Enter the values");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched");
        int m = sc.nextInt();

        boolean res = search(arr,m);

        if(res)
        {
            System.out.println(m+" is present in array");
        }
        else
        {
            System.out.println(m+" is absent in array");
        }
    }
}