package instrumentmain;
abstract class Instrument
{
    public abstract String play();
}
class Piano extends Instrument
{
    @Override
    public String play(){
        return "tan tan tan";
    }
}
class Flute extends Instrument
{
    @Override
    public String play(){
        return "tun tun tun";
    }
}
class Guitar extends Instrument
{
    @Override
    public String play(){
        return "tin tin tin";
    }
}

 public class InstrumentMain {
    public static void main(String[] args) 
    {
        Instrument p=new Piano();
        Instrument f=new Flute();
        Instrument g=new Guitar();
        String ins[]={"Piano","Flute","Guitar"};
        ins[0]=p.play();
        ins[1]=f.play();
        ins[2]=g.play();
        System.out.println("The Piano is playing:"+ins[0]);
        System.out.println("The Flute is playing:"+ins[1]);
        System.out.println("The Guitar is playing:"+ins[2]);
        
        
    }   
}
