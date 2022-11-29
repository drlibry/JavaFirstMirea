package ru.mirea.task2.author;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author A1 = new Author("Пушкин", "p@gm.ru", 'м');
        Author A2 = new Author("Артемьева", "artem@gm.com",'ж');
        //A2.SetEmail("a@gm.com");
        System.out.println(A2.ToString());
        System.out.println(A1.ToString());
    }
}
