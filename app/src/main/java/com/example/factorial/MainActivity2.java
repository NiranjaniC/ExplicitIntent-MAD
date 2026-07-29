package com.example.factorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvResult;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy2);

        tvResult = findViewById(R.id.tvResult);
        btnBack = findViewById(R.id.btnBack);

        int number = getIntent().getIntExtra("number", 0);

        long factorial = 1;

        for(int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }

        tvResult.setText("Factorial of " + number + " = " + factorial);


        btnBack.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);

        });
    }
}