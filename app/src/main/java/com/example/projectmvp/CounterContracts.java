package com.example.projectmvp;

public class CounterContracts {

    interface  CounterView{
        void updateCounter(int count);
        void updateColor(int color);
    }
    interface Presenter{
        void increment();
        void decrement();
        void changeColor();
        void attachView(CounterView counterView);
    }


}
