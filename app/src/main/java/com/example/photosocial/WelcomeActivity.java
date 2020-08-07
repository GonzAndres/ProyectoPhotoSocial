package com.example.photosocial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.photosocial.controlador.PagerController;
import com.example.photosocial.controlador.Perfil;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class WelcomeActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1, tab2, tab3;
    PagerController pagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        // Colocar icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        //Referenciar los tab
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tab1 = findViewById(R.id.tabfotos);
        tab2 = findViewById(R.id.tabperfil);
        tab3 = findViewById(R.id.tabubicacion);

        pagerAdapter = new PagerController(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);




        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0) {
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition()==1) {
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition()==2) {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }




        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



    }

    public void Compartir (View view){

        Intent compartir = new Intent(android.content.Intent.ACTION_SEND);
        compartir.setType("text/plain");
        String mensaje = "Elije la app a la que quieras compartir";
        compartir.putExtra(android.content.Intent.EXTRA_SUBJECT, "Empleos Baja App");
        compartir.putExtra(android.content.Intent.EXTRA_TEXT, mensaje);
        startActivity(Intent.createChooser(compartir, "Compartir vía"));

    }


    /*public void Mensaje (View view){

        Toast notificacion2 = Toast.makeText(this, " :) Me gusta", Toast.LENGTH_SHORT);
        notificacion2.show();

    }

    public void Mensaje2 (View view){

        Toast notificacion2 = Toast.makeText(this, " :( No me gusta", Toast.LENGTH_SHORT);
        notificacion2.show();

    }*/





    public void Iraddactivity (View View){

        Intent iraddactivity = new Intent(this, AddActivity.class);
        startActivity(iraddactivity);

    }




}
