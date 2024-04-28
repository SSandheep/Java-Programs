/*
There is a range given n and m in which we have to find the count all the prime pairs 
whose difference is 6. We have to find how many sets are there within a given range.
Output:
Output consists of single line, print the count prime pairs in given range. Else print"No 
Prime Pairs".
Constraints:
2<=n<=1000
n<=m<=2000
Sample Input:
4
30
Output:
6
Explanation:
(5, 11) (7, 13) (11, 17) (13, 19) (17, 23) (23, 29) . we have 6 prime pairs.
 */
package countofprimepairswithinrange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfPrimePairsWithinRange 
{
    public static boolean isPrime(int n)
    {
        int flag=1;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
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
    public static int countOfPrimePairs(int start,int end)
    {
        int cnt=0;
        ArrayList<Integer>a=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                a.add(i);
            }
        }
        
        System.out.println("The primes numbers within range are:\n"+a);

        for(int i=0;i<a.size();i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
               if(Math.abs(a.get(i)-a.get(j))==6)
               {
                    cnt++;
                    hm.put(a.get(i),a.get(j));
               }
            }
        }
        System.out.println("The prime pairs are:");
        for(Map.Entry<Integer,Integer> e: hm.entrySet())
        {
            System.out.println(e.getKey()+", "+e.getValue());
        }

        return cnt;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int s=sc.nextInt();
        System.out.println("Enter the ending range:");
        int e=sc.nextInt();
        int count=countOfPrimePairs(s,e);
        if(count==0)
            System.out.println("No prime pairs");
        else
            System.out.println("The number of prime pairs within range are: "+count);

    }
    
}
