package ru.mirea.task15.file;

import javax.swing.*;

public class TestFile
{
    public static void main(String [] args)
    {
        File c = new File("NEW");
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(200,200);
        c.setLocationRelativeTo(null);
    }
}
