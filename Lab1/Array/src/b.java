import java.util.Scanner;

public class b{



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();

        }

        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }

    }
}