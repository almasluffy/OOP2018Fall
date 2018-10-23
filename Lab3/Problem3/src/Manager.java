import java.util.*;
public class Manager extends  Employee {
    private boolean certainBonus;
    Vector<Employee> v = new Vector();

    Manager()
    {

    }
    Manager(String name,double salary, int yearofwork,String insuarnceNumber,boolean certainBonus)
    {
             super(name, salary, yearofwork, insuarnceNumber);
             this.certainBonus = certainBonus;
    }
    public void addEmpl(Employee e)
    {
        v.add(e);
    }
    public  void setCertainBonus(boolean certainBonus)
    {
        this.certainBonus = certainBonus;
    }

    public  boolean isCertainBonus()
    {
        return  this.certainBonus;
    }
    public String  toString()
    {
         return  super.toString() + "KRch bonus " + certainBonus ;

    }

    public boolean Equals(Object obj)
    {
        if(obj instanceof Manager )
        {
            Manager mn = (Manager) obj;
            if(this.certainBonus == mn.certainBonus && super.equals(mn))
            {
                return  true;
            }
        }
        return  false;
    }



}
