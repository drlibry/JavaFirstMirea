package ru.mirea.task2.shop;

import ru.mirea.task2.shop.Shop;

import java.util.Scanner;

public class TestShop
{
    public static void main(String[] args)
    {
        Shop MyShop = new Shop();
        System.out.print("Количество компьютеров в магазине = ");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        MyShop.SetN(k);
        MyShop.InputNew();//заполнение массива компьютеров
        System.out.println("Ваш список: ");
        MyShop.PrintList();
        int ind;
        System.out.println("Индекс какого компьютера хотите найти?");
        String find = input.next();
        ind = MyShop.SearchList(find);
        System.out.println("Индекс вашего компьютера = "+ind);
        System.out.println("Какой компьютер хотите удалить?");
        find = input.next();
        MyShop.Del(MyShop.SearchList(find));
        System.out.println("Ваш список после удаления: ");
        MyShop.PrintList();
    }
}
