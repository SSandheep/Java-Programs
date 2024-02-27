package leader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Leader {
    public static ArrayList<Integer> leader (int a[]){
        ArrayList <Integer> r =new ArrayList<>();
        HashMap <Integer,Integer> hm1=new HashMap<>();
        HashMap <Integer,Integer> hm2=new HashMap<>();
        for(int i=0;i<a.length;i++)
        { 
            int count=0;
            for(int j=i+1;j<a.length;j++)
            {
                  if(a[i]>a[j])
                     count++;
                  
                 hm1.put(a[i],count);
            }             
        }     
        for(int i=0,j=a.length-1;i<a.length;i++,j--)
        {
           hm2.put(a[i], j);
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(hm1.get(a[i])==hm2.get(a[i]))
                r.add(a[i]);
            if(a[i]==a[a.length-1])
                r.add(a[i]);
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of Array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("The elements of Array are: \n"+Arrays.toString(arr));
        ArrayList<Integer> res=leader(arr);
        System.out.println("The leader elements are:\n"+res);
    }
    
}
