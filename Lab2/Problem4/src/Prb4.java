
import  java.util.Scanner;
public class Prb4
{
    public static  void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        Time t = new Time(a,b,c);
        System.out.println("Standard: "+ t.toStandard());
        System.out.println("Universal: "+ t.toUniversal());

        Time t2 = new Time(4, 24,33);
        t.add(t2);

    }

}
