import java.util.Scanner;

public class a
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int k = 1;
        while(true)
        {
            if(k*k>a){
                break;
            }
            System.out.println(k*k);
            k++;
        }

    }
}