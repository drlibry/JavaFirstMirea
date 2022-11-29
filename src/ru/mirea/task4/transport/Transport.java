package ru.mirea.task4.transport;

public abstract class Transport
{
    protected double time;
    protected double PassSum;
    protected double FreightSum;
    Transport(){}
    public double getTime()
    {
        return time;
    }
    public void setTime(double time)
    {
        this.time = time;
    }
    public double getPassSum()
    {
        return PassSum;
    }
    public void setPassSum(double p)
    {
        this.PassSum = p;
    }
    public double getFreightSum()
    {
        return FreightSum;
    }
    public void setFreightSum(double f)
    {
        this.FreightSum = f;
    }
    public abstract double stoimPass();
    public abstract double stoimFreight();
    public abstract String toString();
}
