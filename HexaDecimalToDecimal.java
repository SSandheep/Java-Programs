package hexadecimaltodecimal;
import java.util.HashMap;
import java.util.Scanner;
public class HexaDecimalToDecimal 
{
     public static int convertToDecimal(String s)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        String str="0123456789ABCDEF";
        for(int i=0;i<str.length();i++)
        {
           hm.put(str.charAt(i),i);
        }
        System.out.println(hm);
        int sum=0;
        int j=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            sum=sum+(hm.get(s.charAt(j))*(int)(Math.pow(16,i)));
            j--;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in base 16 ");
        String str=sc.next().toUpperCase();
        int res=convertToDecimal(str);
        System.out.println("The corresponding decimal value is:\n"+res);
    }
    
}
