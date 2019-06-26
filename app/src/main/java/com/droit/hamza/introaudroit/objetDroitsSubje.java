package com.droit.hamza.introaudroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class objetDroitsSubje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objet_droits_subje);
    }
    public void distPatri(View view){

        Intent i = new Intent(objetDroitsSubje.this,distinPatriExtraPatr.class);
        startActivity(i);
    }
    public void bienCorpore(View view){

        Intent i = new Intent(objetDroitsSubje.this,bienCorporelIncor.class);
        startActivity(i);
    }
    public void clasification(View view){

        Intent i = new Intent(objetDroitsSubje.this,classification.class);
        startActivity(i);
    }
    public void distinct(View view){

        Intent i = new Intent(objetDroitsSubje.this,distinction.class);
        startActivity(i);
    }
}
