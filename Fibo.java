import java.util.Scanner;
public class Fibo 
{  
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int a=0;
      int b=1;
      int sum;
      int n;
      System.out.println("No of terms:");
      n=sc.nextInt();
      for(int i=0;i<=n;++i)
      {
          System.out.println(a+" ");
          sum=a+b;
          a=b;
          b=sum;
      }  
    }  
}
