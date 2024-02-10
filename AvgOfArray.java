package avgofarray;
import java.util.Scanner;
public class AvgOfArray 
{
    public static int findAvg(int arr[])
    {
        int avg=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The Sum is:"+sum);
        avg=sum/arr.length;
        return avg;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of the Array:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The elements of Array are:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
      findAvg(arr);
      System.out.println("The average is:"+findAvg(arr));
    }
    
}
