package generatevalidparantheses;
import java.util.ArrayList;
import java.util.Scanner;
public class GenerateValidParantheses {
public static void generateParantheses(String p,int left,int right, ArrayList<String>pa)
    {
        if(left>0)
            generateParantheses(p+"(",left-1,right,pa);
        if(right>left)
            generateParantheses(p+")",left,right-1,pa);
        if(right==0)
            pa.add(p);
    }
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of paranthesis:");
        int n=sc.nextInt();
        String s="";
        ArrayList <String> paren=new ArrayList<>();
        ArrayList <String>gp=new ArrayList<>();
        System.out.println("The parantheses generated are: ");
        generateParantheses(s,n,n,paren);
         for(int i=0;i<paren.size();i++){
             gp.add(paren.get(i));
        }
       System.out.println(gp);
   }
    
}
