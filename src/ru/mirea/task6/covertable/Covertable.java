package ru.mirea.task6.covertable;

interface Covertable
{
    void convert();
}
class CelToFar implements Covertable
{
    float tC;
    CelToFar(float tC)
    {
        this.tC=tC;
    }
    public void convert()
    {
        double tF;
        tF= tC*1.8+32;
        System.out.println(this.tC+" градусов по Цельсию = "+tF+" градусов по Фаренгейту");
    }
}
class CeltoK implements Covertable
{
    float tC;
    CeltoK(float tC)
    {
        this.tC=tC;
    }
    public void convert()
    {
        float tK = tC+273;
        System.out.println(this.tC+" градусов по Цельсию = "+tK+" градусов по Кельвину");
    }
}