package Problem1;

public class Cylinder extends Shapes2{


    private double height;
    private double radius;

    public  Cylinder()
    {

    }

    public Cylinder(double height, double radius)
    {
        this.radius = radius;
        this.height = height;
    }

    public  void setHeight(double height)
    {
         this.height = height;
    }

    public  void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getHeight()
    {
        return  height;
    }

    public  double getRadius()
    {
        return  radius;
    }


    public double surfaceArea() {
              return  2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
                      return  Math.PI *Math.pow(radius,2)* height;
    }
    public  String toString()
    {
        return  "The volume of cylinder" + volume()+" The surface area of cylinder " + surfaceArea();
    }
}
