package com.batierlou.tp01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.batierlou.tp01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Integer counter;
    private Double firstTerm;
    private Double secondTerm;
    private Double result;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();
    }

    private void initViews() {
        counter = 0;

        binding.toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, counter.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        binding.incButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter += 1;
                binding.counterTextView.setText(counter.toString());
            }
        });

        binding.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstTerm = Double.parseDouble(String.valueOf(binding.firstTerm.getText()));
                secondTerm = Double.parseDouble(String.valueOf(binding.secondTerm.getText()));
                result = firstTerm + secondTerm;
                
                binding.counterTextView.setText(result.toString());
            }
        });
    }
}