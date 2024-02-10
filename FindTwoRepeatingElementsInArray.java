package findtworepeatingelementsinarray;
import java.util.ArrayList;
import java.util.Scanner;
public class FindTwoRepeatingElementsInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList <Integer> a=new ArrayList<>();
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Elements of Array are:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
        System.out.println("The repeating elements in array:");
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    System.out.println(arr[i]+" ");
            }
        }
    }
    
}
