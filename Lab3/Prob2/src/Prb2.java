public class Prb2 {
    public static  void main(String args[])
    {
            Sphere sp = new Sphere(2);
            Cylender cs  = new Cylender(5,6);
            Cube cb = new Cube(7);

            System.out.println("Sphere Area "+ sp.surfaceArea() + " and " +  "Sphere Volume" + sp.volume());
        System.out.println("Cylinder Area"+ cs.surfaceArea() + " " + " and Cylinder Volume" + cs.volume());
        System.out.println("Cube Area "+ sp.surfaceArea() + " " +  " and Cube Volume" + sp.volume());





    }
}
