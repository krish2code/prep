package com.krish.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 =  new Person("ABC", 11);
        Person p2 =  new Person("XYZ", 21);
        Person p3 =  new Person("PQR", 18);
        
        if(p1.compareTo(p2) > 0) {
            System.out.println(p1.getName() + " is older");
        } else if(p1.compareTo(p2) < 0){
            System.out.println(p2.getName() + " is older");
        } else {
            System.out.println("both are same");
        }
        
        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        
        Collections.sort(lst, new PersonComparator());
        
        for (Person person : lst) {
            System.out.println(person.getName());
        }
    }
    
    
}
