
import java.util.Scanner;


public class Sixth {

    public static String ToUp(String s)
    {
        if(s.length() == 0)
        {
            return "";
        }
        return s.substring(0,1).toUpperCase()+ s.substring(1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String A = input.next();
        String B = input.next();

        System.out.println(A.length() + B.length());

        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        System.out.println(ToUp(A)+ " " + ToUp(B));


    }
}
//https://www.hackerrank.com/challenges/java-strings-introduction/problem