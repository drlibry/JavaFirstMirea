package ru.mirea.task4.transport;

public class Car extends Transport
{
    private double pass;
    Car(double t, double p,double pas)
    {
        pass = pas;
        time = t;
        PassSum = p;
    }
    public double getPass()
    {
        return pass;
    }
    @Override
    public double stoimFreight() {return 0;};
    @Override
    public double stoimPass()
    {
        return pass * PassSum;
    }
    @Override
    public String toString()
    {
        return "Машина, время - " + getTime() + ", количество пассажиров - " + getPass() + ", цена за перевозку пассажира - " + getPassSum() + ", стоимость перевозки - " + stoimPass();
    }
}
