import java.util.Scanner;

public class m
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a  = input.nextInt();
        int x;
        int sum = 0;
        for(int i = 0; i < a ; i++)
        {
            x = input.nextInt();
            if(x==0){
                sum++;
            }
        }

        System.out.print(sum);

    }
}