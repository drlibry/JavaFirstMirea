package ru.mirea.task13.person;

public class Person
{
    private String name = null;
    private String surname = null;
    private String otch = null;

    Person(String surname)
    {
        this.surname = surname;
    }

    Person(String surname, String name, String otch)
    {
        this.name = name;
        this.surname = surname;
        this.otch = otch;
    }
    public String getFio()
    {
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            sb.append(" ").append(name);
        if(otch != null && ! otch.equals(""))
            sb.append(" ").append(otch);
        return sb.toString();
    }
}
