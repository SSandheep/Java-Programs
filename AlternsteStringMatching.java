package alternstestringmatching;
import java.util.Scanner;
public class AlternsteStringMatching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String str1=sc.next();
        System.out.println("Enter 2nd string:");
        String str2=sc.next();
        int len=str1.length()+str2.length();
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<len)
        {
            if(i<str1.length())
                res.append(str1.charAt(i));       
            if(i<str2.length())        
                res.append(str2.charAt(i));        
            i++;
        }
        System.out.println("Merged String is:"+res.toString()); 
   
    }
    
}
