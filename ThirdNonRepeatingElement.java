package thirdnonrepeatingelement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ThirdNonRepeatingElement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<size;i++)
        { 
          arr[i]=sc.nextInt();
        }    
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++)
        {
             if(hm.containsKey(arr[i]))
                 hm.put(arr[i], hm.get(arr[i])+1);
             else
                 hm.put(arr[i],1);
        }
         ArrayList<Integer> a=new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            int count=e.getValue();
            if(count==1)
                a.add(e.getKey());
        }
        System.out.println(a);
         int val=0;
         if(a.size()>=3)
         {
           for(int i=0;i<a.size();i++)
           {
               val=a.get(2);
            
           }
              System.out.println("The third non repeating element is:"+val);
         }
         else 
           System.out.println("The third non repeating element is:"+"Null");
            
    }
    
}
