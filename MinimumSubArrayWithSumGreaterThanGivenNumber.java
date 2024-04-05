package minimumsubarraywithsumgreaterthangivennumber;
import static java.lang.Math.min;
import java.util.Scanner;
public class MinimumSubArrayWithSumGreaterThanGivenNumber 
{
    public static int minimumSubArr(int nums[],int target)
    {
       int n=nums.length;
        int r =0;
        int l=0;
        int min_len = n + 1;
        int curr_sum=0;
        while(r<n)
        {
          curr_sum+=nums[r];
          while(curr_sum >=target)
          {
            min_len=min(min_len, r - l + 1);
            curr_sum-=nums[l++];
          }
          r++;
        }
       return (min_len==n+1)?0:min_len;
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter X: ");
        int x=sc.nextInt();
        System.out.println("Enter elements of Array:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=minimumSubArr(arr, x);
        System.out.println("The length of minimum subArray is:"+res);
    }    
}

