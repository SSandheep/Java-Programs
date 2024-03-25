package eliminateduplicates1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class EliminateDuplicates1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of Array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array elements before eliminating the duplictaes are:\n"+Arrays.toString(arr));
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<size;i++)
            h.add(arr[i]);
        System.out.println("Array elements after eliminating the duplicates:\n"+h);
        
    }
     
}
