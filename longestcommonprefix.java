package longestcommonprefix;
import java.util.Arrays;
import java.util.Scanner;
public class longestcommonprefix 
{
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int indx=0;
        while(indx<s1.length())
        {
            if(s1.charAt(indx)==s2.charAt(indx))
                indx++;
            else
                break;
        }
        return s1.substring(0,indx);
        
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        String starr[] =new String[n];
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++)
        {
            starr[i]=sc.next();
        }
        longestcommonprefix lp=new longestcommonprefix();
        String res=lp.longestCommonPrefix(starr);
        System.out.println("The longest common prefix is:"+res);
       
    }
    
}
