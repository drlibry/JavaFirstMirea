package ru.mirea.task2;

import java.util.Scanner;

public class ChangePlace
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] mass = new int[n];
        for(int i = 0; i < n; i++)
        {
            mass[i]=input.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        int temp;
        for(int i = 0; i < n/2; i++)
        {
            temp = mass[n-i-1];
            mass[n-i-1] = mass[i];
            mass[i] = temp;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass[i]+" ");
        }
        System.out.println();

    }

}
