import  java.util.*;
public class Data
{
    private   double sum;
    private   double mx;
    private   int counter;

    public Data()
    {
      sum = 0;
      mx = -999999999;
      counter  = 0;
    }

    public void AddToData(double a)
    {
       sum+=a;
       mx = Math.max(mx,a);
       counter++;
    }

    public double Average()
    {
        return  sum/counter;
    }

    public double MAX()
    {
        return  mx;
    }


}
