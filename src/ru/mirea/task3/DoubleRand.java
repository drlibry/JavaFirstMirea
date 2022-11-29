package ru.mirea.task3;

import java.util.Random;
import java.util.Scanner;

public class DoubleRand
{
    public static void main(String[] args)
    {
        System.out.println("Сколько хотите чисел в массиве?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] mass1 = new double [n];
        System.out.println("ПЕРВЫЙ СПОСОБ:");
        for(int i = 0; i < n; i++)
        {
            mass1[i]=Math.random();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("После сортировки:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if (mass1[j] > mass1[j+1])
                {
                    double x = mass1[j];
                    mass1[j] = mass1[j + 1];
                    mass1[j + 1] = x;
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("ВТОРОЙ СПОСОБ:");
        int [] mass2 = new int [n];
        Random rand = new Random();
        for(int i = 0; i < n; i++)
        {
            mass2[i] = rand.nextInt(100);
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass2[i] + " ");
        }
        System.out.println(" ");
        System.out.println("После сортировки:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if (mass2[j] > mass2[j+1])
                {
                    int y = mass2[j];
                    mass2[j] = mass2[j + 1];
                    mass2[j + 1] = y;
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass2[i] + " ");
        }

    }
}
