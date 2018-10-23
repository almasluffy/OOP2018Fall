public class Employee extends  Person {
    private double salary;
    private int yearofwork;
    private  String insuarnceNumber;

    Employee()
    {
        super();
        salary = 0;
        yearofwork = 0;
        insuarnceNumber = "";
    }
    Employee(String name,double salary, int yearofwork,String insuarnceNumber){
        super(name);
        this.salary = salary;
        this.yearofwork = yearofwork;
        this.insuarnceNumber = insuarnceNumber;

    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public  void setYearofwork(int yearofwork)
    {
        this.yearofwork = yearofwork;
    }

    public void setInsuarnceNumber(String insuarnceNumber)
    {
        this.insuarnceNumber = insuarnceNumber;
    }
    public  double getSalary()
    {
        return  this.salary;
    }
    public  int getYearofwork()
    {
        return  this.yearofwork;
    }
    public  String getInsuarnceNumber()
    {
        return  this.getInsuarnceNumber();
    }

    public  boolean equals(Object obj)
    {
        if(obj instanceof Employee)
        {
            Employee e = (Employee) obj;
            if(this.insuarnceNumber == e.insuarnceNumber && super.equals(e) && this.yearofwork == e.yearofwork)
            {
                return  true;
            }

        }
        return  false;
    }
    public String toString()
    {
        return "Name " + super.toString()+ "Salary: " + this.salary;
    }

}
