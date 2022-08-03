package com.example.mcje_2022_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class trapecio extends AppCompatActivity {
    EditText Bas,bm, alu, Ld;
    Button cac;
    TextView Rperi, Rarr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);
        this.setTitle("Trapecio");

        Ld = findViewById(R.id.Ld);
        Bas = findViewById(R.id.Bas);
        bm = findViewById(R.id.bm);
        cac = findViewById(R.id.cac);
        Rarr = findViewById(R.id.Rarr);
        Rperi = findViewById(R.id.Rperi);

        cac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double la = Double.valueOf(Ld.getText().toString());
                double bma = Double.valueOf(Bas.getText().toString());
                double bme = Double.valueOf(bm.getText().toString());
                double alt = Double.valueOf(alu.getText().toString());

                double ar= (bma+bme*alt)/2;
                double pe= bma+bme+la+la;

                Rperi.setText(""+pe);
                Rarr.setText(""+ar);
            }
        });
    }
}