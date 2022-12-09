package ru.mirea.task18;

import java.util.Scanner;

public class Ex2
{
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] arg)
    {
        Ex2 e = new Ex2();
        e.exceptionDemo();
    }
}
