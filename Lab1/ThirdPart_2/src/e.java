import java.util.Scanner;
public class e
{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 1, c=0;
        while(i<n){
            i *= 2;
            c++;
        }
        System.out.print(c);
    }
}