package com.example.jnifact;

public class Factor {

    static {
        System.loadLibrary("native-lib");
    }

    public static double calculate(int num){
        double a = new Factor().factcal(num);
        return a;
    }

    public native double factcal(int n);
}
