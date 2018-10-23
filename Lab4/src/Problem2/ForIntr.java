package Problem2;

public class ForIntr implements Show2 {
    public void doSmth()
    {
        System.out.println("Class value" + val);//outside the class(like static)
        System.out.println("Class value" + Show2.val);//outside the class(like static)
    }
}
