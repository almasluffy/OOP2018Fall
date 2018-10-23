import java.awt.event.PaintEvent;

public class Person
{
    private String name;
    Person()
    {

    }
    Person(String name)
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  String getName()
    {
        return  this.name;
    }
    public String toString(){
        return  this.name;
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof  Person)
        {
            Person p = (Person) obj;
            if(this.name.equals(p.name)) return  true;
            return false;
        }


    }


}
