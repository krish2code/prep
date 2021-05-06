package com.krish.iw;

public class ThreadSafeSingleton {

    /*
     *  private constructor to avoid any new object creation with new operator.
     *  Declare a private static instance of the same class
     *  Provide a public static method that will return the singleton class instance variable. 
     *  If the variable is not initialized then initialize it or else simply return the instance variable.
     */
    
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null)
                    instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}
