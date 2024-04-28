package sortbasedonfrequrncy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SortBasedOnFrequrncy 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of Array:");      
       for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println("The Array before sorting :\n"+Arrays.toString(arr));
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<size;i++)
       {
           if(hm.containsKey(arr[i]))
               hm.put(arr[i],hm.get(arr[i])+1);
           else
               hm.put(arr[i], 1);
       }
        System.out.println(hm);
        int temp=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
              if(hm.get(arr[i])<hm.get(arr[j])){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        System.out.println("The Array after sorting :\n"+Arrays.toString(arr));
    }
    
}
