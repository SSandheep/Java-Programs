package oddarrayevenarrayfromanarray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class OddArrayEvenArrayFromAnArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Array size:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter Elements of Array:");
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("Array Elements are:");
       Arrays.toString(arr);
       ArrayList<Integer> odd=new ArrayList<>();
       ArrayList<Integer> even=new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]%2==0)
               odd.add(arr[i]);
           else 
               even.add(arr[i]);
       }
       System.out.println(odd);
       System.out.println(even);
       
    }
    
}
