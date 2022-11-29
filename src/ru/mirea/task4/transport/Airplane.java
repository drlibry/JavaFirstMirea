package ru.mirea.task4.transport;

public class Airplane extends Transport
{
    private double pass;
    private double freight;
    Airplane(double t, double p,double f, double fr, double pas)
    {
        freight = fr;
        pass = pas;
        time = t;
        PassSum = p;
        FreightSum = f;
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
        return "Самолет, время - " + getTime() + ", количество пассажиров - " + getPass() + ", цена за перевозку пассажира - " + getPassSum() + ", количество груза - " + getFreight() + ", цена за перевозку груза - " + getFreightSum()+ ", стоимость перевозки пассажиров - " + stoimPass() + ", стоимость перевозки груза - " + stoimFreight();
    }
}
