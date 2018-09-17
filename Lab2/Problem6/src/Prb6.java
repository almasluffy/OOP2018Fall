import  java.util.*;
public class Prb6 {

    public  static  void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        NumInWords nw = new NumInWords(n);
        System.out.println(nw.inWords());
    }
}
