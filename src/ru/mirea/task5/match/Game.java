package ru.mirea.task5.match;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame
{
    JButton b1,b2;
    JLabel l1, l2,l3 ,l4,l5,l6,l7;
    JTextField t1,t2;
    int a = 0, b = 0;
    String x, y, str1 = "AC Milan", str2 ="Real Madrid" ;
    eHandler handler = new eHandler();
    public Game (String s)
    {
        super();
        setLayout(new FlowLayout());
        b1 = new JButton("AC Milan");
        b2 = new JButton("Real Madrid");
        l1 = new JLabel("Result:");
        l2 = new JLabel("Last Scorer: ");
        l3 = new JLabel("Winner: ");
        l4 = new JLabel("x");
        t1 = new JTextField("0",3);
        t2 = new JTextField("0",3);
        l5 = new JLabel("No goals yet");
        l6 = new JLabel("        ");
        l7 = new JLabel("No goals yet");
        add(b1);
        add(b2);
        add(l1);
        add(t1);
        add(l4);
        add(t2);
        add(l6);
        add(l2);
        add(l5);
        add(l6);
        add(l3);
        add(l7);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
    }

    public class eHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == b1)
            {
                a = Integer.parseInt(t1.getText());
                a++;
                x =""+a;
                t1.setText(null);
                t1.setText(x);
                l5.setText(null);
                l5.setText(str1);
                if(a>b)
                {
                    l7.setText(null);
                    l7.setText(str1);
                }

            }
            else if(e.getSource() == b2)
            {
                b = Integer.parseInt(t2.getText());
                b++;
                y =""+b;
                t2.setText(null);
                t2.setText(y);
                l5.setText(null);
                l5.setText(str2);
                if(b>a)
                {
                    l7.setText(null);
                    l7.setText(str2);
                }
            }
        }
    }
}
