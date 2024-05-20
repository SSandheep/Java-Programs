/*
i/p: wwwxxxxyyyyy
o/p: w3x4y5
*/
import java.util.Scanner;
public class FindFrequencyOfCharactersInAString 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String input = sc.next();
        StringBuilder output = new StringBuilder();
        int len=input.length();
        int count=1;
        for (int i=0; i<len; i++) 
        {
            if(i < len-1  &&  input.charAt(i)==input.charAt(i+1))
                 count++;
            else 
            {
                output.append(input.charAt(i));
                output.append(count);
                count=1;
            }                
        }
        System.out.println(output.toString());
    }
}
