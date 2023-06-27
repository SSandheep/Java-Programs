import java.util.Random;
class RandomNumberThread extends Thread
{
     @Override
     public void run()
     {
         Random random = new Random();
         for(int i=0;i<=10;i++)
         {
             int randomInteger = random.nextInt(100);
             System.out.println("The random integer generated : "+randomInteger);
             if (randomInteger%2==0)
             {
                 SquareThread sThread=new SquareThread(randomInteger);
                 sThread.start();
             }
             else
             {
                 CubeThread cThread = new CubeThread(randomInteger);
                 cThread.start();
             }
             try
             {
                 Thread.sleep(1000);
                 
             }
             catch(InterruptedException ex)
             {
                 System.out.println(ex);
                 
             }
         }
         
     }
}
class SquareThread extends Thread
{
    int randomInteger;
    SquareThread(int randomInteger)
    {
        this.randomInteger=randomInteger;
    
    }
    @Override
    public void run()
    {
        System.out.println("Square of "+randomInteger+"="+(randomInteger*randomInteger));
    }
}
class CubeThread extends Thread
{
    int randomInteger;
    CubeThread(int randomInteger)
    {
       this.randomInteger=randomInteger; 
    }
    @Override
    public void run()
    {
        System.out.println("Cube of "+randomInteger+" = "+(randomInteger*randomInteger*randomInteger));
    }
    
}
public class MultithreadingTest
{
    public static void main(String[] args)
    {
        RandomNumberThread rnThread = new RandomNumberThread();
        rnThread.start();
    }
}





