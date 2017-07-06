package com.umg.programacion;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;

/**
 * Created by alumno on 5/07/2017.
 */
public class Canal {
    private int numero;
    private String tematica;
    private boolean permitidoMenores;

    public Canal() {
    }

    public Canal(int numero, String tematica, boolean permitidoMenores) {
        this.numero = numero;
        this.tematica = tematica;
        this.permitidoMenores = permitidoMenores;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public boolean isPermitidoMenores() {
        return permitidoMenores;
    }

    public void setPermitidoMenores(boolean permitidoMenores) {
        this.permitidoMenores = permitidoMenores;
    }








}
