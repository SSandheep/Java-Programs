/*
i/p-> 11 15
o/p-> 4
Explanation:
11 12 13 14 15
11 has repeated digits Thus 11 should not be counted.
Hence number of elements between 11 and 15 both inclusive is 4

i/p->101  200
o/p->72

*/

package numberofelementswithinrangebutnorepeateddigitvalues;

import java.util.ArrayList;
import java.util.Scanner;
public class NumberOfElementsWithinRangeButNoRepeatedDigitValues 
{
    public static boolean hasRepeatedDigits(int N)
    {
        String res=String.valueOf(N);
        ArrayList<Character>a=new ArrayList<>();
        for(int i=0;i<res.length()-1;i++)
        {
              a.add(res.charAt(i));
             if(a.contains(res.charAt(i+1)))
                 return true;     
        }        
        return false;
    }
    public static int countTheRequiredValues(int s,int e)
    {
        int cnt=0;
        for(int i=s;i<=e;i++)
        {
            if(!hasRepeatedDigits(i))
                cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start:");
        int start=sc.nextInt();
        System.out.println("Enter end:");
        int end=sc.nextInt();
        int count=countTheRequiredValues(start,end); 
        System.out.println(count);
     
    }
    
}
