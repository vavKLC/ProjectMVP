package com.example.projectmvp;


public class CounterPresenter implements CounterContracts.Presenter {
    CounterModel counterModel;
    CounterContracts.CounterView counterView;

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
    public void changeColor() {
        if (counterModel.getCount() == 10 ){
            counterView.updateColor(counterModel.getColor());
        }
    }


    @Override
    public void attachView(CounterContracts.CounterView counterView) {
        this.counterView = counterView;
    }

}
