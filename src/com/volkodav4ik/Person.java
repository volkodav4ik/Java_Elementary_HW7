package com.volkodav4ik;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "age=" + age +
                ", name=" + name + "}";
    }
}
