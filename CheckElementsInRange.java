package checkelementsinrange;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckElementsInRange 
{
    public static boolean checkElementsInRange(int arr[],int s,int t)
    {
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            st.add(arr[i]);
        }
        System.out.print(st);
        for(int i=s;i<=t;i++)
        {
           if(!st.contains(i))
               return false;
           else
               return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the range elements:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("The range is :"+start+" to "+end);
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("The elements of Array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        if(checkElementsInRange(arr,start,end))
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }
    
}
