package ru.mirea.task14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekNum
{
    public static void main(String [] args)
    {
        String s1 = "29/02/2000, 30/04/2003, 01/01/2003";
        String s2 = "29/02/2001, 30-04-2003, 1/1/1899";
        Pattern p  = Pattern.compile("((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))");
        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);
        ArrayList<String> ans = new ArrayList<>();
        while (m1.find())
        {
            ans.add(m1.group());
        }
        while (m2.find())
        {
            ans.add(m2.group());
        }
        System.out.println(ans);
    }
}
