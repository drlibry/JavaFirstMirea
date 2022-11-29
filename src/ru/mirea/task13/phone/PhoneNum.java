package ru.mirea.task13.phone;

public class PhoneNum
{
    private String code, one,two,three;

    public PhoneNum(String s)
    {
        if(s.startsWith("+"))
        {
            this.code = s.substring(1,s.length()-10);
            this.one = s.substring(s.length()-10,s.length()-7);
            this.two = s.substring(s.length()-7,s.length()-4);
            this.three = s.substring(s.length()-4,s.length());
        }
        else
        {
            this.code = "7";
            this.one = s.substring(1,s.length()-7);
            this.two = s.substring(s.length()-7,s.length()-4);
            this.three = s.substring(s.length()-4,s.length());
        }
    }
    public String GetNum1()
    {
        StringBuilder s = new StringBuilder("+<");
        s.append(this.code);
        s.append("><").append(this.one);
        s.append("><").append(this.two);
        s.append("><").append(this.three).append(">");
        return s.toString();
    }

}
