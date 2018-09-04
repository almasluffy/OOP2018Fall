
import java.util.Scanner;

public class e
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int  x  = input.nextInt();
        int y = input.nextInt();
        if (x> y)
            System.out.println(1);
        if (y>x)
            System.out.println(2);
        if ( x== y)
            System.out.println(0);
    }
}