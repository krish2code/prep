package com.krish.iw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullJoin {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("id", "1");
        map1.put("name", "ajeet");

        Map<String, String> map2 = new HashMap<>();
        map2.put("id", "2");
        map2.put("name", "krishna");

        List<Map<String, String>> lst1 = new ArrayList<>();
        lst1.add(map1);
        lst1.add(map2);

        System.out.println(lst1);

        map1 = new HashMap<>();
        map1.put("id", "1");
        map1.put("dept", "mech");
        map1.put("year", "2005");

        map2 = new HashMap<>();
        map2.put("id", "2");
        map2.put("dept", "ec");
        map2.put("year", "2006");

        List<Map<String, String>> lst2 = new ArrayList<>();
        lst2.add(map1);
        lst2.add(map2);

        System.out.println(lst2);

        fulljoin(lst1, lst2);
    }

    private static void fulljoin(List<Map<String, String>> lst1, List<Map<String, String>> lst2) {
        
    }
}
