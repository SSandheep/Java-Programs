package stringmatches;
import java.util.Scanner;
public class StringMatches {
    public static boolean isMatches(String str, String strwithwildcharacters)
    { 
        String str1= strwithwildcharacters.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
        if(str.equals(str1))
            return true;
        else
            return false;     
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(isMatches(s1,s2));
        
        
    }
    
}
