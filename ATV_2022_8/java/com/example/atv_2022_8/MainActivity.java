package com.example.atv_2022_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText x1, y1, x2, y2;
    Button calc;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x1=findViewById(R.id.x1);
        y1=findViewById(R.id.y1);
        x2=findViewById(R.id.x2);
        y2=findViewById(R.id.y2);
        calc=findViewById(R.id.calc);
        calc.setOnClickListener(this::onClick);
        res=findViewById(R.id.res);

    }

    @Override
    public void onClick(View view) {
        int valor1 = Integer.parseInt(x1.getText().toString());
        int valor2 = Integer.parseInt(x2.getText().toString());
        int valor3 = Integer.parseInt(y1.getText().toString());
        int valor4 = Integer.parseInt(y2.getText().toString());
        int s = (valor4 - valor3)/(valor2 - valor1);
        res.setText(s+"");

    }
}