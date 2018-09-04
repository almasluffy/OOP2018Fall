import java.util.Scanner;

public class f{



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        int k = 0;

        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
        }

        for(int i=1;i<n-1;i++)
        {


                if(a[i]>a[i-1] && a[i]>a[i+1])
                {
                    k++;
                }



        }
        System.out.println(k);
    }
}