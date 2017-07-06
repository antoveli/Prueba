package com.umg.programacion;

import com.sun.jndi.cosnaming.CNCtx;

import java.util.ArrayList;

/**
 * Created by alumno on 5/07/2017.
 */
public class Tv {
    private String marca;
    private int pulgadas;
    private boolean esPlano;
    private ArrayList<Canal> canal;


    public Tv()
    {
        canal = new ArrayList<>();
    }

    public Tv(String marca, int pulgadas, boolean esPlano) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.esPlano = esPlano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isEsPlano() {
        return esPlano;
    }

    public void setEsPlano(boolean esPlano) {
        this.esPlano = esPlano;
    }

    public ArrayList<Canal> getCanal() {
        return canal;
    }

    public void setCanal(ArrayList<Canal> canal) {
        this.canal = canal;
    }

    public void addCanal(Canal c) {
        canal.add(c);
    }


    public boolean permitidoMenores(int numeroCanal) {
        Canal micanal = new Canal();
        boolean estado=false;

        for (Canal c : canal) {
            if (c.getNumero() == numeroCanal){
                if (c.isPermitidoMenores() && c.getTematica() == "Dibujos Animados") {
                    estado=true;
                }
                else {
                    estado=false;
                }
            }
        }
        return estado;
    }
}



/*
        for (int i = 0; i < canal.size(); i++) {
            String res[] = canal.get(i).split(",");
            String numero = res[0];
            String nombre = res[1].trim();

            if (numero.equals(s) && nombre.equals("Dibujos Animados") ) {
                estado=true;
            }
        }*/