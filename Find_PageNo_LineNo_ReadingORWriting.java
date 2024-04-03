//Problem Statement:
/*WRITING BOT
Problem Description

A scientist has created a Writing Bot which will read from one book and write into another. Both books may have different dimensions i,e number of lines on each page and number of pages itself. Reads and writes also happen at different speed.

The Bot first reads from the first book fully, then processes the format to write into the second book (done instantaneously) and finally starts writing into the second book.

Your task is to identify, after a specified interval of time, if the Bot is reading or writing For each of these activities how much read and write activity has happened needs to be captured in terms of number of pages and number of lines on the current page

- Constraints
1<=number of lines in first book, Number of pages in second book <10^3
1<=Number of lines in first book, Number of lines in second book < 10^2

*/
package find_pageno_lineno_readingorwriting;
import java.util.Scanner;
public class Find_PageNo_LineNo_ReadingORWriting 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of pages in 1st book which is used for reading:");
        int page1=sc.nextInt();
        System.out.println("Enter the Number of lines per page in 1st book:");
        int line1=sc.nextInt();
        System.out.println("Enter the Number of pages in 2nd book which is used for writing:");
        int page2=sc.nextInt();
        System.out.println("Enter the Number of lines per page in 2nd book:");
        int line2=sc.nextInt();
        System.out.println("Enter the speed for Reading(lines/second):");
        int readspeed=sc.nextInt();
        System.out.println("Enter the speed for writing(lines/second):");
        int writespeed=sc.nextInt();
        System.out.println("Enter the  total time taken to read and write the complete book:");
        int Time=sc.nextInt();
        int Total_no_of_lines1=page1*line1;
        int Time_for_Reading=Total_no_of_lines1/readspeed;
        if(Time>Time_for_Reading)
        {
            System.out.println("The Bot is Writing");
             int rem_time=Time-Time_for_Reading;
             int Lines_written=writespeed*rem_time;
             int pageNo=Lines_written/line2;
             int lineNo=Lines_written%line2;        
             if(lineNo==0)
                 lineNo=line2;
             else
                 lineNo=lineNo;
             System.out.println("Page Number:"+ pageNo);    
             System.out.println("Line Number:"+ lineNo);    
        }
        else
        {
            System.out.println("The Bot is Reading ");
            int Lines_read=Time*readspeed;
            int RpageNo=Lines_read/line1;
            int RlineNo=Lines_read%line1;
            if(RlineNo==0)
                RlineNo=line1;
            else
                RlineNo=RlineNo;
          System.out.println("Page Number:"+ RpageNo);    
          System.out.println("Line Number:"+RlineNo);    
            
        }
            
       
        
        
    }
    
}
