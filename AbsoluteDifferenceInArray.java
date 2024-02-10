package absolutedifferenceinarray;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AbsoluteDifferenceInArray 
{
    public static String isSatisfied(List<Integer> arr)
    {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            if(i<arr.size()-1)
                res.add(Math.abs(arr.get(i)-arr.get(i+1)));
        }
        System.out.println(res);
        int n=res.size();
        int sum=0;
        int k=n*(n+1)/2;
        for(int i=0;i<res.size();i++){
           sum+=res.get(i);
        }
            if(sum==k)
                return "Condition Satisfied";
            else
                return "Not Satisfied";    
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the size of the ArrayList:");
        int size=sc.nextInt();
         System.out.println("Enter the elements of Array:");
        for(int i=0;i<size;i++)
           arr.add(sc.nextInt());       
       String str= isSatisfied(arr);
        System.out.println(str);
    }
}
