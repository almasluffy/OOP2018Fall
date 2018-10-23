package Problem2;

public class Worker extends Person {
    int salary;
    Worker(){
        super();
    };
    Worker(String name,int salary)
    {
        super(name);
        this.salary = salary;
    }
    public void getInfo()
    {
        System.out.println("Darova I am rabotnik");
    }
}
