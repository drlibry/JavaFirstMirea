package ru.mirea.task14;

import java.util.regex.Pattern;

public class Matches
{
    public static void main(String [] args)
    {
        String text = "abcdefghijklmnopqrstuv18340";
        String s1 = "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(Pattern.matches(s1,text));
        System.out.println(Pattern.matches(s2,text));

    }
}
