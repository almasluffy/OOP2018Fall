import java.util.Scanner;

public class a
{

    static int Min1(int a, int b )
    {
        if(a>b)
        {
            return  b;
        }
        return  a;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();


        System.out.println(Min1(Min1(a,b), Min1(c,d)));

    }
}