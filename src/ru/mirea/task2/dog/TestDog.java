package ru.mirea.task2.dog;

public class TestDog
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog ("Dog", 3);
        Dog d2 = new Dog ("Friend", 7);
        Dog d3 = new Dog ("Den", 1);
        String res;
        res = d1.ToString();
        System.out.println(res);
        d1.SetAge(5);
        d2.AgeToHum();
        d3.SetName("Lucky");
        res = d1.ToString();
        System.out.println(res);
        res = d2.ToString();
        System.out.println(res);
        res = d3.ToString();
        System.out.println(res);
    }
}
