/*
A number is known as Balanced Number whose Binary String has equal number of 1s and 0s 
i/p: 2
o/p: Balanced

i/p: 9
o/p: Balanced
*/
package balancednumber;
import java.util.ArrayList;
import java.util.Scanner;                                            
public class BalancedNumber 
{
    public static boolean isBalancedNum(String str)
    {
        ArrayList<Character>a=new ArrayList<>();
        ArrayList<Character>b=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        { 
            if(str.charAt(i)=='1')
                a.add(str.charAt(i));
            else
                b.add(str.charAt(i));        
        }
        if(a.size()==b.size())
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        System.out.println(s);
        if(isBalancedNum(s))
             System.out.println("Balanced Number");
        else
            System.out.println("Not Balanced Number");
        
        
    }
    
}
