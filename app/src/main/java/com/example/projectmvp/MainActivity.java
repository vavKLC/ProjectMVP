package com.example.projectmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;


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
        binding.incrementBtn.setOnClickListener(view -> presenter.increment());
        binding.decrementBtn.setOnClickListener(view -> { presenter.decrement();
        });
    }

    @Override
    public void updateCounter(int count) {
        binding.numberTv.setText(String.valueOf(count));
        if (count == 10){
            binding.numberTv.setTextColor(Color.GREEN);
        }else {
            binding.numberTv.setTextColor(Color.RED);
        }
    }
}