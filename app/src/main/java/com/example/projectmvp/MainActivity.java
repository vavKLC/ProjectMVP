package com.example.projectmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import com.example.projectmvp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    CounterPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = new CounterPresenter();
        presenter.attachView(this);
        initListeners();
    }

    private void initListeners() {
        binding.incrementBtn.setOnClickListener(view -> {
            presenter.increment();
            presenter.changeColor();
        });
        binding.decrementBtn.setOnClickListener(view -> {
            presenter.decrement();
            presenter.changeColor();
        });
    }

    @Override
    public void updateCounter(int count) {
        binding.numberTv.setText(String.valueOf(count));

    }

    @Override
    public void updateColor(int color) {
        binding.numberTv.setTextColor(presenter.counterModel.getgColor());
    }


}
