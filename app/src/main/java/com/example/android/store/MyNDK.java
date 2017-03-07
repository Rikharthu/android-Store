package com.example.android.store;


public class MyNDK {

    static {
        System.loadLibrary("MyLibrary");
    }

    public native String getMyString();
}
