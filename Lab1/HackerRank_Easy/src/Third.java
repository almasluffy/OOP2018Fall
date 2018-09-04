
import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        double y = input.nextDouble();
        input.nextLine();
        String s  = input.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: "+ y);
        System.out.println("Int: "+ x);

    }
}
//https://www.hackerrank.com/challenges/java-stdin-stdout/forum