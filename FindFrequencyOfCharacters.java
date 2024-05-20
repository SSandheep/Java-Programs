/*
i/p: wwwxxxxyyyyy
o/p: w3x4y5
 */
package findfrequencyofcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FindFrequencyOfCharacters 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        StringBuilder s=new StringBuilder();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            else
                hm.put(str.charAt(i), 1);
        }
      
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            s.append(e.getKey());
            s.append(e.getValue());
        }
        System.out.println("The output string is: \n"+s.toString());
        
    }
    
}
