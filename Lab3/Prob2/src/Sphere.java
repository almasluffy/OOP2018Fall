public class Sphere extends Shapes{
    private double radius;
    Sphere(){
    }

    Sphere(double radius){
        this.radius = radius;
    }

    public String volume() {
        return "Volume of sphere " + (4 / 3 * Math.PI * radius * radius * radius);
    }

    public String surfaceArea() {
        return "Surface Area of sphere " + (4 * Math.PI * radius * radius);
    }
    public void ChangeValue()
    {
        this.radius+=5;
    }
}
