
import java.util.Scanner;

public class d
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int  a  = input.nextInt();
        if(a>0){
            System.out.println(1);
        }
        if(a<0){
            System.out.println(-1);
        }
        if(a==0){
            System.out.println(0);
        }
    }
}