package countsmallerelementsonrightside;
import java.util.Arrays;
import java.util.Scanner;
public class CountSmallerElementsOnRightSide 
{
    public static void main(String[] args) 
    {      
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("The elements of Array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int countsmaller[]=new int[n];
        for(int i=0;i<n;i++)
        {
             int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
            countsmaller[i]=count;
        }
   System.out.println(Arrays.toString(countsmaller));
    }
    
}
