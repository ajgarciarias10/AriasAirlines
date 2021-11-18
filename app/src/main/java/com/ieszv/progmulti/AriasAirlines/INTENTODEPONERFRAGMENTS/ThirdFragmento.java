package com.ieszv.progmulti.AriasAirlines.INTENTODEPONERFRAGMENTS;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ieszv.progmulti.AriasAirlines.R;

public class ThirdFragmento extends Fragment{
    /*Método dónde se crea el Fragment y se asigna el layout a este. En este Fragment se definen los elementos necesarios para mostrar la información del contacto seleccionado.*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        return inflater.inflate(R.layout.third_activity,
                container, false);
    }

}

