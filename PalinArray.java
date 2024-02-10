package palinarray;

import java.util.Scanner;

public class PalinArray {
    public static boolean isPalindrome(int num)
    {
        int digit;
        int rev=0;
        int temp=num;       
        while(temp>0)
        {
           digit=temp%10;
           rev=(rev*10)+digit;
            temp=temp/10;
        }
        if(rev==num)
            return true;
        else
            return false;
        
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int k=0;
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
        for(int i=0;i<n;i++)
        {
            if(isPalindrome(arr[i]))
               k++;
            else
               k--;
              
        }
        if(k==n)
            System.out.println("PalinArray");
        else
            System.out.println("Not an PalinArray");
       
    }
    
}
