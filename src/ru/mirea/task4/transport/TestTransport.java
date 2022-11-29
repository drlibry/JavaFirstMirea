package ru.mirea.task4.transport;

public class TestTransport
{
    public static void main(String[]args)
    {
        Airplane a = new Airplane(4.5,5400,1500,505,232);
        Car c = new Car(5.1,100,4);
        Train t = new Train(30.5,800,2000,20,2100);
        Ship s = new Ship(15.7,1200,451,150,3100);
        System.out.println(a.toString());
        System.out.println(c.toString());
        System.out.println(t.toString());
        System.out.println(s.toString());

    }
}
