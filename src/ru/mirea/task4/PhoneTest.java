package ru.mirea.task4;

public class PhoneTest
{
    public static void main(String[] args)
    {
        //1
        Phone p1 = new Phone(848654513, "KKK", 120 );
        Phone p2 = new Phone(464546895,"JK", 205);
        Phone p3 = new Phone(546867465,"RM",80);
        //2
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        //3
        p1.receiveCall("MAMA");
        //11
        p2.receiveCall("PAPA", 65416464);
        String n1 ="641654684";
        String n2 ="783845822";
        p3.sendMessage(n1+" "+n2);





    }
}
