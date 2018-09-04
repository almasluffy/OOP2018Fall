import java.util.Scanner;

public class c {

    static int Xor(int x,int y){
        if (x != y){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.print(Xor(x,y));
    }
}