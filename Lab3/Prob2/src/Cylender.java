public class Cylender extends Shapes {
    private double height;
    private double radius;
    Cylender(){
    }

    Cylender(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public String volume() {
        return "Volume of cylinde*********************************************************r " + (height * Math.PI * radius * radius);
    }

    public String surfaceArea() {
        return "Surface Area of cylinder " +
                (height * 2 * Math.PI * radius + 2 * Math.PI * radius * radius);
    }
    public void ChangeValue()
    {
        this.height+=5;
    }
}
