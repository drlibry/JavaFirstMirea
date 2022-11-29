package ru.mirea.task5.match;

import javax.swing.*;

public class TestMatch
{
    public static void main(String[] args)
    {
        Game g = new Game("LLL");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(220,200);
        g.setLocationRelativeTo(null);
    }
}
