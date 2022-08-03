package com.example.atv_2022_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mcje_2022_3.R;
import com.example.mcje_2022_3.cuadrado;
import com.example.mcje_2022_3.pentagono;
import com.example.mcje_2022_3.trapecio;
import com.example.mcje_2022_3.triangulo;


public class MainActivity extends AppCompatActivity {
        ImageButton cuadrado, pentagono, triangulo,trapecio;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                cuadrado = findViewById(R.id.cuadrado);
                pentagono = findViewById(R.id.pentagono);
                triangulo = findViewById(R.id.trinangulo);
                trapecio = findViewById(R.id.trapecio);

                cuadrado.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MainActivity.this, com.example.mcje_2022_3.cuadrado.class);
                                startActivity(intent);
                        }
                });
                pentagono.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MainActivity.this, com.example.mcje_2022_3.pentagono.class);
                                startActivity(intent);
                        }
                });
                triangulo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MainActivity.this, com.example.mcje_2022_3.triangulo.class);
                                startActivity(intent);
                        }
                });
                trapecio.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MainActivity.this, com.example.mcje_2022_3.trapecio.class);
                                startActivity(intent);
                        }
                });
        }
}