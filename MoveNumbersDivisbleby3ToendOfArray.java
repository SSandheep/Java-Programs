/*
Given an array Arr[] of N integer numbers. The task is to rewrite the array by putting all multiples of 10

 at the end of the given array.

 Note: The order of the numbers which are not multiples of 10 should remain unaltered, and similarly, the

 order of all multiples of 10 should be unaltered. 

For e.g.

Suppose N = 9 and Arr[]={10, 12, 5, 40, 30, 7, 50, 9, 10}

 You have to push all multiple of 10 at the end of the Arr[] Hence, the output is 12 5 7 9 10 40 30 50 10.
*/
package movenumbersdivisbleby10toendofarray;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class MoveNumbersDivisbleby3ToendOfArray 
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of Array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of Array:");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
   System.out.println("Array elements before moving numbers divisible by 10 to the end of the Array: \n"+Arrays.toString(arr));
    Stack<Integer>st=new Stack<>();
    for(int i=0;i<n;i++)
    {
       if(arr[i]%10!=0)
       {
         st.push(arr[i]);
       }
       
    }
    for(int i=0;i<n;i++)
    {
      if(arr[i]%10==0)
      {
        st.push(arr[i]);
      }
    }
  System.out.println("Array elements after moving numbers divisible by 10 to the end of the Array: \n"+st);

    }
    
}
