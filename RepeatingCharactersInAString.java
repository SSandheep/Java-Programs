package repeatingcharactersinastring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RepeatingCharactersInAString 
{
    public static  ArrayList<Character> repeatedCharacters(String s)
    {
        char str[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
            str[i]=s.charAt(i);
       ArrayList<Character> a=new ArrayList<>();
       HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        if(hm.containsKey(str[i]))
           hm.put(str[i],hm.get(str[i])+1);
        else
           hm.put(str[i],1);
        }
        System.out.println(hm);
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            int count=e.getValue();
            if(count!=1)
                a.add(e.getKey());
        }
        return a;
    }
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String:");
     String str=sc.nextLine().toLowerCase();
     ArrayList<Character> RepArr=repeatedCharacters(str);
     System.out.println(RepArr);
     
    }
    
}
