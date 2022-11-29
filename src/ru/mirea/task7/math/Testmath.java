package ru.mirea.task7.math;

public class Testmath
{
    public static void main(String args[])
    {
        MathCalculable mc = new MathFunc(2,4);
        System.out.println("Ваше число: 2 + 4*i");
        mc.mod();
        mc.stepen(2);
    }
}
