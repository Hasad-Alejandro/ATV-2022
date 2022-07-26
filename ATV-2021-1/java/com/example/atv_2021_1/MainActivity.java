package com.example.atv_2021_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }
    public void Next(View view) {
        Intent next = new Intent(this, TerceroActivity.class);
        startActivity(next);
    }
}