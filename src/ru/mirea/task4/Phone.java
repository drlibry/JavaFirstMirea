package ru.mirea.task4;

import java.util.Scanner;

public class Phone
{
    private int number;
    private String model;
    private int weigh;
    Phone(int n, String m, int w)
    {
        number = n;
        model = m;
        weigh = w;
    }
    Phone (int n, String m)
    {
        number = n;
        model = m;
    }
    Phone () {}

    public int getNumber() {
        return number;
    }
    public String getModel(){
        return model;
    }
    public int getWeigh() {
        return weigh;
    }

    public void receiveCall(String name)
    {
        System.out.println(name + " is calling");
    }
    public void receiveCall(String name, int number)
    {
        System.out.println(name + " is calling, Number: " + number);
    }
    public String toString()
    {
        return "Номер: " + getNumber() + " Модель: " + getModel() + " Вес: " + getWeigh();
    }

    public void sendMessage(String numbers)
    {
        String mess = "Привет всем! Приглашаю вас на свой день рождения!\n";
        System.out.println("Сообщение:\n" + mess+ "Доставлено номерам: " + numbers);
    }
}
