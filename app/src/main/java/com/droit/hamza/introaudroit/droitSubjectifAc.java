package com.droit.hamza.introaudroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class droitSubjectifAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droit_subjectif);
    }
    public void sujetDroitSubjectif(View view){

        Intent i = new Intent(droitSubjectifAc.this,sujetsDeDroit.class);
        startActivity(i);

    }
    public void objetDroitSubjectif(View view){

        Intent i = new Intent(droitSubjectifAc.this,objetDroitsSubje.class);
        startActivity(i);

    }
}
