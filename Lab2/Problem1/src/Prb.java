import java.lang.invoke.ConstantCallSite;

public class Prb {
    public static void main(String args[]){
        Student me = new Student();
        me.setId("17BD110401");
        me.setName("Almas");
        System.out.println(me.getName() + " " +me.getId() + " " + me.getYear_of_study());
        me.Update();
        System.out.println(me.getName() + " " +me.getId() + " " + me.getYear_of_study());

    }
}
