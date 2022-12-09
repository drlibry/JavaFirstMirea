package ru.mirea.task29;

import ru.mirea.task28.Item;

public interface Order
{
    boolean addPosition(Item item);
    int count();
    boolean remove(String dishName);
    void deleteAll(String name);
    int costAll();
    int orderName(String p);
    String[] getDishes();
}
