package com.company;

import com.company.classes.Student;
import com.company.classes.Teacher;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*
        Student s1 = new Student();
        s1.setName("Alex");
        Student s2 = new Student();
        s2.setName("Ana");
        System.out.println(s1.toString()+s2.toString());
        Teacher t1 = new Teacher();
        t1.setName("Mihaita");
        System.out.println(t1.toString());


        Student s1 = new Student("Alex",20);
        Student s2 = new Student("Maria",21);
        Teacher t1 = new Teacher("Horatiu");
        Teacher t2 = new Teacher("Mihaita");

        Student[] list = {s1, s2};
        Teacher[] listt = {t1, t2};
        Department d = new Department("Informatica",list,listt);
        System.out.println(d.toString());


        Book b1 = new Book(1985, "Capra cu trei iezi", "Ion Creanga");
        Book b2 = new Book(1901, "Luceafarul", "Mihai Eminescu");
        Book b3 = new Book(1866, "1 scrisoare", "Caragiale");
        Book[] arr = {b1, b2, b3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        TitleComparator titleComparator=new TitleComparator();
        Arrays.sort(arr,titleComparator);
        System.out.println(Arrays.toString(arr));


        int number = 2;
        add(number);
        System.out.println(number);

        Animal animal = new Animal(5);
        changeAnimal(animal);
        System.out.println(animal);

        changeAge(animal);
        System.out.println(animal);
*/

        Greeting greeting = new Hello();
        greeting.sayGreeting();
        greeting.method1();
        Greeting.method2();

        Hello hello = new Hello();
        hello.sayGreeting();
        hello.method1();
/*
        MyConcreteClass myConcreteClass = new MyConcreteClass();
        Greeting g1 = new MyConcreteClass();
        MyInterface myInterface = new MyConcreteClass();
        MyInterface2 myInterface2 = new MyConcreteClass();
        MyInterface3 myInterface3 = new MyConcreteClass();
  */

    }
    /*
    public static void add(int n) {
        n = n + 1;
    }

    public static void changeAnimal(Animal animal) {
        animal = new Animal(10);
    }

    public static void changeAge(Animal animal) {
        animal.setAge(10);
    }
*/
}
