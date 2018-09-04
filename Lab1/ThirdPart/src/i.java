

import java.util.Scanner;


public class i
{
    public static boolean isPrime(int a){
        if(a==1) return false;
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0) return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b =1;
        int d =2, ans  = 1;

        if (isPrime(a))
        {
            System.out.println(2);

        }
else {


            while (a > 1) {
                if (a % d == 0) {
                    b++;
                    a = a / d;

                } else {
                    ans = ans * b;
                    d++;
                    b = 1;
                }
            }


            System.out.print(ans * b);
        }
    }
}