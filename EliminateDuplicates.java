package eliminateduplicates;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class EliminateDuplicates 
{
    public static void main(String[] args){
        System.out.println("Enter size of the Array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of Array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements before eliminating the Duplicates:");
        System.out.println(Arrays.toString(arr));    
        ArrayList<Integer> a=new ArrayList<>();
       for(int i=0;i<n;i++)
       { 
          if(!a.contains(arr[i]))
              a.add(arr[i]);
       }
       System.out.println("Array elements after eliminating the Duplicates:"); 
       System.out.println(a);
    }
   
}

