package medianoftwosortedarrays;
import java.util.Arrays;
import java.util.Scanner;
public class MedianOfTwoSortedArrays 
{
    public static double findMedianSortedArrays(int[] arr1, int[] arr2)
    {
        int s=arr1.length+arr2.length;
        int mA[]=new int[s];
        for(int k=0;k<arr1.length;k++)
        {
            mA[k]=arr1[k];
        }
        for(int k=0;k<arr2.length;k++)
        {
            mA[k+arr1.length]=arr2[k];
        }
        System.out.println("Merged Array before Sorting:");
        for(int k=0;k<s;k++)
        {
            System.out.println(mA[k]);
        }
        Arrays.sort(mA);
        System.out.println("Merged Array after Sorting:");
        for(int k=0;k<s;k++)
        {
            System.out.println(mA[k]);
        }
        double median=0;
        median=(s%2==0)?(double)(mA[(s-1)/2]+mA[(s/2)])/2: mA[(s-1)/2]; // Ternary operator used instead of if-else condition for space efficiency     
     /*   if(s%2==0)
           median=(double)(mA[(s-1)/2]+mA[(s/2)])/2;
        else
            median=mA[(s-1)/2];
    */

        return median;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of 1st Array:");
        int s1=sc.nextInt();
        System.out.println("Enter Size of 2nd Array:");
        int s2=sc.nextInt();
        System.out.println("Size Of Merged Array is:");
        int size=s1+s2;
         System.out.println(size);
         int arr1[]=new int[s1];
         int arr2[]=new int[s2];                
        System.out.println("Enter elements of 1st Array:");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd Array:");
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=sc.nextInt();
        }
        
        System.out.println("Elements of 1st Array is:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("Elements of 2nd Array is:");
        for(int j=0;j<arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
        System.out.println("The median of these Arrays is: \n"+ findMedianSortedArrays(arr1,arr2));
    }
}
