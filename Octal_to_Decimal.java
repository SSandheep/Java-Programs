package octal_to_decimal;
import java.util.Scanner;
public class Octal_to_Decimal 
{
    public static int convertToDecimal(String s)
    {
        int sum=0;
        int j=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            sum=sum+(Integer.parseInt(String.valueOf(s.charAt(j)))*(int)(Math.pow(8,i)));
            j--;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in base 8 ");
        String str=sc.next().toUpperCase();
        int res=convertToDecimal(str);
        System.out.println("The corresponding decimal value is:\n"+res);
    }
    
}
