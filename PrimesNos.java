import java.util.Scanner;
public class PrimesNos
{
    public static void main(String[] args)
    {
        int i,j,n,c =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter prime numbers to be printed until:");
        n=sc.nextInt();
        System.out.println("Prime numbers are:");
        for(i=2;i<=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
         if(c==2)
            System.out.println(i+" ");
         
        } 
        
 
    }
    
}
