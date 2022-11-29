package ru.mirea.task2.author;

public class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }
    public String GetName()
    {
        return name;
    }
    public String GetEmail()
    {
        return email;
    }
    public char GetGender()
    {
        return gender;
    }
    public void SetEmail(String Email)
    {
        this.email = email;
    }
    public String ToString()
    {
        return this.name + " - автор, имейл - " + this.email;
    }

}
