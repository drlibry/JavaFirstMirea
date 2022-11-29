package ru.mirea.task11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

class Student
{
    private String name, surname, spec;
    Calendar date;
    private int course, group;

    public Student(String name, String surname, String spec, int course,int group, Calendar date)
    {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
        this.date = date;
    }
    public Student(){}
    String getName()
    {
        return this.name;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getSurname()
    {
        return this.surname;
    }
    void setSurname(String surname)
    {
        this.surname = surname;
    }
    String getSpec()
    {
        return this.spec;
    }
    void setSpec(String spec)
    {
        this.spec = spec;
    }
    int getCourse()
    {
        return this.course;
    }
    void setCourse(int course)
    {
        this.course = course;
    }
    int getGroup()
    {
        return this.group;
    }
    void setGroup(int group)
    {
        this.group = group;
    }
    @Override
    public String toString()
    {
        final StringBuffer st = new StringBuffer("Student{");
        st.append("name=").append(getName());
        st.append(", surname=").append(getSurname());
        st.append(", spec='").append(getSpec()).append('\'');
        st.append(", course=").append(getCourse());
        st.append(", group=").append(getGroup());
        st.append(", Bdate=").append(date.getTime());
        st.append('}');
        return st.toString();
    }
}
