package ru.mirea.task8;

import java.util.Scanner;

public class SumNum
{
    public static int recursion(int len, int sum, int k, int s)
    {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if(len ==0)
            c = 1;
        else
            c = 0;
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args)
    {
        System.out.println("Введите зеачения k и s");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int s = input.nextInt();
        System.out.println(recursion(0, 0, k, s)); // вызов рекурсивной функции
    }
}
