package customsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomSort 
{
    public static ArrayList<Integer>customSort(int nums[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<nums.length && j>=0;i++,j--)
        {
           if( (j>=0 ) && (!a.contains(nums[j])) )
                 a.add(nums[j]);
            if( (i<nums.length) && (!a.contains(nums[i])) )
                 a.add(nums[i]);
        }
     
        return a;
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
        System.out.println("The elements of Array before sorting are: \n"+Arrays.toString(arr));
        ArrayList<Integer>res=customSort(arr);
       System.out.println("The elements of Array after sorting are: \n"+res);
     
    }
    
}
