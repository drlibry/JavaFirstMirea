package ru.mirea.task9;

import java.util.Scanner;

public class Stud {
    public static void main(String[] args) {
        Student student = new Student();
        student.insertSort();
        student.PrintScr();
    }
}
class Student {
    public int idNumber[];

    public Student()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        idNumber = new int[n];
        for(int i = 0; i< n ; i++)
        {
            idNumber[i] = input.nextInt();
        }
    }

    public void insertSort() {
        for (int i = 0; i < idNumber.length; i++)
        {
            int temp  = idNumber[i];
            int j;
            for(j = i - 1; j>=0 && temp <idNumber[j]; j--)
            {
                idNumber[j+1] = idNumber[j];
            }
            idNumber[j+1] = temp;
        }
    }
    public void PrintScr()
    {
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }
}
