package com.droit.hamza.introaudroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class caraDeRegle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_de_regle);
    }

    public void regleGenAbst(View view){

        Intent i = new Intent(caraDeRegle.this,regleGeneralAbstraite.class);
        startActivity(i);}

    public void regleObligatoir(View view){

        Intent i = new Intent(caraDeRegle.this,regleObligatoir.class);
        startActivity(i);}

    public void sancationRegle(View view){

        Intent i = new Intent(caraDeRegle.this,sancationEtatique.class);
        startActivity(i);}
}
