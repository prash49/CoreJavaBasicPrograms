package com.bridgelabz.comparing;

import java.util.Comparator;

public class Student implements Comparable<Student> {


    int rolNumber;
    float marks;

    public Student(int rolNumber, float marks) {
        this.rolNumber = rolNumber;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
      int diff = (int) (this.marks - o.marks);
      return diff;
    }
}
