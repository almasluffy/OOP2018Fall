package Problem1;

public class Prb1 {
    public  static  void main(String args[])
    {
                Cylinder cy = new Cylinder(5,5);
                Sphere sp = new Sphere(3.3);
                Cube cb = new Cube(7);
                Point pn = new Point(3,5,6);

                pn.add(4,4,4);

                System.out.println(pn.toString() + " \n" + cy.toString() + " " + sp.toString() + "\n" + cb.toString());

    }
}
