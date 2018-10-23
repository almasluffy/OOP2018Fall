import java.util.*;
public class Prb1
{
    public static  void main(String args[])
    {
        Animal an = new Animal("Luffy", 8);

        Dog d = new Dog("Barsik",5,"white");

        d.ToGrow();
        d.info(1);
    }
}
