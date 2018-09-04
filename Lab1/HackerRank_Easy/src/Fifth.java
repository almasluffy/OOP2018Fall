import java.util.Scanner;

public class Fifth
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int  i = 1;

        while (input.hasNextLine())
        {
            System.out.println(i + " " + input.nextLine());
            i++;
        }

    }
}
//https://www.hackerrank.com/challenges/java-end-of-file/problem