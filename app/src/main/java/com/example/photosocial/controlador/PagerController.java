package com.example.photosocial.controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {

    int numerodetabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numerodetabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Fotos();

            case 1:

                return new Perfil();

            case 2:

                return new Ubicacion();

            default:
                return null;


        }

    }

    @Override
    public int getCount() {
        return numerodetabs;
    }
}
