package com.umg.programacion;

/**
 * Created by alumno on 5/07/2017.
 */
public class Tv {
private String marca;
private int pulgadas;
private String caracteristica;
private boolean esPlano;

    public Tv() {
    }

    public Tv(String marca, int pulgadas, String caracteristica, boolean esPlano) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.caracteristica = caracteristica;
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

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public boolean isEsPlano() {
        return esPlano;
    }

    public void setEsPlano(boolean esPlano) {
        this.esPlano = esPlano;
    }

}
