public class Arr
{
    public int[] toX2(int[] a)
    {
        int[] res = new int[a.length*2];
        int k = 0;
        for(int i=0;i<a.length;i++)
        {
            res[k] = a[i];
            res[k+1] = a[i];
            k+=2;
        }

        return res;
    }
}
