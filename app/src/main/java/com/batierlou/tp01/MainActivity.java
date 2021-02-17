package com.batierlou.tp01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toastButton;
    private Button incButton;
    private TextView counterTextView;
    private Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        toastButton = findViewById(R.id.toastButton);
        incButton = findViewById(R.id.incButton);
        counterTextView = findViewById(R.id.counterTextView);
        counter = 0;

        incButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter += 1;
                counterTextView.setText(counter.toString());
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, counter.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}