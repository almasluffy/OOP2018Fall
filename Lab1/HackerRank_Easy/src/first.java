import  java.util.Scanner;
public class first {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        if(x%2==1)
        {
            System.out.println("Weird");
        }
        if(x%2==0 && x>=2 && x<5)
        {
            System.out.println("Not Weird");
        }

        if(x%2==0 && x>=6 && x<=20)
        {
            System.out.println("Weird");
        }

        if(x%2==0 && x>20)
        {
            System.out.println("Not Weird");
        }

    }
}
//https://www.hackerrank.com/challenges/java-if-else/problem