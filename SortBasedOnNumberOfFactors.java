package sortbasedonnumberoffactors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class SortBasedOnNumberOfFactors 
{
    public static int findNumberOfFactors(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array:");
       int size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter the elements of Array:");
       for(int i=0;i<size;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("The Array before sorting :\n"+Arrays.toString(arr));
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<size;i++)
       {
           hm.put(arr[i], findNumberOfFactors(arr[i]));
       }
        System.out.println(hm);
        int temp;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(hm.get(arr[i])>hm.get(arr[j]))
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println("Array after sorting based on number of factors is: \n"+Arrays.toString(arr));
    }
    
}
