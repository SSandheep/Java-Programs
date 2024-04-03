package combinationofstringofdigits;
import java.util.Scanner;
public class CombinationOfStringOfDigits 
{
     public static void printCombinations(String input, String output,int index) {
             
        if (index == input.length()) {
            System.out.println(output);
            return;
        }
     printCombinations(input, output + input.charAt(index) + " ",index+1);

    if(index<input.length()-1)
       printCombinations(input, output + input.charAt(index),index+1);


     }
    public static void main(String[] args) 
    {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res="";
        printCombinations(str,res,0) ;
    }
    
}
