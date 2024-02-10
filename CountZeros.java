package countzeros;
import java.util.Scanner;
public class CountZeros {
    public static void main(String[] args) 
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
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
            if(arr[i]==0)
             count++;
        }
        System.out.println("The number of zeros are:"+count);
    }
}
