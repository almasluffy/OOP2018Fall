
import java.util.Scanner;

public class Seventh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String s1 = new StringBuilder(s).reverse().toString();

        if(s.equals(s1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }


    }
}
//https://www.hackerrank.com/challenges/java-string-reverse/problem