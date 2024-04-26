package multiplystrings1;
import java.math.BigInteger;
import java.util.Scanner;
public class MultiplyStrings1 {
   public String multiply(String num1, String num2) 
   {
        int n1=Integer.parseInt(num1);
        BigInteger a=BigInteger.valueOf(n1);
        int n2=Integer.parseInt(num2);
        BigInteger b=BigInteger.valueOf(n2);
        BigInteger res1=a.multiply(b);
        return res1.toString();
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number string:");
        String n1=sc.next();
        System.out.println("Enter 2nd number string:");
        String n2=sc.next();
        MultiplyStrings1 m=new MultiplyStrings1();
        String product=m.multiply(n1, n2);
        System.out.println("The result is:"+product);
    }
    
}
