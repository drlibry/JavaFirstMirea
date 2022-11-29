package ru.mirea.task8;

import java.util.Scanner;

public class Sum
{
    public static int recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            return n % 10 + recursion(n / 10);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println(recursion(k)); // вызов рекурсивной функции
    }
}
