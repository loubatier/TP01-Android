package com.batierlou.tp01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.batierlou.tp01.databinding.ActivityCounterBinding;

public class CounterActivity extends AppCompatActivity {

    private Integer counter;
    private ActivityCounterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCounterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {
        counter = 0;

        binding.incButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter += 1;
                binding.counterTextView.setText(counter.toString());
            }
        });

        binding.toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CounterActivity.this, counter.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}