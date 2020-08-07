package com.example.photosocial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Quitar el Action Bar
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();


    }

    public void Registrarse(View view){
        Intent registrarse = new Intent(this, WelcomeActivity.class);
        startActivity(registrarse);

    }




}
