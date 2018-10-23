package Problem2;

public abstract class Person {
       public String name;
       Person()
       {

       }
       Person(String name)
       {
           this.name = name;
       }
      abstract void getInfo();
}
