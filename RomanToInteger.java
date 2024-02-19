package romantointeger;
import java.util.HashMap;
import java.util.Scanner;
public class RomanToInteger 
{
    public static int romanToInteger(String str)
    {
        int res=0;
        str=str.replace("IX", "VIIII");
        str=str.replace("IV", "IIII");
        str=str.replace("XL","XXXX");
        str=str.replace("XC", "LXXXX");
        str=str.replace("CD", "CCCC");
        str=str.replace("CM", "DCCCC");
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V', 5);
        hm.put('X',10);  
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D', 500);
        hm.put('M',1000);
       int strlen=str.length();
        for(int i=0;i<strlen;i++)
        {
             res=res+hm.get(str.charAt(i));   
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roman Numeral:");
        String str=sc.next().toUpperCase();
        System.out.println("The Corresponding Integer Value is :");
        int num= romanToInteger(str);
        System.out.println(num);
    }
    
}
