package com.example.atv_2022_9;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FormulaG extends AppCompatActivity {

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

        //calculamos el determinante
        double d = ((b*b)-4*a*c);

        if(d<0){
            sResultado.setText("No existen soluciones reales");
        }
        else{
            //queda confirmar que A sea distinto de 0
            //si a=0 nos encontramos una división por cero.
            x1 = ( -b + Math.sqrt(d))/(2*a);

            x2 = ( -b - Math.sqrt(d))/(2*a);

            sResultado.setText("Solución X1: " +x1 + "\n Solución X2: "+x2);


        }
    }

    public void creditos(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Por Cristian Lezcano para http://appandroideando.blogspot.pe/")
                .setTitle("Desarrollado")
                .setCancelable(false)
                .setNeutralButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}