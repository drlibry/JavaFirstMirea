package ru.mirea.task4;

import java.util.Scanner;

enum Seasons
{
    WINTER("Одно из четырёх времён года, между осенью и весной. Основной признак этого времени года - устойчивая низкая температура во многих районах Земли, на поверхность земли выпадает и ложится снег. Зимние месяцы - Январь, Февраль, Декабрь."),
    SPRING("Одно из четырёх времён года, переходный сезон между зимой и летом. Существуют различные методы определения начала и окончания весны, отличающиеся в зависимости от местного климата, культур и обычаев. Когда в Северном полушарии весна, то в Южном полушарии осень и наоборот. Весенние месяцы - Март, Апрель, Май"),
    SUMMER("Одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды. В день летнего солнцестояния дни самые длинные, а ночи самые короткие. Летние месяцы - Июнь, Июль, Август."),
    AUTUMN("Одно из четырёх времён года, между летом и зимой. Осень - переходный сезон, когда заметно уменьшение светового дня, и постепенно понижается температура окружающей среды. Осенние месяцы - Сентябрь, Октябрь, Ноябрь.");
//    TEMPWIN(""),
//    TEMPSPR(""),
//    TEMPSUM(""),
//    TEMPAUT("");
//    enum Temp
//    {
//        TEMPWIN,
//        TEMPSPR,
//        TEMPSUM,
//        TEMPAUT;
//    }


    Seasons( String season)
    {
        this.season = season;
    }
    private String season;
    public String getSeason()
    {
        return season;
    }
}
enum Temp
{
    TEMPWIN(0),
    TEMPSPR(0),
    TEMPSUM(0),
    TEMPAUT(0);
    Temp(int t)
    {
        this.t = t;
    }
    private int t;
    public int getTemp()
    {
        return t;
    }
    public void SetTemp(int t)
    {
        this.t = t;
    }
}
public class SeasonNum
{
    static void Ilove(Seasons s)
    {

        switch(s)
        {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
    static String GetDescription(Seasons s)
    {
        if(s==Seasons.WINTER | s==Seasons.SPRING | s==Seasons.AUTUMN )
            return "Холодное время года";
        else
            return "Теплое время года";
    }

    public static void main(String[] args)
    {
        // 1
        Seasons s;
        s = Seasons.SUMMER;
        System.out.println(s);
        String st = s.getSeason();
        System.out.println(st);

        //2
        System.out.println("Введите время года");
        Seasons[] Seasmass = new Seasons[4];
        Seasmass[0] = Seasons.WINTER;
        Seasmass[1] = Seasons.SPRING;
        Seasmass[2] = Seasons.SUMMER;
        Seasmass[3] = Seasons.AUTUMN;
        Seasons s1;

        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        if(a=="Зима")
        {
            s1=Seasmass[0];
        }
        else if(a=="Весна")
        {
            s1=Seasmass[1];
        }
        else if(a=="Лето")
        {
            s1=Seasmass[2];
        }
        else
        {
            s1=Seasmass[3];
        }
        Ilove(s1);

        //3//4
        Temp[] Tempmass= new Temp[4];
        Tempmass[0] = Temp.TEMPWIN;
        Tempmass[1] = Temp.TEMPSPR;
        Tempmass[2] = Temp.TEMPSUM;
        Tempmass[3] = Temp.TEMPAUT;

        Tempmass[0].SetTemp(-22);
        Tempmass[1].SetTemp(+9);
        Tempmass[2].SetTemp(+26);
        Tempmass[3].SetTemp(+7);

        for(int i = 0; i<4;i++)
        {
            String descr = GetDescription(Seasmass[i]);
            int x = Tempmass[i].getTemp();
            System.out.println(Seasmass[i]+ " "+x+" " + descr);
        }
        String f = GetDescription(s1);
        System.out.println(f);

    }

}
