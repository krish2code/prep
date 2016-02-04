package com.krish.iw;

import java.util.Comparator;

public class Compare implements Comparator<User>{

    public static void main(String[] args) {
        User u1 = new User();
        u1.setAge(21);
        u1.setDept("mech");
        u1.setName("abc");
        
        User u2 = new User();
        u2.setAge(22);
        u2.setDept("ec");
        u2.setName("xyz");
        
        Compare cm = new Compare();
        
        System.out.println(cm.compare(u1, u2));
    }

    @Override
    public int compare(User u1, User u2) {
        if(u1.getAge() > u2.getAge())
            return 1;
        else if (u1.getAge() < u2.getAge())
            return -1;
        else
            return 0;
    }
}

class User implements Comparable<User>{
    String name;
    int age;
    String dept;
    
    @Override
    public int compareTo(User u) {
        if(this.getAge() > u.getAge())
            return 1;
        else if (this.getAge() > u.getAge())
            return -1;
        else
            return 0;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
}