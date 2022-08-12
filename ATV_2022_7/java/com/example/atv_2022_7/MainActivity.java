package com.example.atv_2022_7;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularEcuacion(View v){

        double x1, x2;

        EditText sCoeficienteA = (EditText)findViewById(R.id.txtCoeficienteA);
        EditText sCoeficienteB = (EditText)findViewById(R.id.txtCoeficienteB);
        EditText sCoeficienteC = (EditText)findViewById(R.id.txtCoeficienteC);
        TextView sResultado = (TextView) findViewById(R.id.lblResultado);

        double a = Double.parseDouble(sCoeficienteA.getText().toString());
        double b = Double.parseDouble(sCoeficienteB.getText().toString());
        double c = Double.parseDouble(sCoeficienteC.getText().toString());

        
        double d = ((b*b)-4*a*c);

        if(d<0){
            sResultado.setText("No existen soluciones reales");
        }
        else{

            x1 = ( -b + Math.sqrt(d))/(2*a);

            x2 = ( -b - Math.sqrt(d))/(2*a);

            sResultado.setText("Solución X1: " +x1 + "\n Solución X2: "+x2);


        }
    }

}