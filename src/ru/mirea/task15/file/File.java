package ru.mirea.task15.file;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class File extends JFrame
{
    JLabel l;
    JButton b1,b2;
    JComboBox c1,c2,c3,c4;
    JTextField t;
    File(String s)
    {
        super();
        setLayout(new FlowLayout());

        String s1[] = {"File", "Save", "Out"};

        String s2[] = {"Edit", "Copy", "Cut", "Paste"};
        String s3[] = {"Help"};
        c1 = new JComboBox(s1);
        c2 = new JComboBox(s2);
        c3 = new JComboBox(s3);
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        t = new JTextField("Enter something");
        add(c1);
        add(c2);
        add(c3);
        add(b1);
        add(b2);
        add(t);
    }

}
