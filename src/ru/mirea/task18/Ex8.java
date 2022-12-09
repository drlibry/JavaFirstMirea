package ru.mirea.task18;

import java.util.Scanner;

public class Ex8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        boolean flag = false;
        do {
            flag = false;
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try{
                printDetails(key);
            } catch (Exception e){
                flag = true;
            }
        } while (flag);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] arg) {
        Ex8 throwsDemo8 = new Ex8();
        try {
            throwsDemo8.getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
