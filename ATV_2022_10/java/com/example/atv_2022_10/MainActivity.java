package com.example.atv_2022_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private EditText N1;
    private EditText No1;
    private EditText No3;
    private TextView r;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        N1 = (EditText)findViewById(R.id.N1);
        No1 = (EditText)findViewById(R.id.No1);
        No3 = (EditText)findViewById(R.id.No3);

    }

    public void Enviar(View view){
        Intent i = new Intent(this,Activity2.class);
        i.putExtra("dato", N1.getText().toString());
        startActivity(i);

        i.putExtra("dato1", No1.getText().toString());
        startActivity(i);

        i.putExtra("dato2", No3.getText().toString());
        startActivity(i);



    }

}