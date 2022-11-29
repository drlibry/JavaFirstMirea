package ru.mirea.task13.shirt;

public class Shirt
{
    private String article, name, colour, size;

    Shirt(String str)
    {
        String[] s = str.split(",");
        this.article = s[0];
        this.name = s[1];
        this.colour = s[2];
        this.size = s[3];
    }
    String getFull()
    {
        StringBuilder s = new StringBuilder("Артикул = ");
        s.append(this.article);
        s.append(", название = ").append(this.name);
        s.append(", цвет = ").append(this.colour);
        s.append(", размер = ").append(this.size);
        return s.toString();
    }
}
