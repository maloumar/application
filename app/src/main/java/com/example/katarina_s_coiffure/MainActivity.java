package com.example.katarina_s_coiffure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btncoiffure(View v)
    {
        Intent intent = new Intent(this, coiffure.class);
        startActivity(intent);
    }
    public void btnoffre(View v)
    {
        Intent intent = new Intent(this, offre.class);
        startActivity(intent);
    }
    public void btnproduit(View v)
    {
        Intent intent = new Intent(this, produit.class);
        startActivity(intent);
    }

    public void btnrendez(View v)
    {
        Intent intent = new Intent(this, rendez.class);
        startActivity(intent);
    }
}