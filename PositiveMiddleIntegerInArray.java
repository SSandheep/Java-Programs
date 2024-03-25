package positivemiddleintegerinarray;
import java.util.ArrayList;
import java.util.Scanner;
public class PositiveMiddleIntegerInArray 
{
    public static int findPositiveMidElement(int arr[],int n)
    {
         ArrayList<Integer>a =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                a.add(arr[i]);
        }
        System.out.println(a);
        int mid=a.size()/2;
         
        return a.get(mid);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size=sc.nextInt();
        System.out.println("Enter elements of Array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int midelement=findPositiveMidElement(arr,size);
        System.out.println("The positive middle element is: "+midelement);   
     
    }
    
}
