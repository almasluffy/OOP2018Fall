package Problem3;

public class Person implements Comparable,Cloneable {
    String name;
    Person()
    {

    }
    Person(String name)
    {
        this.name  = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public  String getName()
    {
        return  this.name;
    }
    @Override
    public int compareTo(Object o) {

        return 0;
    }

    public Person doClone()
    {
        Person p = new Person();
        p.name = name;
        return  p;
    }



}
