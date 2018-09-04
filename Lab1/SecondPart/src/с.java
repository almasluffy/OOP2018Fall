import java.util.Scanner;

public class с
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a==1 && b==1 )
        {
            System.out.println("YES");
        }
        if(a!=1 && b!=1 )
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}