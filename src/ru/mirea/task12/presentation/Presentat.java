package ru.mirea.task12.presentation;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Presentat extends JPanel
{
    private JFrame frame;
    private java.util.Timer timer;
    private Image image;
    private int count;
    public Presentat() {
        count = 0;
        frame = new JFrame("1С");
        frame.setSize(320, 300);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        timer = new Timer();
        timer.schedule(play, 1,270);
    }
    TimerTask play = new TimerTask() {
        public void run() {
            switch (count) {
                case 0:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\ноут1.png").getImage();
                    break;
                case 1:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\ноут2.png").getImage();
                    break;
                case 2:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\ноут3.png").getImage();
                    break;
                case 3:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\ноут4.png").getImage();
                    break;
                case 4:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\ноут5.png").getImage();
                    break;
                case 5:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\ноут6.png").getImage();
                    break;
                case 6:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\Лого.png").getImage();
                    break;
                case 7:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\Печать.png").getImage();
                    break;
                case 8:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\Подпись Ш.png").getImage();
                    break;
                case 9:
                    image = new ImageIcon("C:\\Users\\1686813\\OneDrive\\Документы\\Свищев 1С\\Новый точечный рисунок.png").getImage();
                    break;
                default:
                    break;
            }
            count++;
            if (count == 10) {
                count = 0;
            }
            repaint();
        }
    };

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
}
