package com.droit.hamza.introaudroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class droitObjectifAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droit_objectif);
    }

    public void caraRegle(View view){

        Intent i = new Intent(droitObjectifAc.this,caraDeRegle.class);
        startActivity(i);

    }
    public void sourceRegle(View view){

        Intent i = new Intent(droitObjectifAc.this,sourceDeRegle.class);
        startActivity(i);

    }
}
