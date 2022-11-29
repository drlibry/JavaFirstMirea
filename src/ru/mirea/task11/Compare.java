package ru.mirea.task11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Compare
{
    public static void main(String[] args)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год");
        int y = input.nextInt();
        System.out.println("Введите месяц");
        int m = input.nextInt();
        System.out.println("Введите день");
        int d = input.nextInt();
        System.out.println("Введите час");
        int h = input.nextInt();
        System.out.println("Введите минуты");
        int min = input.nextInt();
        System.out.println("Введите секунды");
        int s = input.nextInt();
        Calendar c1 = new GregorianCalendar(y,m-1,d,h,min,s);
        Date d1 = new Date();
        System.out.println("Ваша дата: "+ sdf.format(c1.getTime()));
        System.out.println("Сейчас: "+ sdf.format(d1));
        System.out.println("Ваша дата больше(1)/меньше(0), чем есть сейчас: "+ c1.after(d1));
    }
}
