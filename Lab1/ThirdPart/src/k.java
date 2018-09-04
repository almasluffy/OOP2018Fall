import java.util.Scanner;

public class k
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        int x;
        int sum = 0;
        for(int i = 0; i < a ; i++)
        {
            x = input.nextInt();
            sum+=x;
        }

        System.out.print(sum);

    }
}