/*
Sweet Seventeen
Problem Description
Given a maximum of four digits to the base 17(10 -> A, 11-> B,12 -> C, 16 -> G) as input, 
output its decimal value
Input 1
1A
Expected output
27
Input 2
23 GF
Expected output
10980
*/
package sweetseventeen;
import java.util.HashMap;
import java.util.Scanner;
public class SweetSeventeen 
{
    public static int convertToDecimal(String s)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        String str="0123456789ABCDEFG";
        for(int i=0;i<str.length();i++)
        {
           hm.put(str.charAt(i),i);
        }
        System.out.println(hm);
        int sum=0;
        int j=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            sum=sum+(hm.get(s.charAt(j))*(int)(Math.pow(17,i)));
            j--;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in base 17 ");
        String str=sc.next().toUpperCase();
        int res=convertToDecimal(str);
        System.out.println(res);
       
    }
    
}
