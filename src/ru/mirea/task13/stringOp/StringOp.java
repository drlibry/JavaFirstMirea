package ru.mirea.task13.stringOp;

import ru.mirea.task12.presentation.Presentat;

public class StringOp
{
    public static void main(String[] args)
    {
        String s = "I love Java!!!";
        System.out.println("Последний символ: " + s.charAt(13));
        System.out.println("Заканчивается на !!!: " + s.endsWith("!!!"));
        System.out.println("Начинается с I love: " + s.startsWith("I love"));
        System.out.println("Содержится Java: " + s.contains("Java"));
        System.out.println("Индекс Java : c " + s.indexOf("Java"));
        System.out.println("Замена а на о: " + s.replace('a','o'));
        System.out.println("К верхнему регистру: " + s.toUpperCase());
        System.out.println("К нижнему регистру: " + s.toLowerCase());
        System.out.println("Вырежем Java: " + s.substring(s.indexOf("Java"),s.indexOf("Java")+4));
    }
}
