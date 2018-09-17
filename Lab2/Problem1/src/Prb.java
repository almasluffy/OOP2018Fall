import java.lang.invoke.ConstantCallSite;

public class Prb {
    public static void main(String args[]){
        Student me = new Student("Almas","17BD110401");

        me.GetName();
        me.GetID();
        me.GetYearOfStudy();
        me.Update();
        me.GetYearOfStudy();

    }
}
