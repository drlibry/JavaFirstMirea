package ru.mirea.task2;

import java.util.Scanner;

public class Pocker
{
    public static void main(String[] args)
    {
        int cardsAmount = 5;
        int n;
        String[] suits ={"Пики", "Черви", "Крести", "Буби"};
        String[] rang = {"2","3","4", "5","6","7","8","9", "10","Валет","Дама","Король", "Туз"};
        int allCards = suits.length * rang.length;
        //проверка на вход
        for(;;)
        {
            Scanner input = new Scanner (System.in);
            System.out.println("Введите количество игроков");
            if(input.hasNextInt())
            {
                n = input.nextInt();
                if(n * cardsAmount <= n)
                {
                    break;
                }
                else
                {
                    if(n == 0)
                    {
                        System.out.println("Игра окочена");
                        break;
                    }
                    else if (n < 0)
                    {
                        System.out.println("Число игроков не может быть больше 0");
                        break;
                    }
                    else
                    {
                        System.out.println("Слишком много игроков");
                        break;

                    }
                }
            }
            else
            {
                System.out.println("Вы ввели не число или Ваше число слишком большое!");
            }
        }
        //инициализация колоды
        String[] pack = new String [allCards];
        for(int i = 0; i < rang.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                pack[suits.length * i + j] = rang[i] + " " + suits[j];
            }
        }
        // перетасовка колоды
        for(int i = 0; i < allCards; i++)
        {
            int randomCard = i + (int) (Math.random() * (allCards - i));
            String temp = pack[randomCard];
            pack[randomCard] = pack[i];
            pack[i] = temp;
        }
        //вывод на экран
        for(int i = 0; i < n * cardsAmount; i++)
        {
            System.out.println(pack[i]);
            if(i % cardsAmount == cardsAmount - 1)
                System.out.println();
        }
    }
}
