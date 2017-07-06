package com.umg.programacion;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;

/**
 * Created by alumno on 5/07/2017.
 */
public class Canal {
    private int numero;
    private ArrayList<String> tematica = new ArrayList<>();
    private boolean permitidoMenores;

    private ArrayList<Canal> canales;

    public Canal() {
        canales = new ArrayList<>();
    }

    public void listadoCanales() {
        tematica.add("1, Deportes, Permitido a menores");
        tematica.add("2, Dibujos Animados, Permitido a menores");
        tematica.add("3, Series, Permitido a menores");
    }

    public boolean devolverCanal(String s) {
        boolean estado=false;

        for (int i = 0; i < tematica.size(); i++) {
            String res[] = tematica.get(i).split(",");
            String numero = res[0];
            String nombre = res[1].trim();

            if (numero.equals(s) && nombre.equals("Dibujos Animados") ) {
                estado=true;
            }
        }

        return estado;
    }

}
