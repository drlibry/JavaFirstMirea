package ru.mirea.task1;

import java.util.Scanner;

public class Factorial
{
    public static void main (String[] args)
    {
        System.out.println("Факториал какого числа хотите найти?");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int factorial = 1, k = 1;
        while(k <= n)
        {
            factorial *= k;
            k++;
        }
        System.out.println("Факториал вашего числа: " + factorial);
    }
}
