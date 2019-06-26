package com.droit.hamza.introaudroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sujetsDeDroit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujets_de_droit);
    }
    public void personPhys(View view){

        Intent i = new Intent(sujetsDeDroit.this,personnesPhysique.class);
        startActivity(i);
    }
    public void personMoral(View view){

        Intent i = new Intent(sujetsDeDroit.this,PersonnesMotal.class);
        startActivity(i);
    }
}
