package com.krish.thread;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        boolean bool = false;
        List<String> lst = new ArrayList<String>();
        lst.add("IDL");
        lst.add("IPK");
        
        String order = "IPK";
        
        if((!bool && !(lst.contains(order) || "UCDGTOD".equals(order)))) {
            System.out.println("not a valid case");
        } else {
            System.out.println("valid case");
        }
    }
}
