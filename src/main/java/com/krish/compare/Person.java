package com.krish.compare;

public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() > o.getAge())
            return 1;
        else if (this.getAge() < o.getAge())
            return -1;
        else
            return 0;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
