public class Student {

    public String name;
    public String id;
    public int year_of_study = 1;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return  name;
    }
    public String getId()
    {
        return id;
    }
    public int getYear_of_study()
    {
        return  year_of_study;
    }
    void Update(){
        year_of_study ++;
    }






}
