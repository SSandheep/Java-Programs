/*
i/p: ABCabcXYZ
o/p:ABCABCXYZ

i/p: abctcXY
o/p:abctcxy
*/
package convertcasesofstring;
import java.util.Scanner;
public class ConvertCasesOfString 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res="";
        int up=0;
        int low=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                up++;
            if(Character.isLowerCase(s.charAt(i)))
                low++;
        }
        if(up>=low)
            res=s.toUpperCase();
        else
            res=s.toLowerCase();
        System.out.println(res);
    }
    
}
