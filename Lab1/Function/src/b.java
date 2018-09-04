import java.util.Scanner;

public class b {


    static double power(double a,int b) {
        double p = 1;

        if (a == 0 && b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            for (int i = 0; i < b; i++) {
                p *= a;
            }
            return p;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        int n = input.nextInt();

        System.out.print(power(a, n));

    }

}