package Problem2;

public class Prb2 {
    public  static  void main(String args[])
    {
               Student firstS = new Student("Almas",3.5,3);
               Student secondS = new Student();
               secondS.setName("Naruto");
               secondS.setCourse(3);
               secondS.setGpa(3.7);

               if(firstS.compareTo(secondS) == 1)
               {
                   System.out.println("Gpa of first Student bigger than second");
               }
               else if(firstS.compareTo(secondS) == -1)
               {
                      System.out.println("Gpa of second Student bigger than first");
               }
               else  {
                   System.out.println("Gpa of second and  first Students are equal");
               }

               //Student s = firstS.clone();

    }
}
