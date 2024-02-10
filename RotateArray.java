package rotatearray;
import java.util.ArrayList;
import java.util.Scanner;
public class RotateArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the number of elements to be rotated:");
        int d=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
        
        System.out.println("The elements of Array:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
        
        for(int i=0;i<n;i++)
            temp[i]=arr[(i+d)%n];
       
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Elements of Array after rotation:");
        for(int i=0;i<n;i++)
            a.add(temp[i]);
        System.out.println(a);
    }
    
}
