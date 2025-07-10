package com.onedimension.interfaceexercise;

import java.util.Arrays;

public class Class1 {
    private Student[] students;

    public Class1(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
