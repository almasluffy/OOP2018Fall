package Problem1;

public class Point implements Shapes {
    public int x,y,z;

    public Point(){};
    public Point(int x,int y,int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double surfaceArea() {
          return  -1111111;
    }

    @Override
    public double volume() {
             return  -1111111;
    }

    public  void add(int x,int y,int z){
        this.x +=x;
        this.y +=y;
        this.z +=z;
    }
    public  String toString()
    {
        return "Cord of x: " + x + " Cord of y: " + y + " Cord of z: " + z;
    }
}
