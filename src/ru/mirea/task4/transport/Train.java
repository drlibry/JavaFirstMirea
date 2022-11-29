package ru.mirea.task4.transport;

public class Train extends Transport
{
    private double pass;
    private double freight;
    Train(double t, double f, double fr, double pas, double p)
    {
        this.freight = fr;
        this.pass = pas;
        this.time = t;
        this.PassSum = p;
        this.FreightSum = f;
    }
    public double getPass()
    {
        return pass;
    }
    public double getFreight()
    {
        return freight;
    }
    @Override
    public double stoimPass()
    {
        return pass * PassSum;
    }
    @Override
    public double stoimFreight()
    {
        return freight * FreightSum;
    }
    @Override
    public String toString()
    {
        return "Поезд, время - " + getTime() + ", количество пассажиров - " + getPass() + ", цена за перевозку пассажира - " + getPassSum() + ", количество груза - " + getFreight() + ", цена за перевозку груза - " + getFreightSum()+ ", стоимость перевозки пассажиров - " + stoimPass() + ", стоимость перевозки груза - " + stoimFreight();
    }
}
