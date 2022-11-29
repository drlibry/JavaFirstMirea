package ru.mirea.task2.dog;

public class Dog
{
    private String name;
    private int age;
    public Dog(String n, int a)
    {
        name = n;
        age = a;
    }
    public void SetAge(int age)
    {
        this.age = age;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public int GetAge()
    {
        return age;
    }
    public String GetName()
    {
        return name;
    }
    public void AgeToHum()
    {
        System.out.println("Возраст " + name + " в человеческом летоисчислении - " +age*7 + " лет");
    }
    public String ToString()
    {
        return this.name + ", возраст " + this.age;
    }

}
