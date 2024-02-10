package twosum;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public int[] twoSum(int nums[],int target)
    {
        int res[]=new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;               
                }
            }
        }
        return res;      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            num[i]=sc.nextInt();
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        TwoSum ts=new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(num, target)));   
    }
}
