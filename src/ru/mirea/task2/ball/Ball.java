package ru.mirea.task2.ball;

public class Ball
{
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double a, double b)
    {
        x = a;
        y = b;
    }
    public Ball()
    {
        x = 0.0;
        y = 0.0;
    }
    public double GetX()
    {
        return x;
    }
    public double GetY()
    {
        return y;
    }
    public void SetX(double x)
    {
        this.x = x;
    }
    public void SetY(double y)
    {
        this.y = y;
    }
    public void SetXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp)
    {
        this.x = x+xDisp;
        this.y = y+yDisp;
    }
    public String ToString()
    {
        return " Ball (" + this.x + ", " + this.y +")";
    }


}
