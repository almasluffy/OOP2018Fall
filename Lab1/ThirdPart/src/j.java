import java.util.Scanner;

public class j
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x;
        int sum = 0;
        for(int i=1;i<=100;i++)
        {
            x = input.nextInt();
            sum+=x;
        }

        System.out.print(sum);

    }
}