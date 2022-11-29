package ru.mirea.task6.movable;

public class TestMovable
{
    public static void main(String args[])
    {
        Movable one = new MovablePoint(5,1,3,10);
        System.out.println("Начальная позиция:");
        System.out.println(one.toString());
        System.out.println();
        System.out.println("ВНИЗ");
        one.moveDown();
        System.out.println(one.toString());
        System.out.println();
        System.out.println("ВЛЕВО");
        System.out.println(one.toString());
        System.out.println();
        Movable two = new MovableCircle(1,6,1,3,4);
        System.out.println();
        System.out.println("Начальная позиция круга");
        System.out.println(two.toString());
        System.out.println();
        System.out.println("ВПРАВО");
        two.moveRight();
        System.out.println(two.toString());
        System.out.println();
        System.out.println("ВВЕРХ");
        two.moveUp();
        System.out.println(two.toString());
        System.out.println();
    }
}
