package ru.mirea.task3;

public class Shell
{
    public static void main(String[] args)
    {
        Double x = Double.valueOf(5);
        Double y = Double.valueOf('k');
        System.out.println("valueOf(): " + x + " " + y);

        Double s = Double.parseDouble("51");
        System.out.println("from string:  " + s);

        Double a = Double.valueOf(88);
        double a0 = a;
        int a1 = a.intValue();
        byte a2 = a.byteValue();
        short a3 = a.shortValue();
        long a4 = a.longValue();
        float a5 = a.floatValue();
        boolean a6 = a!=0;
        char a7 = (char) a.doubleValue();
        System.out.println("Во все примитивные типы:  " + a1 + ' '+ a2 + ' '+ a3 + ' '+ a4 + ' '+ a5 + ' '+ a6 + ' '+ a7);

        String str = Double.toString(3.14);
        System.out.println("Double.toString():  " + str);


    }
}
