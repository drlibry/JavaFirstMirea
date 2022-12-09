package ru.mirea.task18;

import java.util.Scanner;

public class Ex4
{
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("!!!!!");
        } catch (Exception e) {
            System.out.println("???");
        } finally {
            System.out.println("ok");
        }
    }

    public static void main(String[] arg) {
        Ex4 e = new Ex4();
        e.exceptionDemo();
    }
}
