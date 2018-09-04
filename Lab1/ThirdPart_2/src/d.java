import java.util.Scanner;

public class d
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int k = 0,res = 0;
        while(true)
        {
            if(Math.pow(2,k)>a){
                break;
            }
            if(Math.pow(2,k)==a){
                res++;
            }
            k++;
        }
           if(res== 0){
               System.out.println("NO");
           }
        if(res!=0){
            System.out.println("YES");
        }
    }
}