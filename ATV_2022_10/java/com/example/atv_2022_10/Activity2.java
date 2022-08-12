package com.example.atv_2022_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView N2;
    private TextView No2;
    private TextView No4;
    private TextView r;
    private Button Regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        N2 = (TextView) findViewById(R.id.N2);
        No2 = (TextView) findViewById(R.id.No2);
        No4 = (TextView) findViewById(R.id.No4);
        r = (TextView) findViewById(R.id.r);

        String dato = getIntent().getStringExtra("dato");
        N2.setText("Ingeniero " + dato);

        String dato1 = getIntent().getStringExtra("dato1");
        No2.setText(dato1);

        float No2 = Float.valueOf(dato1);

        String dato2 = getIntent().getStringExtra("dato2");
        No4.setText(dato2);

        float No4 = Float.valueOf(dato2);

        float suma = No2 + No4;
        r.setText(""+suma);
    }
}