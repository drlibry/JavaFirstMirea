package ru.mirea.task11;

import ru.mirea.task10.PriceComparator;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestStudent
{
    public static void main(String[] args)
    {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar c1 = new GregorianCalendar(2002,Calendar.JANUARY,15,14,12,0);
        Calendar c2 = new GregorianCalendar(2003,Calendar.OCTOBER,9,12,40,0);
        Calendar c3 = new GregorianCalendar(2001,Calendar.MAY,26,9,17,0);
        Calendar c4 = new GregorianCalendar(2002,Calendar.JUNE,29,20,5,0);
        Student st1 = new Student("B", "BB", "b", 3, 5,c1);
        Student st2 = new Student("B", "BB", "b", 3, 5,c2);
        Student st3 = new Student("C", "CC", "c", 2, 12,c3);
        Student st4 = new Student("D", "DD", "d", 4, 2,c4);
        ArrayList<Student> IDNumber = new ArrayList<Student>();
        IDNumber.add(st1);
        IDNumber.add(st2);
        IDNumber.add(st3);
        IDNumber.add(st4);
        for(Student s: IDNumber)
        {
            System.out.println(s.toString());
        }
    }
}
