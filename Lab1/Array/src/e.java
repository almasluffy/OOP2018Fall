import java.util.Scanner;

public class e{



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        int k = 0;
        int b = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
        }

        for(int i=0;i<n;i++)
        {

            if(b>0){
                if(a[i]*a[i-1]>0)
                {
                    k++;
                }
            }

            b++;
        }
        if(k>0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}