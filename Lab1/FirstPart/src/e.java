import java.util.Scanner;

public class e
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = a*b;
        System.out.println((int)(c-(Math.floor(c/109))*109));
    }
}