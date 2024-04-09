/*
A company is organizing a fun game for its employees. N number of employees are participating in this game. 

Each employee can either compete in the game as an individual or as a pair with another employee. 

The task is to find the number of different ways in which N number of employees can be single or can be paired up.

constraints:
if number of employees is in odd number then pairing is not allowed

i/p: 4
o/p: 10

i/p:2
o/p:3

*/
package no_of_possiblewaysofarrangingemployess;
import java.util.Scanner;
public class No_Of_PossibleWaysOfArrangingEmployess {
  public static  int fact(int num)
  {
      switch (num) {
          case 0:
              return 1;
          case 1:
              return 1;
          default:
              int factorial;
              factorial=num * fact(num-1);
              return factorial;
      }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number of Employees:");
    int n=sc.nextInt();
    int poss_ways=0;
    if(n%2==0)
     poss_ways=(fact(n)/(fact(n-1)))+( fact(n)/(fact(n-2)*2));
    else
      poss_ways=fact(n)/fact(n-1);
       
  System.out.println("The possible ways are:"+poss_ways);

    }
    
}
