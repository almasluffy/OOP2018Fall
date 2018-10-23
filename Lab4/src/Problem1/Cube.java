package Problem1;

import java.lang.management.MemoryType;

public class Cube extends Shapes2 {
    public  double side;

    public  Cube(){}
    public Cube(double side)
    {
        this.side = side;
    }
    public  void setSide(double side)
    {
        this.side = side;
    }

    public  double getSide()
    {
        return  side;
    }
    public double surfaceArea() {
            return  6 * Math.pow(side,2);
    }


    public  double volume() {
           return Math.pow(side,3);
    }
    public  String toString()
    {
        return  "The volume of Cube" + volume()+" The surface area of Cube" + surfaceArea();
    }
}
