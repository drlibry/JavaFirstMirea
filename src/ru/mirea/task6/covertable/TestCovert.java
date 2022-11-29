package ru.mirea.task6.covertable;


public class TestCovert
{
    public static void main(String args[])
    {
        Covertable one = new CelToFar(15);
        one.convert();
        Covertable two = new CeltoK(27);
        two.convert();
    }
}
