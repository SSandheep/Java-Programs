package AbstractClass1;
abstract class Shape
{
    int numSides;
    Shape(int numSides)
    {
        this.numSides=numSides;
    }
    int getNumSides()
    {
        return numSides;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
class Rectangle extends Shape
{
    double width;
    double height;
    Rectangle(double width,double height,int numSides)
    {
        super(numSides);
        this.width=width;
        this.height=height;
    } 
    @Override
    double getArea()
    {
        return width*height;
    }
    @Override
    double getPerimeter()
    {
        return 2*(width+height);
    }
}
class RtTriangle extends Shape
{
    double width;
    double height;
    double base;
    RtTriangle(double width,double height,double base,int numSides)
    {
        super(numSides);
        this.width=width;
        this.height=height;
        this.base=base;
    }
    @Override
    double getArea()
    {
        return (width*height)/2;
    }
    @Override
    double getPerimeter()
    {
        return (base+width+height);
    }
}
public class AbstractMain 
{
    public static void main(String[] args)
    {
        Rectangle r =new Rectangle(3.0,5.0,4);
        System.out.println("Area of the rectangle is: "+r.getArea());
        System.out.println("Perimeter of the rectangle is: "+r.getPerimeter());
        RtTriangle rt=new RtTriangle(3.0,6.0,9.0,3);
        System.out.println("Area of the Right Triangle is: "+rt.getArea());
        System.out.println("Area of the Right Triangle is: "+rt.getPerimeter());
    }
    
}
