package findthemissingnumbersinanarray;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMissingNumbersInAnArray 
{
    public static int findMissingNumber(int arr[],int n)
    {
         int sum=n*(n+1)/2;
         int array_sum=0;
         for(int i=0;i<n;i++)
         {
             if(arr[i]>=1 && arr[i]<=n)
                     array_sum+=arr[i];
         }
         int missing_num=sum-array_sum;

         return missing_num;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size=sc.nextInt();
        System.out.println("Enter elements of Array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
         Arrays.sort(arr);
        System.out.println("The Array elements are: \n"+Arrays.toString(arr));
        int missing_number= findMissingNumber(arr,size);
        System.out.println("The missing number is:"+missing_number);
            
        
    }
    
}
