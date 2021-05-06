package com.krish.impl;

import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyValueDB {
    public static void main(String[] args) {
        KeyValueStore kvStore = new KeyValueStore();
        kvStore.set("a", "A1", 1l);
        kvStore.set("a", "A2", 2l);
        kvStore.set("a", "A4", 4l);
        kvStore.set("a", "A5", 5l);
        System.out.println(kvStore.get("a", 6l));


    }
}

class KeyValueStore {
    private Map<String, TreeMap<Long, String>> dbMap;

    public KeyValueStore() {
        dbMap = new HashMap<>();
    }

    public void set(String key, String value, long timestamp) {
        TreeMap timeMap = new TreeMap();

        if (!dbMap.containsKey(key)) {
            timeMap.put(timestamp, value);
        } else {
            timeMap = dbMap.get(key);
            timeMap.put(timestamp, value);
        }

        dbMap.put(key, timeMap);
    }

    public String get(String key, long timestamp) {
        if (dbMap.containsKey(key)) {
            TreeMap<Long, String> timeMap = dbMap.get(key);
            Long floorTimestampKey = timeMap.floorKey(timestamp);
            return floorTimestampKey != null ? timeMap.get(floorTimestampKey) : "Not Found";
        } else {
            return "Not Found";
        }
    }
}
