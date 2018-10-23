package Problem2;

public class Student implements  Comparable, Cloneable  {

    public  String name;
    public  double gpa = 0;
    public int course = 1;

    public  Student(){};
    public  Student(String name, double gpa,int course)
    {
        this.name = name;
        this.gpa = gpa;
        this.course = course;
    }

    public  void setName(String name)
    {
        this.name = name;

    }
    public  void setGpa(double gpa)
    {
       this.gpa = gpa;

    }
    public  void setCourse(int course) {
        this.course = course;

    }


    public  int compareTo(Object obj)
    {
             Student s1 = (Student) obj;
             if(this.gpa > s1.gpa ) return  1;
             else if(this.gpa == s1.gpa) return  0;
             else  return  -1;
    }

    public Student clone() throws  CloneNotSupportedException
    {

              Student s = new Student();
              s.name = this.name;
              s.gpa = this.gpa;
              s.course = this.course;
              return  s;
    }
}
