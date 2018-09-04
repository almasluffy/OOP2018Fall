import java.util.Scanner;

public class c{



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        int k = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();

        }

        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
             k++;
            }
        }
            System.out.println(k);
    }
}