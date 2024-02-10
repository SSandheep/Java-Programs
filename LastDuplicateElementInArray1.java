package lastduplicateelementinarray1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LastDuplicateElementInArray1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array elements are: \n"+Arrays.toString(arr)); 
        HashMap<Integer,Integer> hm=new HashMap<>();    
        ArrayList<Integer> a=new ArrayList<>();          
        for(int i=0;i<size;i++)
        {
            
            if(!hm.containsValue(arr[i]))
            {
                hm.put(i, arr[i]);
            }
            else
            {
                hm.put(i,arr[i]);      
                a.add(i);
            }
       
        }
        System.out.println(hm);
        System.out.println(a);//returns indices of duplicated elements in the array
    
        int lastindx=0;
        int lastduplicate=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            if(a.contains(e.getKey()))
            {
             lastindx=e.getKey();
             lastduplicate=e.getValue();
            }
            
        }
 /*       int lastindx=0;
        int lastduplicate=0;
        
        for(int i=0;i<size;i++)
        {
            for(int j=size-1;j>i;j--)
            {
                if(arr[i]==arr[j])
                {
                    lastindx=j;
                    lastduplicate=arr[i];
                    
                }
            } 
        }
        */
        System.out.println("The last index is:"+lastindx);
        System.out.println("The last duplicate is:"+lastduplicate); 
    }
    
}
// will pass all the test cases