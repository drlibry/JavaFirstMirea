package ru.mirea.task6.printable;

interface Printable
{
    void print();
}


class Book implements Printable
{
    String name, author;
    float price;
    Book(String name, String author, float price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public void print()
    {
        System.out.println("Название - "+ this.name + "\nАвтор - "+this.author+"\nЦена - " + this.price);
    }

}
class Shop implements Printable
{
    String product;
    float price;
    Shop(String product, float price)
    {
        this.product=product;
        this.price = price;
    }
    public void print()
    {
        System.out.println("Продукт - "+ this.product + "\nЦена - "+this.price);
    }
}
