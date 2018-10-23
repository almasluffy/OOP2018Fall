package Problem1;

import java.lang.management.MemoryType;

public class Sphere implements  Shapes{

    public  double radius;
     public  Sphere()
     {

     }
     public Sphere(double radius)
     {
         this.radius = radius;
     }

    public  void setRadius(double radius)
    {
        this.radius = radius;
    }

    public  double getRadius()
    {
        return  radius;
    }
    public double surfaceArea() {
               return  4 * Math.PI * Math.pow(radius,2);
    }

    @Override
    public double volume() {
        return (4*Math.PI*Math.pow(radius,3))/3;
    }
    public  String toString()
    {
        return  "The volume of sphere " + volume()+" The surface area of sphere " + surfaceArea();
    }
}
