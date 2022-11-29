package ru.mirea.task2;

import java.util.Scanner;

public class HowMany
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите слова");
        String s = input.nextLine();
        int k = 0;

        if(s.length() != 0)
        {
            k++;
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i)==' ')
                {
                    k++;
                }
            }
        }
        System.out.println("Количество слов в строке = " + k);
    }
}
