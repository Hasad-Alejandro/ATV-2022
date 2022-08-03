package com.example.mcje_2022_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pentagono extends AppCompatActivity {
    EditText apo, lad;
    Button ca;
    TextView Rar, Rpe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentagono);
        this.setTitle("Pentagono");

        lad = findViewById(R.id.Ld);
        ca = findViewById(R.id.cac);
        Rar = findViewById(R.id.Rarr);
        Rpe = findViewById(R.id.Rperi);
        apo = findViewById(R.id.apo);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double lados = Double.valueOf(lad.getText().toString());
                double apot = Double.valueOf(apo.getText().toString());



                double p=5*lados;
                double a= (p*apot)/2;

                Rar.setText(""+a);
                Rpe.setText(""+p);
            }
        });
    }
}