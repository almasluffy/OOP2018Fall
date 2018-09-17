public class Student {

    public String name;
    public String id;
    public int year_of_study = 1;

    public Student(String name,String id){
        this.name = name;
        this.id = id;

    }
    void Update(){
        year_of_study ++;
    }



    public void GetID()
    {
        System.out.println(id);
    }

    public  void GetName()
    {
        System.out.println(name);
    }

    public  void GetYearOfStudy()
    {
        System.out.println(year_of_study);
    }


}
