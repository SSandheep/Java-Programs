package sumofmerssenenumberinarray;
import java.util.Scanner;
public class SumOfMersseneNumberInArray 
{
    public static boolean isMersseneNumber(int n)
    {
        int r=n & n+1;
        if(r==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the Array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
           if(isMersseneNumber(arr[i]))
               sum=sum+arr[i];
        }
        System.out.println("The Mersenne number sum is:"+sum);
    }
    
}
