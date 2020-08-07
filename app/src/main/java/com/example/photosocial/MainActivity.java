package com.example.photosocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        //Quitar el Action Bar
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();


        // Colocar icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }



    // Metodo del boton Registrarse
    public void  Registrarse(View view){
        Intent registrarse = new Intent(this, RegisterActivity.class);
        startActivity(registrarse);
    }

    //Metodo del boton Iniciar Sesion
    public void Iniciarsesion(View view){
        Intent iniciarsesion = new Intent(this, WelcomeActivity2.class);
        startActivity(iniciarsesion);
    }





}
