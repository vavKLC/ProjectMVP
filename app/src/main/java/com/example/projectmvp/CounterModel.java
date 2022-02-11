package com.example.projectmvp;

import android.graphics.Color;

public class CounterModel {
    int count = 0;
    int gColor = Color.GREEN;

    void increment() {
        ++count;
    }

    void decrement() {
        --count;
    }


    public int getgColor() {
        return gColor;
    }

    public int getCount() {
        return count;
    }
}
