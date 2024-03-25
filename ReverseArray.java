package reversearray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of Array:");
        int arr[]=new int[size];
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("The Array elements before reversing are: \n"+Arrays.toString(arr));
        for(int i=size-1;i>=0;i--)
            a.add(arr[i]);
        System.out.println("The Array elements after reversing are: \n"+a);
    }
    
}
