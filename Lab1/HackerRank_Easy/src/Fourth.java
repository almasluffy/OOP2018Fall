
import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String s = Integer.toString(x);

        if(x == Integer.parseInt(s))
        {
            System.out.println("Good job");
        }

    }
}
//https://www.hackerrank.com/challenges/java-int-to-string/problem