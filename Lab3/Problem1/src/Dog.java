public class Dog extends  Animal {
    public String color;
    public Dog()
    {
        super();
    }
    public  Dog(String name, int age,String color)
    {
        super(name, age);
        this.color = color;

    }
    public void setColor(){ this.color = color; }
    public String getColor() { return this.color; }

    public  void ToGrow()
    {
        super.setAge(super.getAge() + 4);//override
    }

    public  void info(int height)
    {
          System.out.println("Height of this animal " + height); //overload
    }
}
