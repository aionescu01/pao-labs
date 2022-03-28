package com.company;

import com.company.classes.Student;
import com.company.classes.Teacher;

import java.util.Arrays;

public class Department {
    private String name;
    Student[] students;
    Teacher[] teachers;

    public Department(String name, Student[] students, Teacher[] teachers){
        this.name=name;
        this.students=students;
        this.teachers=teachers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}
