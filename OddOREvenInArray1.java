import java.util.*;
public class OddOREvenInArray1
{
    public static void main(String[] args)
    {
      int i,n;
      System.out.println("Enter number of elements in the Array:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter Array:");
      for (i=0;i<=a.length;i++)
      {
        a[i]=sc.nextInt();
            if(a[i]==0)
              System.out.println("Zero");
            else if (a[i]%2==0)
              System.out.println("Even");
            else
              System.out.println("odd");
      }
    }
}




    

