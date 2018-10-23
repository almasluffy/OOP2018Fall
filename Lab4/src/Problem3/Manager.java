package Problem3;
import  java.util.Date;
import java.util.*;
public class Manager extends Employee {
    private double bonus;
    private Vector<Employee> team;
    public Manager(){
        super();
        this.bonus=0;
        this.team=new Vector<>();
    }
    public Manager(String name, double salary, String insuranceNumber, double bonus){
        super(name, salary, insuranceNumber);
        this.bonus=bonus;
        this.team=new Vector<>();
    }
    public void addEmployee(Employee newEmp){
        team.add(newEmp);
    }
    public String  getTeam(){
        return this.team.toString();
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getBonus(){
        return this.bonus;
    }
    @Override
    public int compareTo(Object obj) {
       Manager mn = (Manager) obj;
       if(super.compareTo(mn) == 0)
       {
           if(this.bonus > mn.bonus ) return  1;
           else  if(this.bonus < mn.bonus) return  -1;
           else  return  0;
       }
       else  if(super.compareTo(mn) == -1)
       {
           return  -1;
       }
       else  if(super.compareTo(mn) ==1)
       {
           return  1;
       }
       return  super.compareTo(mn);
    }
    public Manager DoClone()
    {
        Manager mn = new Manager();
        mn.name = super.name;
        mn.setSalary(super.getSalary());
        mn.setInsuranceNumber(super.getInsuranceNumber());
        mn.team = this.team;
        mn.bonus  = bonus;
     return   mn;
    }
}
