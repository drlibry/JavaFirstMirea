package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.*;
public class Separation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Pattern pattern = Pattern.compile("\\s");
        String[] s = pattern.split(text);
        for(String ss : s)
        {
            System.out.println(ss);
        }
    }
}
