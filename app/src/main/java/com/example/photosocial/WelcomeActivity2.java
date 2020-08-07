package com.example.photosocial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WelcomeActivity2 extends AppCompatActivity {

    BottomNavigationView mBottonNavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);

        // Colocar icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mBottonNavigation = (BottomNavigationView) findViewById(R.id.menubot);

        mBottonNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.añadirpersona){
                    Intent iraddactivity = new Intent(WelcomeActivity2.this, AddActivity.class);
                    startActivity(iraddactivity);

                }


                return true;
            }
        });




    }












    public void Mensaje (View view){

        Toast notificacion2 = Toast.makeText(this, " :) Me gusta", Toast.LENGTH_SHORT);
        notificacion2.show();

    }

    public void Mensaje2 (View view){

        Toast notificacion2 = Toast.makeText(this, " :( No me gusta", Toast.LENGTH_SHORT);
        notificacion2.show();

    }

    public void Compartir (View view){

        Intent compartir = new Intent(android.content.Intent.ACTION_SEND);
        compartir.setType("text/plain");
        String mensaje = "Elije la app a la que quieras compartir";
        compartir.putExtra(android.content.Intent.EXTRA_SUBJECT, "Empleos Baja App");
        compartir.putExtra(android.content.Intent.EXTRA_TEXT, mensaje);
        startActivity(Intent.createChooser(compartir, "Compartir vía"));

    }






}