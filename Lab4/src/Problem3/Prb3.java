package Problem3;

public class Prb3 {
    public static  void main(String args[])
    {
        Person p = new Person("Almas");
        Person p2;
        p2 = p.doClone();

        System.out.println(p2.getName());
    }
}
