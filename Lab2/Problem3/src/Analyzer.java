import  java.util.*;
public class Analyzer
{
    Analyzer()
    {

    }

    public  void DoIt()
    {
        Data dt = new Data();
        Scanner input = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter number(q to quit): ");
            String s = input.next();
            if(s.equals("q"))
            {
                System.out.println("Average = " + dt.Average());
                System.out.println("Maximium = "+ dt.MAX());
                break;
            }
            Double a = Double.parseDouble(s);
            dt.AddToData(a);
        }
    }

}
