package ru.mirea.task15.country;


import ru.mirea.task5.match.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Country extends JFrame
{
    //static JFrame f;
    JLabel l, l1;
    JComboBox c1,c2,c3,c4;
    Country(String s)
    {
        super();
        setLayout(new FlowLayout());

        String s1[] = {"Австралия           ","Австралия — государство в Южном полушарии, расположенное на одноимённом материке, а также близлежащих островах Тихого и Индийского океанов.|"};
        String s2[] = {"Китай               ","Китай или Чжун Го (Zhōngguó), как его называют сами китайцы, является одной из самых удивительных и загадочных стран мира.                 |"};
        String s3[] = {"Великобритания      ","Великобритания — небольшое государство на северо-западе Европы.                                                                            |"};
        String s4[] = {"Российская Федерация","Российская Федерация — крупнейшее в мире государство, занимающее 1/8 часть суши и расположенное на северо-востоке Евразии.                 |"};
        c1 = new JComboBox(s1);
        c2 = new JComboBox(s2);
        c3 = new JComboBox(s3);
        c4 = new JComboBox(s4);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }
}
