package ru.mirea.task32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ser {

    public static void main(String[] args) throws IOException {

        //создаем наш объект
        String[] name = {"Иван ", "Мария", "Дарья"};
        String[] surname = {"Иванов", "Лукина", "Акбашева"};
        String[] dish = {"курица", "рыба", "мясо"};

        Order saved = new Order(name, surname, dish);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\1686813\\IdeaProjects\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(saved);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}
