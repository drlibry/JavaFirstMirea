package ru.mirea.task18;

public class Ex5
{
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            key = "exception";
        }
        return key;
    }

    public static void main(String[] arg) {
        Ex5 K = new Ex5();
        K.printMessage(null);
        K.printMessage("765");
    }
}
