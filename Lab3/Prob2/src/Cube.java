public class Cube extends Shapes {
    private double side;
    Cube(){
    }
    Cube(double side){
        this.side = side;
    }

    public String volume() {
        return "Volume of cube " + (side * side * side);
    }

    public String surfaceArea() {
        return "Surface Area of cube " + (6 * side * side);
    }
    public void ChangeValue()
    {
        this.side+=5;
    }
}
