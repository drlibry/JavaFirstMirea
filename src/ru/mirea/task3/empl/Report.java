package ru.mirea.task3.empl;

import java.util.Scanner;

public class Report
{
    static void generateReport(int n,Employee[] employees)
    {
        for (int i = 0; i<n; i++)
        {
            System.out.print("Зарплата работника № " + (i+1)+ " ");
            System.out.printf("%10.2f", employees[i].salary);
            System.out.println();

        }
    }
    public static void main(String[] args)
    {
        System.out.println("Введите количество работников: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Employee[] employees = new Employee[n];
        String name;
        float s;
        for(int i = 0; i<n; i++)
        {
            System.out.println("Имя:");
            name = input.next();
            System.out.println("Зарплата:");
            s = input.nextFloat();
            employees[i] = new Employee(name, s);
        }
        generateReport(n,employees);
    }
}
