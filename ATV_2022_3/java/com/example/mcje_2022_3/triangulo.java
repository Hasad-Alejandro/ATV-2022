package com.example.mcje_2022_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangulo extends AppCompatActivity {
    EditText b,h,l;
    Button calc;
    TextView Area,Perimetro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        this.setTitle("Triangulo");

        b = findViewById(R.id.base);
        h = findViewById(R.id.Altura);
        l = findViewById(R.id.Ld);
        calc = findViewById(R.id.cac);
        Area = findViewById(R.id.Rarr);
        Perimetro = findViewById(R.id.Rperi);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double lado = Double.valueOf(l.getText().toString());
                double base = Double.valueOf(b.getText().toString());
                double altura = Double.valueOf(h.getText().toString());
                double a= (base*altura)/2;
                double p=lado+lado+lado;



                Perimetro.setText(""+p);
                Area.setText(""+a);
            }
        });
    }
}