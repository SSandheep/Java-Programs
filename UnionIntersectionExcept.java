package unionintersectionexcept;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class UnionIntersectionExcept
{
    public static List<Integer> union(List<Integer>l1, List<Integer>l2)
    {
       List<Integer> uni=new ArrayList<>();
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<l1.size();i++)
       {
           hm.put(l1.get(i), 1);
       }
       for(int i=0;i<l2.size();i++)
       {
           if(!hm.containsKey(l2.get(i)))
               hm.put(l2.get(i), 1);
       }
       for(Map.Entry<Integer,Integer> e:hm.entrySet())
       {
           if(e.getValue()==1)
               uni.add(e.getKey());
       }
        return uni;
    }
    
    public static List<Integer> intersection(List<Integer>l1, List<Integer>l2)
    {
       List<Integer> inter=new ArrayList<>();
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<l1.size();i++)
       {
           hm.put(l1.get(i), 1);
       }
       for(int i=0;i<l2.size();i++)
       {
           if(hm.containsKey(l2.get(i)))
               hm.put(l2.get(i),2);
       }
       for(Map.Entry<Integer,Integer> e:hm.entrySet())
       {
           if(e.getValue()!=1)
               inter.add(e.getKey());
       }
        return inter;
    }
    public static List<Integer>except(List<Integer>l1, List<Integer>l2)
    {
       List<Integer> ex=new ArrayList<>();
       for(int i=0;i<l1.size();i++)
       {
           if(l1.get(i)%2==0)
               ex.add(l1.get(i));
       }
        for(int i=0;i<l2.size();i++)
       {
           if((l2.get(i)%2)!=0)
               ex.add(l2.get(i));
       }
       
        return ex;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        System.out.println("Enter the size of 1st list:");
        int n1=sc.nextInt();
        System.out.println("Enter elements of 1st list:");
        for(int i=0;i<n1;i++)
        {
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
        System.out.println("Enter the size of 2nd List:");
        int n2=sc.nextInt();
        System.out.println("Enter elements of 2nd list:");
        for(int i=0;i<n2;i++)
        {
            l2.add(sc.nextInt());
        }
        System.out.println(l2);
        List<Integer> uni=union(l1,l2);
        List<Integer>inter=intersection(l1,l2);
        List<Integer>ex=except(l1,l2);
        System.out.println("Union is:\n"+uni);
        System.out.println("Intersection is:\n"+inter);
        System.out.println("Except is:\n"+ex);
    }
    
}
