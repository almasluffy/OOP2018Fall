import java.util.Scanner;

public class my_function {
    public static void Binary(int a){
        int b;
        String temp = "";
        while(a !=0){
            b = a%2;
            temp = b + temp;
            a = a/2;
        } System.out.print(temp);
    }
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Binary(a);
    }
}