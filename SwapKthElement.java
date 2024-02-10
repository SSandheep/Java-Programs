package swapkthelement;
import java.util.Arrays;
import java.util.Scanner;
public class SwapKthElement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The elements of Array before swapping are:\n"+Arrays.toString(arr));     
         System.out.println("Enter the K:");
         int k=sc.nextInt();
         if(k>arr.length)
             System.out.println("Invalid K");
         else{
         int a=k-1;
         int b=n-k;
         int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
         System.out.println("The elements of Array after swapping are:\n"+Arrays.toString(arr)); 
         
         }
    }
    
}
