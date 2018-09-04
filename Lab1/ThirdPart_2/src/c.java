import java.util.Scanner;

public class c
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int k = 0;
        while(true)
        {
            if(Math.pow(2,k)>a){
                break;
            }
            System.out.print((int)Math.pow(2,k)+" ");
            k++;
        }

    }
}