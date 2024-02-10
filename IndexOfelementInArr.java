package indexofelementinarr;

import java.util.Scanner;

public class IndexOfelementInArr {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the element:");
        int k=sc.nextInt();
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
            if(arr[i]==k)
                System.out.println("The index of the element is :"+i);
            
        }
    }

    
}
