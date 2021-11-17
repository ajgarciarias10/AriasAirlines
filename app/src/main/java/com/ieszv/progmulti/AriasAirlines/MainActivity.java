package com.ieszv.progmulti.AriasAirlines;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        //region  INICIALIZACI0N DE LAS VARIABLES A USAR EN EL EJERCICIO
    private Button botonNoVip,Desayuno;
    RadioButton MovilidadReducida;
    private  ImageButton botonVip;
    private EditText et_name ,et_surname,et_direccion,et_telefono,et_email,et_from,et_to ,et_date;
    private  String name ,surname,direccion, from, to,date,email,telefonoEnCadena;
    private double  precioIdaVuelta,precioPrimeraClase,
            precioMascota, precioVentanilla, precioBreakfast, precioAlmuerzo, precioCena,priceOfThreeAsciis,
            precioExtraMeal, precioVip, precioMovilidadReducida;
    private int telefono;
    private String TAG= MainActivity.class.getName() + "xyzyx";
    CheckBox checkCena,checkDesayuno,check_Comida,check_Extra,checkPrimeraClase,check_mascota,check_asiento;
    Switch IdaoVuelta;
    Toast toast;
       public static ArrayList<Factura> ListaFacturas = new ArrayList<>();
       //endregion
     //region ONCREATE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Spinner spinner = (Spinner) findViewById(R.id.sp_treatment);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    //endregion
    //region METODO enseñamelDialogo que es un alertDialog
    private void enseñamelDialogo() {
        new AlertDialog.Builder(this)
                .setTitle("Compra")
                .setMessage("¿Desea comprar el Pase No Vip?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                        /*
                        Intent intent = new Intent(MainActivity.this, Fragmento.class);
                        startActivity(intent);
                    */
                    }

                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .show();
    }
    //endregion


    //region inicializamos
    private void initialize()  {
        et_name = findViewById(R.id.et_nombre);
        et_surname = findViewById(R.id.et_Apellidos);
        et_direccion = findViewById(R.id.et_dirección);
        et_telefono = findViewById(R.id.et_Phone);
        et_email = findViewById(R.id.et_email);
        et_from = findViewById(R.id.et_from);
        et_to=findViewById(R.id.et_to);
        et_date = findViewById(R.id.et_Date);
        checkCena= findViewById(R.id.check_cena);
        botonNoVip = findViewById(R.id.bt_aceptar);
        botonVip = findViewById(R.id.img_bt);
        Desayuno = findViewById(R.id.check_breakfast);
        checkDesayuno = findViewById(R.id.check_breakfast);
        check_Comida = findViewById(R.id.check_comida);
        check_Extra = findViewById(R.id.check_Extra);
        checkPrimeraClase = findViewById(R.id.check_primeraclase);
        check_mascota = findViewById(R.id.check_mascota);
        check_asiento = findViewById(R.id.check_asiento);
        MovilidadReducida = findViewById(R.id.rd_movilidadReducida);








        //region Aqui hacemos los eventosOnClick
        checkCena.setOnClickListener((View v)-> {
            toast.makeText(getApplicationContext(),"ACABA DE PULSAR LA OPCION CENA",Toast.LENGTH_SHORT).show();
        });

        botonNoVip.setOnClickListener((View View)->{
            if(!CrearArrayNoVip()){
                toast.makeText(getApplicationContext(),"Rellena todos los campos con Interrogacion",Toast.LENGTH_SHORT).show();
            }else{
                enseñamelDialogo();
            }



        });
        botonVip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!CrearArrayVip()){
                    toast.makeText(getApplicationContext(),"Rellena todos los campos con Interrogacion",Toast.LENGTH_SHORT).show();
                }else{
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }


            }
        });

        Desayuno.setOnClickListener((View view)->{

            Snackbar.make(view,"Error, Reintente la operacion mas tarde ",Snackbar.LENGTH_SHORT).show();
        });
        //endregion
    }
    //endregion
    //region Metodos de checkeo
    public double esCheckDesayuno(){
        if(checkDesayuno.isChecked() == true) {
            precioBreakfast = 10;
            return  precioBreakfast;
        }else{
            precioBreakfast=0;
            return  precioBreakfast;
        }

    }
    public double esCheckCena(){
        if(checkCena.isChecked() == true) {
            precioCena = 25;
            return precioCena;
        }
        else{
            precioCena = 0;
            return  precioCena;

        }

    }
    public double esCheckComida(){
        if(check_Comida.isChecked() == true){
            precioAlmuerzo = 30;
            return  precioAlmuerzo;

        }else{
            precioAlmuerzo = 0;
            return precioAlmuerzo;
        }

    }
    public  double checkExtra(){
        if(check_Extra.isChecked()== true) {
            precioExtraMeal = 5;
            return  precioExtraMeal;
        }
       else{
            precioExtraMeal = 0;
           return precioExtraMeal;
        }
    }
    public double checkPrimeraClase(){
        if(checkPrimeraClase.isChecked()== true){
            precioPrimeraClase = 20;
            return  precioPrimeraClase;
        }else{
            precioPrimeraClase = 0;
            return  precioPrimeraClase;
        }
    }
    public double checkMascota(){
        if(check_mascota.isChecked()== true){
            precioMascota=20;
            return precioMascota;
        }else{
            precioMascota=0;
            return precioMascota;
        }
    }

      public double checkAsiento(){
          if(check_asiento.isChecked()== true){
              precioVentanilla = 12;
              return  precioVentanilla;
          }
          else{
              precioVentanilla=0;
              return precioVentanilla;
          }


      }
      public double dMovilidadReducida(){
          if(MovilidadReducida.isChecked() == true){
              precioMovilidadReducida = -44;
              return precioMovilidadReducida;
          }
          else{
              precioMovilidadReducida=0;
              return precioMovilidadReducida;

          }

      }
      public boolean estaVacionNombre(){
          name = String.valueOf(et_name.getText());
          if(name.isEmpty()){
              et_name.setError("Error Ha escrito el campo name vacio");
              return true;
          }
          else{
              return false;

          }

      }
    public boolean estaVacionApellido(){
        surname = String.valueOf(et_surname.getText());
        if(surname.isEmpty()){
           // toast.makeText(getApplicationContext(),"Error Ha escrito el campo Apellido vacio = "+ surname,Toast.LENGTH_SHORT).show();
            et_surname.setError("Error Ha escrito el campo Apellido vacio");
            return true;
        }
        else{
            return false;

        }

    }
    public boolean estaVacionDireccion(){
        direccion = String.valueOf(et_direccion.getText());
        if(direccion.isEmpty()){
           // toast.makeText(getApplicationContext(),"Error Ha escrito el campo Direccion vacio = "+ direccion,Toast.LENGTH_SHORT).show();
            et_direccion.setError("Error Ha escrito el campo Direccion vacio");
            return true;
        }
        else{
            return false;

        }

    }
    public boolean estaVacioEmail(){
        email = String.valueOf(et_email.getText());
        if(email.isEmpty()){
            //toast.makeText(getApplicationContext(),"Error Ha escrito el campo Email vacio = "+ email,Toast.LENGTH_SHORT).show();
            et_email.setError("Error Ha escrito el campo Email vacio");
            return true;
        }
        else{
            return false;

        }

    }
    public boolean estaVacionTelefono(){
        telefonoEnCadena = String.valueOf(et_telefono.getText());

        if(telefonoEnCadena.isEmpty()){
            //toast.makeText(getApplicationContext(),"Error Ha escrito el campo Telefono  vacio = "+ telefonoEnCadena,Toast.LENGTH_SHORT).show();
            et_telefono.setError("Error Ha escrito el campo Telefono  vacio ");

            return true;
        }
        else{
            return false;

        }

    }
    public boolean estaFechaVacia(){
        date = String.valueOf(et_date.getText());
        if(date.isEmpty()){
           // toast.makeText(getApplicationContext(),"Error Ha escrito el campo Fecha vacio = "+ date,Toast.LENGTH_SHORT).show();
            et_date.setError("Error Ha escrito el campo Fecha vacio ");
            return true;
        }
        else{
            return false;

        }
    }

