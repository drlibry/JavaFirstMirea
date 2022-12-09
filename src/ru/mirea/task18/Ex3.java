package ru.mirea.task18;

import java.util.Scanner;

public class Ex3
{
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } finally {
            System.out.println("String????");
        }
    }
    public static void main(String[] arg) {
        Ex3 e = new Ex3();
        e.exceptionDemo();
    }
}
