package com.example.vilmar.trocatelaapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    public void onClickProxima (View v)
    {
        Intent vrIntent = new Intent(this,proximaTela.class);
        startActivity(vrIntent);
    }
    public void onClickNavegar ()
    {

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.br"));
        startActivity();
    }
}
