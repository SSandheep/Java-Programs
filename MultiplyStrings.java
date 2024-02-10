package multiplystrings;
import java.util.Scanner;
public class MultiplyStrings
{
    public String multiply(String num1, String num2) 
    {
        String res="";
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int res1=n1*n2;
        return String.valueOf(res1);
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number string:");
        String n1=sc.next();
        System.out.println("Enter 2nd number string:");
        String n2=sc.next();
        MultiplyStrings m=new MultiplyStrings();
        String product=m.multiply(n1, n2);
        System.out.println("The result is:"+product);
        
       
    }
    
}
