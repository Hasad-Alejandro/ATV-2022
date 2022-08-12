package com.example.atv_2022_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Grados, FormulaG, Pendiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Grados=(Button) findViewById(R.id.bt1);
        FormulaG=(Button) findViewById(R.id.bt2);
        Pendiente=(Button) findViewById(R.id.bt3);

        Grados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Grados.class);
                startActivity(intent);
            }
        });
        FormulaG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormulaG.class);
                startActivity(intent);
            }
        });
        Pendiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pendiente.class);
                startActivity(intent);
            }
        });
    }
}