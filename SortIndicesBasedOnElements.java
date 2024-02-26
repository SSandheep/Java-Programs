package sortindicesbasedonelements;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class SortIndicesBasedOnElements
{
    public static void main(String[] args) 
    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
                int size=sc.nextInt();
        int arr[]=new int[size];
        int ind[]=new int[size];
        System.out.println("Enter elements of Array:");      
       for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println("The Array before sorting :\n"+Arrays.toString(arr));
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<size;i++)
       {
               hm.put(arr[i], i);
       }
        System.out.println(hm);
        int temp=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
              if((arr[i])>(arr[j]))
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
                 ind[i]=hm.get(arr[i]);
            }
        System.out.println("The Array after sorting :\n"+Arrays.toString(ind));
        
    }
    
}
