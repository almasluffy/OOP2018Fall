import java.util.Scanner;

public class b
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int k = 2;
        while(true)
        {
            if(a%k==0){
                System.out.println(k);
                break;
            }
            k++;
        }

    }
}