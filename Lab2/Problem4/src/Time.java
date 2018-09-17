public class Time
{
    public int hour, minute, second;
    public Time(int hour, int minute, int second)
    {
        this.hour  = hour;
        this.minute = minute;
        this.second  = second;
    }

    public String toUniversal()
    {
        return '"'+ Cnv(hour) + ":" + Cnv(minute) + ":" + Cnv(second) + '"';
    }

    public  String toStandard()
    {
        if(hour>12)
        {
            return  '"' + Cnv(hour-12) + ":" + Cnv(minute) + ":" + Cnv(second) + " PM" + '"';
        }
        else {
            return '"'+ Cnv(hour) + ":" + Cnv(minute) + ":" + Cnv(second) + " AM" + '"';
        }
    }

    public String Cnv(int a)
    {
        String s  = Integer.toString(a);
        if(a<10)
        {
            s = "0" + s;

        }
        return  s;
    }

    public void add(Time t2)
    {
       second+= t2.second;
        minute+=second/60;
       second = second%60;

       minute+=t2.minute;
        hour+=minute/60;
       minute = minute%60;

       hour +=t2.hour;hour+=minute/60;
       hour = hour%24;



        System.out.println("Standard: "+ t2.toStandard());
        System.out.println("Universal: "+ t2.toUniversal());


    }

}
