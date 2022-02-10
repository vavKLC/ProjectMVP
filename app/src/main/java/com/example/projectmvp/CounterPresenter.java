package com.example.projectmvp;

public class CounterPresenter implements CounterContracts.Presenter {
    CounterModel counterModel;
    CounterContracts.CounterView counterView;
    int count = 0;

    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void attachView(CounterContracts.CounterView counterView) {
        this.counterView = counterView;
    }

}
