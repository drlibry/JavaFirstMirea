package ru.mirea.task11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time
{
    public static void main(String[] args)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar c1 = new GregorianCalendar(2022,Calendar.NOVEMBER, 4);
        Date d1 = new Date();
        c1.set(Calendar.HOUR,22);
        c1.set(Calendar.MINUTE,6);
        c1.set(Calendar.SECOND,13);
        System.out.println("Дата получения: "+ sdf.format(c1.getTime()));
        System.out.println("Дата сдачи: "+ sdf.format(d1));
    }
}
