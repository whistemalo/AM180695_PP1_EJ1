package com.example.am180695_pp1_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public static  final  String EXTRA_N1 = "com.example.am180695_pp1_ej1.EXTRA_COA";
    public static  final  String EXTRA_D1 = "com.example.am180695_pp1_ej1.EXTRA_COB";
    public static  final  String EXTRA_N2 = "com.example.am180695_pp1_ej2.EXTRA_COC";
    public static  final  String EXTRA_D2 = "com.example.am180695_pp1_ej1.EXTRA_COC";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcular = (Button) findViewById(R.id.btncalc);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText Den1 =(EditText)findViewById(R.id.d1);
                double d1 = Double.parseDouble(Den1.getText().toString());

                EditText Den2 =(EditText)findViewById(R.id.d2);
                double d2 = Double.parseDouble(Den2.getText().toString());

                if (d1 == 0 || d2 == 0 ){
                    Snackbar.make(findViewById(R.id.t1), "Error: cero en el Denominador", Snackbar.LENGTH_LONG );
                }
                else {
                    abrirAct2();
                }

            }
        });
    }



    public void  abrirAct2(){


        EditText Num1 =(EditText)findViewById(R.id.n1);
        double n1 = Double.parseDouble(Num1.getText().toString());

        EditText Den1 =(EditText)findViewById(R.id.d1);
        double d1 = Double.parseDouble(Den1.getText().toString());

        EditText Num2 =(EditText)findViewById(R.id.n2);
        double n2 = Double.parseDouble(Num2.getText().toString());

        EditText Den2 =(EditText)findViewById(R.id.d2);
        double d2 = Double.parseDouble(Den2.getText().toString());




        Intent intent = new Intent(this, segundaactividad.class);
        intent.putExtra(EXTRA_N1, n1);
        intent.putExtra(EXTRA_D1, d1);
        intent.putExtra(EXTRA_N2, n2);
        intent.putExtra(EXTRA_D2, d2);
        startActivity(intent);

    }

}
