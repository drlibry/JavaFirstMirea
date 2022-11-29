package ru.mirea.task3;

import java.util.Scanner;

public class MassN
{
    public static void main(String[] args)
    {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ввездите размер массива");
        while(n < 1)
        {
            if(input.hasNextInt())
            {
                n = input.nextInt();
                if(n < 1)
                {
                    System.out.println("Введенное число должно быть положительное! Введите заново");
                }
                else if (!(n>0))
                {
                    System.out.println("Вы ввели не число! Введите заново");
                    input.next();
                }

            }
        }
        int[] mass1 = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++)
        {
            mass1[i] = (int) (Math.random()*n);
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass1[i]+" ");
        }
        System.out.println();
        int m = n/2, j = 0;
        int [] mass2 = new int[m];
        for(int i = 0; i < n; i++)
        {
            if(i%2 == 0)
            {
                mass2[j] = mass1[i];
                j++;
            }
        }
        System.out.println("Второй массив: ");
        for(int i = 0; i < m; i++)
        {
            System.out.print(mass2[i]+" ");
        }



    }
}
