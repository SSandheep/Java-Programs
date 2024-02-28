package replacewithnextgreatestnumberinarray;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithNextGreatestNumberInArray 
{
    public static int nextGreater(int n,int start,int arr[])
    {
        int max = Integer.MAX_VALUE;
        for(int i=start;i<arr.length;i++)
        {
            if(arr[i]>n && arr[i]<max)
                max=arr[i];
        }
         max=max==Integer.MAX_VALUE?-1:max;
        return max;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of Array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("The elements of Array before replacing are: \n"+Arrays.toString(arr));
       for(int i=0;i<size;i++)
       {
           int temp=nextGreater(arr[i],i,arr);
           arr[i]=temp;
       }
        System.out.println("The elements of Array after replacing are: \n"+Arrays.toString(arr));
    }
    
}
