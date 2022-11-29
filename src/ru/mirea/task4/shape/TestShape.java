package ru.mirea.task4.shape;

public class TestShape
{
    public static void main(String[] args)
    {
        Circle c = new Circle(2.3,"красный", true);
        Rectangle r = new Rectangle(1.0,15.0,"синий", true );
        Square s = new Square(10,"жёлтый", true);
        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(s.toString());
    }
}
