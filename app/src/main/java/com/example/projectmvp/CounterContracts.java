package com.example.projectmvp;

public class CounterContracts {

    interface  CounterView{
        void updateCounter(int count);
    }
    interface Presenter{
        void increment();
        void decrement();
        void attachView(CounterView counterView);
    }


}
