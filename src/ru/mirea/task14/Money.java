package ru.mirea.task14;
import java.util.ArrayList;
import java.util.regex.*;
public class Money
{
    public static void main(String [] args)
    {
        String s1 = "44 ERR, 0.004 EU";
        String s2 = "25.98 USD";
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
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
