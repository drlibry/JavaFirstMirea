package ru.mirea.task8;

import java.util.Scanner;

public class Simple
{
    public static boolean recursion(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println(recursion(k, 2)); // вызов рекурсивной функции
    }
}
