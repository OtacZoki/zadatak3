package com.example.zadatak3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Skola;



    TextView Razred;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Skola = (TextView) findViewById(R.id.textViewSkola);

        Razred = (TextView) findViewById(R.id.textViewRazred);

        Razred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Razred.setText(Razred.getText() + " 3-5" );
            }
        });
        Skola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Skola.setText(Skola.getText() + " PIROT " );
            }
        });
    }




}