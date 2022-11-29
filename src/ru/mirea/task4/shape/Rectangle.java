package ru.mirea.task4.shape;

public class Rectangle extends Shape
{
    private double width;
    private double length;

    Rectangle(){}
    Rectangle(double w, double l)
    {
        width = w;
        length = l;
    }
    Rectangle(double w, double l, String c, boolean f)
    {
        width = w;
        length = l;
        color = c;
        filled = f;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    @Override
    public double getArea()
    {
        return width*length;
    }
    @Override
    public double getPerimeter()
    {
        return 2*(width + length);
    }
    @Override
    public String toString()
    {
        return "Фигура - прямоугольник, ширина - " + this.width + " длина - " +this.length + " цвет - " + this.getColor() + " площадь - " + this.getArea() +" периметр - " + this.getPerimeter();
    }
}
