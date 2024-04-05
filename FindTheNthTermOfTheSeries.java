/*
The given series is: 3, 4, 33, 34, 43, 44, 333,334,........
To find the Nth term of this series
*/
package findthenthtermoftheseries;
import java.util.Scanner;
public class FindTheNthTermOfTheSeries 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int res=0;
        int pv=1;
        while(N!=0)
        {
        if(N%2==0)
        {
            res=res+4*pv;
            N=N/2-1;
        }
        else
        {
            res=res+3*pv;
            N=N/2;
        }
        pv=pv*10;
        }
        System.out.println(res);
    }
    
}
