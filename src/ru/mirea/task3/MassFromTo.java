package ru.mirea.task3;


public class MassFromTo
{

    public static void main(String[] args)
    {
        int n = 4, max = 99, min = 10;
        //System.out.println("");
        int [] mass = new int [n];
        //Random rand = new Random();
        for(int i = 0; i < 4; i++)
        {
            mass[i] = (int) ((Math.random()*(max - min)) + min);
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        if(mass[0] < mass[1] && mass[1] < mass[2] && mass[2] < mass[3])
        {
            System.out.println("Последовательность строго возрастающая");
        }
        else
        {
            System.out.println("Последовательность не является строго возрастающей");
        }

    }

}
