package com.example1.lenovo.myapplicationcaculadoranotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void acercaDe(View view) {

        Intent i = new Intent(this, Main5ActivityAcercaDe.class);
        startActivity(i);
    }
    public void Comenzar(View view) {

        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
}
