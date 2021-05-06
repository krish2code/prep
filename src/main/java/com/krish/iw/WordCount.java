package com.krish.iw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class WordCount implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public transient int count = 0;

    public static void main(String[] args) throws IOException {
    
        String path = "/Users/ajeetkrishna/Desktop/untitled5.txt";
     
        BufferedReader bf = new BufferedReader(new FileReader(path));
        wordCount(bf);
    
    }


    private static void wordCount(BufferedReader bf) throws IOException {
        String line = null;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        int value = 1;
        int totalWord = 0;
        
        while((line = bf.readLine()) != null) {
            String[] input = line.split(" ");
            totalWord = totalWord + input.length;
            
            for (String str : input) {
                if(map.get(str) != null) {
                    value = map.get(str);
                    value++ ;
                    map.put(str, value);
                } else {
                    map.put(str, value);
                }
            }
        }
        
       System.out.println(map);
    }



}


