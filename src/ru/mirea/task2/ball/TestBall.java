package ru.mirea.task2.ball;

import ru.mirea.task2.ball.Ball;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball B1 = new Ball(0.1, 5);
        Ball B2 = new Ball(0, 2.33);
        Ball B3 = new Ball();
        Ball B4 = new Ball(0.15236, 0);
        B2.SetX(5.56);
        B3.SetXY(41.23, 1.1);
        B4.SetY(1.2);
        System.out.println("1" + B1.ToString());
        System.out.println("2" + B2.ToString());
        System.out.println("3" + B3.ToString());
        System.out.println("4" + B4.ToString());
        B4.move(5, 6);
        System.out.println("После изменений 4 " + B4.ToString());
    }
}
