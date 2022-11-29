package ru.mirea.task6.printable;

import java.util.Scanner;

public class TestPrintable
{
    public static void main(String args[])
    {
        Printable[] B = new Book[3];
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String n,a;
        float p;
        for(int i = 0; i<3;i++)
        {
            System.out.println("Введите название");
            n = input.nextLine();
            System.out.println("Введите автора");
            a = input.nextLine();
            System.out.println("Введите цену");
            p = input1.nextFloat();
            B[i] = new Book(n,a,p);
        }
        System.out.println("\nВаши книги:");
        for(int i = 0; i<3;i++)
        {
            B[i].print();
            System.out.println();
        }

    }
}
