package fizzbuzz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FizzBuzz 
{
    public static List<String> fizzBuzz(int n) 
    {
         ArrayList<String> a=new ArrayList<>();
         for(int i=1;i<=n;i++)
         {
            if(i%3==0 && i%5==0)
                 a.add("FizzBuzz");
            else if(i%3==0)
                 a.add("Fizz");
             else if(i%5==0)
                 a.add("Buzz");
             else
                 a.add(String.valueOf(i));
         }
        return a;
    }
    public static void main(String[] args) 
    {
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the Array:");
         int N=sc.nextInt();
         List<String> res=fizzBuzz(N);
         System.out.println(res);
        
    }
}
