package com.ieszv.progmulti.AriasAirlines;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Factura implements Serializable {
    //INICIALIZAMOS EL CODIGO Y LO HACEMOS SERIALIZABLE
    private String Nombre, Apellidos, Direccion,origen,destino,email,fecha,telefono;
     private double precioDeLosTrees,precioPrimeraClase,
                 precioMascota, precioVentanilla, precioBreakfast, precioAlmuerzo, precioCena,
                 precioExtraMeal, precioVip, precioMovilidadReducida;
     //ENDINICIALIZAMOS LO QUE QUEREMOS EN LA FACTURAS

    //Inicio creacion de  el constructor de la factura
    public Factura(String nombre, String apellidos, String direccion, String origen, String destino, String email, String fecha, String telefono,  double precioDeLosTrees, double precioPrimeraClase, double precioMascota, double precioVentanilla, double precioBreakfast, double precioAlmuerzo, double precioCena, double precioExtraMeal, double precioVip, double precioMovilidadReducida) {
        Nombre = nombre;
        Apellidos = apellidos;
        Direccion = direccion;
        this.origen = origen;
        this.destino = destino;
        this.email = email;
        this.fecha = fecha;
        this.telefono = telefono;
        this.precioDeLosTrees = precioDeLosTrees;
        this.precioPrimeraClase = precioPrimeraClase;
        this.precioMascota = precioMascota;
        this.precioVentanilla = precioVentanilla;
        this.precioBreakfast = precioBreakfast;
        this.precioAlmuerzo = precioAlmuerzo;
        this.precioCena = precioCena;
        this.precioExtraMeal = precioExtraMeal;
        this.precioVip = precioVip;
        this.precioMovilidadReducida = precioMovilidadReducida;
    }
    //FIN creacion de  el constructor de la factura
    //INICIO CONSTRUCTOR NULO
    public Factura() {
        this(null,null,null,null,null,null,null,null,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
    }
    //FIN CONSTRUCTOR NULO
    //INICIO GETTER Y SETTERS
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public double getPrecioDeLosTrees() {
        return precioDeLosTrees;
    }

    public void setPrecioDeLosTrees(double precioDeLosTrees) {
        this.precioDeLosTrees = precioDeLosTrees;
    }

    public double getPrecioPrimeraClase() {
        return precioPrimeraClase;
    }

    public void setPrecioPrimeraClase(double precioPrimeraClase) {
        this.precioPrimeraClase = precioPrimeraClase;
    }

    public double getPrecioMascota() {
        return precioMascota;
    }

    public void setPrecioMascota(double precioMascota) {
        this.precioMascota = precioMascota;
    }

    public double getPrecioVentanilla() {
        return precioVentanilla;
    }

    public void setPrecioVentanilla(double precioVentanilla) {
        this.precioVentanilla = precioVentanilla;
    }

    public double getPrecioBreakfast() {
        return precioBreakfast;
    }

    public void setPrecioBreakfast(double precioBreakfast) {
        this.precioBreakfast = precioBreakfast;
    }

    public double getPrecioAlmuerzo() {
        return precioAlmuerzo;
    }

    public void setPrecioAlmuerzo(double precioAlmuerzo) {
        this.precioAlmuerzo = precioAlmuerzo;
    }

    public double getPrecioCena() {
        return precioCena;
    }

    public void setPrecioCena(double precioCena) {
        this.precioCena = precioCena;
    }

    public double getPrecioExtraMeal() {
        return precioExtraMeal;
    }

    public void setPrecioExtraMeal(double precioExtraMeal) {
        this.precioExtraMeal = precioExtraMeal;
    }

    public double getPrecioVip() {
        return precioVip;
    }

    public void setPrecioVip(double precioVip) {
        this.precioVip = precioVip;
    }

    public double getPrecioMovilidadReducida() {
        return precioMovilidadReducida;
    }

    public void setPrecioMovilidadReducida(double precioMovilidadReducida) {
        this.precioMovilidadReducida = precioMovilidadReducida;
    }
    //FIN GETTER Y SETTERS
   //LISTA DE LA FACTURA
    @Override
    public String toString() {
        return "Factura{" +
                "Nombre='" + Nombre + '\'' + "\n" +
                " Apellidos='" + Apellidos + '\'' + "\n" +
                " Direccion='" + Direccion + '\''+ "\n" +
                " Origen='" + origen + '\''+ "\n" +
                " Destino='" + destino + '\'' + "\n"+
                " Email='" + email + '\''+ "\n"+
                " Fecha='" + fecha + '\'' + "\n"+
                " Telefono=" + telefono + "\n" +
                " PrecioDeLosTrees=" + precioDeLosTrees + "\n" +
                " PrecioPrimeraClase=" + precioPrimeraClase + "\n" +
                " PrecioMascota=" + precioMascota + "\n" +
                "PrecioVentanilla=" + precioVentanilla + "\n" +
                "PrecioBreakfast=" + precioBreakfast + "\n" +
                "PrecioAlmuerzo=" + precioAlmuerzo + "\n" +
                "PrecioCena=" + precioCena + "\n" +
                "PrecioExtraMeal=" + precioExtraMeal + "\n" +
                "PrecioVip=" + precioVip + "\n" +
                "PrecioMovilidadReducida=" + precioMovilidadReducida + "\n" +
                '}';
    }
}
