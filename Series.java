import java.util.Scanner;
public class Series 
{
    public static void main(String[] args)
    {
        int n;
        double i,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            s=s+1/i;
        System.out.println("Sum is:"+s);  
    }
}
