package ru.mirea.task5.picture;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Picture extends JPanel
{
    private JFrame frame;
    private Image image;
    private int count;
    public Picture()
    {
        frame = new JFrame("Laptop");
        frame.setSize(1200,600);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\ноут1.png").getImage();
    }
    public void paint(Graphics g)
    {
        g.drawImage(image, 0, 0, null);
    }
}

