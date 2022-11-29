package ru.mirea.task15.country;

import javax.swing.*;

public class TestCountry
{
    public static void main(String [] args)
    {
        Country c = new Country("NEW");
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(1000,300);
        c.setLocationRelativeTo(null);
    }
}
