package alternateelementsofarray;
import java.util.Scanner;
public class AlternateElementsOfArray 
{
    public static void main(String[] args) 
    {
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
        System.out.println("The Alternate elements of Array are:");
        for(int i=0;i<n;)
        {
            System.out.println(arr[i]);
            i=i+2;
        }

    }
    
}
