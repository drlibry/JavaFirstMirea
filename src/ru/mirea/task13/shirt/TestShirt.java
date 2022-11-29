package ru.mirea.task13.shirt;

public class TestShirt
{
    public static void main(String[] args)
    {
        String[] ss = {"S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        Shirt[] strs = new Shirt[ss.length];
        for(int i = 0; i<ss.length;i++)
        {
            strs[i] = new Shirt(ss[i]);
            System.out.println(strs[i].getFull());
        }
    }
}
