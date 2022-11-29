package ru.mirea.task4.shape;

public class Square extends Rectangle
{
    private double side;

    Square(){}
    Square( double s)
    {
        side = s;
    }
    Square( double s, String c, boolean f)
    {
        side = s;
        color = c;
        filled = f;
    }
    public double getSide()
    {
        return this.side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return side*side;
    }
    @Override
    public double getPerimeter()
    {
        return 4*side;
    }
    @Override
    public String toString()
    {
        return "Фигура - квадрат, сторона - " + this.side  + " цвет - " + this.getColor() + " площадь - " + this.getArea() +" периметр - " + this.getPerimeter();
    }

}
