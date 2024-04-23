package factorial;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial
{
    public static BigInteger factorial(BigInteger n)
    {  
        if(n.equals(BigInteger.valueOf(1))||n.equals(BigInteger.valueOf(0)))
            return BigInteger.valueOf(1);
        else
             return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }
     
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        long N=sc.nextLong();
        BigInteger num;
        num=BigInteger.valueOf(N);
        BigInteger factorial=factorial(num);
        System.out.println(factorial);

    }
    
}
