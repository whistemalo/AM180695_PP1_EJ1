package com.example.am180695_pp1_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class segundaactividad extends AppCompatActivity {

    private TextView resultado;
    private TextView resultado2;
    private TextView resultado3;
    private TextView resultado4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundaactividad);

        Intent intent =getIntent();
        double a = intent.getDoubleExtra(MainActivity.EXTRA_N1,0);
        double b = intent.getDoubleExtra(MainActivity.EXTRA_D1,0);
        double c = intent.getDoubleExtra(MainActivity.EXTRA_N2,0);
        double d = intent.getDoubleExtra(MainActivity.EXTRA_D2,0);

        TextView tv1 = (TextView)findViewById(R.id.resultado);
        TextView tv2 = (TextView)findViewById(R.id.resultado2);
        TextView tv3 = (TextView)findViewById(R.id.resultado3);
        TextView tv4 = (TextView)findViewById(R.id.resultado4);

        tv1.setText("Suma = " + (a*d + b*c) + " / " + (b*d));
        tv2.setText("Resta = " + (a*d-b*c) + " / " + b*d);
        tv3.setText("Multiplicaion = " + (a*c) + " / " + (b*d));
        tv4.setText("Division = " + (a*d) + " / " + (b*c));

    }
}