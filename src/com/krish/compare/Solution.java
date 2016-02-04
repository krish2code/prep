package com.krish.compare;

class Solution {

    public static boolean isPlaindrom(int number) {
        
        StringBuilder sb1 = new StringBuilder(""+number);
        sb1.reverse();
        return sb1.toString().equals(""+number);
    }

    public static void main(String[] args) {
        
    }
}