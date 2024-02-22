package binarysearch;
import java.util.Scanner;
public class BinarySearch {
     public static int binarySearch(int arr[], int x)
    {
        int left = 0, right = arr.length - 1;
        while (left<= right) {
            int m = (left + right) / 2;

            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                left= m + 1;
            else
                right= m - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        System.out.println("Enter the element for search:");
        int searchele=sc.nextInt();
        int pos= binarySearch(arr,searchele);
        
        if(pos==-1)
           System.out.println("The element is not found");
        else
           System.out.println("The element is found in the index " +pos);
        
    }
    
}
