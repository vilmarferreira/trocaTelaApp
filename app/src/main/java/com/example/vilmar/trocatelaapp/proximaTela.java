package com.example.vilmar.trocatelaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class proximaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima_tela);
    }

    public void onClickVoltar (View v)
    {
        Intent vrIntent = new Intent(this,telaTres.class);
        startActivity(vrIntent);
        this.finish();

    }
}
