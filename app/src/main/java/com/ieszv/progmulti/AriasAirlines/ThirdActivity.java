package com.ieszv.progmulti.AriasAirlines;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ThirdActivity extends AppCompatActivity {
    //origen inicializamos los campos a utilizar
    TextView tv_lista;
    ImageButton bt_cancelar;
    Button bt_aceptar;
    Toast toast;
    MainActivity main = new MainActivity();
    //endorigen
    //origen Metodo OnCreate con eventos onClick
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        initalize();
        tv_lista.setText(MainActivity.ListaFacturas.toString());
        bt_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast.makeText(getApplicationContext(),"SU COMPRA HA SIDO REALIZADA CON EXITO" + MainActivity.ListaFacturas., Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(intent);
                ;
            }
        });
        bt_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        //endorigen


    }

    private void initalize() {
        tv_lista = findViewById(R.id.tv_ListaDeViaje);
        bt_cancelar = findViewById(R.id.img_bt);
        bt_aceptar = findViewById(R.id.bt_aceptar);


    }

}
