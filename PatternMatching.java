package patternmatching;
import java.util.HashMap;
import java.util.Scanner;
public class PatternMatching 
{
    public static boolean stringPatternMatching(String str1,String str2)
    {         
        char arr[]=new char[str1.length()];
        String words[]=str2.split("\\s");
        
        HashMap<Character,String> hm1=new HashMap<>();
        HashMap<String,Character> hm2=new HashMap<>();
        for(int i=0;i<str1.length();i++)
            arr[i]=str1.charAt(i);
        
        if(arr.length!=words.length)
            return false;
        
       for(int i=0;i<arr.length &&i<words.length;i++)
       {
            if(!hm1.containsKey(arr[i]))
                hm1.put(arr[i],words[i]);
            else
              hm1.remove(arr[i],words[i]);
       }
               
       for(int i=0;i<arr.length &&i<words.length;i++)
       {
            if(!hm2.containsKey(words[i]))
                hm2.put(words[i],arr[i]);
            else
              hm2.remove(words[i],arr[i]);
       }
       System.out.println(hm1);
       System.out.println(hm2);
     if(hm1.size()==hm2.size())
           return true;
         else
           return false;
  }
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1st String:");
         String str1=sc.nextLine();
         System.out.println("Enter 2nd String:");
         String str2=sc.nextLine();
         if(stringPatternMatching(str1,str2))
             System.out.println("Matched");
         else
             System.out.println("Not Matched");
    }


}
