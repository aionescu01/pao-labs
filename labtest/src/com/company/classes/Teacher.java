package com.company.classes;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Teacher{ "+"name = '" + name + "'"+"}";
    }
}
