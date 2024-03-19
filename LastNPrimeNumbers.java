package lastnprimenumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class LastNPrimeNumbers 
{
    public static boolean isPrime(int num)
    {
        int flag=1;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0) 
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of prime numbers:");
        int limit=sc.nextInt();
        System.out.println("Enter the number of prime numbers to be printed from the last :");
        int count=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=2;i<=limit;i++)
        {
            if(isPrime(i))
                a.add(i);
        }
        System.out.println("The prime numbers within the given limit are:");
        System.out.println(a);
        System.out.println("The Last N prime numbers within the limit are:");
        for(int i=a.size()-count;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
    
}
//O(n*sqrt(n)) complexity
