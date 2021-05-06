package com.krish.iw;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return (instance == null) ? new Singleton() : instance;
    }

}
