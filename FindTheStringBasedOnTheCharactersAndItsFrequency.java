 package stringsamp1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FindTheStringBasedOnTheCharactersAndItsFrequency 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input:");
        String str=sc.next();
        StringBuilder output =new StringBuilder();
        HashMap<Character,Integer>hm=new HashMap<>();
        int len=str.length();
        int count=0;
        char pchar = 0;
        String s ="";
        for(int i=0;i<len;i++)
        {          
            if(Character.isLetter(str.charAt(i)))
            {
                 pchar=str.charAt(i);
                 s="";
            }
            else if(Character.isDigit(str.charAt(i)))
            {     
                  s+=str.charAt(i); 
                  count=Integer.parseInt(s);      
                  hm.put(pchar, count);
            }   
        }
        System.out.println(hm);
       for(Map.Entry<Character,Integer>e:hm.entrySet())
       {
           count=e.getValue();
           for(int i=0;i<count;i++)
           {
               output.append(e.getKey());
           }
       }
          System.out.println("The output String is :"+output.toString());
    }

}
