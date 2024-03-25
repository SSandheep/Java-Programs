package decimaltobinaryconversion;
import java.util.Scanner;
public class DecimalToBinaryConversion 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer number:");
        int num=sc.nextInt();
        StringBuilder s=new StringBuilder();
        int rem;
        while(num!=1)
        {
          rem=num%2;
          s.append(rem);
          num=num/2;
        }
        if(num==1)
            s.append(num);
        System.out.println("The corresponding binary number is: \n"+s.reverse().toString());
    }
    
}
