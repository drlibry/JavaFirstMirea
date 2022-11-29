package ru.mirea.task4.shape;

public abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape(){}
    public Shape(String c, boolean f)
    {
        color = c;
        filled = f;
    }
    public String getColor ()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
