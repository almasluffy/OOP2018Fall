import java.util.Scanner;
public class a {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);
    }
}
