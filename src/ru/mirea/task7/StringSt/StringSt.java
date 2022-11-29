package ru.mirea.task7.StringSt;

interface StringSt
{
    public void counter();
    public void returnStr();
    public void invert();
}
class StrFunc
{
    String s;
    StrFunc(String s)
    {
        this.s =s;
    }
    public void counter()
    {
        int k = 0;

        if(s.length() != 0)
        {
            k++;
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) != ' ')
                {
                    k++;
                }
            }
        }
        System.out.println("Количество символов в строке = " + k);
    }
    public void returnSt()
    {

        char st[] = new char[50];
        int j = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (i%2==1 && s.charAt(i)!=' ')
            {
                st[j] = s.charAt(i);
                j++;
            }

        }
        for(int i = 0;i<j; i ++)
        {
            System.out.print(st[i]);
        }
    }
    public void invert()
    {
        char st[] = new char[50];
        int n = s.length();
        System.out.println(n);
        int j =0;
        for(int i = n -1; i >= 0; i--)
        {
            st[j] = s.charAt(i);
            j++;
        }
        for(int i = 0;i<j; i ++)
        {
            System.out.print(st[i]);
        }
    }
}