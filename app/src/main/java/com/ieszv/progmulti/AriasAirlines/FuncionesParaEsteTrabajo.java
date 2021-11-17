package com.ieszv.progmulti.AriasAirlines;

public class FuncionesParaEsteTrabajo {
    public static int funcionAscii(String cadena) {

        int contador=0, resultado ; //esta variable contará la suma del valor ASCII de cada letra
        for (int i=0; i < cadena.length(); i++){
            contador = contador + cadena.codePointAt(i);

        }
        resultado = contador % 99;
        return resultado;
    }
}
