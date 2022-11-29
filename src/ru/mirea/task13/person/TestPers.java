package ru.mirea.task13.person;

public class TestPers
{
    public static void main(String args[])
    {
        Person p1 = new Person("Рыбакова", "Дарья", "Алексеевна");
        Person p2 = new Person("Рыбакова");
        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
    }
}
