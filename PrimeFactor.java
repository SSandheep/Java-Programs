package primefactor;
import java.util.Scanner;
public class PrimeFactor
{ 
    public static boolean isPrime(int n){
       int flag=0;
      for (int i=2;i<=Math.sqrt(n);i++){    
          if(n%i==0)
            flag=1;
      }
      if(flag==0)
          return true;
      else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0 && isPrime(i)){
                   System.out.println(i);
            }      
        }
    }
    
}
