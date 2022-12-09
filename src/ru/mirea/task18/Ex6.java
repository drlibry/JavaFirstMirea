package ru.mirea.task18;

import java.util.Scanner;

public class Ex6 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        try {
            if (key == "jjj") {
                throw new Exception("exeption");
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return "data for " + key;
    }

    public static void main(String[] arg) {
        Ex6 e = new Ex6();
        e.getKey();
    }
}
