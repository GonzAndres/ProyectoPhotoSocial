package com.example.photosocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Colocar icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);



    }

    public void iraaddactivity (View view){

        Intent intent = new Intent(AddActivity.this, WelcomeActivity2.class);
        startActivity(intent);




    }


}