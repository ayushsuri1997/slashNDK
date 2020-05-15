package com.example.jnifact;

public class Factor {

    static {
        System.loadLibrary("native-lib");
    }

    public double calculate(int num){
        double a = factcal(num);
        return a;
    }

    public native double factcal(int n);
}
