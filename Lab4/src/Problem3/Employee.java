package Problem3;
import  java.util.Date;
public class Employee extends  Person {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;


    Employee() {
        super();
        this.hireDate= getHireDate();
        this.salary = 0;
        this.insuranceNumber = "";
    }

    Employee(String name, double salary, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = new Date();
        this.insuranceNumber = insuranceNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
    public Date getHireDate(){return this.hireDate;}
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }
    @Override
    public int compareTo(Object obj) {
         Employee e = (Employee) obj;
         if(this.salary > e.salary ) return  1;
         else if(this.salary < e.salary ) return  -1;
         else  return  0;

    }

    public Employee DoClone()
    {
        Employee em = new Employee();
        em.name = super.name;
        em.salary = this.salary;
        em.hireDate = this.hireDate;
        em.insuranceNumber = this.insuranceNumber;

        return  em;
    }
}
