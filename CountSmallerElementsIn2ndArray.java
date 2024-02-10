package countsmallerelementsin2ndarray;
import java.util.Arrays;
import java.util.Scanner;
public class CountSmallerElementsIn2ndArray {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter the elements of the 1st array:");
        for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd Array:");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int countsmaller[]=new int[n];
        for(int i=0;i<n;i++)
        {
             int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr1[i]>=arr2[j])
                    count++;
            }
            countsmaller[i]=count;
        }
   System.out.println(Arrays.toString(countsmaller));
    }
}
