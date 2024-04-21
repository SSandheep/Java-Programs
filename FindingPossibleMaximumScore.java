/*
Generally , In any examination the mark attached to a question is linearly related to the time taken to solve it. 
Unfortunately, our universe is neither consistent not fair always ;and examinations bodies are no exception to this exception. 
One institution has designed a question paper, where this linear relationship is thrown out of the window. 
As a judicious programmer, you should help in choosing the questions that would give maximum score to the candidate within the specified time limit.
The input to your program consists of the first line with two space separated integers.
The first one is the number of questions (n) and the second is the time limit to answer the questions 2<=n<=20
The next line has space separated n unique integers each giving the individual (score for the questions. The third and final line has another set of unique n integers , 
which gives the time required to solve the questions . You can assume that your program should output the maximum possible score.
Example 1:
Input
4 30
25 10 40 17
12 20 15 8
Expected output
65
Example 2
Input
3 40
34 22 16
10 30 20
Excepted output
56
*/
package findingpossiblemaximumscore;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class FindingPossibleMaximumScore 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Questions:");
        int n=sc.nextInt();
       System.out.println("Enter the time for exam:");
        int t=sc.nextInt();
        Integer mark[]=new Integer[n];
        int time[]=new int[n];
        System.out.println("Enter the marks for each question:");
        for(int i=0;i<n;i++)
        {
            mark[i]=sc.nextInt();
        }
        System.out.println("Enter the time for each question:");
        for(int i=0;i<n;i++)
        {
            time[i]=sc.nextInt();
        }
        System.out.println("The marks for each question :"+ Arrays.toString(mark));
        System.out.println("The time limit for each question :"+Arrays.toString(time));    
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(mark[i],time[i]);
        }
        System.out.println(hm);
        Arrays.sort(mark, Collections.reverseOrder());
         int timelimit=0;
         int marks=0;
          for(int i=0;i<n;i++)
          { 
             timelimit+=hm.get(mark[i]);  
             marks+=mark[i];
              if(timelimit>t)
             {
              timelimit-=hm.get(mark[i]);
              marks-=mark[i];
              break;
            }     
        }
      System.out.println("The maximum score is : "+marks);
    }
}

