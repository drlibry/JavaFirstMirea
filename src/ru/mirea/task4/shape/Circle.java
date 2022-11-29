package ru.mirea.task4.shape;

public class Circle extends Shape {
    private double radius;

    Circle(){}
    Circle (double r)
    {
        radius = r;
    }
    Circle (double r, String c, boolean f)
    {
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }
    @Override
    public String toString()
    {
        return "Фигура - круг, радиус - " + this.radius+ " цвет - " + this.getColor() + " площадь - " + this.getArea() +" периметр - " + this.getPerimeter();
    }
}
