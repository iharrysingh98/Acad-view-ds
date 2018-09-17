import java.util.Scanner;
class Reverse
{
    public static void reverse(int[] arr, int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1 ,end-1);

    }
    public static void display(int[] arr)
    {
        for(int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int arr[] = new int[n] ;

        System.out.println("Enter the elements of array:");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }


        int start = 0;
        int end = n-1;
        reverse(arr,start,end);

        System.out.println("Reverse of the array is:");
        display(arr);
    }
}