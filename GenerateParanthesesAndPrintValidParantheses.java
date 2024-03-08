package generateparanthesesandprintvalidparantheses;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
public class GenerateParanthesesAndPrintValidParantheses
{
    public static void generateParantheses(String p,int left,int right, ArrayList<String>pa)
    {
        if(left>0)
            generateParantheses(p+"(",left-1,right,pa);
        if(right>left)
            generateParantheses(p+")",left,right-1,pa);
        if(right==0)
            pa.add(p);
       if(right>0)
            generateParantheses(p+")",left,right-1,pa);
       if(left>right)
            generateParantheses(p+"(",left-1,right,pa);
       if(left==0)
            pa.add(p);
        
    }
    public static boolean isValidParantheses(String s1)
    {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s1.length();i++)
        {
            if(st.isEmpty())
                st.push(s1.charAt(i));
            else if(st.peek()=='(' && s1.charAt(i)==')' || st.peek()=='{' && s1.charAt(i)==']' || st.peek()=='{' && s1.charAt(i)=='}')
                st.pop();
            else
                st.push(s1.charAt(i));
        }
        if(st.isEmpty())
            return true;
        else
           return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of paranthesis:");
        int n=sc.nextInt();
        String s="";
        ArrayList <String> paren=new ArrayList<>();
        HashSet<String>gp=new HashSet<>();
        HashSet<String>vp=new HashSet<>();
        System.out.println("The parantheses generated are: ");
        generateParantheses(s,n,n,paren);
        for(int i=0;i<paren.size();i++)
        {
            if(paren.get(i).length()==2*n)
                    gp.add(paren.get(i));
        }
       ArrayList <String>gparen=new ArrayList<>(gp);
       System.out.println(gp);
        for(int i=0;i<gparen.size();i++)
        {
            if(isValidParantheses(gparen.get(i)))
                vp.add(gparen.get(i));   
        }
        System.out.println("The valid paranthesis are:\n"+vp);
    }
    
}
