package medianoftwosortedarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArrays 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of 1st Array:");
        int n1=sc.nextInt();
        System.out.println("Enter Size of 2nd Array:");
        int n2=sc.nextInt();
        System.out.println("Size Of Merged Array is:");
        int s=n1+n2;
         System.out.println(s);
         int arr1[]=new int[n1];
         int arr2[]=new int[n2];
         int mA[]=new int[s];
         int mid1=0;
         int mid2=0;
         if(s%2==0)
         {
            mid1=(s-1)/2;
            mid2=s/2;
         }
         else
         {
             mid1=s/2;
             mid2=(s+1)/2;
         }
         
             
        System.out.println("Enter elements of 1st Array:");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd Array:");
        for(int j=0;j<arr1.length;j++)
        {
            arr2[j]=sc.nextInt();
        }
        
        System.out.println("Elements of 1st Array is:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("Elements of 2nd Array is:");
        for(int j=0;j<arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
        System.out.println("Elements of Merged Array is:");
        for(int k=0;k<n1;k++)
        {
            mA[k]=arr1[k];
            mA[k+n1]=arr2[k];
        }
        System.out.println("Merged Array before Sorting:");
        for(int k=0;k<mA.length;k++)
        {
            System.out.println(mA[k]);
        }
        Arrays.sort(mA);
        System.out.println("Merged Array after Sorting:");
        for(int k=0;k<mA.length;k++)
        {
            System.out.println(mA[k]);
        }
        System.out.println("Middle Elements are:");   
        System.out.println(mA[mid1]+","+mA[mid2]);
        int median=(mA[mid1]+mA[mid2])/2;
        System.out.println("The median of these arrays is:"+median);
        
       
    }

    
}
