package com.ieszv.progmulti.AriasAirlines;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    //region Inicializamos los componentes a utilizar
    TextView tv_Precio;
    private String TAG= SecondActivity.class.getName() + "xyzyx";
    MainActivity m1 = new MainActivity();
    ImageButton img_cancelar;
    Button bontonComprar;
    //endregion
    //region Metodo OnCreate que pone el  texto del metodo factura Cadenita que explicare más tarde
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        tv_Precio = findViewById(R.id.tv_ListaDeViaje);
        /*Bundle bundle = getIntent().getExtras();
        factura = bundle.getString("Facturas");*/

        tv_Precio.setText(facturaCadenita());
        initialize();
    }
    //endregion
    //region Incializamos  los botones hacemos unos eventos onClick
    private void initialize() {
        img_cancelar = findViewById(R.id.img_bt);
        img_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bontonComprar = findViewById(R.id.bt_aceptar);
        bontonComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
                /*Intent intent2 = new Intent(SecondActivity.this, Fragmento.class);
                startActivity(intent2);*/
            }
        });
    }
    //endregion

    //region sacar el precio De La Factura sacando los precios que se crean en a actividad Anterior
    public String facturaCadenita(){
    double factura = 0;

     for (int i = 0; i <  MainActivity.ListaFacturas.size(); i++) {


         factura = factura + Double.parseDouble(String.valueOf(MainActivity.ListaFacturas.get(i).getPrecioAlmuerzo() + MainActivity.ListaFacturas.get(i).getPrecioBreakfast()+ MainActivity.ListaFacturas.get(i).getPrecioMovilidadReducida()+MainActivity.ListaFacturas.get(i).getPrecioCena() + MainActivity.ListaFacturas.get(i).getPrecioVip() + MainActivity.ListaFacturas.get(i).getPrecioVentanilla() + MainActivity.ListaFacturas.get(i).getPrecioPrimeraClase() +MainActivity.ListaFacturas.get(i).getPrecioExtraMeal()+MainActivity.ListaFacturas.get(i).getPrecioMascota()+MainActivity.ListaFacturas.get(i).getPrecioDeLosTrees()+MainActivity.ListaFacturas.get(i).getPrecioMovilidadReducida()));

     }
     String facturita ="";
      facturita = String.valueOf(factura);
     Log.v(TAG,facturita);
     return facturita;
    }
    //endregion




}
