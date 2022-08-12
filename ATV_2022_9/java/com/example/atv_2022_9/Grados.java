package com.example.atv_2022_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Grados extends AppCompatActivity {


    private Button CF;
    private Button FC;
    private Button CK;
    private Button KC;
    private Button FK;
    private Button KF;
    private EditText ET;
    private TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CF=findViewById(R.id.CF);
        FC=findViewById(R.id.FC);
        CK=findViewById(R.id.CK);
        KC=findViewById(R.id.KC);
        FK=findViewById(R.id.FK);
        KF=findViewById(R.id.KF);
        ET=findViewById(R.id.ET);
        TV=findViewById(R.id.TV);

        userInput();
    }

    private void userInput(){
        CF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Conversor converterClass=new Conversor();
                double degCel=Double.parseDouble(ET.getText().toString());
                double degFar=converterClass.CF(degCel);
                TV.setText(Double.toString(degFar));

            }
        });

        FC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Conversor converterClass=new Conversor();
                double degFar=Double.parseDouble(ET.getText().toString());
                double degCel=converterClass.FC(degFar);
                TV.setText(Double.toString(degCel));

            }
        });

        CK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Conversor converterClass=new Conversor();
                double degCel=Double.parseDouble(ET.getText().toString());
                double degKel=converterClass.CK(degCel);
                TV.setText(Double.toString(degKel));

            }
        });

        KC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Conversor converterClass=new Conversor();
                double degKel=Double.parseDouble(ET.getText().toString());
                double degCel=converterClass.KC(degKel);
                TV.setText(Double.toString(degCel));

            }
        });

        FK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Conversor converterClass=new Conversor();
                double degFar=Double.parseDouble(ET.getText().toString());
                double degKel=converterClass.FK(degFar);
                TV.setText(Double.toString(degKel));

            }
        });

        KF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Conversor converterClass=new Conversor();
                double degKel=Double.parseDouble(ET.getText().toString());
                double degFar=converterClass.KF(degKel);
                TV.setText(Double.toString(degFar));
            }
        });

    }
}