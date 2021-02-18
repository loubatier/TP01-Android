package com.batierlou.tp01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.batierlou.tp01.databinding.ActivityCalculatorBinding;
import com.batierlou.tp01.databinding.ActivityCounterBinding;

public class CalculatorActivity extends AppCompatActivity {

    private Double firstTerm;
    private Double secondTerm;
    private Double result;
    private ActivityCalculatorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCalculatorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    private void initViews() {

        binding.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstTerm = Double.parseDouble(String.valueOf(binding.firstTerm.getText()));
                secondTerm = Double.parseDouble(String.valueOf(binding.secondTerm.getText()));
                result = firstTerm + secondTerm;

                binding.addTextView.setText(result.toString());
            }
        });

    }
}