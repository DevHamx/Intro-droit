package com.droit.hamza.introaudroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sourceDeRegle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_de_regle);
    }
    public void sourceTraditionnel(View view){

        Intent i = new Intent(sourceDeRegle.this,sourceTrad.class);
        startActivity(i);
    }
    public void sourceModerne(View view){

        Intent i = new Intent(sourceDeRegle.this,sourceModernes.class);
        startActivity(i);
    }
}
