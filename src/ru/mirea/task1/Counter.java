package ru.mirea.task1;
import java.util.Scanner;

public class Counter
{
    public static void main(String[] args)
    {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        int[] mass = new int[n];
        for(int i=0;i<n;i++)
        {
            mass[i]=v.nextInt();
        }
        int i=0;
        do
        {
            System.out.print(mass[i]);
            System.out.print(" ");
            i++;
        } while(i<n);
        int sum=0, j=0;
        while (j<n)
        {
            sum+=mass[j];
            j++;
        }
        System.out.print("Sum = ");
        System.out.println(sum);
        float MidSum = sum/n;
        System.out.print("Среднеее арифметическое:" + MidSum);
    }
}
