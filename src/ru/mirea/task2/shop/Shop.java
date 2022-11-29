package ru.mirea.task2.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    //private String name;
    private int n = 0;
    public ArrayList<String> comp = new ArrayList<String>();
    //String[] CompMass = new String[n];
    public Shop()
    {
        int n = 0;
    }
    public void SetN(int n)
    {
        this.n = n;
    }

    public void InputNew()
    {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            comp.add(input.next());
        }
    }
    public void PrintList()
    {
        System.out.println(String.join("\n", comp));
    }
    public void Del(int ind)
    {
        comp.remove(ind);
    }
    public int SearchList(String computer)
    {
        int ind = comp.indexOf(computer);
        return ind;
    }





}
