class count
{
    static int NoOfObjects=0;
    {
    NoOfObjects+=1;
    };
public count()
{
    
}
public count(int x)
{
  
}
public count(String s)
{
    
}
public count(double v)
{
    
}
}
public class CountNoOfObs
{
    public static void main(String[] args)
    {
        count c1=new count();
        count c2=new count(3);
        count c3=new count("Aarthy");
        System.out.println("No.of Objects created are:"+count.NoOfObjects);
    }
}
    
