package ru.mirea.task10;

import java.util.Comparator;

public class PriceComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        if (s1.getGroup() == s2.getGroup()) {
            return 0;
        }
        if (s1.getGroup() > s2.getGroup()) {
            return 1;
        } else {
            return -1;
        }
    }
}
