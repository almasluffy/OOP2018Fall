package Problem4;

public class Animal implements Setable{
     String name;
     Animal()
     {

     }
     Animal(String name)
     {
         this.name = name;
     }

    @Override
    public void CanMove() {
        System.out.println("Yeaa man, I can move,thanks soooo, my speed is " + Setable.speed);
    }
}
