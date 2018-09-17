public class Prb5 {

    public static  void main(String args[])
    {
        Arr arr = new Arr();
        int[] a = {1,2,3};

        int[] b =  arr.toX2(a);

        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
