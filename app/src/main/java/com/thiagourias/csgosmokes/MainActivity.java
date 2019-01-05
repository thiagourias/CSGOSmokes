package com.thiagourias.csgosmokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirTick64(View view){
        startActivity(new Intent(getBaseContext(), tick64home.class));
    }

    public void abrirTick128(View view){
        startActivity(new Intent(getBaseContext(), tick128home.class));
    }

    public void paginatick(View view){
        startActivity(new Intent(getBaseContext(), paginaTick.class));
    }

    public void creditos(View view){
        startActivity(new Intent(getBaseContext(), creditos.class));
    }

    public void doacoes(View view){
        startActivity(new Intent(getBaseContext(), doacoes.class));
    }
}