//endregion


    //region metodo deCreacion de un array en caso de que sea vip
    public boolean CrearArrayVip(){

          from= String.valueOf(et_from.getText());
          to = String.valueOf(et_to.getText());
          estaFechaVacia();
          priceOfThreeAsciis =  idavuelta(from,to,date);

          dMovilidadReducida();
          checkAsiento();
          checkMascota();
          checkPrimeraClase();
          checkExtra();
          esCheckComida();
          esCheckCena();
          esCheckDesayuno();
        if(estaVacionNombre() || estaVacionApellido() || estaVacionDireccion() || estaVacionTelefono()|| estaVacioEmail()){
            return  false;

        }else{
            precioVip= 43;
            Factura factura = new Factura(name,surname,direccion,from,to,email,date,telefonoEnCadena,priceOfThreeAsciis,precioPrimeraClase,precioMascota,precioVentanilla,precioBreakfast,precioAlmuerzo,precioCena,precioExtraMeal,precioVip,precioMovilidadReducida);
            ListaFacturas.add(factura);
            Log.v(TAG, ListaFacturas.toString());
            return  true;

        }

      }
      //endregion


    //region metodo deCreacion de un array en caso de que  no sea vip
    public boolean CrearArrayNoVip(){
        //HACEMOS LOS GETTEXT DE CADA CAMPO
        from= String.valueOf(et_from.getText());
        to = String.valueOf(et_to.getText());
        estaFechaVacia();
        priceOfThreeAsciis =  idavuelta(from,to,date);

        dMovilidadReducida();
        checkAsiento();
        checkMascota();
        checkPrimeraClase();
        checkExtra();
        esCheckComida();
        esCheckCena();
        esCheckDesayuno();
        if(estaVacionNombre() || estaVacionApellido() || estaVacionDireccion() || estaVacionTelefono()|| estaVacioEmail()){

            return  false;
        }else{
            precioVip= 0;
            Factura factura = new Factura(name,surname,direccion,from,to,email,date,telefonoEnCadena,priceOfThreeAsciis,precioPrimeraClase,precioMascota,precioVentanilla,precioBreakfast,precioAlmuerzo,precioCena,precioExtraMeal,precioVip,precioMovilidadReducida);
            ListaFacturas.add(factura);
            Log.v(TAG, ListaFacturas.toString());
            return  true;


        }
    }
    //endregion
 //region Metodo que te devuelve el total de la ida la vuelta
    private double idavuelta(String cadena1 ,String cadena2,String cadena3) {
        IdaoVuelta = findViewById(R.id.sw_id_vuelt);
        precioIdaVuelta =  FuncionesParaEsteTrabajo.funcionAscii(cadena1) + FuncionesParaEsteTrabajo.funcionAscii(cadena2) + FuncionesParaEsteTrabajo.funcionAscii(cadena3);
        if(IdaoVuelta.isActivated()){
            precioIdaVuelta = precioIdaVuelta *2;
            return precioIdaVuelta;
        }else{
            return precioIdaVuelta;
        }

    }

    //endregion

    //region INflando el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    //endregion

}