package ru.mirea.task13.phone;

public class TestPhone
{
    public static void main(String[] args)
    {

        PhoneNum p1 = new PhoneNum("+79874784580");
        PhoneNum p2 = new PhoneNum("+101234567890");
        PhoneNum p3 = new PhoneNum("89874781790");
        System.out.println(p1.GetNum1());
        System.out.println(p2.GetNum1());
        System.out.println(p3.GetNum1());
    }
}
